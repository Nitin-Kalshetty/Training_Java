<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC</title>
</head>
<body>
	<h1>Register User</h1>
	<form action="" method="POST">
		<input placeholder="Enter the user Name" name="username" /> <br>
		<br> <input placeholder="Enter the password" name="password"
			type="password" /> <br> <br> <input
			placeholder="Enter the mobile" name="mobile" type="tel" /> <br>
		<br> <label for="database"><b>Database</b></label> <br> <input
			type="radio" name="database" value="oracle" />ORACLE <br> <input
			type="radio" name="database" value="mysql" />MYSQL <br> <br>
		<br> <input type="submit" value="submit" />


	</form>
</body>
</html>