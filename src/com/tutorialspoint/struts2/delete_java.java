package com.tutorialspoint.struts2;

public class delete_java {
	private String isbn;
	
	public String execute() throws Exception
	{
		setIsbn(isbn);
		all_sql_things.delete_book(isbn);
		return "success";
	}
	
	public String getIsbn() 
	{
	    return isbn;
	}
	public void setIsbn(String isbn) 
	{
	     this.isbn = isbn;
	}
}
