<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>

<link type="text/css" href="<%=basePath%>css/login.css" rel="stylesheet"/>
<meta charset="UTF-8">
<script src = "<%=basePath%>js/jquery.min.js"></script>
<script src = "<%=basePath%>js/login.js"></script>
<title>Login Page</title>
</head>

<body>

	<div class="login">
		<span class="sp1"></span>
		<div class="login_form">
			<div>
				<input  type="text" id = "nameText"/><span><img src="<%=basePath%>img/user.png"/></span>
				<br />
				<input type="password" id = "pwdText"/><span><img src="<%=basePath%>img/lock.png"/></span>
				<br />
				<button  id="loginBtn">Login</button>
				<br />		
				<button id="registBtn" ><a href="<%=basePath%>resource/user/registpage">Regist</a></button>
		</div>
		</div>
	</div>
</body>

</html>