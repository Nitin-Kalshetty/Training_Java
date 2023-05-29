<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>I am Non Expression User Details JSP page</h1>
<h2>User Name :  
	<% out.println(request.getAttribute("username")); %>
   </h2>
   <h2>Password :  
	<% out.println(request.getAttribute("password")); %>
   </h2>
   <h2>Mobile :  
	<% out.println(request.getAttribute("mobile")); %>
   </h2>
   <h2>City :  
	<% out.println(request.getAttribute("city")); %>
   </h2>
   <h2>Address :  
	<% out.println(request.getAttribute("address")); %>
   </h2>
</body>
</html>