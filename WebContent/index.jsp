
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.dbs.bookstore.model.*"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=uft-8">
<title>LIWA Book Store</title>
</head>
<body>
	<center>
		<jsp:include page="head.jsp"></jsp:include>
			<%
				// 获取提示信息
				String info = (String) request.getAttribute("info");
				// 如果提示信息不为空，则输出提示信息
				if (info != null) {
					out.println(info);
					}
				else{
			%>
		
		<table border="1" width="60%">
			<tr>
				<td>书名</td>
				<td>ISBN</td>
				<td>价格</td>
				<td>作者</td>
				<td>分类</td>
				<td>库存</td>
				<td></td>
			</tr>

			<c:forEach var="book" items="${booklist}">
				<tr>
					<td>${book.title}</td>
					<td>${book.ISBN}</td>
					<td>${book.price}</td>
					<td>${book.author}</td>
					<td>${book.category}</td>
					<td>${book.stock}</td>
					<%
						// 获取登录的用户信息
							User user = (User) session.getAttribute("user");
							// 判断用户是否登录
							if (user != null && !user.getName().equals("admin")){
					%>
					<td><a href="CartServlet?action=add&bookId=${book.bookId}">加入购物车</a></td>

					<%
					}
					if (user != null && user.getName().equals("admin")){
					%>
					<td><a
						href="ManageBookServlet?action=del&bookId=${book.bookId}">删除图书</a></td>
					<%
					}
					%>
				</tr>
			</c:forEach>
		</table>
		<%
				}
		%>
		
		<jsp:include page="foot.jsp"></jsp:include>
	</center>
</body>
</html>