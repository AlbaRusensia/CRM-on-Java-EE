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
	<form:form method="POST" modelAttribute="new_magazin"
		action="save.new_magazin">
		<div class="form-group row">
			<label for="example-text-input" class="col-2 col-form-label">Ф.И.О.</label>
			<div class="col-10">
				<form:select path="customer" name="Клиенты">
					<c:forEach items="${customers}" var="customer1">
						<form:option value="${customer1}">
							<c:out value="${customer1.firstName}"></c:out>
						</form:option>
					</c:forEach>
				</form:select>

			</div>
		</div>
		<div class="form-group row">
			<label for="example-search-input" class="col-2 col-form-label">Выбрать
				услугу</label>
			<div class="col-10">
				<form:select path="service" name="Услуга" id="services_js">
					<c:forEach items="${services}" var="service">
						<form:option value="${service}">
							<c:out value="${service.serviceName}"></c:out>
						</form:option>
					</c:forEach>
				</form:select>
			</div>
		</div>
		<div class="form-group row">
			<label for="example-text-input" class="col-2 col-form-label">Мастер</label>
			<div class="col-10">
				<form:select path="employee" name="Мастера" id="employes_js">
					<c:forEach items="${employees}" var="employee">
						<form:option value="${employee}">
							<c:out value="${employee.firstName}"></c:out>
						</form:option>
					</c:forEach>
				</form:select>

			</div>
		</div>

		<div class="form-group row">
			<label for="example-datetime-local-input"
				class="col-2 col-form-label">Дата и время</label>
			<div class="col-10">
				<form:input path="magazin.dateTime" class="form-control"
					type="datetime-local" id="example-datetime-local-input" />
					<form:hidden path="magazin.id" class="form-control"
					id="example-text-input" value="${magazin.id}" />
			</div>
		</div>
		<div class="form-check">
			<label class="form-check-label"> <form:checkbox
					path="magazin.treatment" class="form-check-input" /> Обработана ли
				заявка
			</label>
		</div>
		<div class="form-group row">
			<div class="offset-sm-2 col-sm-10">
				<button type="submit" class="btn btn-primary">Оформить
					заявку</button>
			</div>
		</div>
	</form:form>
	<table class="table table-hover table-dark">
		<thead>
			<tr>
				<th scope="col">Ф.И.О.</th>

				<th scope="col">Мастер</th>
				<th scope="col">Услуга</th>
				<th scope="col">Дата</th>
				<th scope="col">Телефон</th>
				<th scope="col">Email</th>
				<th scope="col">Статус</th>
				<th scope="col">Изменить</th>
				<th scope="col">Удалить</th>
				<th scope="col">Отправить сообщение</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${table_inf}" var="table">
				<tr>
					<td scope="col"><c:out value="${table.customer.firstName}"></c:out></td>
					<td scope="col"><c:out value="${table.employee.firstName}"></c:out></td>
					<td scope="col"><c:out value="${table.service.serviceName}"></c:out></td>
					<td scope="col"><c:out value="${table.magazin.dateTime}"></c:out></td>
					<td scope="col"><c:out value="${table.customer.numberPhone}"></c:out></td>
					<td scope="col"><c:out value="${table.customer.email}"></c:out></td>



					<td><input type="checkbox"
						<c:if test="${table.magazin.treatment}">checked</c:if>
						class="form-check-input" value="${table.magazin.treatment}"></td>
					<td scope="col"><a
						href="magazin.edit?serviceId=${table.service.id}&customerId=${table.customer.id}&magazinId=${table.magazin.id}">Изменить</a></td>
					<td scope="col"><a
						href="magazin.delete?id=${table.magazin.id}">Удалить</a></td>
					<td scope="col"><a href="customer.email?id=${table.customer.id}">Отправить сообщение</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<script src="js/jquery.min.js"></script>
	<script src="js/json_js.js"></script>
</body>
</html>