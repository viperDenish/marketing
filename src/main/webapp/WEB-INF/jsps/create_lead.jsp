<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Create New Lead</h1>
<form action="saveLead" method="post">
<pre>
First Name <input type="text" name= "firstName" />
Last Name <input type="text" name= "lastName" />
Email <input type="text" name= "email" />
Phone <input type="text" name= "phone" />
<input type="submit" value="save"/>
</pre>
</form>

${msg}

</body>
</html>