<%@page import="java.util.List"%>
<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>User Details</h1>
<form action="display.jsp" method="POST" >
<input placeholder="Enter the userName" name="username" />
<br>
<br>
<input placeholder="enter the password" name="password" />
<br>
<br>
<input placeholder="enter the mobile" name="mobile" />
<br>
<br>
<label for="gender" >Gender</label>
<br>
<input type="radio" name="gender" value="male" />MALE
<input type="radio" name="gender" value="female" />FEMALE
<input type="radio" name="gender" value="others" />OTHERS
<br>
<br>

<label for="selectstate">State</label>
<select name="selectstate" >
<c:forEach items="${requestScope.allstates}"  var="state">
<option  value="${state}">${state}</option>
</c:forEach>
</select>
<br>
<br>

<label for="selectcourses" >Courses</label>
<br>
<br>
<c:forEach items="${requestScope.allcourses}"  var="course">
<input type="checkbox" name="selectcourses" value="${course}" /> ${course}
</c:forEach>
<br>
<br>

<input type="submit" value="Submit" />

</form>

</body>
</html>