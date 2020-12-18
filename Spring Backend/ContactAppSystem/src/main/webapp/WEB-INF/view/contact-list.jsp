<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Page</title>

<link type="text/css" rel="stylesheet"
href="${pageContext.request.contextPath}/resources/css/tablestyle.css">

</head>
<body>
<div id="wrapper">
<div id="header">
<h1>Contact Manager</h1>
</div>
</div>
<br>
<br>
<input type="button" value="Add contact"
onclick="window.location.href = 'showFormForAddContact'; return false;"
class="add-button" />

<input type="button" value="Logout"
onclick="window.location.href = 'showlogin'; return false;"
class="logout-button" />


<br>

<table id="Contacts" >

<tr>
<th>Name</th>
<th>Phone</th>
<th>Action</th>
</tr>


<c:forEach var="tempContact" items="${contact}">

<c:url var="updateLink" value="/contact/showFormForUpdate">
<c:param name="contactId" value="${tempContact.id}"></c:param>
</c:url>

<c:url var="deleteLink" value="/contact/delete">
<c:param name="contactId" value="${tempContact.id}"></c:param>
</c:url>

<tr>
<td>${tempContact.name}</td>
<td>${tempContact.phn}</td>
<td><a href="${updateLink}">Update</a>|
<a href="${deleteLink}" onclick="if(!(confirm('Are you sure to delete'))) return false">Delete</a></td>
</tr>
</c:forEach>
</table>


</body>
</html>
