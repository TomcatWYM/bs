<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>组件试卷</title>
<%@ include
	file="${pageContext.request.contextPath}/common/jsp/head_file.jspf"%>
<style type="text/css">
.small_border {
	border: 1px solid #D3D3D3;
	padding: 5px;
	margin-top: 10px;
}
</style>
</head>
<body>
<body style="background-color: #ddd">
	<div class="container">
		<div class="row">
			<div class="col-sm-5">
				<div class="row">
					<div class="panel panel-default">
						<div class="panel-heading">xxx试卷</div>
						<div class="panel-body">开始时间： 考试时长： 试卷总分： 试卷标签：</div>
					</div>
				</div>
				<div class="row">
					<button id="one" data="试卷类型" class="btn btn-default" number=""
						allGrade="">第1大题</button>
				</div>

			</div>
			<div class="col-sm-7">
				<div class="panel panel-default">
					<div class="panel-heading">
						第一大题<font>数量;总分</font><img id="addQuestion" src="${pageContext.request.contextPath}/paper/img/add.png">
					</div>
					<div class="panel-body"></div>
				</div>
				
			</div>
		</div>
	</div>
	<%@include
		file="${pageContext.request.contextPath}/common/jsp/footer.jsp"%>
</body>
</html>
