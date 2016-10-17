<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Update </title>
</head>
<body background="background.jpg" >
	<div class="area">
	<h2>Edit</h2>
	<p>input messages of a book.</p>
	<form action="edit_java">
	
	<%
	String isbnString=new String(request.getAttribute("isbn").toString().getBytes("ISO-8859-1"),"gb2312");
	String titleString=new String(request.getAttribute("title").toString().getBytes("ISO-8859-1"),"gb2312");
	%>
	
 	  	<p>ISBN: <input value=<%=isbnString%> name="isbn" readonly="readonly"/></p>
	  	<p>Title:<input value=<%=titleString%>  name="title"  readonly="readonly" /></p>
		<p>AuthorID: <input type="text" name="author_id" pattern="^[0-9]{1,12}$" placeholder="eg:1234" required="required" /></p>
	 	<p>Publisher: <input type="text" name="publisher" placeholder="eg:Tom cat"  required="required"/></p>
	  	<p>PublishDate: <input type="text" name="publish_date" placeholder="eg:1949-10-01" pattern="^[12][0-9][0-9][0-9]-[01][0-9]-[0-3][0-9]$" required="required"/></p>
	  	<p>Price: <input type="text" name="price" pattern="^[0-9]+.?[0-9]*$" placeholder="eg:88.99" required="required"/></p>
	  	<input type="submit" value="Insert this book into database" />
	</form>
	</div>
	     
</body>
</html>