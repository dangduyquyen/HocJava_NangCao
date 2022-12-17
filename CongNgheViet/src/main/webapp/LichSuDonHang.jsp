<%@page import="bean.KhachHangbean"%>
<%@page import="bean.LichSuDonHangbean"%>
<%@page import="java.util.ArrayList"%>
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
.gradient-custom {
	/* fallback for old browsers */
	background: #cd9cf2;
	/* Chrome 10-25, Safari 5.1-6 */
	background: -webkit-linear-gradient(to top left, rgba(205, 156, 242, 1),
		rgba(246, 243, 255, 1));
	/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
	background: linear-gradient(to top left, rgba(205, 156, 242, 1),
		rgba(246, 243, 255, 1))
}
</style>
</head>
<body>
<!-- code java -->
<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	ArrayList<LichSuDonHangbean> dsDonHang = (ArrayList<LichSuDonHangbean>)request.getAttribute("dsDonHang");
%>
<!-- end code java -->

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
					<li class="nav-item"><a class="nav-link" href="LichSuDonHangController">Lịch sử
							mua hàng</a></li>
					<li class="nav-item"><a class="nav-link" href="GioHangController">Giỏ hàng</a>
					</li>
					<%
					if (session.getAttribute("user") != null) {
					%>
					<li class="nav-item"><a class="nav-link" href="DangNhap.jsp">
							<span></span> Hi: <%
							KhachHangbean kh = (KhachHangbean) session.getAttribute("user");
							out.print(kh.getHoTen());
							%>
					</a></li>
					<%
					} else {
					%>
					<li class="nav-item"><a class="nav-link" href="DangKy.jsp"><span></span>
							Đăng ký</a></li>

					<li class="nav-item"><a class="nav-link" href="DangNhap.jsp">
							<span></span> Đăng nhập
					</a></li>
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

	<section class="h-100 gradient-custom">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-lg-10 col-xl-8">
					<div class="card" style="border-radius: 10px;">
						<div class="card-header px-4 py-5">
							<h5 class="text-muted mb-0">
								Lịch sử đơn hàng !
							</h5>
						</div>
						<div class="card-body p-4">
							<%
							if(dsDonHang != null){
								for(LichSuDonHangbean dh : dsDonHang){
							%>
									<div class="card shadow-0 border mb-4">
										<div class="card-body">
											<div class="row">
												<div class="col-md-2">
													<img
														src="<%=dh.getAnhSP() %>"
														class="img-fluid" alt="Phone">
												</div>
												<div
													class="col-md-2 text-center d-flex justify-content-center align-items-center">
													<p class="text-muted mb-0"><%=dh.getTenSP()%></p>
												</div>
												<div
													class="col-md-2 text-center d-flex justify-content-center align-items-center">
													<p class="text-muted mb-0 small"><%=dh.getGia() %> đ</p>
												</div>
												<div
													class="col-md-2 text-center d-flex justify-content-center align-items-center">
													<p class="text-muted mb-0 small"><%=dh.getSoLuongMua() %></p>
												</div>
												<div
													class="col-md-2 text-center d-flex justify-content-center align-items-center">
													<p class="text-muted mb-0 small"><%=dh.getThanhTien() %> đ</p>
												</div>
												<div
													class="col-md-2 text-center d-flex justify-content-center align-items-center">
													<p class="text-muted mb-0 small"><%=dh.getNgayMua() %></p>
												</div>
											</div>
											<hr class="mb-4" style="background-color: #e0e0e0; opacity: 1;">
										</div>
									</div>
								<%	
								}
								%>
							<%	
							}
							%>
							
							
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>



</body>
</html>