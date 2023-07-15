<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Leads</title>
</head>
<body>

<h1>Update Lead</h1>

<form action="updatedLead" method="post">
<input type="hidden" value="${lead.id}" name="id">
FirstName <input type="text" value="${lead.firstName}" name="firstName">
LastName <input type="text" value="${lead.lastName}" name="lastName">
Email <input type="email" value="${lead.email}" name="email">
Phone <input type="text" value="${lead.phone}" name="phone">

<input type="submit" value="update">

</form>

</body>
</html>