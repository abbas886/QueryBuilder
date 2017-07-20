package com.stackroute.query.builder;

import java.util.List;

public class QueryParameter {

	//Add the required parameters 
	
	private String queryString;
	
	//query without where condition
	private String baseQuery;
	
  
	private String file;
	
	//Selected fields. If it is null ->  * ( i.e., select all fields)
	private List<String> fields;
	


	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public String getBaseQuery() {
		return baseQuery;
	}

	public void setBaseQuery(String baseQuery) {
		this.baseQuery = baseQuery;
	}
	
	
	
	
	
}
