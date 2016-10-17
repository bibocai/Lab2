package com.tutorialspoint.struts2;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class detail_java 
{
   private String isbn;
   private String result;
   public String execute() throws Exception 
   {
	  String temp_author_idString=all_sql_things.search_book_return_authorID(isbn);
	  result=all_sql_things.search_author_details(temp_author_idString);
	  result=result.concat(all_sql_things.search_book_big(isbn));
	  ServletRequest request=ServletActionContext.getRequest();
	  HttpServletRequest req =(HttpServletRequest) request;
	  HttpSession sesssion=req.getSession();
	  sesssion.setAttribute("result", result); 
	  System.out.print(result);
	  return "success_1";
   } 
   public String getIsbn() 
   {
      return isbn;
   }
   public void setIsbn(String isbn) 
   {
      this.isbn = isbn;
   }
   public String getResult() 
   {
      return result;
   }
   public void setResult(String result) 
   {
      this.result = result;
   }
}
