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
<style>
.card {
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
	max-width: 300px;
	margin: auto;
	text-align: center;
	font-family: arial;
}

.price {
	color: grey;
	font-size: 22px;
}

.card button {
	border: none;
	outline: 0;
	padding: 12px;
	color: white;
	background-color: #000;
	text-align: center;
	cursor: pointer;
	width: 100%;
	font-size: 18px;
}

.card button:hover {
	opacity: 0.7;
}
</style>
</head>
<body>
	<!-- Code JAVA -->
	<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	// lay ds loai sp
	ArrayList<LoaiSanPhambean> dsloaiSP = (ArrayList<LoaiSanPhambean>) request.getAttribute("dsloaiSP");
	ArrayList<HoatDongCuaHangbean> dsHoatDong = (ArrayList<HoatDongCuaHangbean>) request.getAttribute("dsHoatDong");
	ArrayList<SanPhambean> dsSanPham = (ArrayList<SanPhambean>) request.getAttribute("dsSanPham");
	ArrayList<SanPhambean> dsDienThoai = (ArrayList<SanPhambean>) request.getAttribute("dsDienThoai");
	%>
	<!-- End Code JAVA -->
	<!-- header -->
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Công Nghệ Việt</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Danh mục sản phẩm <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<%
						for (LoaiSanPhambean l : dsloaiSP) {
						%>
						<li><a href="<%=l.getMaLoaiSP()%>"><%=l.getTenLoaiSP()%></a></li>
						<%
						}
						%>
					</ul></li>

			</ul>
			<form class="navbar-form navbar-left" action="/action_page.php">
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

	<!-- Hoat Dong Cua Hang -->

	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
		</ol>

		<!-- Wrapper for slides -->
		<%
		for (int i = 0; i < 2; i++) {
			HoatDongCuaHangbean hd = dsHoatDong.get(i);
		%>
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="<%=hd.getAnhHD()%>" alt="Img">
				<div class="carousel-caption">
					<h3><%=hd.getTenHoatDong()%></h3>
				</div>
			</div>
			<%
			i++;
			if (i < 2) {
				hd = dsHoatDong.get(i);
			%>
			<div class="item">
				<img src="<%=hd.getAnhHD()%>" alt="Image">
				<div class="carousel-caption">
					<h3><%=hd.getTenHoatDong()%></h3>
				</div>
			</div>
		</div>
		<%
		}
		%>
		<%
		}
		%>
		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>

	<!-- Het Hoat Dong Cua Hang -->

	<!-- ds dien thoai -->

	<h1><a>Sản Phẩm</a></h1>

	<div class="row">
		<%
		for (int i = 0; i < 4; i++) {
			SanPhambean dt = dsSanPham.get(i);
		%>
		<div class="col-sm-3">
			<div class="well">
				<div class="card">
					<img src="<%=dt.getAnhSP()%>" alt="img"
						style="width: 100%">
					<h4><a href="#?ml=<%=dt.getMaSP()%>"><%=dt.getTenSP() %></a></h4>
					<p class="price"><%=dt.getGia()%></p>
					<p>
						<button>Add to Cart</button>
					</p>
				</div>
			</div>
		</div>
		<%
		i++;
		if (i < 4) {
			dt = dsSanPham.get(i);
		%>
		<div class="col-sm-3">
			<div class="well">
				<div class="card">
					<img src="<%=dt.getAnhSP()%>" alt="img"
						style="width: 100%">
					<h4><a href="#?ml=<%=dt.getMaSP()%>"><%=dt.getTenSP() %></a></h4>
					<p class="price"><%=dt.getGia()%></p>
					<p>
						<button>Add to Cart</button>
					</p>
				</div>
			</div>
		</div>
		<%
		}
		%>
		<%
		i++;
		if (i < 4) {
			dt = dsSanPham.get(i);
		%>
		<div class="col-sm-3">
			<div class="well">
				<div class="card">
					<img src="<%=dt.getAnhSP()%>" alt="img"
						style="width: 100%">
					<h4><a href="#?ml=<%=dt.getMaSP()%>"><%=dt.getTenSP() %></a></h4>
					<p class="price"><%=dt.getGia()%></p>
					<p>
						<button>Add to Cart</button>
					</p>
				</div>
			</div>
		</div>
		<%
		}
		%>
		<%
		i++;
		if (i < 4) {
			dt = dsSanPham.get(i);
		%>
		<div class="col-sm-3">
			<div class="well">
				<div class="card">
					<img src="<%=dt.getAnhSP()%>" alt="img"
						style="width: 100%">
					<h4><a href="#?ml=<%=dt.getMaSP()%>"><%=dt.getTenSP() %></a></h4>
					<p class="price"><%=dt.getGia()%></p>
					<p>
						<button>Add to Cart</button>
					</p>
				</div>
			</div>
		</div>
		<%
		}
		%>
		<%
		}
		%>
	</div>


	<!-- ds lap top -->


</body>
</html>