package com.tutorialspoint.struts2;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class Search_java
{
   private String name;
//   private String place;
   public String result;
   public String execute() throws Exception 
   {
	  setName(name);
	  result=name+"~";
	  result=result.concat(all_sql_things.search_author_name(name)); 
	  
	  ServletRequest request=ServletActionContext.getRequest();
	  HttpServletRequest req =(HttpServletRequest) request;
	  HttpSession sesssion=req.getSession();
	  sesssion.setAttribute("result", result);
      return "success_1";
   } 
   public String getName() 
   {
      return name;
   }
   public void setName(String name) 
   {
      this.name = name;
   }
   public String getResult() 
   {
      return result;
   }
}
