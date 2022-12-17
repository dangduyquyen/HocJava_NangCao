<%@page import="bean.KhachHangbean"%>
<%@page import="bean.LoaiSanPhambean"%>
<%@page import="bean.ThongSoKyThuatbean"%>
<%@page import="bo.ThongTinSanPhambo"%>
<%@page import="bean.SanPhambean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Thông tin sản phẩm</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style type="text/css">
	.container{
		width: 1000px;
		height: 500px;
		border: 1px solid black;
	}
.info button {
	border: none;
	outline: 0;
	padding: 12px;
	color: white;
	background-color: #000;
	text-align: center;
	cursor: pointer;
	width: 200px;
	font-size: 18px;
}

.info button:hover {
	opacity: 0.7;
}
.info{
	height: 500px;
}
.img-product{
	height: 500px;
	max-width: 100%;
}


</style>
	
</head>
<body>
	
	<!-- code java -->
		<%
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			SanPhambean sp = (SanPhambean)request.getAttribute("sp");
			ThongSoKyThuatbean tskt = (ThongSoKyThuatbean)request.getAttribute("tsktsp");
			ArrayList<LoaiSanPhambean> dsloaiSP = (ArrayList<LoaiSanPhambean>) request.getAttribute("dsloaiSP");
			
		%>
	<!-- end code java -->

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
						<%
						if(dsloaiSP != null){
							for (LoaiSanPhambean l : dsloaiSP) {
								%>
								<li><a href="HienThiSanPham?ml=<%=l.getMaLoaiSP()%>"><%=l.getTenLoaiSP()%></a></li>
								<%
							}
						}
						%>
					</ul>
					</li>

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
				<li><a href="LichSuDonHangController">Lịch sử đơn hàng</a></li>
				<li><a href="GioHangController">Giỏ hàng</a></li>
				<%
				if (session.getAttribute("user") != null) {
				%>
				<li><a href="DangNhap.jsp"> <span
						class="glyphicon glyphicon-log-in"></span> Hi: <%
							 KhachHangbean kh = (KhachHangbean) session.getAttribute("user");
							 out.print(kh.getHoTen());
							 %>
				</a></li>
				<%
				} else {
				%>
				<li><a href="DangKy.jsp"><span
						class="glyphicon glyphicon-user"></span> Đăng ký</a></li>

				<li><a href="DangNhap.jsp"> <span
						class="glyphicon glyphicon-log-in"></span> Đăng nhập </a></li><%
				 }
				 %>
			</ul>
		</div>
	</nav>

	<!-- end header -->
	<div class="container">
		<div class="row">
			<div class="col-sm-5">
				<div class="img-product">
					<%if(sp != null){
						%>
						<img alt="" src="<%=sp.getAnhSP() %>" style="width: 100%">
					<%} %>
				</div>
			</div>
			<div class="col-sm-7">
				<div class="info">
				
					<%if(sp != null){%>
						<h1><%=sp.getTenSP() %></h1>
						<h3>Giá: <%=sp.getGia() %> đ</h3>
						<h3>Năm sản xuất: <%=sp.getNamSX() %> </h3>
						<h3>Nhà sản xuất <%=sp.getNhaSX() %> </h3>
						<h3>Thời gian bảo hành<%=sp.getThoiGianBaoHanh()%> </h3>
						<br>
					<%} %>
					<a
						href="ThemSanPhamController?maSP=<%=sp.getMaSP()%>&tenSP=<%=sp.getTenSP()%>&giaSP=<%=sp.getGia()%>&anhSP=<%=sp.getAnhSP()%>"><button>Add
							to Cart</button></a>
				</div>
			</div>
		</div>
		<div class="text-info-product">
			<h1>Thông tin sản phẩm </h1><hr>
			<h3><%=sp.getThongTinSP() %></h3>
		
		</div>
		<div class="details">
			<%if(tskt!=null){%>
				<h1>Thông số kỹ thuật sản phẩm</h1><hr>
				<h3><%=tskt.getMaSP() %></h3><hr>
				<h3><%=tskt.getThongSo1() %></h3><hr>
				<h3><%=tskt.getThongSo2() %></h3><hr>
				<h3><%=tskt.getThongSo3() %></h3><hr>
				<h3><%=tskt.getThongSo4() %></h3><hr>
				<h3><%=tskt.getThongSo5() %></h3><hr>
				<h3><%=tskt.getThongSo6() %></h3><hr>
				<h3><%=tskt.getThongSo7() %></h3><hr>
				<h3><%=tskt.getThongSo8() %></h3><hr>
				<h3><%=tskt.getThongSo9() %></h3><hr>
				<h3><%=tskt.getThongSo10() %></h3><hr>
			<%} %>
		</div>
	</div>

</body>
</html>