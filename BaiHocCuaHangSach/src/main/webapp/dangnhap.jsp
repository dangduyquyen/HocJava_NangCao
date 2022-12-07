<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<table width="1000" align="center">
		<tr>
			<td>
				<form action="ktdn" method="post">
				<h3 align="center" class="">Login</h3>
				  <div class="form-group">
				    <label for="un">Username</label>
				    <input name="txtun" type="text" class="form-control" id="un" placeholder="Username">
				  </div>
				  <div class="form-group">
				    <label for="pass">Password</label>
				    <input name="txtpass" type="password" class="form-control" id="pass" placeholder="Password">
				  </div>
				  <button name="butt" type="submit" class="btn btn-default">Đăng nhập</button>
				</form>
				<hr>
				<button class="btn btn-default"><a href="dangky.jsp">Đăng ký</a></button>
			</td>
		</tr>
	</table>
	
	<%
	if (request.getParameter("kt") != null) {%>
	<script>alert("Thông tin đăng nhập sai")</script> 
	<%}%>

</body>
</html>

