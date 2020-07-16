<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="utf-8">
		<title>Shopper</title>
		<link rel="shortcut icon" href="logo/logo.ico?"  />
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<!--[if ie]><meta content='IE=8' http-equiv='X-UA-Compatible'/><![endif]-->
		<!-- bootstrap -->
		<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">      
		<link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">		
		<link href="themes/css/bootstrappage.css" rel="stylesheet"/>
		
		<!-- global styles -->
		<link href="themes/css/flexslider.css" rel="stylesheet"/>
		<link href="themes/css/main.css" rel="stylesheet"/>

		<!-- scripts -->
		<script src="themes/js/jquery-1.7.2.min.js"></script>
		<script src="bootstrap/js/bootstrap.min.js"></script>				
		<script src="themes/js/superfish.js"></script>	
		<script src="themes/js/jquery.scrolltotop.js"></script>
		<!--[if lt IE 9]>			
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
			<script src="themes/js/respond.min.js"></script>
		<![endif]-->
	</head>
</head>
<body>
	<div class="span3 col">
		<div class="block">	
			<ul class="nav nav-list">
				<li class="nav-header">LINH KIỆN PHỤ</li>
				<li><a href="#">Vòng tay</a></li>
				<li><a href="#">Cột tóc</a></li>
				<li><a href="#">Thắt lưng</a></li>
				<li><a href="#">Dây chuyền</a></li>
				<li><a href="#">Khuyên tai</a></li>
				<li><a href="#">Kính không độ</a></li>
			</ul>
			<br/>
			<ul class="nav nav-list below">
				<li class="nav-header">THƯƠNG HIỆU</li>
				<li><a href="#">Adidas</a></li>
				<li><a href="#">Nike</a></li>
				<li><a href="#">Dunlop</a></li>
				<li><a href="#">Yamaha</a></li>
			</ul>
		</div>
		<div class="block">
			<h4 class="title">
				<span class="pull-left"><span class="text">Size tùy chọn</span></span>
				<span class="pull-right">
					<a class="left button" href="#myCarousel" data-slide="prev"></a><a class="right button" href="#myCarousel" data-slide="next"></a>
				</span>
			</h4>
				<div id="myCarousel" class="carousel slide">
					<div class="carousel-inner">
						<div class="active item">
							<ul class="thumbnails listing-products">
								<li class="span3">
									<div class="product-box">
										<span class="sale_tag"></span>												
										<a href="product_detail.jsp"><img alt="" src="themes/images/ladies/2.jpg"></a><br/>
										<a href="product_detail.jsp" class="title">Váy nâu hoa cúc</a><br/>
										<a href="#" class="category">Suspendisse aliquet</a>
										<p class="price">300.000 VNĐ</p>
									</div>
								</li>
							</ul>
						</div>
						<div class="item">
							<ul class="thumbnails listing-products">
								<li class="span3">
									<div class="product-box">												
										<a href="product_detail.jsp"><img alt="" src="themes/images/ladies/4.jpg"></a><br/>
										<a href="product_detail.jsp" class="title">Áo phông nữ</a><br/>
										<a href="#" class="category">Urna nec lectus mollis</a>
										<p class="price">400.000 VNĐ</p>
									</div>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>						
		<div class="block">								
			<h4 class="title"><strong>Best</strong> Seller</h4>								
			<ul class="small-product">
				<li>
					<a href="#" title="Praesent tempor sem sodales">
						<img src="themes/images/ladies/1.jpg" alt="Praesent tempor sem sodales">
					</a>
					<a href="#">Áo sơ mi mix đầm đen</a>
				</li>
				<li>
					<a href="#" title="Luctus quam ultrices rutrum">
						<img src="themes/images/ladies/2.jpg" alt="Luctus quam ultrices rutrum">
					</a>
					<a href="#">Túi Dollce</a>
				</li>
				<li>
					<a href="#" title="Fusce id molestie massa">
						<img src="themes/images/ladies/3.jpg" alt="Fusce id molestie massa">
					</a>
					<a href="#">Áo sơ mi mix váy bó</a>
				</li>   
			</ul>
		</div>
		<script src="themes/js/common.js"></script>
		<script>
			$(document).ready(function() {
				$('#checkout').click(function (e) {
					document.location.href = "checkout.jsp";
				})
			});
		</script>
</body>
</html>