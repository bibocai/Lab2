<%@ page contentType="text/html; charset=utf-8"%>
<%@page import="com.tutorialspoint.struts2.Search_java"%>
<%@page import="com.opensymphony.xwork2.Result"%>
<%@ page language="java"  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book details</title>
</head>
<body background="background.jpg" >
  <%
    String big_string=request.getAttribute("result").toString();
    String string_arr[]=big_string.split("~");
  
    String author_arr[]=string_arr[0].split("`");
    
    out.print("Author details:<br>");
	out.print("	<table border=\"1\"> <tr> <th>AuthorID</th> <th>Name</th> <th>Age</th> <th>Country</th> </tr>");
	
	
	int j=0;
    out.print("<tr><td>");		
	out.print(author_arr[j++]);    	
	out.print("</td><td>");
	out.print(author_arr[j++]);
	out.print("</td><td>");
	out.print(author_arr[j++]);
	out.print("</td><td>");
	out.print(author_arr[j++]);
	out.print("</td></tr>");
	out.print("</table>");
	
    
    
//	out.print(string_arr[0]);    
    int book_numbers=string_arr.length;

    out.print("Book details:<br>");
    out.print("	<table border=\"1\"> <tr> <th>ISBN</th> <th>Title</th> <th>AuthorID</th> <th>Publisher</th> <th>PublishDate</th> <th>Price</th> </tr>");

    
    int i=1;
    out.print("<tr><td>");		
	out.print(string_arr[i++]);    	
	out.print("</td><td>");
	out.print(string_arr[i++]);
	out.print("</td><td>");
	out.print(string_arr[i++]);
	out.print("</td><td>");
	out.print(string_arr[i++]);
	out.print("</td><td>");
	out.print(string_arr[i++]);
	out.print("</td><td>");
	out.print(string_arr[i++]);
	out.print("</td></tr>");
	out.print("</table>");
	
	out.print("<a  href=\"delete_java?isbn="+(string_arr[1])+"\">");
	out.print("Delete this book");
	out.print("</a>");

	out.print("<br>");
	out.print("<a  href=\"book_detail_edit?isbn="+string_arr[1]+"&"+"title="+string_arr[2]+"\">");
	out.print("Update this book");
	out.print("</a>");
	
  %>
<br><a href="index.jsp">Return home page</a>
</body>
</html>