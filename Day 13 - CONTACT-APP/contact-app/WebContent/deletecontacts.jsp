<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Delete Contact!</h3>
	<form action = "DeleteContactServlet" method = "post">
		<label>
			Enter the contact id <input type = "text" name = "id">
		</label>
		
		<input type = "submit" value = "Delete">
	</form>
		

</body>
</html>