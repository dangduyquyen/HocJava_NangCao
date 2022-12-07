<%@page import="bean.sachbean"%>
<%@page import="bo.sachbo"%>
<%@page import="bean.loaibean"%>
<%@page import="bean.giohangbean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.loaibo"%>
<%@page import="bo.giohangbo"%>
<%@page import="bean.khachhangbean"%>
<%@page import="bean.dangnhapadminbean"%>




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
		        <li><a href="admin_QuanLyLoaiSachController">Quản lý loại</a></li>
		      	<li><a href="#">Quản lý sách</a></li>
				<li><a href="#">Xác nhận</a></li>
				<li><a href="#">Danh sách khách hàng</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				
				<li><a href="logout"><span class="glyphicon glyphicon-user"></span> Logout</a></li>
				<%
				if (session.getAttribute("admin") != null) {
				%>
				<li><a href=""> <span class="glyphicon glyphicon-log-in"></span> 
						Hi: <%dangnhapadminbean dn = (dangnhapadminbean)session.getAttribute("admin");
						out.print(dn.getTendn());%>
				</a></li>
				<%
				} else {
				%>
				
				<li><a href="dangnhapadminController"> <span
						class="glyphicon glyphicon-log-in"></span> Login </a></li>
 
 				<%} %>
			</ul>

		</div>
	</nav>
	<table width="1000" align="center">
		
	</table>
</body>
</html>