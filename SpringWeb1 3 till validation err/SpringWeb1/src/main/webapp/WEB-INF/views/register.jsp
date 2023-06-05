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
<% int id=90;%>
<a href="admin/id=<%= id%>">click</a>
<!--  modelattr will search for user key in incoming request -->
<spring:form action="store" method="POST" modelAttribute="user">

	Name: <spring:input path="uname"/>	
	Mobile: <spring:input path="mobile"/>
	Email: <spring:input path="email"/>
	<spring:errors path="uname"></spring:errors>
	<spring:errors path="mobile"></spring:errors>
	<spring:errors path="email"></spring:errors>
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