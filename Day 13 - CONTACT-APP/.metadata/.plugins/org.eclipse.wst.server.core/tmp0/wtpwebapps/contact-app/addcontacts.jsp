<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h2>Add new contact</h2>

	<form action = "AddContactsServlet" method = "post">
			<label>
				Name <input type = "text" name = "name">
			</label>
			<br />
			
			<label>
				Phone Number <input type = "text" name = "phone">
			</label>
			<br />
			
			
			<input type = "submit" value = "Add contact">
				
			
	
	</form>
	
	
</body>
</html>