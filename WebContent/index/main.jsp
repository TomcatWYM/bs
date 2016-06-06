<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在线测试</title>
<%@ include file="../common/jsp/head_file.jspf"%>
</head>
<link rel="stylesheet" type="text/css" href="./css/main.css">
<link type="text/css" href="./css/mscarousel.css" rel="stylesheet" />
<body>
	<%@ include file="./head.jspf"%>
	<div class="container">
		<div class="row">
			<%@ include file="./lunbotu.jspf"%>
		</div>
		<!-- 		图书文章推荐 -->
		<div class="row m_c">
			<div class="col-sm-9" style="padding: 10px;">
				<div class="row">
					<font class="title_row">我们的推荐书单</font> <font class="title_small">生命不息读书不止!</font>
					<a>换一批</a>
				</div>
				<div class="row small_border">
					<div class="col-sm-2">
						<a href="showbook.jsp"> <img alt="" url="" src="./images/test1.png"
							class="photo_yuan">作者
							<p>领域:少年</p> 简介：啊我I啊是的那就是看撒大家拉升
						</a>
					</div>
					<div class="col-sm-2">
						<img alt="" url="" src="./images/test1.png" class="photo_yuan">作者
						<p>领域:少年</p>
						<a title="12345，上山打老虎">简介：</a>

					</div>
					<div class="col-sm-2">
						<img alt="" url="" src="./images/test1.png" class="photo_yuan">作者
						<p>领域:少年</p>
						<a title="12345，上山打老虎">简介：</a>

					</div>
					<div class="col-sm-2">
						<img alt="" url="" src="./images/test1.png" class="photo_yuan">作者
						<p>领域:少年</p>
						<a title="12345，上山打老虎">简介：</a>

					</div>
					<div class="col-sm-2">
						<img alt="" url="" src="./images/test1.png" class="photo_yuan">作者
						<p>领域:少年</p>
						<a title="12345，上山打老虎">简介：</a>

					</div>
					<div class="col-sm-2">
						<img alt="" url="" src="./images/test1.png" class="photo_yuan">作者
						<p>领域:少年</p>
						<a title="12345，上山打老虎">简介：</a>

					</div>

				</div>
			</div>
			<div class="col-sm-3">
				<div class="row" style="margin-top: 10px;">
					<font class="title_row">美文欣赏</font> <font class="title_small">更多>></font>
				</div>

				<div class="row small_border">
					<div class="row" title="asdasdasd">

						<img alt="" src="./images/1_1.PNG"
							style="width: 20px; height: 20px; float: left;"> <a href="./showarticle.jsp"
							style="float: left">话题标题... </a> 张三 
					</div>

				</div>

			</div>

		</div>
		<!-- 		题库专区 -->
		<div class="row m_c">
			<div class="row">
				<div class="col-sm-1">
					<img alt="" src="./images/left_head.PNG" height="30px;"
						width="31px">
				</div>
				<div class="col-sm-11" style="margin-left: -50px;">
					<font class="title_row">题库专区</font>
				</div>
			</div>
			<div class="row"
				style="height: 3px; border: 3px; border-color: #f90; background-color: #f90">
			</div>
			<div class="row">
				<div class="col-sm-3" style="background-color: #f90;">
					<div class="row">
						<img alt="" src="./images/ziliao.jpg"
							style="margin-left: 40px; margin-top: 10px; border-radius: 20px;"
							height="200px" width="200px;">
					</div>
					<div class="row z_left_f">
						分类
						<div class="row">
							<div class="col-sm-6 z_a_font">
								<ul>
									<li><a>编程</a></li>
									<li><a>文学</a></li>
									<li><a>科技</a></li>
								</ul>
							</div>
							<div class="col-sm-6 z_a_font">
								<ul>
									<li><a>编程</a></li>
									<li><a>文学</a></li>
									<li><a>科技</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				<div class="col-sm-9">
					<div class="row">
						<div class="col-sm-9">
							<div class="row">
								<div class="col-sm-4">1</div>
								<div class="col-sm-4" style="padding: 5px;">
									<div class="row">
										<img src="./images/p2.PNG" width="100px" height="100px"
											style="border-radius: 50px;" />
									</div>
									<div class="row ">
										<img src="./images/1_1.PNG" class="number_pic" /> <a href="./accesspool.jsp">第一条记录</a>
									</div>
									<div class="row">
										<img src="./images/2_2.PNG" class="number_pic" /> <a>第二条记录</a>
									</div>
									<div class="row">
										<img src="./images/3_3.PNG" class="number_pic" /> <a>第三条记录</a>
									</div>
									<div class="row">
										<img src="./images/4.PNG" class="number_pic" /> <a>第三条记录</a>
									</div>
									<div class="row">
										<img src="./images/5.PNG" class="number_pic" /> <a>第三条记录</a>
									</div>
									<div class="row">
										<img src="./images/6.PNG" class="number_pic" /> <a>第三条记录</a>
									</div>

								</div>
								<div class="col-sm-4">3</div>
							</div>
						</div>

						<div class="col-sm-3">
							<form method="post" action="" id="findTextFrom"
								name="findTextFrom">
								资料查询：
								<div class="form_z">
									<select class="form-control">
										<option>条件一</option>
										<option>2</option>
										<option>3</option>
										<option>4</option>
										<option>5</option>
									</select>
								</div>
								<div class="form_z">
									<select class="form-control">
										<option selected>条件二</option>
										<option>2</option>
										<option>3</option>
										<option>4</option>
										<option>5</option>
									</select>
								</div>
								<div class="form_z">
									<input type="text" class="form-control" placeholder="请输入关键词">
								</div>
								<div class="form_z">
									<input type="submit" class="btn btn-info" placeholder="请输入关键词"
										value="搜索"> <input type="button"
										class="btn btn-default" placeholder="请输入关键词" value="重置">
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 		话题，测评专区 -->
		<div class="row m_c">
			<div class="row">
				<div class="col-sm-6  " style="margin-left: -3px;">
					<font class="title_row">话痨</font> <font class="title_small">只说我想说的!</font>

				</div>
				 
			</div>

			<div class="row">
				<div class="col-sm-12 small_border " style="margin-left: -3px;">
					<div class="col-sm-3">
						<div class="row no_pading">
							<img alt="" src="./images/l_bg1.jpg"
								style="border-radius: 20px; width: 50px; height: 50px;">
						</div>
						<div class="row no_pading" style="text-align: left;">
							<font>话题标题</font><br /> <font>张三 &nbsp; 浏览量： &nbsp; </font>
						</div>
					</div>

				</div>
			</div>




		</div>

	</div>
	<%@include file="../common/jsp/footer.jsp"%>
</body>
<script type="text/javascript" src="./script/jquery.msCarousel-min.js"></script>
<script type="text/javascript" src="./script/main.js"></script>
</html>