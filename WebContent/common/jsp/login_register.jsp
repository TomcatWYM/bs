<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎到来！</title>
</head>
<link rel="stylesheet" href="../css/l_reset.css">
<link rel="stylesheet" href="../css/l_supersized.css">
<link rel="stylesheet" href="../css/l_style.css">
<body  >
<div class="bg">
	<div class="page-container">
		<h1>登录/注册</h1>
		<form action="" method="post">
			<div>
				<input type="text" name="username" class="username"
					placeholder="邮箱" autocomplete="off" />
			</div>
			<div>
				<input type="text" name="username" class="username"
					placeholder="用户名" autocomplete="off" />
			</div>
			<div>
				<input type="password" name="password" class="password"
					placeholder="密码" oncontextmenu="return false"
					onpaste="return false" />
			</div>
			<div>
				<input type="password" name="password" class="password"
					placeholder="验证密码" oncontextmenu="return false"
					onpaste="return false" />
			</div>
			<button id="submit" type="button">登录</button>
			<button id="submit" type="button">注册</button>
		</form>
	</div>
		<div style="margin-top: 100px;">
			<p>If we can only encounter each other rather than stay with each
				other,then I wish we had never encountered.</p>
			<p style="margin-top: 20px;">如果只是遇见，不能停留，不如不遇见。</p>
		</div>
	<div style="position: absolute;;bottom: 0px; margin-left: 450px;">
	<%@include file="../jsp/footer.jsp"%>
	</div>
	</div>
</body>
<script type="text/javascript" src="../script/login.js"></script>
</html>