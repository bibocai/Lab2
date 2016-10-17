<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Insert an author</title>
</head>
<body background="background.jpg" >
	<div class="area">
	<h2>Insert a author</h2>
	<p>input information about a new author</p>
	<form action="insert_a_author">
		<p>AuthorID: <input type="text" name="author_id" pattern="^[0-9]{1,12}$" placeholder="eg:1234" required="required" /></p>
	  	<p>Name: <input type="text" name="name"  required="required"/></p>
	 	<p>Age: <input type="text" name="age"  pattern="^1?[0-9]?[0-9]$" required="required" /></p>
	 	<p>Country: <input type="text" name="country" required="required" /></p>
	  	<input type="submit" value="Insert this author into database" />
	</form>
	</div>	    
<br><a href="index.jsp">Return home page</a>
</body>
</html>