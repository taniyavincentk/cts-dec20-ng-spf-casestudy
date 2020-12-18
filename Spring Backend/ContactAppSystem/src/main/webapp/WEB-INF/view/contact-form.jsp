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
<form:form class="box1" action="saveContact" modelAttribute="contact"
method="POST">
<form:hidden path="id" />
<div>
<h1>Contact Data</h1>
<table >

<tr>
<td><label>Name</label></td>
<td><form:input id="co" path="name" />
<form:errors path="name" cssClass="error"/>
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
<p>
<a href="${pageContext.request.contextPath}/user/list">Back to
List</a>
</p>

</body>
</html>