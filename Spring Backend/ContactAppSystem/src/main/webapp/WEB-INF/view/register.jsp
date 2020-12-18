<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
  <style>
  #co{
    width: 125px;
    }
        </style>
<meta charset="ISO-8859-1">
<title>Add Customer</title>


<link type="text/css" rel="stylesheet"
href="${pageContext.request.contextPath}/resources/css/formstyle.css">

</head>
<body>
<form:form class="box1" action="saveUser" modelAttribute="user"
method="POST">
<form:hidden path="id" />
<div>
<h1>Registration Details</h1>
<table >

<tr>
<td><label>First Name</label></td>
<td><form:input id="co" path="firstName" />
<form:errors path="firstName" cssClass="error"/>
</td>
</tr>
<tr>
<td><label>Password</label></td>
<td><form:input id="co" type="Password" path="userPass" />

<form:errors path="userPass" cssClass="error"/>
</td>
</tr>

<tr>
<td><label>Date of Birth</label></td>
<td><form:input id="co"  type="date" path="dob"  />
<form:errors path="dob" cssClass="error"/>
</td>
</tr>

<tr>
<td><label>Phone no</label></td>
<td><form:input id="co" path="phn" />
<form:errors path="phn" cssClass="error"/>
</td>
</tr>

</table>


</div>
<div style="text-align:center">  
    <input type="submit" />  
</div> 
</form:form>


</body>
</html>