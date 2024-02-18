<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>${student }</h1>
	
	<hr>
	
	<h1>Student Name is:  ${student.name }</h1>
	<h1>Student ID:  ${student.id }</h1>
	<h1>Student DOB: ${student.date }</h1>
	<h1>Courses is:  ${student.courses }</h1>
	<h1>Student Gender:   ${student.gender }</h1>
	<h1>Student Type: ${student.type }</h1>
	<hr>
	<hr>
	
	<h1>Address Street is:  ${student.address.street }</h1>
	<h1>Address Street is:  ${student.address.city }</h1>
	
	

</body>
</html>