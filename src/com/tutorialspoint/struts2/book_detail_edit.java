package com.tutorialspoint.struts2;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class book_detail_edit 
{
   private String isbn;
   private String title;
   private String result;
   public String execute() throws Exception 
   {
	  result=all_sql_things.search_book_big(isbn);
	  ServletRequest request=ServletActionContext.getRequest();
	  HttpServletRequest req =(HttpServletRequest) request;
	  HttpSession sesssion=req.getSession();
	  sesssion.setAttribute("isbn",isbn);
	  sesssion.setAttribute("title", title);
	  //System.out.print("==============================================");
	  //System.out.print(isbn);
	  //System.out.print("==============================================");	  
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
   public String getResult() 
   {
      return result;
   }
   public void setResult(String result) 
   {
      this.result = result;
   }
   public String getTitle() 
   {
      return title;
   }
   public void setTitle(String title) 
   {
      this.title = title;
   }
}
