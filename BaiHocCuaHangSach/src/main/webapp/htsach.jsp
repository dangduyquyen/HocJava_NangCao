<%@page import="bean.sachbean"%>
<%@page import="bo.sachbo"%>
<%@page import="bean.loaibean"%>
<%@page import="bean.giohangbean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.loaibo"%>
<%@page import="bo.giohangbo"%>
<%@page import="bean.khachhangbean"%>


<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">

			<ul class="nav navbar-nav">
				<li class="active"><a href="htsachController">Trang chủ</a></li>
				<%
				if (request.getAttribute("tongSach") == null) {
				%>
				<li><a href="htgioController">Giỏ hàng (0)</a></li>
				<%
				} else {
				%>
				<li><a href="htgioController">Giỏ hàng (<%=request.getAttribute("tongSach")%>)
				</a></li>
				<%
				}
				%>
				<li><a href="thanhtoanController">Thanh toán</a></li>
				<li><a href="lichsuController">Lịch sử mua hàng</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<%
				if (session.getAttribute("kh") != null) {
				%>
				<li><a href="logout"><span class="glyphicon glyphicon-user"></span>
						Logout</a></li>

				<li><a href="dangnhap.jsp"> <span
						class="glyphicon glyphicon-log-in"></span> Hi: <%
							 khachhangbean kh = (khachhangbean) session.getAttribute("kh");
							 out.print(kh.getHoten());
							 %>
				</a></li>
				<%
				} else {
				%>
				<li><a href="dangky.jsp"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>

				<li><a href="dangnhap.jsp"> <span
						class="glyphicon glyphicon-log-in"></span> Login <%
				 }
				 %>
			</ul>

		</div>
	</nav>
	<table width="1000" align="center">
		<tr>
			<td width="400" valign="top">
				<table>
					<%
					ArrayList<loaibean> dsloai = new ArrayList<>();
					if (request.getAttribute("dsloai") != null) {
						dsloai = (ArrayList<loaibean>) request.getAttribute("dsloai");
					}
					for (loaibean l : dsloai) {
					%>
					<tr>
						<td><a href="htsachController?ml=<%=l.getMaloai()%>"> <%=l.getTenloai()%>
						</a></td>
					</tr>
					<%
					}
					%>
				</table>
			</td>
			<td width="1000" valign="top">
				<table class="table">

					<%
					ArrayList<sachbean> dssach = new ArrayList<>();
					if (request.getAttribute("dssach") != null) {
						dssach = (ArrayList<sachbean>) request.getAttribute("dssach");
					}
					int n = dssach.size();
					%>
					<h4>
						Số mẫu sách:
						<%=n%></h4>

					<%
					for (int i = 0; i < n; i++) {
						sachbean s = dssach.get(i);
					%>
					<tr>
						<td><img src="<%=s.getAnh()%>"> <br> <%=s.getTensach()%>
							<br> <%=s.getTacgia()%> <br> <%=s.getGia()%> <br>
							<a
							href="themsach?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&gia=<%=s.getGia()%>&anh=<%=s.getAnh()%>">
								<img src="buynow.jpg">
						</a>
							<hr></td>
						<%
						i++;
						if (i < n) {
							s = dssach.get(i);
						%>
						<td><img src="<%=s.getAnh()%>"> <br> <%=s.getTensach()%>
							<br> <%=s.getTacgia()%> <br> <%=s.getGia()%> <br>
							<a
							href="themsach?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&gia=<%=s.getGia()%>&anh=<%=s.getAnh()%>">
								<img src="buynow.jpg">
						</a>
							<hr></td>
						<%
						}
						%>

					</tr>
					<%
					}
					%>
				</table>
			</td>

			<td width="200" valign="top">
				<form action="htsachController" method="get">
					<input class="form-control" name="txttk" type="text" value=""
						placeholder="Tim kiem"> <br> <input
						class="btn-primary" name="buttdn" type="submit" value="Search">

				</form>

			</td>
		</tr>
	</table>
</body>
</html>