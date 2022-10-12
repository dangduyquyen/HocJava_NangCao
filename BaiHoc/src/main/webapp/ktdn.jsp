<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String un = request.getParameter("txtun");
	String pass = request.getParameter("txtpass");
	if (un.equals("haha") && pass.equals("123")) {
		session.setAttribute("dn", un);
		response.sendRedirect("htsach.jsp");//Mo trang htsach
	} else
		response.sendRedirect("dangnhap.jsp?kt=1");
	%>
</body>

</html>