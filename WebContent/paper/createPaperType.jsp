<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>组件试卷</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/common/css/time.css">
<%@ include
	file="${pageContext.request.contextPath}/common/jsp/head_file.jspf"%>
</head>
<body>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2">
				<form action="" method="post">
					<!-- 		试卷基本信息 -->
					<div class="panel panel-default">

						<div class="panel-body">

							<div class="col-sm-4">试卷名称：</div>
							<div class="col-sm-8">
								<input type="text" class="form-control" value="**试卷">
							</div>
							<div class="col-sm-4">开始时间：</div>
							<div class="col-sm-8">
								<input type="text" class="form-control date_picker"
									value="2016-6-4">
							</div>
							<div class="col-sm-4">考试时长：</div>
							<div class="col-sm-8">
								<input type="text" class="form-control" value="90">
							</div>
							<div class="col-sm-4">考试总分：</div>
							<div class="col-sm-8">
								<input type="text" class="form-control" value="100">
							</div>
							<div class="col-sm-4">试卷标签：</div>
							<div class="col-sm-8">
								<input type="text" class="form-control" value="分号；隔开">
							</div>
							<div class=""></div>
						</div>
					</div>
					<!-- 					试卷的题型 -->
					<div class="panel panel-default">

						<div class="panel-body" id="addType">
							<div class="row copy" style="padding: 0px;">
								<ai class="row">
								<div class="col-sm-6" class="change">第1大题</div>
								<div class="col-sm-6">
									试题类型： <select class="form-control">
										<option selected value="1">单选题</option>
										<option value="2">多选题</option>
										<option value="3">填空</option>
										<option value="4">简答</option>
									</select>
								</div>
							</div>
							<div class="row">
								试题名称：<input type="text" class="questionName" placeholder="显示名称">
								试题数量：<input type="text" class="questionNumber" placeholder="10">
								总分数：<input type="text" class="questionGrade" placeholder="20">
							</div>
						</div>
					</div>
			</div>
			<div class="row">
			<a href=""  class="btn btn-default">
					 》》返回
				</a>
				<button id="addQuestion" class="btn btn-default">
					 添加大题 
				</button>
				<button id="beginPaper" class="btn btn-default">
					 开始组卷 
				</button>

			</div>

			</form>
		</div>
		<div class="col-sm-7"></div>
	</div>
	</div>
	<%@include
		file="${pageContext.request.contextPath}/common/jsp/footer.jsp"%>
</body>
<script type="text/javascript">
	$(function() {
		$('.date_picker').date_input();
		$("#addQuestion").click(function(){
			var html= $(".copy").first().html();
			 $("#addType").append(html);
			 alert($(".copy").length);
			 $(".copy:last .change").html("第"+$('.copy').length+"大题");
		});
		$("#beginPaper").click(function(){
			windows.open("url","data","属性");
		});
	})
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/common/js/jquery.date_input.pack.js"></script>
</html>
