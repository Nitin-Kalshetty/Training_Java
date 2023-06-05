<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  modelattr will search for user key in incoming request -->
<spring:form action="store" method="POST" modelAttribute="user">
	Name: <spring:input path="name"/>
	Mobile: <spring:input path="mobile"/>
	Email: <spring:input path="email"/>
	<input type="submit" value="store"/>
</spring:form>
<!-- <form action="store" method="POST">
	Name: <input name="name"/>
	Mobile: <input name="mobile"/>
	Email: <input name="email"/>
	<input type="submit" value="store"/>
</form> -->
</body>
</html>