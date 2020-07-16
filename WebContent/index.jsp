<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>
<%@page import="dao.LoaiSanPhamDAO"%>
<%@page import="model.LoaiSanPham"%>
<%@page import="dao.SanPhamDAO"%>
<%@page import="model.SanPham"%>
<%@page import="dao.ThongTinSanPhamDAO"%>
<%@page import="model.ThongTinSanPham"%>
<%
Map<String, LoaiSanPham> list = LoaiSanPhamDAO.mapLoaiSanPham;
Map<String, SanPham> listSp = SanPhamDAO.mapSanPham;
Map<String, ThongTinSanPham> listTtsp= ThongTinSanPhamDAO.mapThongTinSanPham;
%>
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
			<section  class="homepage-slider" id="home-slider">
				<div class="flexslider">
					<ul class="slides">
						<li>
							<img src="themes/images/carousel/banner-1.jpg" alt="" />
						</li>
						<li>
							<img src="themes/images/carousel/banner-2.jpg" alt="" />
							<div class="intro">
								<h1>Giảm giá giữa mùa</h1>
								<p><span>Đến 50%</span></p>
								<br/>
								<p><span>Khi lựa chọn mua hàng online tại đây</span></p>
							</div>
						</li>
					</ul>
				</div>			
			</section>
			<section class="header_text">
				Chúng tôi đại diện cho những thương hiệu quần áo chất lượng nhất Sài Gòn. Đội ngũ nhân viên luôn tìm kiếm những mặt hàng tôt để đưa đến khách hàng 
				<br/>Đừng bỏ lỡ những món hàng chất lượng ở cửa hàng này.
			</section>
			<section class="main-content">
				<div class="row">
					<div class="span12">													
						<div class="row">
							<div class="span12">
								<h4 class="title">
									<span class="pull-left"><span class="text"><span class="line">SẢN PHẨM <strong>NỔI BẬT</strong></span></span></span>
									<span class="pull-right">
										<a class="left button" href="#myCarousel" data-slide="prev"></a><a class="right button" href="#myCarousel" data-slide="next"></a>
									</span>
								</h4>
								<div id="myCarousel" class="myCarousel carousel slide">
									<div class="carousel-inner">
										<div class="active item">
											<ul class="thumbnails">	
											<%
												for (int i = 0 ;i < 4 ;i++){	
											%>	
												<li class="span3">
													<div class="product-box">
														<span class="sale_tag"></span>
														<p><a href="ProductDetailSeverlet?id=<%=listSp.get(listSp.keySet().toArray()[i]).getMaSanPham()%>"><img src="themes/images/ladies/<%out.print(i);%>.jpg" alt="" /></a></p>
														<%
															for (ThongTinSanPham ttsp : listTtsp.values()){	
														%>
															<%if(listSp.get(listSp.keySet().toArray()[i]).getMaThongTinSanPham().equals(ttsp.getMaThongTinSanPham())){ %>
																<a href="ProductDetailSeverlet?id=<%=listSp.get(listSp.keySet().toArray()[i]).getMaSanPham()%>" class="title"><%out.print(listSp.get(listSp.keySet().toArray()[i]).getTenSanPham()); %></a><br/>
																<a href="ProductDetailSeverlet?id=<%=listSp.get(listSp.keySet().toArray()[i]).getMaSanPham()%>"><%out.print(ttsp.getMoTa2()); %></a>									
															<%} %>
														<%
															}
														%>
														
														<p class="price"><%out.print(listSp.get(listSp.keySet().toArray()[i]).getGiaTien()); %> VNĐ</p>
													</div>
												</li>															
											<% 
												}
											%>
											</ul>
										</div>
										<div class="item">
											<ul class="thumbnails">
												<%
													for (int y = 4;y < 8 ;y++) {		
												%>	
												<li class="span3">
													<div class="product-box">
														<span class="sale_tag"></span>
														<p><a href="ProductDetailSeverlet?id=<%=listSp.get(listSp.keySet().toArray()[y]).getMaSanPham()%>"><img src="themes/images/ladies/<%out.print(y);%>.jpg" alt="" /></a></p>
														<%
															for (ThongTinSanPham ttsp : listTtsp.values()){	
														%>
															<%if(listSp.get(listSp.keySet().toArray()[y]).getMaThongTinSanPham().equals(ttsp.getMaThongTinSanPham())){ %>
																<a href="ProductDetailSeverlet?id=<%=listSp.get(listSp.keySet().toArray()[y]).getMaSanPham()%>" class="title"><%out.print(listSp.get(listSp.keySet().toArray()[y]).getTenSanPham()); %></a><br/>
																<a href="ProductDetailSeverlet?id=<%=listSp.get(listSp.keySet().toArray()[y]).getMaSanPham()%>" class="category"><%out.print(ttsp.getMoTa2()); %></a>									
															<%} %>
														<%
															}
														%>
														<p class="price"><%out.print(listSp.get(listSp.keySet().toArray()[y]).getGiaTien()); %> VNĐ</p>
													</div>
												</li>															
												<% 
													}
												%>																																	
											</ul>
										</div>
									</div>							
								</div>
							</div>						
						</div>
						
						<br/>
						
						<div class="row">
							<div class="span12">
								<h4 class="title">
									<span class="pull-left"><span class="text"><span class="line">SẢN PHẨM <strong>MỚI NHẤT</strong></span></span></span>
									<span class="pull-right">
										<a class="left button" href="#myCarousel-2" data-slide="prev"></a><a class="right button" href="#myCarousel-2" data-slide="next"></a>
									</span>
								</h4>
								<div id="myCarousel-2" class="myCarousel carousel slide">
									<div class="carousel-inner">
										<div class="active item">
											<ul class="thumbnails">	
												<%
													for (int z = 0;z < 4 ;z++) {		
												%>	
												<li class="span3">
													<div class="product-box">
														<span class="sale_tag"></span>
														<p><a href="ProductDetailSeverlet?id=<%=listSp.get(listSp.keySet().toArray()[z]).getMaSanPham()%>"><img src="themes/images/cloth/bootstrap-women-ware<%out.print(z);%>.jpg" alt="" /></a></p>
														<%
															for (ThongTinSanPham ttsp : listTtsp.values()){	
														%>
															<%if(listSp.get(listSp.keySet().toArray()[z]).getMaThongTinSanPham().equals(ttsp.getMaThongTinSanPham())){ %>
																<a href="ProductDetailSeverlet?id=<%=listSp.get(listSp.keySet().toArray()[z]).getMaSanPham()%>" class="title"><%out.print(listSp.get(listSp.keySet().toArray()[z]).getTenSanPham()); %></a><br/>
																<a href="ProductDetailSeverlet?id=<%=listSp.get(listSp.keySet().toArray()[z]).getMaSanPham()%>" class="category"><%out.print(ttsp.getMoTa2()); %></a>									
															<%} %>
														<%
															}
														%>
														<p class="price"><%out.print(listSp.get(listSp.keySet().toArray()[z]).getGiaTien()); %> VNĐ</p>
													</div>
												</li>															
												<% 
													}
												%>											
											</ul>
										</div>
										<div class="item">
											<ul class="thumbnails">
												<%
													for (int t = 4;t < 8 ;t++) {		
												%>	
												<li class="span3">
													<div class="product-box">
														<span class="sale_tag"></span>
														<p><a href="ProductDetailSeverlet?id=<%=listSp.get(listSp.keySet().toArray()[t]).getMaSanPham()%>"><img src="themes/images/cloth/bootstrap-women-ware<%out.print(t);%>.jpg" alt="" /></a></p>
														<%
															for (ThongTinSanPham ttsp : listTtsp.values()){	
														%>
															<%if(listSp.get(listSp.keySet().toArray()[t]).getMaThongTinSanPham().equals(ttsp.getMaThongTinSanPham())){ %>
																<a href="ProductDetailSeverlet?id=<%=listSp.get(listSp.keySet().toArray()[t]).getMaSanPham()%>" class="title"><%out.print(listSp.get(listSp.keySet().toArray()[t]).getTenSanPham()); %></a><br/>
																<a href="ProductDetailSeverlet?id=<%=listSp.get(listSp.keySet().toArray()[t]).getMaSanPham()%>" class="category"><%out.print(ttsp.getMoTa2()); %></a>									
															<%} %>
														<%
															}
														%>
														<p class="price"><%out.print(listSp.get(listSp.keySet().toArray()[t]).getGiaTien()); %> VNĐ</p>
													</div>
												</li>															
												<% 
													}
												%>																																	
											</ul>
										</div>
									</div>							
								</div>
							</div>						
						</div>
						
						<div class="row feature_box">						
							<div class="span4">
								<div class="service">
									<div class="responsive">	
										<img src="themes/images/feature_img_2.png" alt="" />
										<h4>THIẾT KẾ <strong>HIỆN ĐẠI</strong></h4>
										<p>Luôn cập nhập những xu hướng thời trang mới nhất.</p>									
									</div>
								</div>
							</div>
							<div class="span4">	
								<div class="service">
									<div class="customize">			
										<img src="themes/images/feature_img_1.png" alt="" />
										<h4>MIỄN PHÍ <strong>SHIP</strong></h4>
										<p>Miễn phí ship trong khu vực Sài Gòn</p>
									</div>
								</div>
							</div>
							<div class="span4">
								<div class="service">
									<div class="support">	
										<img src="themes/images/feature_img_3.png" alt="" />
										<h4>HỖ TRỢ <strong>24/7</strong></h4>
										<p>Đội ngũ nhân viên luôn có mặt để tư vấn khách hàng</p>
									</div>
								</div>
							</div>	
						</div>		
					</div>				
				</div>
			</section>
			<section class="our_client">
				<h4 class="title"><span class="text">Các thương hiệu</span></h4>
				<div class="row">					
					<div class="span2">
						<a href="#"><img alt="" src="themes/images/clients/14.png"></a>
					</div>
					<div class="span2">
						<a href="#"><img alt="" src="themes/images/clients/35.png"></a>
					</div>
					<div class="span2">
						<a href="#"><img alt="" src="themes/images/clients/1.png"></a>
					</div>
					<div class="span2">
						<a href="#"><img alt="" src="themes/images/clients/2.png"></a>
					</div>
					<div class="span2">
						<a href="#"><img alt="" src="themes/images/clients/3.png"></a>
					</div>
					<div class="span2">
						<a href="#"><img alt="" src="themes/images/clients/4.png"></a>
					</div>
				</div>
			</section>
			<jsp:include page="footer/Footer.jsp"></jsp:include>
		</div>
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