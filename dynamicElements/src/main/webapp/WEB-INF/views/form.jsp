<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Enter your bank:
	<spring:form action="store" method="post" modelAttribute="bank">
	<spring:select path="bankName" >
	<spring:options items="${list}"/>
    <%-- <spring:option value="RBI">RBI</spring:option >
    <spring:option  value="SBI">SBI</spring:option >
    <spring:option  value="BankOfBaroda">BankOfBaroda</spring:option >
    <spring:option value="AndhraBank">AndhraBank</spring:option >
    <spring:option value="AbcBank">AbcBank</spring:option > --%>
  </spring:select>
  <input type="submit" value="store"/>
	</spring:form>
</body>
</html>