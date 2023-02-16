<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập Admin</title>
<!-- Font Awesome -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
	rel="stylesheet" />
<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
	rel="stylesheet" />
<!-- MDB -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.1/mdb.min.css"
	rel="stylesheet" />
	<style type="text/css">
		li{
		font-weight: 1000;
		}
		
		.container{
			width: 500px;
			height: 300px;
		
		}
		
	
	
	</style>
</head>
<body>
	<header>
		<!-- Navbar -->
		<nav class="navbar navbar-expand-lg navbar-light bg-white">
			<div class="container-fluid">
				<button class="navbar-toggler" type="button"
					data-mdb-toggle="collapse" data-mdb-target="#navbarExample01"
					aria-controls="navbarExample01" aria-expanded="false"
					aria-label="Toggle navigation">
					<i class="fas fa-bars"></i>
				</button>
				<div class="collapse navbar-collapse" id="navbarExample01">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li  class="nav-item active"><a class="nav-link"
							aria-current="page" href="#">ADMIN</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Quản lý Loại Sản Phẩm</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="#">Quản lý Sản Phảm</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="#">Quản lý Đơn Hàng</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Lich sử xác nhận đơn hàng</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Quản lý tài khoản Adimn</a></li>
						<%
						if (session.getAttribute("admin") != null) {
						%>
						<li class="nav-item"><a class="nav-link" href="DangNhap.jsp"> <span
								></span> Admin: <%
								 //KhachHangbean kh = (KhachHangbean) session.getAttribute("user");
								 //out.print(kh.getHoTen());
								 %>
						</a></li>
						<%
						} else {
						%>
						<li class="nav-item"><a class="nav-link" href="DangKy.jsp"><span></span> Thêm tài Khoản Admin</a></li>
	
						<li class="nav-item"><a class="nav-link" href="DangNhapAdmin.jsp"> <span></span> Đăng nhập Admin</a></li>
						<%
						 }
					 	%>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!--  -->
	<br>
	<div class="container">
		<center><h1>Đăng Nhập</h1></center>
		<form action="KiemTraDangNhapAdminController" method="post">
			<div class="form-group">
			  <label for="usr">Tên Đăng Nhập:</label>
			  <input type="text" class="form-control" id="usr" name="adminname">
			</div>
			<div class="form-group">
			  <label for="pwd">Mật Khẩu:</label>
			  <input type="password" class="form-control" id="pwd" name="adminpassword">
			</div>
			<br>
			<center>
				<button type="submit" class="btn btn-success">Đăng Nhập</button>
			</center>
		</form>
		
	</div>
</body>
</html>