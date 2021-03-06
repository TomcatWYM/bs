<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎到来！</title>
</head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/common/css/l_reset.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/common/css/l_supersized.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/common/css/l_style.css">
<style type="text/css">
.userType {
	width: 50px !important;
	height: 13px !important;
}
</style>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/common/js/libs/jquery-1.11.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/common/js/common.js"></script>
<body>
	<div class="bg">
		<div class="page-container">
			<h1>登录</h1>
			<form action="${pageContext.request.contextPath}/user/" method="post"
				id="form">
				<div>
					<input type="text" name="email" class="email" placeholder="邮箱"
						autocomplete="off" />
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
					<input class="userType" type="radio" value="student"
						name="userType" checked>学生 <input class="userType"
						type="radio" value="teacher" name="userType">教师
				</div>
				<button id="login" type="button">登录</button>
			</form>
		</div>
		<div style="margin-top: 100px;">
			<p>If we can only encounter each other rather than stay with each
				other,then I wish we had never encountered.</p>
			<p style="margin-top: 20px;">如果只是遇见，不能停留，不如不遇见。</p>
		</div>
		<div style="position: absolute; bottom: 0px; margin-left: 450px;">
			<%@include file="footer.jsp"%>
		</div>
	</div>
</body>
<script type="text/javascript">
    $(function(){
        $("#login").click(function(e){
            e.preventDefault();
            submitForm('login');
        });
        $("#register").click(function(e){
            e.preventDefault();
            submitForm('register');
        });
        function submitForm(type){
            var action = $("#form").attr('action');
            var $form = $("#form");
            $form.attr('action',action+type+'.do');
            log(action);
            $form.submit();
        }
    })
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/common/script/login.js"></script>

</html>