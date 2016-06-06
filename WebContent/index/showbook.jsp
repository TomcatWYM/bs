<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在线测试</title>
<%@ include file="../common/jsp/head_file.jspf"%>
</head>
<link rel="stylesheet" type="text/css" href="./css/showbook.css">
<body>
	<%@ include file="./head.jspf"%>
	<div class="container">
		<div class="row postion">
			当前位置：<a>首页</a>>>图书介绍
		</div>
		<div class="row">
			<div class="col-sm-3">
				<img src="./images/test_pic.PNG" width="200px" height="300px" />
			</div>
			<div class="col-sm-7 show_book_info">
				<p>
					书名：<i>嘻嘻嘻嘻嘻嘻</i>
				</p>
				<p>
					作者：<i>test</i>
				</p>
				<p>
					翻译：<i>asd</i>
				</p>
				<p>
					出版社：<i>dasdasd</i>
				</p>
				<p>
					出版时间：<i>2018-1-1</i>
				</p>
				<p>
					推荐使用：<i>第x版</i>
				</p>
				<p>
					标签：&nbsp; <i>第x版</i> <i>第x版</i> <i>第x版</i> <i>第x版</i>
				</p>
			</div>
			<div class="col-sm-2 show_book_info">
				<div class="row">
					<img src="./images/test1.png" width="100px" height="150px;" />
				</div>
				<div class="row">
					<p>
						姓名: <i>test </i>
					</p>
					<p>
						出生日期: <i> xxx</i>
					</p>
					<p>
						百度链接: <i> xxx</i>
					</p>
					<p>
						主要出版书籍: <br />
					</p>
					<p>
						简单介绍：<br /> asdhiaushdkahs快速的减肥还是看见对方
					</p>
				</div>
			</div>
			<div class="col-sm-10">
				<div class="panel panel-default p_width">
					<div class="panel-body">书本的简单介绍： 爱上电脑卡金色年华的空间啊山东黄金卡死了都快</div>
				</div>
			</div>
		</div>
		相似书籍推荐：
		<div class="row">
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="col-sm-2">
						<img src="./images/test1.png" width="100x" height="150px" />
					</div>
					<div class="col-sm-2">
						<img src="./images/test1.png" width="100x" height="150px" />
					</div>
					<div class="col-sm-2">
						<img src="./images/test1.png" width="100x" height="150px" />
					</div>
					<div class="col-sm-2">
						<img src="./images/test1.png" width="100x" height="150px" />
					</div>


				</div>
			</div>

		</div>

	</div>
	<%@include file="../common/jsp/footer.jsp"%>
</body>
</html>