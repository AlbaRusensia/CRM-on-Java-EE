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
<link href="css/email-style.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div class="container">
		<form:form action="employee.email.sent"  method="POST" modelAttribute="employer_new"> 
			<label for="fname">Ф.И.О.</label>
			<form:input type="text" id="fname" name="firstname"
				placeholder="Ф.И.О. получателя" path="employee.firstName"/>
			<label for="fname">Email</label>
			<form:input type="email" id="fname" name="lastname"
				placeholder="Email получателя" path="employee.email"/>
			
			<form:textarea path="message" id="subject" name="subject" placeholder="Введите сообщение..."
				style="height: 200px"></form:textarea>
			<%-- <form:hidden path="id" class="form-control" id="example-text-input"
				value="${employee.id}" /> --%>
			<input type="submit" value="Отправить">
		</form:form>
	</div>
</body>
</html>