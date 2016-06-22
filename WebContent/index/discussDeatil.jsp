<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>话题辩论</title>
<%@ include file="../common/jsp/head_file.jspf"%>
<link rel="stylesheet" type="text/css" href="./css/discuss.css">
<style type="text/css">
section {
	width: 100%;
	margin: 5px;
	text-align: left;
}
</style>
</head>
<body>
	<%@ include file="./head.jspf"%>
	<div class="container">
		<div class="row"
			style="height: 40px; background-color: #ddd; color: #fff; font-size: 20px; text-align: center;">大致方向内容</div>
		<div class="row">
			<div class="col-sm-3 small_border">
				<center>
					<img src="./images/p1.PNG" width="150px" height="100px">
				</center>
				<br />
				<center>作者</center>
			</div>
			<div class="col-sm-9 small_border" style="height: 162px;">
				<div class="row">内容</div>
				<div class="row" style="margin-top: 100px;">
					浏览次数：，点赞次数：
					<div style="float: right;">
						<a>赞</a>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-sm-3 small_border">
				<center>
					<img src="./images/p1.PNG" width="150px" height="100px">
				</center>
				<br />
				<center>作者</center>
			</div>
			<div class="col-sm-9 small_border" style="height: auto;">
				<%@include file="../common/index.html"%>
				<div class="row" style="text-align: center;">
					<button class="btn btn-info">确认评论</button>
				</div>
			</div>
		</div>


	</div>
	<%@include file="../common/jsp/footer.jsp"%>
</body>
</html>