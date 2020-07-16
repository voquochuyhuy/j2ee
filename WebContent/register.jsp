<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<img class="pageBanner" src="themes/images/pageBanner.png" alt="Sản phẩm mới" >
				<h4><span>Đăng nhập / Đăng kí</span></h4>
			</section>			
			<section class="main-content">				
				<div class="row">
					<div class="span5">					
						<h4 class="title"><span class="text">Đơn<strong>Đăng Nhập</strong> </span></h4>
						<form action="#" method="post">
							<input type="hidden" name="next" value="/">
							<fieldset>
								<div class="control-group">
									<label class="control-label">Tên đăng nhập</label>
									<div class="controls">
										<input type="text" placeholder="Nhập tên đăng nhập" id="username" class="input-xlarge">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">Mật khẩu</label>
									<div class="controls">
										<input type="password" placeholder="Nhập mật khẩu" id="password" class="input-xlarge">
									</div>
								</div>
								<div class="control-group">
									<input tabindex="3" class="btn btn-inverse large" type="submit" value="Đăng nhập">
									<hr>
									<p class="reset">Recover your <a tabindex="4" href="#" title="Khôi phục tài khoản">Tên đăng nhập</a></p>
								</div>
							</fieldset>
						</form>				
					</div>
					<div class="span7">					
						<h4 class="title"><span class="text">Đơn <strong>Đăng Kí</strong> </span></h4>
						<form action="#" method="post" class="form-stacked">
							<fieldset>
								<div class="control-group">
									<label class="control-label">Tên đăng nhập</label>
									<div class="controls">
										<input type="text" placeholder="Nhập tên đăng nhập" class="input-xlarge">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">Địa chỉ Email:</label>
									<div class="controls">
										<input type="password" placeholder="Nhập địa chỉ Email" class="input-xlarge">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">Mật khẩu:</label>
									<div class="controls">
										<input type="password" placeholder="Nhập mật khẩu" class="input-xlarge">
									</div>
								</div>							                            
								<div class="control-group">
									<p>Now that we know who you are. I'm not a mistake! In a comic, you know how you can tell who the arch-villain's going to be?</p>
								</div>
								<hr>
								<div class="actions"><input tabindex="9" class="btn btn-inverse large" type="submit" value="Tạo tài khoản"></div>
							</fieldset>
						</form>					
					</div>				
				</div>
			</section>			
			<jsp:include page="footer/Footer.jsp"></jsp:include>
			
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