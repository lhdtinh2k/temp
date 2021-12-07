<%@page import="org.o7planning.hellospringmvc.bean.Hangbean_Tinh"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jdk.internal.misc.FileSystemOption"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method='post' action='Hang'>
      Nhập tên: <input name='txtname' type='text'><br>
      Nhập Nhà cung cấp :<input name='txtncc' type='text'><br>
      <input name='but1' type='submit' value='Tìm'><br>
</form>
     <c:if test="$ds == null}">
   			 <b> tb:<c:out value="null"></c:out>  </b>
	 </c:if>
   <%
   response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	//System.out.println("ss ne" + session.getAttribute("test"));
   if(session.getAttribute("ds")==null){
	   out.print("k co");
   }
   %>
		<table class="table table-bordered">
		<colgroup>
		    <col width="80" span="2">
		    <col width="100" span="2">
		</colgroup>
		    <thead>
		      <tr>
		        <th>Mã hàng</th>
		        <th>Tên hàng</th>
		        <th>Nhà cung cấp</th>
		        <th>Giá</th>
		        <th> </th>
		      </tr>
		    </thead>
		    <tbody>
		    <%
		    if(session.getAttribute("ds")!=null){
			    ArrayList<Hangbean_Tinh> ds= (ArrayList<Hangbean_Tinh>)session.getAttribute("ds");
			    for(Hangbean_Tinh s: ds) {%>
			    	<tr>
			        <th><%=s.getMahang() %></th>
			        <th><%=s.getTenhang() %></th>
			        <th><%=s.getNhacungcap()%></th>
			        <th><%=s.getGia() %></th>
			        <th> </th>
			      </tr>
			    <%}
		    }
		    %>
		    </tbody>
		  </table>

</body>
</html>