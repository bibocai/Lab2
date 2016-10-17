package com.tutorialspoint.struts2;

public class insert_author 
{
	private	String	name	;
	private	String	age	;
	private	String	author_id	;
	private	String	country	;

	public String execute() throws Exception
	{
		setAuthor_id(author_id);
		setName(name);
		setCountry(country);
		setAge(age);
		
//		System.out.print(name);
		if(!all_sql_things.if_author_exist(author_id))
		{
			all_sql_things.insert_author(author_id,name ,age ,country);			
			return "success";
		}
		return "failed";
	}
	
	public String getName() 
	{
	    return name;
	}
	public void setName(String name) 
	{
	     this.name = name;
	}
	public String getAge() 
	{
	    return age;
	}
	public void setAge(String age) 
	{
	     this.age = age;
	}
	public String getAuthor_id() 
	{
	    return author_id;
	}
	public void setAuthor_id(String author_id) 
	{
	     this.author_id = author_id;
	}
	public String getCountry() 
	{
	    return country;
	}
	public void setCountry(String country) 
	{
	     this.country =country;
	}
}
