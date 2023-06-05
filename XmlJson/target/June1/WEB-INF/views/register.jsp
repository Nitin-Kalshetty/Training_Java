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
<h1>Hi hello</h1>
<spring:form action="store" method="post" modelAttribute="helper"> 

	<spring:input path="user.name" placeholder="enter the username"  />
	<spring:input path="user.email" placeholder="enter the email" />
	<spring:input path="user.mobile" placeholder="enter the mobile" />
	<spring:input path="user.address.road" placeholder="enter the road" />
	<spring:input path="user.address.area" placeholder="enter the area" />
	<spring:input path="user.address.city"  placeholder="enter the city"/>
	<spring:input path="user.address.state" placeholder="enter the state"/>
	<spring:input path="user.address.pincode" placeholder="enter the pincode" />
	
	<input type="submit" value="Submit" />


</spring:form>
</body>
</html>