package com.login;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
* Servlet implementation class Dash
*/
@WebServlet("/Dash")
public class Dash extends HttpServlet {
private static final long serialVersionUID = 1L;

 /**
 * @see HttpServlet#HttpServlet()
 */
 public Dash() {
 super();
 // TODO Auto-generated constructor stub
 }
/**
* @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
*/protected void service(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
response.setContentType("text/html");
String username=request.getParameter("username");
String password=request.getParameter("password");
RequestDispatcher rd=null;
if(username!=null && username.equalsIgnoreCase("Bikki") && password!=null &&
password.equalsIgnoreCase("bikki@084")){
rd=request.getRequestDispatcher("SuccessServlet");
rd.forward(request, response);}
else{
rd=request.getRequestDispatcher("login.html");
PrintWriter out=response.getWriter();
rd.include(request, response);
out.print("<center><span style='color:red'>Invalid Credentials!!</span></center>");
}
String url=request.getRequestURI().toString();
PrintWriter pw=response.getWriter();
pw.print("<center><h4><a href=Logout?>logout</a></h4></center>");
}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
/* RequestDispatcher rd=null;
if(username!=null && username.equalsIgnoreCase("rohan") && password!=null &&
password.equalsIgnoreCase("raghav")){
rd=request.getRequestDispatcher("SuccessServlet");
	rd.forward(request, response);}
	else{
	rd=request.getRequestDispatcher("login.html");
	PrintWriter out=response.getWriter();
	rd.include(request, response);
	out.print("<center><span style='color:red'>Invalid
	Credentials!!</span></center>");
	}*/
	}
	}