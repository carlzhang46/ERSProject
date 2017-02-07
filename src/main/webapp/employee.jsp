<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Homepage</title>
<%@include file="../tiles/boostrapheader.jsp" %>
<link rel="stylesheet" href="css/login.css" type="text/css">
</head>
<body>
<%@include file="tiles/navbar.jsp" %>
<h1 style = "text-align: center; color: white; ">WELCOME TO THE EMPLOYEE HOMEPAGE</h1>
<div class="container2">
<form method = POST>
		<br>
		<div class="row">
			<div class="col-md-3">
				<a href="viewAndUpdateEmpInfo.jsp" class="btn btn-primary btn-lg btn-block btn-huge">View and Update<br> Information</a>
			</div>
			<div class="col-md-3">
				<a href="submitrequest" class="btn btn-primary btn-lg btn-block btn-huge">Submit a <br>Reimbursement Request</a>
			</div>
			<div class="col-md-3">
				<a href="#" class="btn btn-primary btn-lg btn-block btn-huge">View <br>Requests</a>
			</div>
			<div class="col-md-3">
				<a href="#" class="btn btn-primary btn-lg btn-block btn-huge">Test
					button</a>
			</div>
			
		</div>

		<br>
		</form>
	</div>
</body>
</html>