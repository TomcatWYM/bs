<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>题库</title>
<%@ include file="../common/jsp/head_file.jspf"%>
<link rel="stylesheet" type="text/css" href="./css/tiku.css">
</head>
<body>
	<%@ include file="./head.jspf"%>
	<div class="container">
		<div class="row">
			<!-- 		 左侧栏 -->
			<div class="col-sm-3">
				<div class="row left_carte">
					<div class="one">
						<ul class="left_color">
							<li class="show_color"></li>
							<li></li>
							<li></li>
						</ul>
					</div>
					<div class="two">
						<ul class="left_word">
							<li>其它</li>
							<li>试卷</li>
							<li>我要上传</li>
						</ul>
					</div>
				</div>
				<div class="row">
					<img src="./images/tiku/test.jpg" width="290" height="100" />
				</div>
				<div class="row pad">
					<div class="row">
						<font
							style="font-size: 20px; font-weight: bold; font-family: '方正行楷';">最近更新</font>
					</div>
					<div class="row"
						style="height: 3px; border: 3px; border-color: #cee3e9; background-color: #cee3e9">
					</div>
					<div class="row small_border no_pad">
						<div class="row no_pad">
							<div class="div_one left_div_shuzi">
								<img src="./images/xiaotubiao/1.PNG" />
							</div>
							<div class="div_two no_pad ">test1</div>
						</div>
						<div class="row no_pad">
							<div class="div_one left_div_shuzi">
								<img src="./images/xiaotubiao/2_2.PNG" />
							</div>
							<div class="div_two no_pad ">test2_2</div>
						</div>
					</div>
				</div>

			</div>
			<!-- 			右侧题库显示 -->
			<div class="col-sm-8" style="margin-left: 10px;">
				<!-- 			显示筛选条件 -->
				<div class="row ">
					<table border="0px" class="select_table">
						<tr>当前位置：首页》题库》test
						</tr>
						<tr>
							<td width="96px">筛选条件1：</td>
							<td><button type="button" class="btn btn-info">全部</button>
								<button type="button" class="btn btn-default">条件1</button>
								<button type="button" class="btn btn-default">条件1</button>
								<button type="button" class="btn btn-default">条件1</button>
								<button type="button" class="btn btn-default">条件1</button>
								<button type="button" class="btn btn-default">条件1</button></td>
						</tr>
						<tr>
							<td width="96px">筛选条件2：</td>
							<td><button type="button" class="btn btn-info">全部</button>
								<button type="button" class="btn btn-default">条件1</button>
								<button type="button" class="btn btn-default">条件1</button>
								<button type="button" class="btn btn-default">条件1</button>
								<button type="button" class="btn btn-default">条件1</button>
								<button type="button" class="btn btn-default">条件1</button></td>
						</tr>
					</table>

				</div>
				<div class="small_border top">
					<div class="row">
						<table border="0px">
							<tr>
								<td>来源：</td>
								<td><font color="#f90">XXXX试卷</font></td>
							</tr>
							<tr>
								<td>头目：</td>
								<td>XXXX试卷</td>
							</tr>
							<tr>
								<td>选项（选择题）/提示/答案：</td>
								<td>XXXX试卷</td>
							</tr>
						</table>
					</div>
					<div class="row tiku_op">
						<input type="button" value="不显示" /> <input type="button"
							value="查看详情" /> <font> 难度系数：0.8-0.9 &nbsp; 浏览量：xx次 </font>
					</div>
				</div>

			</div>
		</div>

	</div>
	<%@include file="../common/jsp/footer.jsp"%>
</body>
</html>