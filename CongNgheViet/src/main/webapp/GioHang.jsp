<%@page import="java.util.ArrayList"%>
<%@page import="bean.GioHangbean"%>
<%@page import="bo.GioHangbo"%>
<%@page import="bean.KhachHangbean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Giỏ hàng</title>
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
@media ( min-width : 1025px) {
	.h-custom {
		height: 100vh !important;
	}
}

.card-registration .select-input.form-control[readonly]:not([disabled])
	{
	font-size: 1rem;
	line-height: 2.15;
	padding-left: .75em;
	padding-right: .75em;
}

.card-registration .select-arrow {
	top: 13px;
}

.bg-grey {
	background-color: #eae8e8;
}

@media ( min-width : 992px) {
	.card-registration-2 .bg-grey {
		border-top-right-radius: 16px;
		border-bottom-right-radius: 16px;
	}
}

@media ( max-width : 991px) {
	.card-registration-2 .bg-grey {
		border-bottom-left-radius: 16px;
		border-bottom-right-radius: 16px;
	}
}
</style>
</head>
<body>
<!-- code java -->
<%
request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");
GioHangbo gh = (GioHangbo) session.getAttribute("gio");
long tongSP = (long) request.getAttribute("tongSP");
long tongTien = (long) request.getAttribute("tongTien");
%>
<!-- code java -->
	<!-- header -->
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
					<li class="nav-item active"><a class="nav-link"
						aria-current="page" href="HomeController">Công Nghệ Việt</a></li>
					<li class="nav-item"><a class="nav-link" href="LichSuDonHangController">Lịch sử mua hàng</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="GioHangController">Giỏ hàng</a>
					</li>
					<%
					if (session.getAttribute("user") != null) {
					%>
					<li class="nav-item"><a class="nav-link" href="DangNhap.jsp"> <span
							></span> Hi: <%
							 KhachHangbean kh = (KhachHangbean) session.getAttribute("user");
							 out.print(kh.getHoTen());
							 %>
					</a></li>
					<%
					} else {
					%>
					<li class="nav-item"><a class="nav-link" href="DangKy.jsp"><span></span> Đăng ký</a></li>

					<li class="nav-item"><a class="nav-link" href="DangNhap.jsp"> <span></span> Đăng nhập</a></li>
					<%
				 }
				 %>
				</ul>
			</div>
		</div>
	</nav>
	<!-- Navbar -->
	<!-- Navbar -->
	<!--end header -->
	<!-- body -->
	<section class="h-100 h-custom" style="background-color: #d2c9ff;">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-12">
					<div class="card card-registration card-registration-2"
						style="border-radius: 15px;">
						<div class="card-body p-0">
							<div class="row g-0">
								<div class="col-lg-8">
									<div class="p-5">
										<div
											class="d-flex justify-content-between align-items-center mb-5">
											<h1 class="fw-bold mb-0 text-black">Giỏ hàng</h1>
											<h6 class="mb-0 text-muted"><%=tongSP %> Sản Phẩm</h6>
										</div>
										
										<%
										if (gh != null) {
											for (GioHangbean sp : gh.ds){
										%>
											<hr class="my-4">
												<div
													class="row mb-4 d-flex justify-content-between align-items-center">
													<div class="col-md-2 col-lg-2 col-xl-2">
														<img
															src="<%=sp.getAnh() %>"
															class="img-fluid rounded-3" alt="Cotton T-shirt">
													</div>
													
													<div class="col-md-3 col-lg-3 col-xl-3">
														<h6 class="text-muted"><%=sp.getTenSP() %></h6>
													</div>
													<div class="col-md-3 col-lg-2 col-xl-2 offset-lg-1" style="margin-left: 0px;">
														<h6 class="mb-0" ><%=sp.getGia() %> đ</h6>
													</div>
													<div class="col-md-3 col-lg-3 col-xl-2 d-flex">
														<input id="form1" min="0" name="quantity" value="<%=sp.getSoLuong() %>"
															type="number" class="form-control form-control-sm" />
		
														<button class="btn btn-link px-2">
															Cập nhật
														</button>
													</div>
													<div class="col-md-3 col-lg-2 col-xl-2 offset-lg-1" style="margin-left: 0px;">
														<h6 class="mb-0"><%=sp.getThanhTien() %> đ</h6>
													</div>
													<div class="col-md-1 col-lg-1 col-xl-1 text-end">
														<a href="XoaSanPhamController?maSP=<%=sp.getMaSP() %>" class="text-muted"><i class="fas fa-times"></i></a>
													</div>
												</div>
											<%
											}
											%>
										<%
										}else{
										%>
											<h1>Bạn chưa chọn sản phẩm nào!</h1>
											<a href="HomeController"><button type="button" class="btn btn-success">Chọn sản phẩm</button></a>
										<%
										}
										%>

										<hr class="my-4">

										<div class="pt-5">
											<h6 class="mb-0">
												<a href="HomeController" class="text-body"><i
													class="fas fa-long-arrow-alt-left me-2"></i>Back to shop</a>
											</h6>
										</div>
									</div>
								</div>
								<div class="col-lg-4 bg-grey">
									<div class="p-5">
										<h3 class="fw-bold mb-5 mt-2 pt-1">Tóm tắt</h3>
										<hr class="my-4">

										<div class="d-flex justify-content-between mb-4">
											<h5 class="text-uppercase"><%=tongSP %> Sản phẩm</h5>
											<h5><%=tongTien %> đ</h5>
										</div>

										<h5 class="text-uppercase mb-3">Mã giảm giá</h5>

										<div class="mb-5">
											<div class="form-outline">
												<input type="text" id="form3Examplea2"
													class="form-control form-control-lg" /> <label
													class="form-label" for="form3Examplea2">Enter your
													code</label>
											</div>
										</div>

										<hr class="my-4">

										<div class="d-flex justify-content-between mb-5">
											<h5 class="text-uppercase">Tổng giá</h5>
											<h5><%=tongTien %> đ</h5>
										</div>

										<a href="DatHangController"><button type="button" class="btn btn-dark btn-block btn-lg"
											data-mdb-ripple-color="dark">Đặt Hàng</button></a>

									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- end body -->
	<!-- MDB -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.1/mdb.min.js"></script>
</body>
</html>