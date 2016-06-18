<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>组件试卷</title>
<%@ include file="../common/jsp/head_file.jspf"%>
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
			<div class="col-sm-4">
				<div class="row">
					<div class="panel panel-default">
						<div class="panel-heading">${paper.name }test</div>
						<div class="panel-body">
							开始时间：${paper.useDate } 考试时长:${paper.showTime } <br />
							试卷总分：${paper.allScore } 试卷标签：${paper.title }
						</div>
					</div>
				</div>
				<div class="row">
					<c:forEach var="question" items="${questionType }"
						varStatus="index">
						<div class="col-sm-12">
							<button id="index" data="试卷类型" class="btn btn-default" number=""
								type="${question }" allGrade="">第${index+1 }大题:${questionName[index] }</button>
							<font class="number" color="red">${questionNumber[index] }</font>&nbsp;
							<font class="allScore" color="red">${questionAllScore[index] }</font>分
						</div>
					</c:forEach>
				</div>
				<div class="col-sm-12">

					<button id="0" data="试卷类型" class="btn btn-default" number=""
						type="${question }" allGrade="">第${index+1 }大题:${questionName[index] }</button>
					${questionNumber[index] }道；${questionAllScore[index] } 分
				</div>
			</div>
			<div class="col-sm-7">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="row">
							<font class="name">第一大题</font><font color="red"></font>道&nbsp;<font color="red"></font>分
							<button id="createQuestion" style="float: right;"
								class="btn btn-info">手动建题</button>
							<button id="findQuestion" style="float: right;"
								class="btn btn-info">题库查找</button>
						</div>
					</div>
					<div class="panel-body">
					
					
					
					</div>
				</div>

			</div>
		</div>
	</div>
	<%@include file="../common/jsp/footer.jsp"%>
</body>
</html>
