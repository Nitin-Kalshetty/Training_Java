<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
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
<form action="${pageContext.request.contextPath}/admin/profile" method="POST" >
		<input type="text" name="username"/>
		<input type="text" name="mobile"/>
		<input type="text" name="city"/>
		<input type="submit" value="store">
</form>
<%-- <spring:form action="${pageContext.request.contextPath}/submit" method="post"  modelAttribute="lg">
        <spring:input type="date" path="loginDate"/>
        <br>
        <input type="submit" value="Submit">
    </spring:form> --%>
    
    <form action="${pageContext.request.contextPath}/items1" method="POST" >
    	<select name="items" multiple>
    		<option value="one">one</option>
    		<option value="two">two</option>
    		<option value="three">three</option>
    	</select>
    	<input type="submit" value="save">
    </form>
    
    
</body>
</html>