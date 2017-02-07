<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manager Homepage</title>
<%@include file="../tiles/boostrapheader.jsp"%>
<link rel="stylesheet" href="css/login.css" type="text/css">
</head>
<body>
	<%@include file="tiles/navbar.jsp"%>
	<h1 style="text-align: center; color: white;">WELCOME TO THE
		MANAGER HOMEPAGE</h1>

	<div class="container2">
		<br>
		<div class="row">
			<div class="col-md-3">
				<form method=POST action="pendingreimbursements">
					<button class="btn btn-primary btn-lg btn-block btn-huge">
						View Pending<br>Reimbursements Requests
					</button>
				</form>
			</div>
			<div class="col-md-3">
				<form method=POST action="resolvedreimbursements">
					<button class="btn btn-primary btn-lg btn-block btn-huge">
						View Resolved<br>Reimbursement Requests
					</button>
				</form>
			</div>
			<div class="col-md-3">
				<form method=POST action="viewemployees">
					<button class="btn btn-primary btn-lg btn-block btn-huge">
						View<br>Employees
					</button>
				</form>
			</div>
			<div class="col-md-3">
			<form method=POST action="requestsperuser">
				<button class="btn btn-primary btn-lg btn-block btn-huge">Find
					Requests<br>By Employee
				</button>
				</form>
			</div>

		</div>

		<br>
	</div>

</body>
</html>