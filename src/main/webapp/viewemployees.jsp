<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Core = java core e.g. if/loops/print -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- fmt = formatting date/time/money etc -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- functions = useful for Strings -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Employees Page</title>
<%@include file="../tiles/boostrapheader.jsp" %>
<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.13/css/jquery.dataTables.css">
<link rel="stylesheet" href="css/login.css" type="text/css">
<script src="http://code.jquery.com/jquery.min.js"></script>
</head>
<body >
<%@include file="tiles/navbar.jsp" %>
<div style = "background-color: #59b9ff; border-radius: 10px;">
<table id="emp_table" style = "text-color: white;" >
		<thead>
			<tr>
				<th>USERNAME</th>
				<th>FIRST NAME</th>
				<th>LAST NAME</th>
				<th>EMAIL</th>
			</tr>
		</thead>
		<c:forEach items="${userList}" var="user">
		<tr>
			<td>${user.uUsername}</td>
			<td>${user.uFirstname}</td>
			<td>${user.uLastname}</td>
			<td>${user.uEmail}</td>
			</tr>
			</c:forEach>

	</table>
	
</div>
<script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.13/js/jquery.dataTables.js"></script>
<script>
$(document).ready( function () {
    $('#emp_table').DataTable();
} );
</script>
</body>
</html>