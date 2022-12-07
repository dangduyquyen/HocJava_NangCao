<%@page import="bean.loaibean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quan ly loai</title>
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

			<td width="500" valign="top">
				<table class="table table-hover">
					<%
					ArrayList<loaibean> dsloai = new ArrayList<>();
					if (request.getAttribute("dsloai") != null) {
						dsloai = (ArrayList<loaibean>) request.getAttribute("dsloai");
					}
					if (dsloai != null) {
					  for (loaibean l : dsloai) {
					%>
					<tr>
						<td>Mã loại sách</td>
						<td>Tên loại sách</td>
					</tr>
					<tr>
						<td><%=l.getMaloai()%></td>
						<td><%=l.getTenloai()%></td>
					</tr>
						<%} %>
					<%} %>
				</table>
			</td>

</body>
</html>