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
<label for="gender" ><b>Gender</b></label>
<br>
<input type="radio" name="gender" value="male" />MALE  <br>
<input type="radio" name="gender" value="female" />FEMALE <br>
<input type="radio" name="gender" value="others" />OTHERS <br>
<br>
<br>

<label for="selectstate"><b>State</b> </label>
<select name="selectstate" >
<c:forEach items="${requestScope.allstates}"  var="state">
<option  value="${state}">${state}</option>
</c:forEach>
</select>
<br>
<br>

<label for="selectcourses" ><b>Courses</b></label>
<br>
<br>
<c:forEach items="${requestScope.allcourses}"  var="course">
<input type="checkbox" name="selectcourses" value="${course}" /> ${course}
<br>
</c:forEach>
<br>
<br>

<input type="submit" value="Submit" />

</form>

</body>
</html>