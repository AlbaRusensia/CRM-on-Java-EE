<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="css/menu.css">
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
</head>

<body>
    <div class="container">
        <div class="box">
            <div class="thumb">
                <img src="image/menu/waterman_fount_paper.jpg">
            </div>
            <div class="details">
                <div class="content">
                    <i class="fa fa-book" aria-hidden="true"></i>
                    <h3>Журнал</h3>
                    <a href="<%=request.getContextPath()%>/magazin">Далее</a>
                </div>
            </div>
        </div>
        <div class="box">
            <div class="thumb">
                <img src="image/menu/no-translate-detected.jpg">
            </div>
            <div class="details">
                <div class="content">
                    <i class="fa fa-globe" aria-hidden="true"></i>
                    <h3>Клиенты</h3>
                    <a href="<%=request.getContextPath()%>/customer">Далее</a>
                </div>
            </div>
        </div>
        <div class="box">
            <div class="thumb">
                <img src="image/menu/clock.jpg">
            </div>
            <div class="details">
                <div class="content">
                    <i class="fa fa-user" aria-hidden="true"></i>
                    <h3>Работники</h3>
                    <a href="<%=request.getContextPath()%>/employers">Далее</a>
                </div>
            </div>
        </div>
        <div class="box">
            <div class="thumb">
                <img src="image/menu/focused.jpg">
            </div>
            <div class="details">
                <div class="content">
                    <i class="fa fa-envelope" aria-hidden="true"></i>
                    <h3>Услуги</h3>
                    <a href="<%=request.getContextPath()%>/services">Далее</a>
                </div>
            </div>
        </div>
    </div>
</html>