<%@page import="bo.GioHangbo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
 
 
<%
String so=request.getParameter("slmua");
String masach=(String)request.getParameter("MaSach");
String CapNhat=request.getParameter("sub0");
String Xoa=request.getParameter("sub1");
GioHangbo gh1 = new GioHangbo();
gh1=(GioHangbo)session.getAttribute("gh");                      //Lấy arraylist gh
 
                                                                                                        //Cập nhật sách
if(CapNhat!=null){
        long so2=Long.parseLong(so);   
        gh1.SetSL(masach,so2);
        session.setAttribute("gh", gh1);
        response.sendRedirect("HTgio.jsp");    
}else{                                                                                          //Xóa sách
        gh1.xoa(masach);
        session.setAttribute("gh", gh1);
        response.sendRedirect("HTgio.jsp");            
}
%>
</body>
</html>
