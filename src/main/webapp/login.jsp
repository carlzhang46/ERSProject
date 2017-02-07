<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Login Page</title>
<%@ include file="/tiles/boostrapheader.jsp"%>
<link rel="stylesheet" href="css/login.css" type="text/css">
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>

	<!--  include file="tiles/navbar.jsp"-->



<div class="container">
    <div class="row">
        <div class="col-md-offset-5 col-md-3">
        	<form method="POST" action="login">
            <div class="form-login">
            <h4 style = "font-family: 'Helvetica';">Welcome To Employee Reimbursement</h4>
            <input type="text" name="userName" id="username"class="form-control input-sm chat-input" placeholder="username"/>
            </br>
            <input type="password" name="userPassword" id="password" class="form-control input-sm chat-input" placeholder="password" />
            </br>
            
            <input class = "btn btn-success" type="submit" value="Login">
            
            </div>
        	</form>
        </div>
    </div>
</div>
</body>
</html>