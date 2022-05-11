<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="Product" method="post">
			<table>
				<tr>
					<td align="left">Product ID :</td>
					<td><input type="text" name="pid"></td>
				</tr>
				<tr>
					<td align="left">Product Name :</td>
					<td><input type="text" name="pname"></td>
				</tr>
				<tr>
					<td align="left">Product Description :</td>
					<td><input type="text" name="pdescription"></td>
				</tr>
				<tr>
					<td align="left">Product price :</td>
					<td><input type="text" name="pprice"></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="Submit"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>