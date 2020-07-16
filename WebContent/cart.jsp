<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="model.CartObject"%>
<%@page import="model.SanPham"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%
	CartObject cartobject = (CartObject) session.getAttribute("CartObject");
	System.out.println(cartobject);
%>
<!DOCTYPE html>
<html lang="en">
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
    <body>		
		<jsp:include page="header/Header.jsp"></jsp:include>
		<div id="wrapper" class="container">
			<jsp:include page="navbar/Navbar.jsp"></jsp:include>				
			<section class="header_text sub">
			<img class="pageBanner" src="themes/images/pageBanner.png" alt="New products" >
				<h4><span>Giỏ hàng</span></h4>
			</section>
			<section class="main-content">				
				<div class="row">
					<div class="span9">					
						<h4 class="title"><span class="text"><strong>Giỏ</strong> của bạn</span></h4>
						<table class="table table-striped">
							<thead>
								<tr>
									<th>Xóa</th>
									<th>Hình ảnh</th>
									<th>Tên Sản Phẩm</th>
									<th>Số lượng</th>
									<th>Đơn giá</th>
									<th>Tổng</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><input type="checkbox" value="option1"></td>
									<td><a href="product_detail.jsp"><img alt="" src="themes/images/ladies/0.jpg"></a></td>
									<td>Fusce id molestie massa</td>
									<td><input type="text" placeholder="1" class="input-mini"></td>
									<td>VNĐ</td>
									<td>VNĐ</td>
								</tr>			  
								<tr>
									<td><input type="checkbox" value="option1"></td>
									<td><a href="product_detail.jsp"><img alt="" src="themes/images/ladies/1.jpg"></a></td>
									<td>Luctus quam ultrices rutrum</td>
									<td><input type="text" placeholder="2" class="input-mini"></td>
									<td>VNĐ</td>
									<td>VNĐ</td>
								</tr>
								<tr>
									<td><input type="checkbox" value="option1"></td>
									<td><a href="product_detail.jsp"><img alt="" src="themes/images/ladies/3.jpg"></a></td>
									<td>Wuam ultrices rutrum</td>
									<td><input type="text" placeholder="1" class="input-mini"></td>
									<td>VNĐ</td>
									<td>VNĐ</td>
								</tr>
								<tr>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
								</tr>		  
							</tbody>
						</table>
						<hr>
						<p class="cart-total right">
							<strong>Total</strong>: 119.50 VNĐ<br>
						</p>
						<hr/>
						<form class="form-inline" action="CheckoutSeverlet" method="get">
							<p class="buttons center">				
								<button class="btn btn-inverse" type="submit" id="checkout">Thanh toán</button>
							</p>
						</form>					
					</div>
					<jsp:include page="sidebar/Sidebar.jsp"></jsp:include>
				</div>
			</section>			
			<jsp:include page="footer/Footer.jsp"></jsp:include>
		</div>
		<script src="themes/js/common.js"></script>	
    </body>
</html>