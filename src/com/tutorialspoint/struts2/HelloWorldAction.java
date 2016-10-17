package com.tutorialspoint.struts2;
public class HelloWorldAction
{
   private String name;
   public String execute() throws Exception 
   {
      return "success";
   } 
   public String getName() 
   {
      return name;
   }
   public void setName(String nbme) 
   {
      this.name = nbme;
   }
}
