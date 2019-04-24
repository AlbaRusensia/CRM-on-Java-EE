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
<form:form action="/clients/login" method="get">
		<button class="btn btn-md btn-warning btn-block button" type="Submit">Go To Login Page</button>
	</form:form>
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<form:form autocomplete="off" action="/clients/registration"
					modelAttribute="user" method="post" class="form-horizontal box"
					role="form">
					<h1>Registration Form</h1>
					<div class="form-group">
						<div class="col-sm-9">
							<form:errors path="name" cssClass="validation-message" />
							<form:input type="text" path="name" placeholder="Name"
								class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-9">
							<form:errors path="lastName" cssClass="validation-message" />
							<form:input type="text" path="lastName" placeholder="LastName"
								class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-9">
							<form:errors path="email" cssClass="validation-message" />
							<form:input type="text" path="email" placeholder="Email"
								class="form-control" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-9">
							<form:errors path="password" cssClass="validation-message" />
							<form:input type="password" path="password"
								placeholder="Password" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-9">
							<button type="submit" class="btn btn-primary btn-block button">Register
								User</button>
						</div>
					</div>

					<h2>
						<c:if test="${successMessage != null}">
							<span class="text-success" style="color: #2ecc71;"><c:out
									value="${successMessage}"></c:out></span>
						</c:if>
					</h2>

				</form:form>
			</div>
		</div>
	</div>
</body>
</html>