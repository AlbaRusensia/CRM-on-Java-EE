<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My</title>
<link href="css/font.css" rel="stylesheet">
<link href="css/preloader.css" rel="stylesheet">
<link href="css/cssIndex.css" rel="stylesheet">
<link href="css/style-menu.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap-grid.css" rel="stylesheet">
<link href="fonts/font-awesome-4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<link href="css/owl.carousel/assets/owl.carousel.min.css"
	rel="stylesheet">
<link href="css/owl.carousel/assets/owl.theme.default.min.css"
	rel="stylesheet">
<link href="css/fotorama-4.6.4/fotorama.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">


<style>
boby {
	opacity: 0;
	overflow-x: hidden;
}
</style>
</head>


<body class="home">
	<div class="preloader">
		<div class="preloader_content">
			<div class="preloader_first"></div>
			<div class="preloader_second"></div>
			<div class="preloader_third"></div>
		</div>
	</div>

	<div id="my-page">
		<div id="my-header">
			<header class="site-header img-color">
				<div class="burger-menu">
					<a href="#" class="burger-menu_button"> <span
						class="burger-menu_lines"></span>
					</a>
					<nav class="burger-menu_nav">
						<a href="#" class="burger-menu_link logo"><img
							src="image/spa_f.png"></a> <a href="#"
							class="burger-menu_link ">Парикмахерский сервис</a> <a href="#"
							class="burger-menu_link">Косметологический сервис</a> <a href="#"
							class="burger-menu_link">Маникюрный сервис</a> <a href="#"
							class="burger-menu_link">Массаж и SPA</a> <a href="#"
							class="burger-menu_link">Солярий</a> <a href="#"
							class="burger-menu_link">Наши специалисты</a> <a href="#"
							class="burger-menu_link">Новости</a> <a href="#"
							class="burger-menu_link">Прайс-лист</a> <a href="#"
							class="burger-menu_link">Наши сертификаты</a> <a href="#"
							class="burger-menu_link">О салоне</a>

					</nav>
					<div class="burger-menu_overlay"></div>
				</div>
				<div class="top-line">
					<a href="" class="logo"> <img src="image/spa_f.png"
						alt="Салон красоты"></a>
					<div class="phone">
						<i class="fa fa-mobile" aria-hidden="true"></i> +375 (44)
						777-77-77
					</div>
				</div>

				<div class="header-flex">
					<div class="flex-center">

						<div class="container">
							<div>
								<div class="col-sm-7">
									<div class="header-composition">
										<div class="welcome">
											<p>
												<span>Добро пожаловать в профессиональный</span>
											</p>

											<h1 class="h1">Салон красоты</h1>
											<strong><i class="fa fa-star">В Бобруйске</i> <i
												class="fa fa-star"></i></strong>
										</div>
										<p>SPA - это салон красоты бизнес-класса.
											Высококвалифицированные мастера по перманентному макияжу
											помогут Вам быть всегда красивыми и выглядеть безупречно в
											любых жизненных ситуациях!</p>
										<button class="button">О салоне</button>
									</div>


								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="header-social">
					<nav class="soc">
						<ul>
							<li><a href="#"> <i class="fa fa-facebook"></i>
							</a></li>
							<li><a href="#"> <i class="fa fa-instagram"></i>
							</a></li>
							<li><a href="#"> <i class="fa fa-vk"></i>
							</a></li>
						</ul>

					</nav>
				</div>
				<div class="heder-contakts">
					<div class="container">
						<div class="row">
							<div class="col-md-4">
								<i class="fa fa-location-arrow"></i>г. Бобруйск, ул. Что-то там
							</div>
							<div class="col-md-4">
								<i class="fa fa-mobile"></i>+375 (44) 777-77-77
							</div>
							<div class="col-md-4">
								<i class="fa fa-clock-o"></i>Время работы: 24/7.
							</div>
						</div>
					</div>
				</div>
			</header>

		</div>

		<div id="my-content">
			<section class="s-services">
				<div class="owl-carousel carousel-services">
					<div class="carousel-services-item"
						style="background-color: #F9C869">
						<div class="carousel-services-content">
							<div class="carousel-services-composition">
								<img src="image/logomin.png"
									style="width: 100px; height: auto; display: inline-block; margin-top: 5px">
								<h3 class="h3">Косметологический сервис</h3>
								<ul class="carousel-services-list">
									<li>Ключевая услуга #1 - <strong>50 руб.</strong></li>
									<li>Ключевая услуга #2 - <strong>50 руб.</strong></li>
									<li>Ключевая услуга #3 - <strong>50 руб.</strong></li>
									<li>Ключевая услуга #4 - <strong>50 руб.</strong></li>
								</ul>
								<button>ВСЕ УСЛУГИ</button>

								<div class="carousel-services-image"
									style="background-image: url(image/kisspng-hair.png)"></div>
							</div>

						</div>
					</div>
					<div class="carousel-services-item"
						style="background-color: #66C7CD">
						<div class="carousel-services-content">
							<div class="carousel-services-image"
								style="background-image: url(image/kisspng-beauty.png)"></div>
							<div class="carousel-services-composition">
								<img src="image/logomin.png"
									style="width: 100px; height: auto; display: inline-block; margin-top: 5px">
								<h3 class="h3">Маникюрный сервис</h3>
								<ul class="carousel-services-list">

									<li>Ключевая услуга #1 - <strong>50 руб.</strong></li>
									<li>Ключевая услуга #2 - <strong>50 руб.</strong></li>
									<li>Ключевая услуга #3 - <strong>50 руб.</strong></li>
									<li>Ключевая услуга #4 - <strong>50 руб.</strong></li>
								</ul>
								<button>ВСЕ УСЛУГИ</button>


							</div>

						</div>
					</div>
					<div class="carousel-services-item"
						style="background-color: #F86868">
						<div class="carousel-services-content">
							<div class="carousel-services-composition">
								<img src="image/logomin.png"
									style="width: 100px; height: auto; display: inline-block; margin-top: 5px">
								<h3 class="h3">Парикмахерский сервис</h3>
								<ul class="carousel-services-list">
									<li>Ключевая услуга #1 - <strong>50 руб.</strong></li>
									<li>Ключевая услуга #2 - <strong>50 руб.</strong></li>
									<li>Ключевая услуга #3 - <strong>50 руб.</strong></li>
									<li>Ключевая услуга #4 - <strong>50 руб.</strong></li>
								</ul>
								<button>ВСЕ УСЛУГИ</button>

								<div class="carousel-services-image"
									style="background-image: url(image/woman_red_hair2-1.png)">

								</div>
							</div>

						</div>
					</div>
					<div class="carousel-services-item"
						style="background-color: #F9C869">
						<div class="carousel-services-content">
							<div class="carousel-services-composition">
								<div class="carousel-services-image"
									style="background-image: url(image/modnyiy-manikyur-11.png)"></div>
								<img src="image/logomin.png"
									style="width: 100px; height: auto; display: inline-block; margin-top: 5px">
								<h3 class="h3">Косметологический сервис</h3>
								<ul class="carousel-services-list">
									<li>Ключевая услуга #1 - <strong>50 руб.</strong></li>
									<li>Ключевая услуга #2 - <strong>50 руб.</strong></li>
									<li>Ключевая услуга #3 - <strong>50 руб.</strong></li>
									<li>Ключевая услуга #4 - <strong>50 руб.</strong></li>
								</ul>
								<button>ВСЕ УСЛУГИ</button>



							</div>
						</div>
					</div>
				</div>
			</section>

			<section class="s-king inverse section-overley body">


				<div class="container">
					<div class="row">
						<div class="col-md-5">
							<h2 class="h2">Салон красоты</h2>
							<p>
								<strong>Салон</strong> встречает своих посетителей современным
								дизайном и атмосферой уюта: огромное светлое пространство,
								изящная мебель, мягкие бархатные кресла. Это отличное место для
								того, чтобы посвятить пару часов только себе!
							</p>
							<p>Дамам здесь предложат экстраординарный ассортимент
								косметологических процедур и качественный нейл-сервис, а мужчин
								порадуют услугами стилистов и уходом за лицом.</p>
						</div>
						<div class="col-md-7">
							<div class="section-gallery fotorama" data-nav="thumbs"
								data-thumbwidth="120" data-thumbheights="66"
								data-thumbborderwidth="5" data-thumbmargin="15"
								data-width="100%">
								<img src="image/fotorama/1.jpg"> <img
									src="image/fotorama/2.jpg"> <img
									src="image/fotorama/3.jpg"> <img
									src="image/fotorama/4.jpg">

							</div>


						</div>
					</div>
					<ul class="bubbles">
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
					</ul>
				</div>
				<!--                    в js запихнуть  -->

			</section>
			<section class="s-call inverse"
				style="background-image: url(image/woman_red_hair2-1.png);">
				<div class="container">
					<div class="row">
						<div class="col-md-5 offset-sm-7 col-sm-6 offset-sm-6">
							<!--                           в jsp поменять-->
							<form:form method="POST" action="save.magazin" class="callback" modelAttribute="view">
								<div class="success">
									<span>Спасибо за заявку!</span>
								</div>
								<!--Отправка письма на почту 
                                <input type="hidden" name="project_name" value="Site Name">
                                <input type="hidden" name="admin_email" value="admin@mail.com">
                                <input type="hidden" name="form_subject" value="Form Subject">-->
								<div class="callback-logo">
									<img src="image/logomin.png">
								</div>
								<div class="formhead h3">Оставить заявку</div>
								<p>Оставьте заявку и мы перезвоним вам в течение 15 минут.</p>
								<form:input type="text" path="customer.firstName" name="Имя" placeholder="Ваше Ф.И.О. ..."/>
								<form:input type="text" path="customer.numberPhone" name="Телефон" placeholder="Ваш телефон..."/>
								<form:select path="service" name="Услуга">
									<c:forEach items="${services}" var="service">
										<form:option value="${service}"><c:out value="${service.serviceName}"></c:out></form:option>
									</c:forEach>								
								</form:select>
								<button type="submit" class="button1">Отправить</button>
							</form:form>
						</div>
					</div>
				</div>
			</section>
			<section class="s-review inverse seciton-overlay"
				style="background-image: url(image/top-image6.jpg);">
				<div class="container">
					<div class="row">
						<div class="col-sm-12">
							<h2 class="h2 text-center h-first">Отзывы наших клиентов</h2>

						</div>
						<div class="col-sm-8 offset-sm-2">
							<div class="quotes"></div>

							<div class="owl-carousel reviews">
								<div class="review">
									<div class="review-header">Оксана</div>
									<div class="review-date">20.05.2019(Маникюр)</div>
									<div class="review-stars">
										<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i>
									</div>
									<div class="review-text">Нормальный салон. Персонал
										вежливый и адекватный, цены не высокие. Маникюр сделали
										неплохо, буду ещё посещать при необходимости.Я делаю
										периодически в этом салоне маникюр-педикюр. Мастера
										доброжелательные, улыбчивые, очень стараются. Я делаю
										периодически в этом салоне маникюр-педикюр. Мастера
										доброжелательные, улыбчивые, очень стараются.</div>
								</div>
								<div class="review">
									<div class="review-header">Лена</div>
									<div class="review-date">20.05.2019(Стрижка)</div>
									<div class="review-stars">
										<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i>
									</div>
									<div class="review-text">Я долго искала место, где хорошо
										делают маникюр. По рекомендациям подруги пошла в цирюльник и
										осталась очень довольна полученным результатом. Спасибо.Я
										делаю периодически в этом салоне маникюр-педикюр. Мастера
										доброжелательные, улыбчивые, очень стараются. Я делаю
										периодически в этом салоне маникюр-педикюр. Мастера
										доброжелательные, улыбчивые, очень стараются.</div>
								</div>
								<div class="review">
									<div class="review-header">Александра</div>
									<div class="review-date">20.05.2019(Стрижка)</div>
									<div class="review-stars">
										<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i>
									</div>
									<div class="review-text">Я очень довольна работой
										мастеров, с ними приятно иметь дело. Там же я сделала лечебную
										стрижку. Мои волосы прекрасно выглядят, у меня настроение
										шикарное после этого салона, за это отдельное спасибо!Я делаю
										периодически в этом салоне маникюр-педикюр. Мастера
										доброжелательные, улыбчивые, очень стараются. Я делаю
										периодически в этом салоне маникюр-педикюр. Мастера
										доброжелательные, улыбчивые, очень стараются.</div>
								</div>
							</div>

						</div>
					</div>
				</div>
			</section>
			<section class="s-partners section-overley"
				style="background-color: black;">
				<div class="container">
					<div class="row">
						<div class="col-sm-12">
							<h2 class="h2 text-center" style="color: khaki;">Наши
								партнеры</h2>
						</div>

						<div class="col-sm-10 offset-sm-1">
							<div class="owl-carousel partners">
								<div class="partner">
									<img src="image/icon/lo.png">
								</div>
								<div class="partner">
									<img src="image/icon/logo-ru.png">
								</div>
								<div class="partner">
									<img src="image/icon/logo.png">
								</div>
								<div class="partner">
									<img src="image/icon/lo.png">
								</div>
								<div class="partner">
									<img src="image/icon/logo-ru.png">
								</div>
								<div class="partner">
									<img src="image/icon/logo.png">
								</div>
							</div>
						</div>
					</div>

				</div>

			</section>
		</div>


		<div id="my-footer">
			<div class="main-footer">
				<div class="container">
					<div class="row">
						<div class="col-lg-3 col-sm-6">
							<div class="footer-column">
								<img src="image/logomin.png" class="logo-footer">
								<p>
									Салон красоты<br> бизнес-класса в Бобруйске
								</p>
								<div class="social-footer">
									<nav class="soc">
										<ul>
											<li><a href="#"> <i class="fa fa-facebook"></i>
											</a></li>
											<li><a href="#"> <i class="fa fa-instagram"></i>
											</a></li>
											<li><a href="#"> <i class="fa fa-vk"></i>
											</a></li>
										</ul>

									</nav>
								</div>
							</div>
						</div>
						<div class="col-lg-3 col-sm-6">
							<div class="footer-column">
								<nav class="footer-menu">
									<ul>
										<li class="active"><a>Парикмахерский сервис</a></li>
										<li class="active"><a>Косметологический сервис</a></li>
										<li class="active"><a>Маникюрный сервис</a></li>
										<li class="active"><a>Массаж и SPA</a></li>
										<li class="active "><a>Солярий</a></li>
										<li class="active"><a>Наши специалисты</a></li>
									</ul>
								</nav>
							</div>
						</div>
						<div class="col-lg-3 col-sm-6">
							<div class="footer-column">
								<p class="footer-addr">
									<i class="fa fa-location-arrow"></i>г. Бобруйск
								</p>
								<p class="footer-addr">
									<i class="fa fa-clock-o"></i>Время работы: 24/7.
								</p>
								<p class="footer-addr">
									<i class="fa fa-mobile"></i>+375 (44) 777-77-77
								</p>
							</div>
						</div>
						<div class="col-lg-3 col-sm-6">
							<div class="footer-column">
								<div class="map">
									<script type="text/javascript" charset="utf-8" async
										src="https://api-maps.yandex.ru/services/constructor/1.0/js/?um=constructor%3Acb1b963c625d97bdf3c3170ece96dcf888580ff92099b59f00c713f186d49f4a&amp;width=100%&amp;height=200&amp;lang=ru_RU&amp;scroll=true"></script>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="js/jquery.min.js"></script>
	<script src="js/owl.carousel/owl.carousel.min.js"></script>
	<script src="css/fotorama-4.6.4/fotorama.js">
		
	</script>
	<script src="js/common.js"></script>
</body>

</html>