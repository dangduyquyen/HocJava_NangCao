<%@ page language="java" contentType="text/html; charset=utf-8"
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
				<form action="dangky" method="post">
				<h3 align="center" class="">Sign Up</h3>
				  <div class="form-group">
				    <label for="un">Username</label>
				    <input name="txtun" type="text" class="form-control" id="un" placeholder="Username">
				  </div>
				  <div class="form-group">
				    <label for="pass">Password</label>
				    <input name="txtpass" type="password" class="form-control" id="pass" placeholder="Password">
				  </div>
				  <div class="form-group">
				    <label for="ht">Họ tên</label>
				    <input name="txtht" type="text" class="form-control" id="ht" placeholder="Họ tên">
				  </div>
				  <div class="form-group">
				    <label for="dc">Địa chỉ</label>
				    <input name="txtdc" type="text" class="form-control" id="dc" placeholder="Địa chỉ">
				  </div>
				  <div class="form-group">
				    <label for="sdt">Số điện thoại</label>
				    <input name="txtsdt" type="text" class="form-control" id="sdt" placeholder="Số điện thoại">
				  </div>
				  <div class="form-group">
				    <label for="email">Email</label>
				    <input name="txtemail" type="email" class="form-control" id="email" placeholder="Email">
				  </div>
				  <button name="butt" type="submit" class="btn btn-default">Submit</button>
				</form>
				<hr>
				<button class="btn btn-default"><a href="dangnhap.jsp">Đăng nhập</a></button>
			</td>
			
		</tr>
		
		<%
		if (request.getParameter("kt") != null) {%>
		<script>alert("Tên đăng nhập bị trùng")</script> 
		<%}%>
		
		
	</table>
	
	
	

</body>
</html>

