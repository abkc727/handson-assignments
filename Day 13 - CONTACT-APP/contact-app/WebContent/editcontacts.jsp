<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Edit Contact</h2>
	<form action = "EditContactServlet" method = "post">
		<label>
			Enter the contact id <input type = "text" name = "id">
		</label>
		<br />
		
		<label>
			Edit Contact Name <input type = "text" name = "name">
		</label>
		<br />
		<label>
			Edit Contact Number <input type = "text" name = "phone">
		</label>
		<br />
		<input type = "submit" value = "Update">
	</form>
	

</body>
</html>