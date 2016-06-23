<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>欢迎到来！</title>
</head>
<%@ include file="head_file.jspf" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/common/css/l_reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/common/css/l_supersized.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/common/css/l_style.css">
<style type="text/css">
    .userType {
        width: 50px !important;
        height: 13px !important;

    }
</style>
<script src="${pageContext.request.contextPath}/common/script/jquery-1.11.1.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/common/js/common.js" type="text/javascript"></script>

<body>
	<div class="bg">
		<div class="page-container">
			<h1>注册</h1>
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
					<input type="password" name="re-password" class="re-password"
						placeholder="验证密码" oncontextmenu="return false"
						onpaste="return false" />
				</div>
				<div>
					<input class="userType" type="radio" value="student"
						name="userType" checked>学生 <input class="userType"
						type="radio" value="teacher" name="userType">教师
				</div>
				<button id="register" type="button">注册</button>
			</form>
		</div>
		<div style="position: absolute;; bottom: 0px; margin-left: 450px;">
			<%@include file="footer.jsp"%>
		</div>
	</div>
</body>
<script type="text/javascript">
    $(function () {
        $("#login").click(function (e) {
            e.preventDefault();
            submitForm('login');
        });
        $("#register").click(function(e){
        	if($(".password").val()==$(".re-password").val()){
                e.preventDefault();
                submitForm('register');
        	}else{
        		alert("请输入相同密码！！");
        	}


        $("#register").click(function (e) {
            e.preventDefault();
            submitForm('register');
        });
        function submitForm(type) {
            var action = $("#form").attr('action');
            var $form = $("#form");
            $form.attr('action', action + type + '.do');
            log(action);
            $form.submit();
        }
    })
</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/common/script/login.js"></script>

</html>