<%@page import="bean.giohangbean"%>
<%@page import="bo.giohangbo"%>
<%@page import="bean.sachbean"%>
<%@page import="bo.sachbo"%>
<%@page import="bean.loaibean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.loaibo"%>
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
				<li class="active"><a href="htsach.jsp">Trang chủ</a></li>

				<li><a href="htgio.jsp">Giỏ hàng</a></li>
				<li><a href="thanhtoan.jsp">Thanh toán</a></li>
				<li><a href="lichsu.jsp">Lịch sử mua hàng </a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="logout.jsp"><span
						class="glyphicon glyphicon-user"></span> Logout</a></li>

				<%
				if (session.getAttribute("dn") != null) {
				%>
				<li><a href="dangnhap.jsp"> <span
						class="glyphicon glyphicon-log-in"></span> Hi: <%=session.getAttribute("dn")%>
				</a></li>
				<%
				} else {
				%>
				<li><a href="dangnhap.jsp"> <span
						class="glyphicon glyphicon-log-in"></span> Login
				</a></li>
				<%
				}
				%>
			</ul>
		</div>
	</nav>
	<table width="1000" align="center">
		<tr>
			<td width="200" valign="top">
				<table>
					<%
					loaibo lbo = new loaibo();
					ArrayList<loaibean> dsloai = lbo.getloai();
					for (loaibean l : dsloai) {
					%>
					<tr>
						<td><a href="htsach.jsp?ml=<%=l.getMaloai()%>"> <%=l.getTenloai()%>
						</a></td>
					</tr>
					<%
					}
					%>
				</table>
			</td>
			<td width="600" valign="top">
				<table class="table table-hover">
					<%
					giohangbo gh = (giohangbo) session.getAttribute("gio");
					if (gh != null) {
						for (giohangbean h : gh.ds) {
					%>
					<tr>
						<td><%=h.getMasach()%></td>
						<td><%=h.getTensach()%></td>
						<td><%=h.getGia()%></td>
						<td><%=h.getSoluong()%></td>
						<td>
							<form action="suaxoa.jsp?ms=<%=h.getMasach()%>" method="post">
								<input name="txtsl" type="number" min="0" width="25" value="0">
								<button name="butsua" type="submit" value="">update</button>
								<button name="butxoa" type="submit" value="">Delete</button>
							</form>
						</td>
						<td><%=h.getThanhtien()%></td>
					</tr>
						<%
						}
						%>
					<%
					}
					%>
				</table>

			</td>
			<td width="200" valign="top">
				<form action="htsach.jsp" method="get">
					<input class="form-control" name="txttk" type="text" value=""
						placeholder="Nhap tt"> <br> <input
						class="btn-primary" name="butdn" type="submit" value="Search">
				</form>

			</td>
		</tr>
	</table>
</body>
</html>
