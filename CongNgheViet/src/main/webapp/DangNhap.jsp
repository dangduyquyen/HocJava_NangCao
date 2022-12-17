<%@page import="bean.SanPhambean"%>
<%@page import="bean.HoatDongCuaHangbean"%>
<%@page import="java.lang.reflect.Array"%>
<%@page import="bean.LoaiSanPhambean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Chủ</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<!-- CSS -->
	
	<style type="text/css">
		.container{
			width: 500px;
			height: 300px;
		
		}
		
	
	</style>


</head>
<body>
	<!-- Code JAVA -->
	<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	
	String tbLogin = (String)request.getAttribute("tbLogin");
	%>
	<!-- header -->
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="HomeController">Công Nghệ Việt</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Danh mục sản phẩm <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="HienThiSanPham?ml=CMR_WC">Camera Webcam</a></li>
						<li><a href="HienThiSanPham?ml=PKMT">Phụ Kiện Máy Tính</a></li>
						<li><a href="HienThiSanPham?ml=PKDT">Phụ Kiện Điện Thoại</a></li>
						<li><a href="HienThiSanPham?ml=MT">Máy Tinh</a></li>
						<li><a href="HienThiSanPham?ml=MH">Màng Hình</a></li>
						<li><a href="HienThiSanPham?ml=MC">Máy Chiếu</a></li>
						<li><a href="HienThiSanPham?ml=LT">LapTop</a></li>
						<li><a href="HienThiSanPham?ml=DT">Điện Thoại</a></li>
						<li><a href="HienThiSanPham?ml=DH">Đồng hồ</a></li>
					</ul></li>

			</ul>
			<form class="navbar-form navbar-left" action="HienThiSanPham" method="get">
				<div class="input-group">
					<input size=50 type="text" class="form-control"
						placeholder="Search" name="search">
					<div class="input-group-btn">
						<button class="btn btn-default" type="submit">
							<i class="glyphicon glyphicon-search"></i>
						</button>
					</div>
				</div>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#">Lịch sử đơn hàng</a></li>
				<li><a href="#">Giỏ hàng</a></li>
				<li><a href="DangKy.jsp"><span
						class="glyphicon glyphicon-user"></span> Đăng ký</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
						Đăng nhập</a></li>
			</ul>
		</div>
	</nav>

	<!-- end header -->
	<!-- đăng nhập -->
	<div class="container">
		<h1>Đăng Nhập</h1>
		<form action="KiemTraDangNhapUserController" method="post">
			<div class="form-group">
			  <label for="usr">Name:</label>
			  <input type="text" class="form-control" id="usr" name="username">
			</div>
			<div class="form-group">
			  <label for="pwd">Password:</label>
			  <input type="password" class="form-control" id="pwd" name="password">
			</div>
			<center>
				<button type="submit" class="btn btn-success">Đăng Nhập</button>
			</center>
		</form>
		<%if(tbLogin != null){ %>
			<h2 style="color: red;"><%=tbLogin %></h2>
		<%} %>
	</div>
	


	


</body>
</html>