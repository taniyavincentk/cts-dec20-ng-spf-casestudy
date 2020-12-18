<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>

<link type="text/css" rel="stylesheet"
href="${pageContext.request.contextPath}/resources/css/loginstyle.css">

</head>
<body>
<form class=box action="loginUser" method="post">
<div>
                
                <h1>LOGIN</h1>
                <table>
                    <tr>
                       
                        <td>
                            <input type="text" name="username" placeholder="User Name" />
                        </td>
                    </tr>
                    
                    <tr>
                        
                        <td>
                            <input type="password" name="password" placeholder="Password"/>
                        </td>
                    </tr>
                    <tr>
                        
            </table>
            <input type="submit" value="Login"/>
            </div>
            ${msg}
            </form>
			
</body>
</html>