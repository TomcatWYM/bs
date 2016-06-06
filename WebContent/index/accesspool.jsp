<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>试卷展示</title>
<%@ include file="../common/jsp/head_file.jspf"%>
<link rel="stylesheet" type="text/css" href="./css/accesspool.css">
</head>
<body>
<div class="head_no">我的世界是孤独的，除了永无止境的书本！</div>
	<div class="container" style="margin-top: 1px;">
		<div class="row show_p">
			<div class="col-sm-8">
				<ol class="breadcrumb">
					<li><a href="#">主页</a></li>
					<li><a href="#">题库</a></li>
					<li class="active">xxx试卷</li>
				</ol>
			</div>
		</div>
		<div class="row " style="border: 1px solid #D3D3D3;">
		<div class="col-sm-1">
			<div class="option">
				<ul>
					<li><img src="./images/ziliao.jpg" width="60px" height="90px" /></li>
				</ul>
			</div>
		</div>
		<div class="col-sm-10">
			<div class="row font_center">xxxx试卷</div>
			<div class="row">作者：，发布时间：下载试卷</div>
			<!-- 			试题列表 -->
			<div class="row" id="show_question"></div>
			<div class="small_border top">
				<div class="row">
					<table border="0px">
						<tr>
							<td>题目：</td>
							<td>XXXX</td>
						</tr>
						<tr>
							<td>选项（选择题）/提示/答案：</td>
							<td>XXXX</td> 
						</tr>
					</table>
				</div>
				<div class="row tiku_op">
					<input type="button" id="hidden_question" value="不显示" /> 
					<input type="button" id="show_question" value="查看详情" /> <input type="button" value="个人收藏" />
					<font> 难度系数：0.8-0.9 &nbsp; 浏览量：xx次 </font>
				</div>
			</div>

		</div>
		</div>
	</div>
	<%@include file="../common/jsp/footer.jsp"%>
</body>
<script type="text/javascript" src="./script/main.js"></script>
</html>