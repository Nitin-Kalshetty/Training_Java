<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<spring:form method="post" action="store" modelAttribute="user">
		<spring:input path="name" placeholder="enter the name" />
		<spring:input path="mobile" placeholder="enter the mobile" />
		<spring:input path="city" placeholder="enter the city" />
		<input type="submit" value="Submit" />
	</spring:form>

</body>
</html>