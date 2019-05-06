<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 
   
<%@ page import ="com.loginsystem.entity.*"  %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<% User user = (User) session.getAttribute("user");  %>
	<head>
		<base href="<%=basePath%>">
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1" />
		<link rel="stylesheet" href="css/bootstrap.css" />
		<link rel="stylesheet" href="css/bootstrap-switch.css" />
		<script src="js/bootstrap.js"></script>
		<script src="js/jquery-3.3.1.js"></script>
		<script src="js/bootstrap-switch.js"></script>
		<script src="js/jquery.pagination.js"></script>
		<title>登录成功</title>
		<style>
			html,
			body {height: 100%;}
			body {display: -ms-flexbox;display: -webkit-box;display: flex;
			-ms-flex-align: center;-ms-flex-pack: center;
			-webkit-box-align: center;align-items: center;-webkit-box-pack: center;justify-content:center;
			padding-top: 40px;padding-bottom: 40px;background-color: #f5f5f5;
			background: url(/LoginSystem/img/3.jpg);
			background-size: 100% 100%}
			.touming{
				padding: 25px;
				background-color:rgba(255,255,255,0.73);
				/* -moz-opacity:0.5; opacity:0.5; */}
			.buttonposition{
				position: absolute;
				top: 10px;
				right: 10px;
			}
		</style>
	</head>
	<body class="text-center">
	<script type="text/javascript">
		function jumpLogout(){
			window.location.href="servlet/LoginoutServlet";
		}
	</script>
		<nav class="navbar navbar-default buttonposition  " role="navigation">
			<div class="navbar-header ">
				<button class="btn btn-primary buttonposition " type = "button" onclick="jumpLogout()" >注销</button>
			</div>
		</nav>
		<div class="container ">
			<div class="panel touming col-md-offset-3 col-md-6 panelPostion ">
				<h1 class="h3 mb-3 font-weight-normal "><%=user.getUsername() %></h1>
				<h2 class="h3 mb-3 font-weight-normal ">恭喜你登录成功！</h1>
			</div>

		</div>
	</body>
</html>