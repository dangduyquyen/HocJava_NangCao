<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Font Awesome -->
<link
  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
  rel="stylesheet"
/>
<!-- Google Fonts -->
<link
  href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
  rel="stylesheet"
/>
<!-- MDB -->
<link
  href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.0/mdb.min.css"
  rel="stylesheet"
/>
</head>
<body>
<!-- code java -->
	<% String tbTaoTaiKhoan = (String)request.getAttribute("tbThieuThongTin"); %>
	<% String tbLoiTenDN = (String)request.getAttribute("tbLoiTenDN"); %>
<!-- end code java -->


<section class="vh-100 bg-image"
  style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
  <div class="mask d-flex align-items-center h-100 gradient-custom-3">
    <div class="container h-100">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col-12 col-md-9 col-lg-7 col-xl-6">
          <div class="card" style="border-radius: 15px;">
            <div class="card-body p-5">
              <h2 class="text-uppercase text-center mb-5">ĐẮNG KÝ TÀI KHOẢN</h2>

              <form action="DangKyController" method="post">

                <div class="form-outline mb-4">
                  <input name="hoTen" type="text" id="form3Example1cg" class="form-control form-control-lg" />
                  <label class="form-label" for="form3Example1cg">Tên của bạn</label>
                </div>

                <div class="form-outline mb-4">
                  <input name="email" type="email" id="form3Example3cg" class="form-control form-control-lg" />
                  <label class="form-label" for="form3Example3cg">Email của bạn</label>
                </div>
                
                <div class="form-outline mb-4">
                  <input name="diaChi" type="text" id="form3Example3cg" class="form-control form-control-lg" />
                  <label class="form-label" for="form3Example3cg">Địa chỉ của bạn</label>
                </div>
                
                <div class="form-outline mb-4">
                  <input name="SDT" type="text" id="form3Example3cg" class="form-control form-control-lg" />
                  <label class="form-label" for="form3Example3cg">Số điện thoại của bạn</label>
                </div>
                
                <div class="form-outline mb-4">
                  <input name="tenDN" type="text" id="form3Example3cg" class="form-control form-control-lg" />
                  <label class="form-label" for="form3Example3cg">Tên Đăng Nhập</label>
                </div>
                <%if(tbLoiTenDN != null){%>
					<p color : red;> <%=tbLoiTenDN%> </p>
				<%} %>

                <div class="form-outline mb-4">
                  <input name="matKhauDN" type="password" id="form3Example4cg" class="form-control form-control-lg" />
                  <label class="form-label" for="form3Example4cg">Mật khẩu</label>
                </div>

                <div class="d-flex justify-content-center">
                  <button type="submit"
                    class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Đăng Ký</button>
                </div>
				<%if(tbTaoTaiKhoan != null){%>
					<p color : red;> <%=tbTaoTaiKhoan%> </p>
				<%} %>
                <p class="text-center text-muted mt-5 mb-0">Bạn đã có tài khoản? <a href="#!"
                    class="fw-bold text-body"><u>Đăng nhập tại đây</u></a></p>

              </form>

            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>



<!-- MDB -->
<script
  type="text/javascript"
  src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.0/mdb.min.js"
></script>
</body>
</html>