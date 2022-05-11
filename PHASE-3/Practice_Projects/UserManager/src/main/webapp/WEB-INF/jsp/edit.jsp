<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<style>
table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body style="background-color: E2E5DE;">
	<center>
		<h2>Edit User</h2>

		<table>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Password</th>
			</tr>
			<c:forEach items="${users}" var="user" varStatus="count">
				<tr id="${count.index}">
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.email}</td>
					<td>${user.password}</td>
				</tr>
			</c:forEach>
		</table>
		<br> <br> <br>
		<form action="/edit" method="post">
			<br> <br> <br> <label for="name">Name: </label> <input
				type="text" id="name" name="name"><br> <br> <label
				for="email">Email:</label> <input type="text" id="email"
				name="email"><br> <br> <label for="password">Password:</label>
			<input type="text" id="password" name="password"><br> <br>
			<input type="submit" value="Enter">
		</form>
		<a href="users">
			<button>Back</button>
		</a>
	</center>
</body>
</html>