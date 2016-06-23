<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
<%@ include file="../common/jsp/head_file.jspf"%>
</head>
<style type="text/css">
.remove {
	height: 50px;
	border: 1px solid #F88;
}

.leftName {
	height: 400px;
	overflow: scroll;
}
</style>
<body>
<body style="background-color: #ddd">
	<div class="container">
		<div class="row">
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="col-xs-3 "
						style="background-color: #f5f5f5; height: 570px">
						<table>
							<tr>
								<td><img
									src="${pageContext.request.contextPath}/teacher/images/comback.png"
									height="70px" width="70px"></img></td>
								<td>${sessionScope.student.username}</td>
							</tr>
							<tr>
								<td><input type="checkbox" id="showRealName">是否真实姓名${sessionScope.student.realName}
								</td>
							</tr>
							<tr>
								<td>真实姓名:${sessionScope.student.realName}</td>
							</tr>
							<tr>
								<td>个性宣言:${sessionScope.student.sayForYourself}</td>
							</tr>
						</table>
						<div class="list-group " style="margin-top: 10px;">
							<a class="list-group-item" id="peopleInfo">查看个人信息</a> <a
								class="list-group-item" id="message">我的消息</a> <a
								class="list-group-item" id="friends">我的好友</a> <a
								class="list-group-item" id="classess">我的班级</a> <a
								class="list-group-item" id="resetPwd"> 密码修改</a> <a
								class="list-group-item" id="showGrade">考试</a>
						</div>

					</div>
					<!-- col-xs-3 -->
					<div class="col-xs-9">
						<div class="row" style="height: 50px">
							<a href="" class="btn btn-info" style="margin-left: 10px;">>>返回主页</a>


							<button type="button" class="btn btn-info" data-toggle="modal"
								data-target="#sendMessageModal">发送消息</button>
							<button type="button" class="btn btn-info" data-toggle="modal"
								data-target="#find-friend-modal">添加好友</button>
							<a class="btn btn-info" id="findClassess">进入班级</a>
						</div>
						<div class="row">
							<div class="panel panel-default" style="margin-left: 10px;">
								<div class="panel-body" id="panel-body">
									<!-- 									内容添加 -->

									<!-- 								end -->
								</div>
							</div>
						</div>
						<!-- col-xs-9 -->
					</div>
				</div>
			</div>

		</div>
	</div>
    <jsp:include page="findFriendModal.jsp"/>
    <jsp:include page="sendMessageModal.jsp"/>

	<%@include file="../common/jsp/footer.jsp"%>


    <script type="text/javascript">
        $(function(){

            $(".list-group-item").click(function(){
                var type = $(this).attr('id');
                log(type);
                var $panelBodyContainer = $("#panel-body");
                var requestUrl = "${pageContext.request.contextPath}/studentCenter/"+type+".do";
                $.get(requestUrl,{},function(page){
                    $panelBodyContainer.html(page);
                });
            });
            $("#peopleInfo").click();   //主页默认显示用户信息
        });
    </script>

</body>
</html>
