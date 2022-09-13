<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<th>ID</th>
<th>NAME</th>
<th>SALARY</th>
</tr>

<tr>
<td>${employee.id}</td>
<td>${employee.name}</td>
<td>${employee.salary}</td>

</tr>
</table>

</body>
</html>