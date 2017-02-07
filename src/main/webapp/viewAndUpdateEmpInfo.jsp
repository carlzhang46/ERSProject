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

<%@include file="tiles/boostrapheader.jsp" %>
<link rel="stylesheet" href="css/login.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Information</title>
</head>
<body>
	<%@include file="tiles/navbar.jsp"%>
	<h2 style="color:white;">Employee Information Page</h2>
<div class = "empform">
<form class="form-horizontal" method= "POST" action = "empupdate">
<fieldset>

<!-- Form Name -->
<legend style="color:white;">Employee Information Form</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="emp_username">Username</label>  
  <div class="col-md-4">
  <input id="emp_username" name="emp_username" type="text" value="<c:out value = "${sessionScope.user.getuUsername()}"></c:out>" placeholder="username" class="form-control input-md" required="">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="emp_password">Password</label>  
  <div class="col-md-4">
  <input id="emp_password" name="emp_password" type="text" value="<c:out value = "${sessionScope.user.getuPassword()}"></c:out>" placeholder="password" class="form-control input-md" required="">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="emp_firstname">First Name</label>  
  <div class="col-md-4">
  <input id="emp_firstname" name="emp_firstname" type="text" value="<c:out value = "${sessionScope.user.getuFirstname()}"></c:out>" placeholder="firstname" class="form-control input-md" required="">
    
  </div>
</div>



<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="emp_lastname">Last Name</label>  
  <div class="col-md-4">
  <input id="emp_lastname" name="emp_lastname" value="<c:out value = "${sessionScope.user.getuLastname()}"></c:out>" type="text" placeholder="lastname" class="form-control input-md" required="">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="emp_email">E-mail Address</label>  
  <div class="col-md-4">
  <input id="emp_email" name="emp_email" value="<c:out value = "${sessionScope.user.getuEmail()}"></c:out>" type="text" placeholder="email" class="form-control input-md" required="">
    
  </div>
</div>
<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
    <button id="singlebutton" name="singlebutton" class="btn btn-primary">UPDATE INFORMATION</button>
  </div>
</div>

</fieldset>
</form>

</div>

</body>
</html>