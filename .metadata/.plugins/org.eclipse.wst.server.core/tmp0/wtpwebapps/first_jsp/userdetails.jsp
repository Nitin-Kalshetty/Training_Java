<%@ page isELIgnored="false"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>I am User Details JSP page</h1>
	<h2>User Name :  ${requestScope.username}   </h2>
	<h2>Password :  ${requestScope.password}   </h2>
	<h2>Mobile :  ${requestScope.mobile}   </h2>
	<h2>City :  ${requestScope.city}   </h2>
	<h2>Address :  ${requestScope.address}   </h2>
</body>
</html>