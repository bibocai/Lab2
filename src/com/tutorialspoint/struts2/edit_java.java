package com.tutorialspoint.struts2;

public class edit_java
{
	private	String	isbn	;
	private	String	title	;
	private	String	author_id	;
	private	String	publisher	;
	private	String	publish_date	;
	private	String	price	;

	public String execute() throws Exception
	{
		setAuthor_id(author_id);
		setIsbn(isbn);
		setPrice(price);
		setPublish_date(publish_date);
		setPublisher(publisher);
		setTitle(title);
		
//		System.out.print(isbn);
		
		if(all_sql_things.if_author_exist(author_id))
		{
			all_sql_things.delete_book(isbn);
			all_sql_things.insert_book(isbn ,title,author_id ,publisher,publish_date,price);	
			return "success";			
		}
		return "failed";
	}
	
	public String getIsbn() 
	{
	    return isbn;
	}
	public void setIsbn(String isbn) 
	{
	     this.isbn = isbn;
	}
	public String getTitle() 
	{
	    return title;
	}
	public void setTitle(String title) 
	{
	     this.title = title;
	}
	public String getAuthor_id() 
	{
	    return author_id;
	}
	public void setAuthor_id(String author_id) 
	{
	     this.author_id = author_id;
	}
	public String getPublisher() 
	{
	    return publisher;
	}
	public void setPublisher(String publisher) 
	{
	     this.publisher =publisher;
	}
	public String getPublish_date() 
	{
	    return publish_date;
	}
	public void setPublish_date(String publish_date) 
	{
	     this.publish_date =publish_date;
	}
	public String getPrice() 
	{
	    return price;
	}
	public void setPrice(String price) 
	{
	     this.price = price;
	}
}
