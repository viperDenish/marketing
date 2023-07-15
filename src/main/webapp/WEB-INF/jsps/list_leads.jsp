<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>

<table border="1">

<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Phone</th>
</tr>

<c:forEach var="lead" items= "${leads}">
<tr>
<td>${lead.firstName}</td>
<td>${lead.lastName}</td>
<td>${lead.email}</td>
<td>${lead.phone}</td>
<td><a href="deleteLead?id=${lead.id}">delete</a></td>
<td> <a href= "updateLead?id=${lead.id}">Update</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>