<%@page import="bean.khachhangbean"%>
<%@page import="bo.khachhangbo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sach</title>
</head>
<body>
<%
	response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	
	khachhangbo khbo=new khachhangbo();
	String un=request.getParameter("txtun");
	String pass=request.getParameter("txtpass");
	khachhangbean kh=khbo.ktdn(un, pass);
	if(kh!=null){
		session.setAttribute("dn", kh);	//set dn = kh
		session.setAttribute("kt", (long)1);	//set kt = 1
		response.sendRedirect("HTSach.jsp");	
	}else{
		response.sendRedirect("HTSach.jsp");
		session.setAttribute("kt", (long)0);	//set kt = 0
	}
%>
</form>
</body>
</html>