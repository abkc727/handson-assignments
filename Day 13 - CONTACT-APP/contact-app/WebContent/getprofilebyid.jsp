<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Get Profile</h2>
	<form action = "GetProfileByIdServlet" method = "post">
		
		
		<label>
			ID <input type = "text" name = "id">
		</label>
		<br />
		
		<input type = "submit" value = "Get">
	</form>

</body>
</html>