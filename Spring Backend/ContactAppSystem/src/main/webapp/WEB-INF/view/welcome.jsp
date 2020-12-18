<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<style>
body{
background:#00FFFF;
}
.loginbutton {
	margin-top:10%;
	margin-left:42%;
	border: 5px solid #666; 
	border-radius: 5px; 
	padding: 40px; 
	font-size: 17px;
	font-weight: bold;
	width: 220px; 
	padding: 5px 10px; 
	top:15px;
	margin-bottom: 15px;
	background: #cccccc;
}

.registerbutton {
	margin-top:10%;
	margin-left:42%;
	border: 5px solid #666; 
	border-radius: 5px; 
	padding: 40px; 
	font-size: 17px;
	font-weight: bold;
	width: 220px; 
	padding: 5px 10px; 
	top:15px;
	margin-bottom: 15px;
	background: #cccccc;
}

}
</style>
</head>
<body>
<h1 style="text-align:center">WELCOME</h1>

<input type="button" value="Login"
onclick="window.location.href = 'user/showlogin'; return false;"
class="loginbutton" />

<br>

<input type="button" value="Register"
onclick="window.location.href = 'user/showregister'; return false;"
class="registerbutton" />


</body>
</html>