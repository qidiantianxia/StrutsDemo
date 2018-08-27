<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>This is index.jsp</h3>
	<h3>用户</h3>
	<a href="<%=path%>/UserAction_add.action">add</a>
	<br>
	<a href="<%=path%>/UserAction_show.action">show</a>
	<br>


	<h3>新闻</h3>
	<a href="<%=path%>/NewsAction_add.action">add</a>
	<br>
	<a href="<%=path%>/NewsAction_show.action">show</a>
	<br>
</body>
</html>