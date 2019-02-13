<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
	<head>
		<meta charset="utf-8">
		<title>Regist</title>
		<style>
			body{
				background-color:wheat;
			}
			.regist{
				position: absolute;
				margin: auto;
				width: 350px;
				height: 400px;
				top: 0;
				left: 100px;
				bottom: 0;
				right: 0;
				background-color: lightseagreen;
				border:solid lightseagreen;
				border-radius: 10px;
				box-shadow: 3px 3px 6px #666;
			}
			.regist .sp1{
				width: 0;
				height: 0;
				border: solid 12px;
				border-color: wheat lightseagreen wheat wheat; 
				position:absolute;
				top: 50px;
				left: -27px;		
			}
			.regist div{
				width: 300px;
				height: 300px;
				margin: 50px auto ;
				font-family: arial;
			}
			.regist div input{
				height: 40px;
				width: 250px;
				margin:15px 20px;
				border: solid beige;
				border-radius: 5px;
				background-color: cornsilk;
			}
			.regist div span{
				margin:20px -50px 0px;
			}
			.regist div button{
				height: 45px;
				width: 258px;
				margin:15px 20px;
				color: black;
				font-size: 20px;
				border-radius: 5px;
				border: solid lightcoral;
				background-color:lightcoral;
			}
			.regist div button:hover{
				background-color:rgba(240,128,128,0.8);
				border: 0;
				font-size: 23px;
			}
			.regist div button a{
				text-decoration: none;
				color: black;
			}
		</style>
		<script src = "<%=basePath%>js/jquery.min.js"></script>
		<script src = "<%=basePath%>js/regist.js"></script>
	</head>
	<body>
		<div class="regist">
			<span class="sp1"></span>
			<div>
				<input type="text" id = "regNameText" /><span><img src="<%=basePath%>img/user.png"/></span>
				<br />
				<input type="password" id = "regpwdText"/><span><img src="<%=basePath%>img/lock.png"/></span>
				<br />
				<input type="password" id = "regpwdText2"/><span><img src="<%=basePath%>img/lock.png"/></span>
				<br />
				<button id = "regBtn">Regist</button>
			</div>
		</div>
		

	</body>
</html>
