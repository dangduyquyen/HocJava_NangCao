<%@page import="bean.Adminbean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
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
							aria-current="page" href="#">ADMIN</a></li>
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
	<%
	}else{
	%>
	
		<a href="DangNhapAdmin.jsp"><button type="button" class="btn btn-dark btn-block btn-lg"
											data-mdb-ripple-color="dark">Đăng Nhập</button></a>
	
	<%
	}
	%>
</body>
</html>