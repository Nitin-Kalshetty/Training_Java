<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String s=request.getContextPath(); %><br/>
Home page
<a href="param?name=tv">buy</a>
<a href="<%=s%>/register">register</a>
<!-- <a href="admin/profile?name=tv&price=55545">buy TV</a>
<a href="admin/profile?name=AC&price=33445">buy AC</a>
<a href="admin/profile?name=car&price=5534545">buy CAR</a> -->
<form action="admin/profile" method="POST" >
		<input type="text" name="username"/>
		<input type="text" name="mobile"/>
		<input type="text" name="city"/>
		<input type="submit" value="store">
</form>
</body>
</html>