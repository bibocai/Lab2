package com.tutorialspoint.struts2;
import java.sql.*;
public class all_sql_things 
{
	public static void insert_book(String ISBN ,String Title, String AuthorID ,String Publisher,String PublishDate, String Price) throws Exception
	{		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://bkhfkwqweuft.rds.sae.sina.com.cn:10594/bookdb";
		
		String user = "root";
		String password = "statham123";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		if(!conn.isClosed())
		{
			//System.out.println("connecting to the database successfully!");
		}		
		Statement statement = conn.createStatement();
				// select”Ôæ‰
		
		String sql = "insert into book value(";
		sql=sql.concat(ISBN);
		sql=sql.concat(",\"");
		sql=sql.concat(Title);
		sql=sql.concat("\",\"");
		sql=sql.concat(AuthorID);
		sql=sql.concat("\",\"");
		sql=sql.concat(Publisher);
		sql=sql.concat("\",\"");
		sql=sql.concat(PublishDate);
		sql=sql.concat("\",\"");
		sql=sql.concat(Price);
		sql=sql.concat("\")");
		//System.out.println(sql);
		
		statement.executeUpdate(sql);  
		conn.close();  
	}
	
	public static String search_author_id(String author) throws Exception
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://bkhfkwqweuft.rds.sae.sina.com.cn:10594/bookdb";
		String user = "root";
		String password = "statham123";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		if(!conn.isClosed())
		{
			//System.out.println("connecting to the database successfully!");
		}		
		Statement statement = conn.createStatement();
				// select”Ôæ‰
		String sql = "select * from book where authorID = "+author;
		//System.out.println(sql);
		ResultSet rs = statement.executeQuery(sql);  
		String to_return="";
		while(rs.next()) 
		{
			to_return=to_return.concat(rs.getString("ISBN"));
			to_return=to_return.concat("~");
			to_return=to_return.concat(rs.getString("Title"));
			to_return=to_return.concat("~");
		} 
		rs.close();
		conn.close();  
		return to_return;
	}

	public static void delete_book(String ISBN) throws Exception
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://bkhfkwqweuft.rds.sae.sina.com.cn:10594/bookdb";
		String user = "root";
		String password = "statham123";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		if(!conn.isClosed())
		{
			//System.out.println("connecting to the database successfully!");
		}		
		Statement statement = conn.createStatement();
				// select”Ôæ‰
		
		String sql = "delete from book where ISBN =\""+ISBN+"\";";
		
		//System.out.println(sql);
		statement.executeUpdate(sql);  
		conn.close();  
	}

	public static String search_book_big(String isbn) throws Exception
	{
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://bkhfkwqweuft.rds.sae.sina.com.cn:10594/bookdb";
		String user = "root";
		String password = "statham123";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		if(!conn.isClosed())
		{
			//System.out.println("connecting to the database successfully!");
		}		
		Statement statement = conn.createStatement();
				// select”Ôæ‰
		String sql = "select * from book where ISBN = "+isbn;
		//System.out.println(sql);
		ResultSet rs = statement.executeQuery(sql);  
		String to_return="";

		while(rs.next())
		{
			to_return=to_return.concat(rs.getString("ISBN"));
			to_return=to_return.concat("~");
			to_return=to_return.concat(rs.getString("Title"));
			to_return=to_return.concat("~");
			to_return=to_return.concat(rs.getString("AuthorID"));			
			to_return=to_return.concat("~");
			to_return=to_return.concat(rs.getString("Publisher"));
			to_return=to_return.concat("~");
			to_return=to_return.concat(rs.getString("PublishDate"));
			to_return=to_return.concat("~");
			to_return=to_return.concat(rs.getString("Price"));
		}		
		rs.close();
		conn.close();  
		return to_return;	
	}

	public static String search_author_name(String author_name) throws ClassNotFoundException, SQLException
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://bkhfkwqweuft.rds.sae.sina.com.cn:10594/bookdb";
		String user = "root";
		String password = "statham123";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		if(!conn.isClosed())
		{
			//System.out.println("connecting to the database successfully!");
		}		
		Statement statement = conn.createStatement();
				// select”Ôæ‰
		String sql = "select * from book where authorID in (select authorID from author where Name=\""+author_name+"\");";
		//System.out.println(sql);
		ResultSet rs = statement.executeQuery(sql);  
		String to_return="";
		while(rs.next()) 
		{
			to_return=to_return.concat(rs.getString("ISBN"));
			to_return=to_return.concat("~");
			to_return=to_return.concat(rs.getString("Title"));
			to_return=to_return.concat("~");
		} 
		rs.close();
		conn.close();  
		return to_return;
	}

	public static void insert_author(String authorID ,String Name, String Age ,String Country) throws Exception
	{		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://bkhfkwqweuft.rds.sae.sina.com.cn:10594/bookdb";
		String user = "root";
		String password = "statham123";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		if(!conn.isClosed())
		{
			//System.out.println("connecting to the database successfully!");
		}		
		Statement statement = conn.createStatement();
				// select”Ôæ‰
		
		String sql = "insert into author value(";
		sql=sql.concat(authorID);
		sql=sql.concat(",\"");
		sql=sql.concat(Name);
		sql=sql.concat("\",");
		sql=sql.concat(Age);
		sql=sql.concat(",\"");
		sql=sql.concat(Country);
		sql=sql.concat("\")");
		//System.out.println(sql);
		
		statement.executeUpdate(sql);  
		conn.close();  
	}
	
	public static boolean if_author_exist(String authorID) throws Exception
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://bkhfkwqweuft.rds.sae.sina.com.cn:10594/bookdb";
		String user = "root";
		String password = "statham123";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		if(!conn.isClosed())
		{
			//System.out.println("connecting to the database successfully!");
		}		
		Statement statement = conn.createStatement();
				// select”Ôæ‰
		String sql = "select * from author where authorID = "+authorID;
		//System.out.println(sql);
		ResultSet rs = statement.executeQuery(sql);  
		boolean to_return=false;
		while(rs.next()) 
		{
			to_return=true;
		} 
		rs.close();
		conn.close();  
		return to_return;
	}

	public static boolean if_book_exist(String ISBN) throws Exception
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://bkhfkwqweuft.rds.sae.sina.com.cn:10594/bookdb";
		String user = "root";
		String password = "statham123";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		if(!conn.isClosed())
		{
			//System.out.println("connecting to the database successfully!");
		}		
		Statement statement = conn.createStatement();
				// select”Ôæ‰
		String sql = "select * from book where ISBN = "+ISBN;
		//System.out.println(sql);
		ResultSet rs = statement.executeQuery(sql);  
		boolean to_return=false;
		while(rs.next()) 
		{
			to_return=true;
		} 
		rs.close();
		conn.close();  
		return to_return;
	}

	
	public static String search_author_details(String author) throws Exception
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://bkhfkwqweuft.rds.sae.sina.com.cn:10594/bookdb";
		String user = "root";
		String password = "statham123";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		if(!conn.isClosed())
		{
			//System.out.println("connecting to the database successfully!");
		}		
		Statement statement = conn.createStatement();
				// select”Ôæ‰
		String sql = "select * from author where authorID = "+author;
		//System.out.println(sql);
		ResultSet rs = statement.executeQuery(sql);  
		String to_return="";
		while(rs.next()) 
		{
			to_return=to_return.concat(rs.getString("AuthorID"));
			to_return=to_return.concat("`");
			to_return=to_return.concat(rs.getString("Name"));
			to_return=to_return.concat("`");
			to_return=to_return.concat(rs.getString("Age"));
			to_return=to_return.concat("`");
			to_return=to_return.concat(rs.getString("Country"));
			to_return=to_return.concat("~");
		} 
		rs.close();
		conn.close();  
		return to_return;
	}
	
	public static String search_book_return_authorID(String isbn) throws Exception
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://bkhfkwqweuft.rds.sae.sina.com.cn:10594/bookdb";
		String user = "root";
		String password = "statham123";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		if(!conn.isClosed())
		{
			//System.out.println("connecting to the database successfully!");
		}		
		Statement statement = conn.createStatement();
				// select”Ôæ‰
		String sql = "select authorID from book where isbn = "+isbn;
		//System.out.println(sql);
		ResultSet rs = statement.executeQuery(sql);  
		String to_return="";
		while(rs.next()) 
		{
			to_return=to_return.concat(rs.getString("AuthorID"));
		} 
		rs.close();
		conn.close();  
		return to_return;
	}
}