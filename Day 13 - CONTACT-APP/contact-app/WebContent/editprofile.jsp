<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Edit My Profile</h2>
	<form action = "EditProfileServlet" method = "post">
		
		
		<label>
			Edit Name <input type = "text" name = "name">
		</label>
		<br />
		<label>
			Edit Number <input type = "text" name = "phone">
		</label>
		<br />
		<label>
			Edit Password <input type = "text" name = "password">
		</label>
		<br />
		
		<label>
			Edit Date of Birth <input type = "text" name = "dob">
		</label>
		<br />
		<input type = "submit" value = "Update">
	</form>

</body>
</html>