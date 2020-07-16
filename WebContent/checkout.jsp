<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<title>Bootstrap E-commerce Templates</title>
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
			<img class="pageBanner" src="themes/images/pageBanner.png" alt="Sản phẩm mới" >
				<h4><span>Thanh Toán</span></h4>
			</section>	
			<section class="main-content">
				<div class="row">
					<div class="span12">
						<div class="accordion" id="accordion2">
							<div class="accordion-group">
								<div class="accordion-heading">
									<a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">Phương thức thanh toán</a>
								</div>
								<div id="collapseOne" class="accordion-body in collapse">
									<div class="accordion-inner">
										<div class="row-fluid">
											<div class="span6">
												<h4>Khách hàng mới</h4>
												<p>Bằng cách đăng kí tài khoản, việc mua sắm của bạn sẽ nhanh hơn và bạn có thể xem lịch sử mua hàng của mình.</p>
												<form action="#" method="post">
													<fieldset>
														<label class="radio" for="register">
															<input type="radio" name="account" value="register" id="register" checked="checked">Đăng kí tài khoản
														</label>
														<label class="radio" for="guest">
															<input type="radio" name="account" value="guest" id="guest">Khách lai vãng
														</label>
														<br>
														<button class="btn btn-inverse" data-toggle="collapse" data-parent="#collapse2">Tiếp tục</button>
													</fieldset>
												</form>
											 </div>
											 <div class="span6">
												<h4>Khách quen</h4>
												<p>Tôi là khách quen</p>
												<form action="#" method="post">
													<fieldset>
														<div class="control-group">
															<label class="control-label">Tên đăng nhập</label>
															<div class="controls">
																<input type="text" placeholder="Điền tên đăng nhập" id="username" class="input-xlarge">
															</div>
														</div>
														<div class="control-group">
															<label class="control-label">Mật khẩu</label>
															<div class="controls">
															<input type="password" placeholder="Điền mật khẩu" id="password" class="input-xlarge">
															</div>
														</div>
														<button class="btn btn-inverse">Tiếp tục</button>
													</fieldset>
												</form>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="accordion-group">
								<div class="accordion-heading">
									<a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseTwo">Tài khoản &amp; Chi tiết hóa đơn</a>
								</div>
								<div id="collapseTwo" class="accordion-body collapse">
									<div class="accordion-inner">
										<div class="row-fluid">
											<div class="span6">
												<h4>Thông tin cá nhân</h4>
												<div class="control-group">
													<label class="control-label">Tên</label>
													<div class="controls">
														<input type="text" placeholder="" class="input-xlarge">
													</div>
												</div>
												<div class="control-group">
													<label class="control-label">Họ</label>
													<div class="controls">
														<input type="text" placeholder="" class="input-xlarge">
													</div>
												</div>					  
												<div class="control-group">
													<label class="control-label">Địa chỉ Email</label>
													<div class="controls">
														<input type="text" placeholder="" class="input-xlarge">
													</div>
												</div>
												<div class="control-group">
													<label class="control-label">Số điện thoại</label>
													<div class="controls">
														<input type="text" placeholder="" class="input-xlarge">
													</div>
												</div>
												<div class="control-group">
													<label class="control-label">Fax</label>
													<div class="controls">
														<input type="text" placeholder="" class="input-xlarge">
													</div>
												</div>
											</div>
											<div class="span6">
												<h4>Your Address</h4>
												<div class="control-group">
													<label class="control-label">Công ty</label>
													<div class="controls">
														<input type="text" placeholder="" class="input-xlarge">
													</div>
												</div>
												<div class="control-group">
													<label class="control-label">ID công ty:</label>
													<div class="controls">
														<input type="text" placeholder="" class="input-xlarge">
													</div>
												</div>					  
												<div class="control-group">
													<label class="control-label"><span class="required">*</span> Địa chỉ 1:</label>
													<div class="controls">
														<input type="text" placeholder="" class="input-xlarge">
													</div>
												</div>
												<div class="control-group">
													<label class="control-label">Địa chỉ 2:</label>
													<div class="controls">
														<input type="text" placeholder="" class="input-xlarge">
													</div>
												</div>
												<div class="control-group">
													<label class="control-label"><span class="required">*</span> Thành phố:</label>
													<div class="controls">
														<input type="text" placeholder="" class="input-xlarge">
													</div>
												</div>
												<div class="control-group">
													<label class="control-label"><span class="required">*</span> Mã:</label>
													<div class="controls">
														<input type="text" placeholder="" class="input-xlarge">
													</div>
												</div>
												<div class="control-group">
													<label class="control-label"><span class="required">*</span> Khu vực:</label>
													<div class="controls">
														<select name="zone_id" class="input-xlarge">
															<option value=""> --- Vui lòng lựa chọn --- </option>
															<option value="3513">TPHCM</option>
															<option value="3514">Hà Nội</option>
															<option value="3515">Đà Nẵng</option>
															<option value="3516">Angus</option>
															<option value="3517">Argyll and Bute</option>
														</select>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="accordion-group">
								<div class="accordion-heading">
									<a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseThree">Xác Nhận Đơn Hàng</a>
								</div>
								<div id="collapseThree" class="accordion-body collapse">
									<div class="accordion-inner">
										<div class="row-fluid">
											<div class="control-group">
												<label for="textarea" class="control-label">Bình luận</label>
												<div class="controls">
													<textarea rows="3" id="textarea" class="span12"></textarea>
												</div>
											</div>									
											<button class="btn btn-inverse pull-right">Xác nhận đơn hàng</button>
											<div id="paypal-button-container"></div>
										</div>
									</div>
								</div>
							</div>
						</div>				
					</div>
				</div>
			</section>			
			<section id="footer-bar">
				<div class="row">
					<div class="span3">
						<h4>Thanh điều hướng</h4>
						<ul class="nav">
							<li><a href="./index.jsp">Trang chủ</a></li>  
							<li><a href="./about.jsp">Về chúng tôi</a></li>
							<li><a href="./contact.jsp">Thông tin liên lạc</a></li>
							<li><a href="./cart.jsp">Giỏ hàng</a></li>
							<li><a href="./register.jsp">Đăng nhập</a></li>							
						</ul>					
					</div>
					<div class="span4">
						<h4>Tài khoản của tôi</h4>
						<ul class="nav">
							<li><a href="#">Lịch sử mua hàng</a></li>
							<li><a href="#">Danh sách mong muốn</a></li>
							<li><a href="#">Bản tin</a></li>
						</ul>
					</div>
					<div class="span5">
						<p class="logo"><img src="themes/images/logo.png" class="site_logo" alt=""></p>
						<p>Một trong những nhà phân phối,cung cấp quần áo, giày dép uy tín và chất lượng nhất khu vực Sài Gòn trong mười năm qua</p>
						<br/>
						<span class="social_icons">
							<a class="facebook" href="#">Facebook</a>
							<a class="twitter" href="#">Twitter</a>
							<a class="skype" href="#">Skype</a>
							<a class="vimeo" href="#">Vimeo</a>
						</span>
					</div>					
				</div>	
			</section>
		</div>
		<script src="themes/js/common.js"></script>
		<script src="https://www.paypal.com/sdk/js?client-id=AUFrlin40XhXjV7-zxyn0YOtvST2fC3KcV30XSOK0fjGbkA5xwMDR3XKI_X1n1Qve9iLBIAUvhdDTHZu&disable-funding=credit,card&commit=false"></script>

	    <script>
	        // Render the PayPal button into #paypal-button-container
	        paypal.Buttons({
	
	            // Set up the transaction
	            createOrder: function(data, actions) {
	                return actions.order.create({
	                    purchase_units: [{
	                        amount: {
	                            value: '0.01'
	                        }
	                    }]
	                });
	            },
	
	            // Finalize the transaction
	            onApprove: function(data, actions) {
	                return actions.order.capture().then(function(details) {
	                    // Show a success message to the buyer
	                    alert('Transaction completed by ' + details.payer.name.given_name + '!');
	                });
	            }
	
	
	        }).render('#paypal-button-container');
	    </script>
    
    </body>
</html>