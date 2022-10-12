<%@page import="bo.giohangbo"%>
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
   String masach=request.getParameter("ms");
   String tensach=request.getParameter("ts");
   long gia=Long.parseLong(request.getParameter("gia"));
   giohangbo gh;
   if(session.getAttribute("gio")==null){
	   gh=new giohangbo();
	   session.setAttribute("gio", gh);
   }
   //b1: gan session vao bien
   gh=(giohangbo)session.getAttribute("gio");
   //b2: Thao tac tren bien
   gh.Them(masach, tensach, gia, (long)1);
   //b3: Luu bien vao session
   session.setAttribute("gio", gh);
   response.sendRedirect("htgio.jsp");
   %>
</body>
</html>

