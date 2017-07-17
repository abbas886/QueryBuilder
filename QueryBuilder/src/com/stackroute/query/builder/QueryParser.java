package com.stackroute.query.builder;



public class QueryParser {
	
	QueryParameter queryParameter;
	public QueryParameter parseQuery(String queryString) {
		
		//Implement the logic
		queryParameter = new QueryParameter();
		queryParameter.setQueryString(queryString);
		
			String baseQuery = queryString.split("where")[0];
			queryParameter.setBaseQuery(baseQuery);
			
			
			String file =baseQuery.split("from")[1];
			queryParameter.setFile(file.trim());
			
			
		
		
		return queryParameter;
	}
	

}
