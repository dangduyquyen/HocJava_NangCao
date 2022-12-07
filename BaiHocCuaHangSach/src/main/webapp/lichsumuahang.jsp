<%@page import="bean.sachbean"%>
<%@page import="bo.sachbo"%>
<%@page import="bean.loaibean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.loaibo"%>
<%@page import="bean.khachhangbean"%>
<%@page import="bean.lichsubean"%>



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
				<li><a href="htsachController">Trang chủ</a></li>
				<%if(request.getAttribute("tongSach") == null ) {%>
	      		<li><a href="htgioController">Giỏ hàng (0)</a></li>
	      		<% } else { %>
	      		<li><a href="htgioController">Giỏ hàng (<%=request.getAttribute("tongSach")%>)</a></li>
	      		<%} %>
				<li><a href="thanhtoanController">Thanh toán</a></li>
				<li class="active"><a href="lichsuController">Lịch sử mua hàng</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<%
				if (session.getAttribute("kh") != null) {
				%>
				<li><a href="logout"><span
						class="glyphicon glyphicon-user"></span> Logout</a></li>

				<li><a href="dangnhap.jsp"> <span
						class="glyphicon glyphicon-log-in"></span> Hi: <%khachhangbean kh = (khachhangbean)session.getAttribute("kh");
						out.print(kh.getHoten());%>
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
			<td width="200" valign="top">
				<table>
					
				</table>
			</td>
			<td width="2000" valign="top">
				<table class="table">
					<%
					ArrayList<lichsubean> dsls = new ArrayList<>();
					if (request.getAttribute("ls") != null) {
					  dsls = (ArrayList<lichsubean>) request.getAttribute("ls");
					%>
					<tr>
						<td>Tên sách</td>
						<td>Số lượng mua</td>
						<td>Giá</td>
						<td>Thành tiền</td>
						<td>Ngày mua</td>
					
					</tr>
					<% for (lichsubean ls : dsls) {%>
					<tr>
						<td><%=ls.getTensach()%></td>
						<td><%=ls.getSoluongmua()%></td>
						<td><%=ls.getGia()%></td>
						<td><%=ls.getThanhtien()%></td>
						<td><%=ls.getNgaymua() %></td>
					</tr>
					
					
					<%} } else {%>
					<tr>Lịch sử mua hàng trống!</tr>
					<%} %>
				</table>
			</td>
			
			<td width="200" valign="top">
				
			</td>
		</tr>
	</table>
</body>
</html>