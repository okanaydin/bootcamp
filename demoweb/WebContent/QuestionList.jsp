<%@page import="com.eteration.entity.Question"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 

Question question=(Question)request.getAttribute("question");
%>



<table style="width:100%">
  <tr>
    <th>Header</th>
    <th>Body</th> 
    <th>Date</th>
  </tr>
  <tr>
    <td><%=question.getHeader() %></td>
    <td><%=question.getBody() %></td> 
    <td><%=question.getDate() %></td>
  </tr>

</table>
</body>
</html>