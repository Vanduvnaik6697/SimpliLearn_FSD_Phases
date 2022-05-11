<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="https://www.thymeleaf.org"
	xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
<title>Login</title>
</head>
<body style="background-color: #c1c1c1;">
	<center>
		<div th:if="${param.error}">Invalid username or password.</div>
		<div th:if="${param.logout}">You have been logged out.</div>
		<form th:action="@{/login}" method="post"
			style="margin: auto; width: 220px;">
			<div>
				<label> User Name : <input type="text" name="username" />
				</label><br>
				<br>
			</div>
			<div>
				<label> Password: <input type="password" name="password" />
				</label><br>
				<br>
			</div>
			<div>
				<input type="submit" value="Sign In" /><br>
				<br>
			</div>
		</form>

		<a href="/"><button>Back to Main Page</button></a>
	</center>
</body>
</html>