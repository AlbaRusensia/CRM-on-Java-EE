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
	<form:form method="POST" modelAttribute="service_new"
		action="services.save" >
		<div class="form-group row">
			<label for="example-text-input" class="col-2 col-form-label">Наименование процедуры</label>
			<div class="col-10">
			<form:errors path="serviceName" />
				<form:input path="serviceName" class="form-control" type="text" id="example-text-input" value="${service.serviceName}"/>
				<form:hidden path="id" class="form-control" id="example-text-input" value="${service.id}"/>
			</div>
		</div>
		<div class="form-group row">
			<label for="example-search-input" class="col-2 col-form-label">Цена</label>
			<div class="col-10">
			<form:errors path="price" /> 
				<form:input path="price"  class="form-control" type="text" id="example-search-input" value="${service.price}"/>
				<form:hidden path="id" class="form-control" id="example-text-input" value="${service.id}"/>
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
				<th scope="col">Наименование процедуры</th>
				<th scope="col">Цена</th>
				<th scope="col">Изменить</th>
				<th scope="col">Удалить</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${services}" var="service">
				<tr>
					<td scope="col"><c:out value="${service.serviceName}"></c:out></td>
					<td scope="col"><c:out value="${service.price}"></c:out></td>
					<td scope="col"><a  href="services.edit?id=${service.id}">Изменить</a></td>
					<td scope="col"><a href="services.delete?id=${service.id}">Удалить</a></td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>