<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Display Form Data</h1>

    <p>Username: 
    <c:out value="${param.username}" /> </p>
    <br>
   
    <p>Password: <c:out value="${param.password}" />    
    </p>
    <br>
   
    <p>Mobile: <c:out value="${param.mobile}" />
    </p>
    <br>
   
    <p>Gender: <c:out value="${param.gender}" />
    </p>
    
    <br>
    <p>State: <c:out value="${param.selectstate}" />
    </p>
   
    <br>
    <h3>Selected Courses:</h3>
    <c:if test="${empty paramValues.selectcourses}">
    	<p>You haven't selected any courses......</p>
    </c:if>
    <c:if test="${not empty paramValues.selectcourses}">
    <c:forEach items="${paramValues.selectcourses}"  var="course">
    <br>
	${course}
	</c:forEach>
    </c:if>
	
	<br>

	<h3>Thanks for Registering</h3>
    
	
</body>
</html>