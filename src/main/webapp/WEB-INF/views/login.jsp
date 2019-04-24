<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="css/style-login.css">
<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<form:form action="/clients/registration" method="get">
		<button class="btn btn-md btn-warning btn-block button" type="Submit">Go To Registration Page</button>
	</form:form>

	<div class="container">
		<form:form action="/clients/login" method="POST" class="form-signin box">
			<h1 class="form-signin-heading">Welcome</h1>
			

			<input type="text" id="email" name="email" placeholder="Email" class="form-control"/>
		
			<input type="password" placeholder="Password" id="password"
				name="password" class="form-control"/>
			

			<c:if test="${param.error != null}">
				<p style="font-size: 20; color: #FF1C19;">Email or Password
					invalid, please verify</p>
			</c:if>

			<button class="btn btn-lg btn-primary btn-block button" name="Submit" value="Login" type="Submit">Login</button>
		</form:form>
	</div>
</body>
</html>