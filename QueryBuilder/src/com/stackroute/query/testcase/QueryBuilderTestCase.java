package com.stackroute.query.testcase;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.query.builder.QueryParameter;
import com.stackroute.query.builder.QueryParser;

public class QueryBuilderTestCase {
	
	private static QueryParser queryParser;
	private static QueryParameter queryParameter;

	@BeforeClass
	public static  void init()
	{
		queryParser = new QueryParser();
	}
	
	@Test
	public void getFileNameTestCase()
	{
		queryParameter = queryParser.parseQuery("select * from employe.csv");
		assertEquals("employe.csv", queryParameter.getFile());
		display(queryParameter);
	}
	@Test
	public void getBaseQueryTestCase()
	{
		queryParameter = queryParser.parseQuery("select * from employe.csv");
		assertEquals("select * from employe.csv", queryParameter.getBaseQuery());
		display(queryParameter);
	}
	@Test
	public void getQueryStringTestCase()
	{
		queryParameter = queryParser.parseQuery("select * from employe.csv");
		assertEquals("select * from employe.csv", queryParameter.getBaseQuery());
		display(queryParameter);
	}
	//@Test
	public void getFieldTestCase()
	{
		queryParameter = queryParser.parseQuery("select * from employe.csv");
		assertEquals("employe.csv", queryParameter.getFields());
		display(queryParameter);
	}


	private void display(QueryParameter queryParameter) {
		System.out.println("RESULT :");
		System.out.println("Base Query:" +queryParameter.getBaseQuery());
		System.out.println("File:" +queryParameter.getFile());
		List<String>  fields = queryParameter.getFields();
		
		System.out.print("Selected field(s):");
		if(fields==null ||fields.isEmpty())
		{
			  System.out.println("*");
		}
		else
		{
			for(String field : fields)
			{
				System.out.println("\t" + field);
			}
		}
		
	}
}
