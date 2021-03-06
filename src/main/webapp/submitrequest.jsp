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
<title>Reimbursement Request Submission Page</title>
<%@include file="tiles/boostrapheader.jsp"%>
<link rel="stylesheet" href="css/login.css" type="text/css">
</head>
<body>
	<%@include file="tiles/navbar.jsp"%>
	<div class="requestform">
		<form class="form-horizontal" method="POST" action="submitreimbursement">
			<fieldset>

				<!-- Form Name -->
				<legend style="color: white;">Reimbursement Request Form</legend>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="r_amount">Reimbursement
						Amount</label>
					<div class="col-md-4">
						<input id="r_amount" name="r_amount" type="number"
							placeholder="amount" class="form-control input-md" required="">

					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="r_description">Description</label>
					<div class="col-md-4">
						<input id="r_description" name="r_description" type="text"
							placeholder="description" class="form-control input-md"
							required="">

					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="r_receipt">Receipt
						Image</label>
					<div class="col-md-4">
						<input id="r_receipt" name="r_receipt" type="text"
							placeholder="img" class="form-control input-md" required="">

					</div>
				</div>

				<!-- File Button -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="filebutton"></label>
					<div class="col-md-4">
						<input id="filebutton" name="filebutton" class="input-file"
							type="file">
					</div>
				</div>

				<!-- Select Basic -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="r_type">Reimbursement
						Type</label>
					<div class="col-md-4">
						<select id="r_type" name="r_type" class="form-control">
						<c:forEach items="${sessionScope.rtList}" var="rType">
							<option value=${rType.rtId}><c:out value = "${rType.rtType}"></c:out></option>
							</c:forEach>
						</select>
					</div>
				</div>

				<!-- Button -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="submitbutton"></label>
					<div class="col-md-4">
						<button id="submitbutton" name="submitbutton"
							class="btn btn-primary">SUBMIT REIMBURSEMENT</button>
					</div>
				</div>

			</fieldset>
		</form>
	</div>
</body>
</html>