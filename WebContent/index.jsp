<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<style>
.area {
float: left;
margin: 5px;
padding: 15px;
width: 300px;
height: 400px;
border: 1px solid black;
} 
</style>
<title>library </title>
</head>
<body background="background.jpg" >

	<div class="area" align="left">
	<h2 align="center">Search name</h2>
	<p>Input an author's name and find all his/her books.</p>
	<form action="search">
	    <p>Name: <input type="text" name="name"  placeholder="eg:luxun" required="required" /></p>
	    <input  type="submit" value="Search"/> 
	</form>
	</div>

	<div class="area" align="right">
	<h2 align="left">Insert</h2>
	<p>Input messages of a book.</p>
	<form action="insert_a_book">
	  	<p>ISBN: <input type="text" name="isbn"  placeholder="eg:1122334455667" pattern="^[0-9]{13}$" required="required"/></p>
	 	<p>Title: <input type="text" name="title" placeholder="eg:Computer design" required="required" /></p>
		<p>AuthorID: <input type="text" name="author_id" pattern="^[0-9]{1,12}$" placeholder="eg:1234" required="required" /></p>
	 	<p>Publisher: <input type="text" name="publisher" placeholder="eg:Tom cat"  required="required"/></p>
	  	<p>PublishDate: <input type="text" name="publish_date" placeholder="eg:1949-10-01" pattern="^[12][0-9][0-9][0-9]-[01][0-9]-[0-3][0-9]$" required="required"/></p>
	  	<p>Price: <input type="text" name="price" pattern="^[0-9]+.?[0-9]*$" placeholder="eg:88.99" required="required"/></p>
	  	<input type="submit" value="Insert this book into database" />
	</form>
	</div>

	     
</body>
</html>