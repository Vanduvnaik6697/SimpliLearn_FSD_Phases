package com.login;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
* Servlet implementation class Logout
*/
@WebServlet("/Logout")
public class Logout extends HttpServlet {
private static final long serialVersionUID = 1L;

 /**
 * @see HttpServlet#HttpServlet()
*/
public Logout() {
super();
// TODO Auto-generated constructor stub
}
protected void service(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
PrintWriter out=response.getWriter();
out.print("logout Succesfully");
}
}
