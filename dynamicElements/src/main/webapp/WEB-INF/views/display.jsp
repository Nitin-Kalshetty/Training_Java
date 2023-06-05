<%@page import="com.clayfin.model.BankList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%BankList b = (BankList) request.getAttribute("bank");
out.println(b);%>


</body>
</html>