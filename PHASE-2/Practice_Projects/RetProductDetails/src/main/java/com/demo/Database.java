package com.demo;

import java.io.*;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class Database
 */
@WebServlet("/Database")
public class Database extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
response.setContentType("text/html");
PrintWriter out=response.getWriter();
//out.print("the product details");
String productId=request.getParameter("product_id");
try{
Class.forName("com.mysql.jdbc.Driver");
Connection
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","root","root");
 PreparedStatement ps=conn.prepareStatement("select * from product where product_id=?");
 ps.setInt(1,Integer.parseInt(productId));
 out.print("<table width=25% border=1>");
 ResultSet rs=ps.executeQuery();
 ResultSetMetaData rsmd=rs.getMetaData();
 if(rs.next()){
 out.print("Entered ProductId Details \n");
 out.print("<td>"+rsmd.getColumnName(1)+"</td>");
 out.print("<td>"+rsmd.getColumnName(2)+"</td>");
 out.print("<td>"+rsmd.getColumnName(3)+"</td>");
 out.print("<td>"+rsmd.getColumnName(4)+"</td>");
 out.print("<td>"+rsmd.getColumnName(5)+"</td>");
out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getInt(5)+"</td></tr>");

 }else{
 RequestDispatcher rd=null;
 rd=request.getRequestDispatcher("login.html");
 rd.include(request, response);
 out.print("<center><span style='color:red'>Invalid Product Id</span></center>");
 }
}catch(Exception e){
 e.printStackTrace();

}
}
}