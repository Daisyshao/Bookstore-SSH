<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LIWA Book Store--登录</title>
<script type="text/javascript">
    	function login(form){
        	if(form.username.value == ""){
        		alert("用户不能为空！");
        		return false;
        	}
        	if(form.password.value == ""){
        		alert("密码不能为空！");
        		return false;
        	}
    	}
    </script>
</head>

<body>
<center>
	<jsp:include page="head.jsp"></jsp:include>
	<h3>登录</h3>

	<form action="LoginServlet" method="post" onSubmit="return login(this);">
						    <table align="center" width="300" border="0" class="tb1">
						    	<tr>
						    		<td align="right">用户名：</td>
						    		<td>
						    			<input type="text" name="username">
						    		</td>
						    	</tr>
						    	<tr>
						    		<td align="right">密 码：</td>
						    		<td>
						    			<input type="password" name="password">
						    		</td>
						    	</tr>
						    	<tr>
						    		<td colspan="2" align="center" height="50">
						    			<input type="submit" value="登 录">
						    			<input type="reset" value="重 置">
						    		</td>
						    	</tr>
						    </table>
						</form>
	<jsp:include page="foot.jsp"></jsp:include>
</center>
</body>
</html>