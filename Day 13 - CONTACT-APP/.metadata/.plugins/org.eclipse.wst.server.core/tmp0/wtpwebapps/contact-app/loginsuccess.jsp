<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome to Login Success Page</h3>
	<p>Id: ${profileKey.profileId}, Name : ${profileKey.name}, Phone: ${profileKey.phone}</p>
	<br />
	<a href = "editprofile.jsp">Edit Profile</a><br />
	<a href = "addcontacts.jsp">Add Contacts</a><br />
	<a href = "ViewAllContactsServlet">View All Contacts</a><br />
	<a href = "editcontacts.jsp">Edit Contacts</a><br />
	<a href = "deletecontacts.jsp">Delete Contacts</a><br />
	<a href = "deleteprofile.jsp">Delete My Profile</a><br />
	<a href = "LogoutServlet">Log Out</a>	
	
</body>
</html>