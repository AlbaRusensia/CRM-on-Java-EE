<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"
	integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ"
	crossorigin="anonymous">
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<form:form method="POST" modelAttribute="customer_new"
		action="customer.save">
		<div class="form-group row">
			<label for="example-text-input" class="col-2 col-form-label">Ф.И.О.</label>
			<div class="col-10">
			<%-- <form:errors path="firstName" /> --%>
				<form:input path="firstName" class="form-control" type="text"
					id="example-text-input" value="${customer.firstName}" />
				<form:hidden path="id" class="form-control" id="example-text-input"
					value="${customer.id}" />
			</div>
		</div>

		<div class="form-group row">
			<label for="example-email-input" class="col-2 col-form-label">Email</label>
			<div class="col-10">
				<form:input path="email" class="form-control" type="email"
					id="example-email-input" value="${customer.email}" />
				<form:hidden path="id" class="form-control" id="example-text-input"
					value="${customer.id}" />
			</div>
		</div>
		<div class="form-group row">
			<label for="example-tel-input" class="col-2 col-form-label">Номер
				телефона</label>
			<div class="col-10">
				<%-- <form:errors path="numberPhone" /> --%>
				<form:input path="numberPhone" class="form-control" type="tel"
					id="example-tel-input" value="${customer.numberPhone}" />
				<form:hidden path="id" class="form-control" id="example-text-input"
					value="${customer.id}" />
			</div>
		</div>
		<div class="form-group row">
			<div class="offset-sm-2 col-sm-10">
				<button type="submit" class="btn btn-primary">Добавить</button>
			</div>
		</div>
	</form:form>
	<table class="table table-hover table-dark">
		<thead>
			<tr>
				<th scope="col">Ф.И.О.</th>

				<th scope="col">Email</th>
				<th scope="col">Номер телефона</th>
				<th scope="col">Изменить</th>
				<th scope="col">Удалить</th>
				<th scope="col">Отправить сообщение</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${customers}" var="customer">
				<tr>
					<td scope="col"><c:out value="${customer.firstName}"></c:out></td>

					<td scope="col"><c:out value="${customer.email}"></c:out></td>
					<td scope="col"><c:out value="${customer.numberPhone}"></c:out></td>
					<td scope="col"><a href="customer.edit?id=${customer.id}">Изменить</a></td>
					<td scope="col"><a href="customer.delete?id=${customer.id}">Удалить</a></td>
					<td scope="col"><a href="customer.email?id=${customer.id}">Отправить сообщение</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>