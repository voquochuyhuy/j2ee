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
	Map<String, LoaiSanPham> list = LoaiSanPhamDAO.mapLoaiSanPham;
	Map<String, SanPham> listSp = SanPhamDAO.mapSanPham;
%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="utf-8">
		<title>Online Clothes Shop</title>
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
			<section class="navbar main-menu">
				<div class="navbar-inner main-menu">				
					<a href="index.jsp" class="logo pull-left"><img src="themes/images/logo.png" class="site_logo" alt=""></a>
					<nav id="menu" class="pull-right">
						<ul>
						<%
								int count = 0;
								for (LoaiSanPham lsp : list.values()) {
									count++;
						%>	
							<li><a href="ProductsSeverlet?id=<%=lsp.getMaLoaiSanPham()%>"><%out.print(lsp.getTenLoai()); %></a>																	
								<ul>
								<%
									int countSp = 0;
									for (SanPham sp : listSp.values()) {
										countSp++;
										
								%>	
									<%if(sp.getMaLoaiSanPham().equals(lsp.getMaLoaiSanPham())){ %>
										<li><a href="ProductDetailSeverlet?id=<%=sp.getMaSanPham()%>"><%out.print(sp.getTenSanPham()); %></a></li>									
									<%} %>

								<% 
									}
								%>
								</ul>
								
							</li>															
						<% 
							}
						%>	
						</ul>
					</nav>
				</div>
			</section>
		<script src="themes/js/common.js"></script>
		<script src="themes/js/jquery.flexslider-min.js"></script>
		<script type="text/javascript">
			$(function() {
				$(document).ready(function() {
					$('.flexslider').flexslider({
						animation: "fade",
						slideshowSpeed: 4000,
						animationSpeed: 600,
						controlNav: false,
						directionNav: true,
						controlsContainer: ".flex-container" // the container that holds the flexslider
					});
				});
			});
		</script>
</body>
</html>