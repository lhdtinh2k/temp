<%@page import="bean.loaibean"%>
<%@page import="bean.sachbean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.sachbo"%>
<%@page import="bo.loaibo"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>TinhTong</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
		<form method="post" action="TinhTong.jsp">           
             <label> n=: </label>
             <input name="txtn" type="number" value=0>
             <input name="but1" type="submit" value="Cộng">
         </form>
<%
		if(session.getAttribute("ss")==null){ //chua tao bien session
			session.setAttribute("ss",(long) 0);
		}
		String tam=request.getParameter("txtn");
			if(tam!=null){
				long n=Long.parseLong(tam);
				//b1: gan sesion vao 1 bien
				long s=(long)session.getAttribute("ss");
				//b2: Thay doi gia tri cua bien: s
					s=s+ n;
				//b3: Lưu biến vào session
				session.setAttribute("ss", s);
            	out.print("Tong="+ session.getAttribute("ss"));
         }
%>
</body>
</html>