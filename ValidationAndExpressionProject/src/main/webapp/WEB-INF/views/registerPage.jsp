<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>User Registration Page</h1>
	
	<spring:form action="store" method="post" modelAttribute="user">
		<spring:input path="name" placeholder="Enter the username" />
		<spring:input path="email" placeholder="Enter the email" />
		<spring:input path="mobile" placeholder="Enter the mobile" />
		<input type="submit" value="Submit" />
	</spring:form>

	
</body>
</html>