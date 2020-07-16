<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>
<%@page import="dao.LoaiSanPhamDAO"%>
<%@page import="model.LoaiSanPham"%>
<%@page import="dao.SanPhamDAO"%>
<%@page import="model.SanPham"%>
<%
	Map<String, SanPham> dsSanPham = new HashMap<String, SanPham>();
	dsSanPham = (Map<String,SanPham>)request.getAttribute("listSp");
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
			<script src="js/respond.min.js"></script>
		<![endif]-->
	</head>
    <body>				
    	<jsp:include page="header/Header.jsp"></jsp:include>  
		<div id="wrapper" class="container">
			<jsp:include page="navbar/Navbar.jsp"></jsp:include>
			<section class="header_text sub">
			<img class="pageBanner" src="themes/images/pageBanner.png" alt="New products" >
				<h4><span>Sản phẩm mới</span></h4>
			</section>
			<section class="main-content">
				<div class="row">						
					<div class="span9">								
						<ul class="thumbnails listing-products">
							<%
									int count = 0;
									for (SanPham sp : dsSanPham.values()) {
										count++;
							%>	
									<li class="span3">
										<div class="product-box">
											<span class="sale_tag"></span>												
											<a href="product_detail.jsp"><img alt="" src="themes/images/ladies/9.jpg"></a><br/>
											<a href="product_detail.jsp" class="title"><%out.print(sp.getTenSanPham()); %></a><br/>
											<a href="#" class="category">Phasellus consequat</a>
											<p class="price"><%out.print(sp.getGiaTien()); %> VNĐ</p>
										</div>
									</li> 												
							<% 
								}
							%>	
							</ul>								
						<hr>
						<div class="pagination pagination-small pagination-centered">
							<ul>
								<li><a href="#">Trước</a></li>
								<li class="active"><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">Sau</a></li>
							</ul>
						</div>
					</div>
					<jsp:include page="sidebar/Sidebar.jsp"></jsp:include>
				</div>
			</section>
			<jsp:include page="footer/Footer.jsp"></jsp:include>
			
		</div>
		<script src="themes/js/common.js"></script>	
    </body>
</html>