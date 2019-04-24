<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="css/header.css">
</head>
<body>
    <header>
        <div class="container">
            <nav>
                <h1 class="brand"><a>Mi<span>ra</span>sov</a></h1>
            <ul>
                <li><a href="<%=request.getContextPath()%>/magazin">Журнал</a></li>
                <li><a href="<%=request.getContextPath()%>/customer">Клиенты</a></li>
                <li><a href="<%=request.getContextPath()%>/employers">Работники</a></li>
                <li><a href="<%=request.getContextPath()%>/services">Услуги</a></li>
                <li><a>Выйти</a></li>
            </ul>
            </nav>
            
        </div>
    </header>
</body>
</html>