<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
</head>
<body >
<center>
<br>
<a href=HomePage.jsp style="color:black;text-decoration:none ;font-size:35px;font-weight:bold;">FlyAway</a>
<br><br>

<h2 style="text-decoration: underline;">Insert New Flight Details</h2>

<div style="border:3px solid black;width:45%;border-radius:20px;padding:20px" align="center">
<form action=InsertFlight method=post>
	<label for=name>Name :-</label> <input type="text" name=name id=name /><br><br>
	<label for=from>From :-</label> <input type="text" name=from id=from /><br><br>
	<label for=to>To :-</label> <input type="text" name=to id=to /><br><br>
	<label for=departure>Departure :-</label> <input type="date" name=departure id=departure /><br><br>
	<label for=time>Time :-</label> <input type="time" name=time id=time /><br><br>
	<label for=price>Price :-</label> <input type="text" name=price id=price /><br><br>
	<input type=submit value=submit /> <input type=reset />
</form>
</div>

<%
	String message=(String)session.getAttribute("message");
	if(message!=null){
%>
<p style="color:silver;"><%=message %></p>
<%
		session.setAttribute("message", null);
	}
%>
</center>
</body>
</html>