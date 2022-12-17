<%@page import="bean.Adminbean"%>
<%@page import="bean.LoaiSanPhambean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Quản lý loại sản phẩm</title>
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
	</style>
</head>
<body>

	<%
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
						<li class="nav-item"><a class="nav-link" href="#">Quản lý tài khoản khách hàng</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Quản lý tài khoản Adimn</a></li>
						
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

	<td width="800" valign="top">
		<table class="table table-hover">
			<tr>
				<td width="200"><b>Mã loại sách</b></td>
				<td width="200"><b>Tên loại sách</b></td>
				<td>
			</tr>
			<%
					ArrayList<LoaiSanPhambean> dsloai = new ArrayList<>();
					if (request.getAttribute("dsloai") != null) {
						dsloai = (ArrayList<LoaiSanPhambean>)request.getAttribute("dsloai");
					}
					if (dsloai != null) {
					  for (LoaiSanPhambean l : dsloai) {
					%>
			<tr>
				<td><%=l.getMaLoaiSP()%></td>
				<td><%=l.getTenLoaiSP()%></td>
				<td><a
					href="AdminXoaLoaiSPController?maLoaiSP=<%=l.getMaLoaiSP()%>">
					<button>Xóa</button></a></td>
			</tr>
			<%} %>
			<%} %>
		</table>
	</td>
	<!-- Thêm Loại SP -->

	<center>

	<form action="AdminThemLoaiSanPhamController" method="get" style="margin-bottom: 30px">
		<td width="800" valign="top">
			<table class="table table-hover">
				<tr>
					<td width="100"><span>Mã Loại Sách</span></td>
					<td width="200"><input name="maLoaiSP" size="50"></td>
				</tr>
				<tr>
					<td width="100"><span>Tên Loại Sách</span></td>
					<td width="200"><input name="tenLoaiSP" size="50"></td>
				</tr>
			</table>
		</td>
		<button type="submit">Thêm</button>
	</form>
	
	<%String tbEditLoaiSP = (String)request.getAttribute("tbEditLoaiSP");
	if(tbEditLoaiSP != null){ %>
		<h1 style="color: red;"><%=tbEditLoaiSP %></h1>
	<%} %>
	
	
	</center>

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