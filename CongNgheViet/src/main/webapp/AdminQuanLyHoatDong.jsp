<%@page import="java.util.ArrayList"%>
<%@page import="bean.HoatDongCuaHangbean"%>
<%@page import="bean.Adminbean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Quản Lý Hoạt Động</title>
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
		img{
		max-width: 100%;
		}
		.addProduct{
			margin-top: 10px;
		}
		.addProduct .bt-add-Product{
			margin-left: 500px;
			margin-bottom: 20px;
		}
	</style>
</head>
<body>

	<%
	response.setContentType("text/html;charset=UTF-8");
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	
	if (session.getAttribute("admin") != null) {
	%>
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
								aria-current="page" href="Admin.jsp">ADMIN</a></li>
							<li class="nav-item"><a class="nav-link" href="QuanLyLoaiSanPhamController">Quản lý Loại Sản Phẩm</a>
							</li>
							<li class="nav-item"><a class="nav-link" href="QuanLySanPhamController">Quản lý Sản Phảm</a>
							</li>
							<li class="nav-item"><a class="nav-link" href="QuanLyDonHangController">Quản lý Đơn Hàng</a></li>
							<li class="nav-item"><a class="nav-link" href="AdminLichSuXacNhanDonHangController">Lịch sử xác nhận đơn hàng</a></li>
							
							<li class="nav-item"><a class="nav-link" href="DangNhapAdmin.jsp"> <span
									></span> Admin: <%
									 Adminbean admin = (Adminbean) session.getAttribute("admin");
									 out.print(admin.getTenAdmin());
									 %>
							</a></li>
							
						</ul>
					</div>
				</div>
			</nav>
		</header>
		<div class="addProduct">	
			<h1>Thêm Hoạt động</h1>
			<hr>
				<form action="AdminThemHoatDongController" method="post" enctype="multipart/form-data">
						<table class="table table-hover">
							<tr>
								<td width="200"><span>Mã hoạt động</span></td>
								<td width="300"><input type="text" name="maSP" size="50"></td>
							</tr>
							<tr>
								<td width="200"><span>tên hoạt động</span></td>
								<td width="300"><input type="text" name="maLoaiSP" size="50"></td>
							</tr>
							<tr>
								<td width="200"><span>Ảnh hoạt động</span></td>
								<td width="300"><input type="file" name="anhSP" size="50" placeholder="Ảnh sản phẩm"></td>
								
							</tr>
							<tr>
								<td width="200"><span>Tên file ảnh hoạt động</span></td>
								<td width="300"><input  type="text" name="tenAnhSP" size="50"></td>
							</tr>
							<tr>
								<td width="200"><span>ngày tháng</span></td>
								<td width="300"><input type="date" name="thongTinSP" size="50"></td>
							</tr>
						</table>
					<button type="submit" class="bt-add-Product">Thêm</button>
				</form>
		<h1>Danh sách hoạt động</h1>
		</div>
		<td width="800" valign="top">
			<table class="table table-hover">
				<tr>
					<td width="150"><b>Mã hoạt động</b></td>
					<td width="150"><b>Tên hoạt động</b></td>
					<td width="150"><b>ảnh hoạt động</b></td>
				</tr>
				<%
					
						ArrayList<HoatDongCuaHangbean> dsHoatDong = (ArrayList<HoatDongCuaHangbean>) request.getAttribute("dsHoatDong");
						
						if (dsHoatDong != null) {
						  for (HoatDongCuaHangbean s : dsHoatDong) {
						%>
				<tr>
					<td width="150"><b><%=s.getMaHoatDong() %></b></td>
					<td width="150"><b><%=s.getTenHoatDong() %></b></td>
					<td width="150"><img alt="" src="<%=s.getAnhHD() %>"></td>
					<td><a
						href="#?maSP=<%=s.getMaHoatDong()%>">
						<button>Xóa</button></a></td>
				</tr>
					<%} %>
						<%} %>
			</table>
		</td>
	<%
	} else {
	%>
	
		<a href="DangNhapAdmin.jsp"><button type="button" class="btn btn-dark btn-block btn-lg"
											data-mdb-ripple-color="dark">Đăng Nhập</button></a>
	<%
	}
	%>
</body>
</html>