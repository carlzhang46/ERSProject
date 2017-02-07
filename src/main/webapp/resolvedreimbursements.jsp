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
<title>Resolved Reimbursements</title>
<%@include file="../tiles/boostrapheader.jsp" %>
<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.13/css/jquery.dataTables.css">
<link rel="stylesheet" href="css/login.css" type="text/css">
<script src="http://code.jquery.com/jquery.min.js"></script>
</head>
<body >
<%@include file="tiles/navbar.jsp" %>
<h1 style="text-align: center; color: white;">Resolved Reimbursements</h1>
<div style = "background-color: #59b9ff; border-radius: 10px;">
<table id="resolved_reimbursement_table" style = "text-color: white;" >
		<thead>
			<tr>
				<th>ID</th>
				<th>Amount</th>
				<th>Description</th>
				<th>Receipt</th>
				<th>Time Submitted</th>
				<th>Time Resolved</th>
				<th>Author</th>
				<th>Resolver</th>
				<th>Type</th>
			</tr>
		</thead>
		<c:forEach items="${appRList}" var="appR">
		<tr>
			<td>${appR.rId}</td>
			<td>${appR.rAmount}</td>
			<td>${appR.rDescription}</td>
			<td>${appR.rReceipt}</td>
			<td>${appR.rSubmitted}</td>
			<td>${appR.rResolved}</td>
			<td>${appR.rAuthor}</td>
			<td>${appR.rResolver}</td>
			<td>${appR.rType}</td>
			
			</tr>
			</c:forEach>

	</table>
	
</div>
<script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.13/js/jquery.dataTables.js"></script>
<script>
$(document).ready( function () {
    $('#resolved_reimbursement_table').DataTable();
} );
</script>
</body>
</html>