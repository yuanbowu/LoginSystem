<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1" />
		<link rel="stylesheet" href="/LoginSystem/css/bootstrap.css" />
		<link rel="stylesheet" href="/LoginSystem/css/bootstrap-switch.css" />
		<script src="/LoginSystem/js/bootstrap.js"></script>
		<script src="/LoginSystem/js/jquery-3.3.1.js"></script>
		<script src="/LoginSystem/js/bootstrap-switch.js"></script>
		<title>欢迎注册</title>
		<style>
			html,
			body {height: 100%;}
			body {display: -ms-flexbox;display: -webkit-box;display: flex;-ms-flex-align: center;-ms-flex-pack: center;
			-webkit-box-align: center;align-items: center;-webkit-box-pack: center;justify-content:center;
			padding-top: 40px;padding-bottom: 40px;background-color: #f5f5f5;
			background: url(/LoginSystem/img/3.jpg);
			background-size: 100% 100%}
			.form-sign {width: 100%;max-width: 330px;padding: 15px;margin: 0 auto;}
			.form-sign .radio {font-weight: 400;}
			.form-sign .form-control {position: relative;box-sizing: border-box;height: auto;padding: 10px;font-size: 16px;}
			.form-sign .form-control:focus {z-index: 2;}
		</style>
	</head>
	<body class="text-center" >
		<div class="container ">
			<form role="form" class="form-sign" action="RegisterServlet" method="post" >
					<h1 class="mb-3 font-weight-normal">用户注册</h1>
					<div >
						<input type="text" class="form-control " 
						 placeholder="Enter Your Username" required autofocus name = "username" />
					</div>
					<div >
						<input type="password" class="form-control"
						 placeholder="Enter Your Password" name = "password" />
					</div>
					<button type="submit" class="btn btn-block btn-info " >注册</button>
			</form>
		</div>
	</body>
</html>