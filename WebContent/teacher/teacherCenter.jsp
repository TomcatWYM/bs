<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
<%@ include file="../common/jsp/head_file.jspf"%>
</head>
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
								<td>武玉密</td>
							</tr>
							<tr>
								<td><input type="checkbox" id="showRealName">显示真实姓名
								</td>
							</tr>
							<tr>
								<td>真实姓名:哈哈</td>
							</tr>
							<tr>
								<td>个性宣言：呵呵</td>
							</tr>
						</table>
						<div class="list-group " style="margin-top: 10px;">
							<a class="list-group-item" id="peopleInfo">查看个人信息</a> <a
								class="list-group-item" id="message">我的消息</a> <a
								class="list-group-item" id="friend">我的好友</a> <a
								class="list-group-item" id="classess">我的班级</a> <a
								class="list-group-item" id="password"> 密码修改</a> <a
								class="list-group-item" id="showGrade">试卷</a> <a
								class="list-group-item" id="classessIndex">班级主页设置</a>
						</div>
					</div>
					<!-- col-xs-3 -->
					<div class="col-xs-9">
						<div class="row" style="height: 50px">
							<a href="" class="btn btn-info" style="margin-left: 10px;">>>返回主页</a>


							<button type="button" class="btn btn-info" data-toggle="modal"
								data-target="#sendMessageModal">发送消息</button>
							<button type="button" class="btn btn-info" data-toggle="modal"
								data-target="#findFriend">添加好友</button>
							<button class="btn btn-info">添加试题</button>
							<button class="btn btn-info">组卷</button>
						</div>
						<div class="row">
							<div class="panel panel-default" style="margin-left: 10px;">
								<div class="panel-body">
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
	<%@include file="../common/jsp/footer.jsp"%>

	<%@include file="sendMessageModal.jsp"%>
	<%@include file="findFriendModal.jsp"%>

</body>
</html>
