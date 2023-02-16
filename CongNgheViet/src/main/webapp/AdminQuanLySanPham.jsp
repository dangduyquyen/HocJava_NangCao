<%@page import="bean.SanPhambean"%>
<%@page import="bean.LichSuDonHangbean"%>
<%@page import="bean.Adminbean"%>
<%@page import="bean.LoaiSanPhambean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Quản Lý Sản Phẩm</title>
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

	<!-- Thêm Sản phẩm -->
	<!-- Thông báo edit -->
	<%String tbeditSP = (String)request.getAttribute("tbeditSP");
		if(tbeditSP != null){
		%>
		<h1><%=tbeditSP %></h1>
		<%		
		}
		%>
	<!-- Thêm Loại SP -->

<div class="addProduct">	
	<h1>Thêm sản Phẩm</h1>
	<hr>
		<form action="AdminThemSanPhamController" method="post" enctype="multipart/form-data">
			<h2>Thông tin</h2>
				<table class="table table-hover">
					<tr>
						<td width="200"><span>Mã sản phẩm</span></td>
						<td width="300"><input type="text" name="maSP" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Mã loại Sản Phẩm</span></td>
						<td width="300"><input type="text" name="maLoaiSP" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Tên sản phẩm</span></td>
						<td width="300"><input type="text" name="tenSP" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Số Lượng</span></td>
						<td width="300"><input type="number" name="soLuong" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Giá</span></td>
						<td width="300"><input type="number" name="gia" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Ảnh sản Phẩm</span></td>
						<td width="300"><input type="file" name="anhSP" size="50" placeholder="Ảnh sản phẩm"></td>
						
					</tr>
					<tr>
						<td width="200"><span>Tên ảnh sản phẩm</span></td>
						<td width="300"><input  type="text" name="tenAnhSP" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Nhà sản xuất</span></td>
						<td width="300"><input  type="text" name="nhaSX" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Năm sản xuất</span></td>
						<td width="300"><input type="text" name="namSX" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Thời gian bảo hành</span></td>
						<td width="300"><input type="text" name="thoiGianBaoHanh" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Thông tin sản phẩm</span></td>
						<td width="300"><input type="text" name="thongTinSP" size="50"></td>
					</tr>
				</table>
			<h2>Thông số kỹ thuật</h2>
				<table class="table table-hover">
					<tr>
						<td width="200"><span>Thông Số 1</span></td>
						<td width="300"><input type="text" name="thongSo1" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Thông Số 2</span></td>
						<td width="300"><input type="text" name="thongSo2" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Thông Số 3</span></td>
						<td width="300"><input type="text" name="thongSo3" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Thông Số 4</span></td>
						<td width="300"><input type="text" name="thongSo4" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Thông Số 5</span></td>
						<td width="300"><input type="text" name="thongSo5" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Thông Số 6</span></td>
						<td width="300"><input type="text" name="thongSo6" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Thông Số 7</span></td>
						<td width="300"><input type="text" name="thongSo7" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Thông Số 8</span></td>
						<td width="300"><input type="text" name="thongSo8" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Thông Số 9</span></td>
						<td width="300"><input type="text" name="thongSo9" size="50"></td>
					</tr>
					<tr>
						<td width="200"><span>Thông Số 10</span></td>
						<td width="300"><input type="text" name="thongSo10" size="50"></td>
					</tr>
					
				</table>
			<button type="submit" class="bt-add-Product">Thêm</button>
		</form>
	<%
		String tbEditLoaiSP = (String)request.getAttribute("");
		if(tbEditLoaiSP != null){ %>
			<h1 style="color: red;"><%=tbEditLoaiSP %></h1>
		<%} %>
		
	<h1>Sản phẩm</h1>
</div>
	<td width="800" valign="top">
		<table class="table table-hover">
			<tr>
				<td width="150"><b>Mã sản phẩm</b></td>
				<td width="150"><b>Mã loại sản phẩm</b></td>
				<td width="150"><b>Tên sản phẩm</b></td>
				<td width="150"><b>Số lượng sản phẩm</b></td>
				<td width="150"><b>Giá sản phẩm</b></td>
				<td width="150"><b>Ảnh sản phẩm</b></td>
				<td width="150"><b>Nhà SX</b></td>
				<td width="150"><b>Năm SX</b></td>
				
			</tr>
			<%
					ArrayList<SanPhambean> dsSanPham = new ArrayList<>();
					if (request.getAttribute("dsSanPham") != null) {
						dsSanPham = (ArrayList<SanPhambean>)request.getAttribute("dsSanPham");
					}
					if (dsSanPham != null) {
					  for (SanPhambean s : dsSanPham) {
					%>
			<tr>
				<td width="150"><b><%=s.getMaSP() %></b></td>
				<td width="150"><b><%=s.getMaLoaiSP() %></b></td>
				<td width="150"><b><%=s.getTenSP() %></b></td>
				<td width="150"><b><%=s.getSoLuong() %></b></td>
				<td width="150"><b><%=s.getGia() %></b></td>
				<td width="150"><img alt="" src="<%=s.getAnhSP() %>"></td>
				<td width="150"><b><%=s.getNhaSX() %></b></td>
				<td width="150"><b><%=s.getNamSX() %></b></td>
				<td><a
					href="AdminXoaSanPhamController?maSP=<%=s.getMaSP()%>">
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
</body>
</html>