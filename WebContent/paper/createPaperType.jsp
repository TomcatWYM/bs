<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>组件试卷</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/common/css/time.css">
<%@ include file="../common/jsp/head_file.jspf"%>
</head>
<body>
<body style="background-color: #ddd">
	<div class="container">
		<div class="row" style="margin-top: -50px;">
			<div class="col-sm-8 col-sm-offset-2">
				<div class="row">

					<!-- 		试卷基本信息 -->
					<div class="panel panel-default">
						<div class="panel-body">
							<div class="row">
								<div class="col-sm-2">试卷名称：</div>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="paperName"
										value="**试卷">
								</div>
							</div>
							<div class="row">
								<div class="col-sm-2">开始时间：</div>
								<div class="col-sm-6">
									<input type="text" class="form-control date_picker"
										id="beginTime" value="2016-6-4">
								</div>
							</div>
							<div class="row">
								<div class="col-sm-2">考试时长：</div>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="testAllTime"
										value="90">
								</div>
							</div>
							<div class="row">
								<div class="col-sm-2">考试总分：</div>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="paperNumber"
										value="100">
								</div>
							</div>
							<div class="row">
								<div class="col-sm-2">试卷标签：</div>
								<div class="col-sm-6">
									<input type="text" class="form-control" value="分号；隔开"
										id="paperTitle">
								</div>
							</div>

						</div>
					</div>
					<!-- 					单选 -->
					<div class="panel panel-default copy">
						<div class="panel-body">
							<!-- 						单选 -->
							<div class="row" style="padding: 0px;">
								<div class="row">
									<div class="change">第一大题:</div>
								</div>
								<div class="row">
									试题类型： <select class="questionType">
										<option selected value="1">单选题</option>
									</select> 简单说明：<input type="text" class="questionName"
										placeholder="显示名称"> 试题数量：<input type="text"
										class="questionNumber" style="width: 50px;" placeholder="10">
									总分数：<input type="text" class="questionGrade"
										style="width: 50px;" placeholder="20">
								</div>
							</div>
						</div>
					</div>
					<!-- 多选 -->
					<div class="panel panel-default copy">
						<div class="panel-body">
							<!-- 						单选 -->
							<div class="row" style="padding: 0px;">
								<div class="row">
									<div class="change">第二大题:</div>
								</div>
								<div class="row">
									试题类型： <select class="questionType">
										<option value="2">多选题</option>
									</select> 简单说明：<input type="text" class="questionName"
										placeholder="显示名称"> 试题数量：<input type="text"
										class="questionNumber" style="width: 50px;" placeholder="10">
									总分数：<input type="text" class="questionGrade"
										style="width: 50px;" placeholder="20">
								</div>
							</div>
						</div>
					</div>
					<!-- 					填空 -->
					<div class="panel panel-default copy">
						<div class="panel-body">
							<!-- 						单选 -->
							<div class="row" style="padding: 0px;">
								<div class="row">
									<div class="change">第三大题:</div>
								</div>
								<div class="row">
									试题类型： <select class="questionType">
										<option value="3">填空题</option>
									</select> 简单说明：<input type="text" class="questionName"
										placeholder="显示名称"> 试题数量：<input type="text"
										class="questionNumber" style="width: 50px;" placeholder="10">
									总分数：<input type="text" class="questionGrade"
										style="width: 50px;" placeholder="20">
								</div>
							</div>
						</div>
					</div>
					<!-- 					简答 -->
					<div class="panel panel-default copy">
						<div class="panel-body">
							<!-- 						单选 -->
							<div class="row" style="padding: 0px;">
								<div class="row">
									<div class="change">第四大题:</div>
								</div>
								<div class="row">
									试题类型： <select class="questionType">
										<option value="4">简答题</option>
									</select> 简单说明：<input type="text" class="questionName"
										placeholder="显示名称"> 试题数量：<input type="text"
										class="questionNumber" style="width: 50px;" placeholder="10">
									总分数：<input type="text" class="questionGrade"
										style="width: 50px;" placeholder="20">
								</div>
							</div>
						</div>
					</div>
					<a href="${pageContext.request.contextPath}/paper/paper/item/1.do?cur=1" class="btn btn-primary " id="begtnCreatePaper">开始组卷</a>
					<a href="" class="btn btn-primary"  >返回</a>
				</div>
			</div>

		</div>
	</div>
</body>
<script type="text/javascript" src="./script/createType.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/common/js/jquery.date_input.pack.js"></script>
</html>
