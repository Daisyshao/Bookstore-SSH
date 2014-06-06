<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="com.dbs.bookstore.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=uft-8">
<title>LIWA Book Store</title>
</head>
<body>
	<center>
		<h1>
			欢迎来到 <i>LIWA Book Store!</i>
		</h1>

		<div class=head_middle>
			<a href="index.jsp">首页</a>
			<%
				// 获取登录的用户信息
				User user = (User) session.getAttribute("user");
				// 判断用户是否登录
				if (user == null) {
			%>
			<a href="login.jsp">登录</a>
			<%
			}
				else {
					if (user.getName().equals("admin")){
				
			%>
			<a href="ListUserServlet">用户管理</a> 
			<a href="statistics.jsp">销售记录统计</a>
			<a href="addBook.jsp">增加图书</a>
			<%
				}
				else {
			%>
			<a href="CartServlet">我的购物车</a> 
			<%
			}
			%>
					
				<a href="ExitServlet">注销</a>
			<%
				}
			%>

			<a href="register.jsp">注册</a>

		</div>
	</center>
</body>
</html>