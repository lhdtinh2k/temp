<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String a1=request.getParameter("a");
	String b1=request.getParameter("b");
	String kq1=request.getParameter("kq");
	
	
%>
	
	<form action="tinhtoan1.jsp" method="post">
	  a=<input name="txta" value="<%=(a1==null?"0":a1) %>" type="number"> <br>
	  b=<input name="txtb" value="<%=(b1==null?"0":b1) %>" type="number"> <br> 
	  ketqua: <%=(kq1==null?"0":kq1)%>		<br>
	    <input name="butcong" value="+" type="submit">
	    <input name="buttru" value="-" type="submit">
	    <input name="butnhan" value="*" type="submit">
	    <input name="butchia" value="/" type="submit">
	</form>
	
	<%
   String tama=request.getParameter("txta");
   String tamb=request.getParameter("txtb");
   if(tama!=null&&tamb!=null){
	   Long a=Long.parseLong(tama);
	   Long b=Long.parseLong(tamb);
	   Long kq=(long)0;
	  if(request.getParameter("butcong")!=null){
		  kq=a+b;
	  }
	  response.sendRedirect("tinhtoan1.jsp?kq="+kq.toString()+"&a="+a.toString()+"&b="+b.toString()); //tu load lai trang
   }
   
%>

</body>
</html>