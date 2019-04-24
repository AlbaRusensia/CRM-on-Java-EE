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
<link rel="stylesheet" href="css/styles.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">

		<form:form action="/clients/logout" method="get">
			<button class="btn btn-md btn-danger btn-block" name="registration"
				type="Submit">Logout</button>
		</form:form>

		<div class="panel-group" style="margin-top: 40px">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<span><c:out value="${userName}" /></span>
				</div>
				<p class="admin-message-text text-center">
					<c:out value="${adminMessage}" />
				</p>
			</div>
		</div>

	</div>
</body>
</html>