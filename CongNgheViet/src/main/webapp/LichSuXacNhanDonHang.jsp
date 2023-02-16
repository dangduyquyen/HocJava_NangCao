<%@page import="bean.AdminDonHangbean"%>
<%@page import="bean.Adminbean"%>
<%@page import="bean.LoaiSanPhambean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Đơn Hàng</title>
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
						<li class="nav-item"><a class="nav-link" href="AdminLichSuXacNhanDonHangController">Lịch sử xác nhận đơn hàng</a></li>h
						
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
				<td width="200"><b>Mã Hóa Đơn</b></td>
				<td width="200"><b>Tên Sản Phẩm</b></td>
				<td width="200"><b>Số Lượng Mua</b></td>
				<td width="200"><b>Giá Sản Phẩm</b></td>
				<td width="200"><b>Thành Tiền</b></td>
				<td width="200"><b>Ngày Mua</b></td>
				<td width="200"><b>Xác Nhận</b></td>
				<td>
			</tr>
			<%
					ArrayList<AdminDonHangbean> dsDonHang = new ArrayList<>();
					if (request.getAttribute("dsDonHang") != null) {
						dsDonHang = (ArrayList<AdminDonHangbean>)request.getAttribute("dsDonHang");
					}
					if (dsDonHang != null) {
					  for (AdminDonHangbean d : dsDonHang) {
						  if(d.getDaMua() == 1){
					%>
							<tr>
								<td width="200"><b><%=d.getMaHD() %></b></td>
								<td width="200"><b><%=d.getTenSP()%></b></td>
								<td width="200"><b><%=d.getSoLuongMua() %></b></td>
								<td width="200"><b><%=d.getGia()%></b></td>
								<td width="200"><b><%=d.getThanhTien() %></b></td>
								<td width="200"><b><%=d.getNgayMua() %></b></td>
								<td width="200"><b><%=d.getDaMua() %></b></td>
								<td width="200"> Đã Xác Nhận</td>
							</tr>
						<%} %>
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
	
	<%
	String tbXacNhan = (String) request.getAttribute("tbXacNhan");
	if(tbXacNhan != null){ %>
		<h1 style="color: red;"><%=tbXacNhan %></h1>	
	<%
	}
	%>
</body>
</html>
</body>
</html>