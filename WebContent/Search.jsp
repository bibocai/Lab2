<%@ page contentType="text/html; charset=utf-8"%>
<%@page import="com.tutorialspoint.struts2.Search_java"%>
<%@page import="com.opensymphony.xwork2.Result"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<%@ page language="java"  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search results</title>
</head>
<body background="background.jpg" >

   	All books written by author:    
    <%
    
    String big_string=request.getAttribute("result").toString();
    String string_arr[]=big_string.split("~");
    int book_numbers=string_arr.length-1;
    if(book_numbers!=0)
    {
    	out.print(string_arr[0]+"<br>");
        out.print("	<table border=\"1\"> <tr> <th>Isbn</th> <th>Name</th> </tr>");
        
        for(int i=1;i<book_numbers;i=i+2)
        {
        	out.print("<tr><td>");	
        	out.print(string_arr[i]);    	
        	out.print("</td><td>");
        	out.print("<a href=\"detail_java?isbn="+(string_arr[i])+"\">");
        	out.print(string_arr[i+1]);
        	out.print("</a>");
        	out.print("</td></tr>");  	
        }
        out.print("</table>");    	
    }
    else
    {
    	out.print(string_arr[0]+"<br>");
    	out.print("None");	
    }
    %>
    
    
<br><a href="index.jsp">Return home page</a>
</body>
</html>
