<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>讨论区</title>
<%@ include file="../common/jsp/head_file.jspf"%>
<link rel="stylesheet" type="text/css" href="./css/discuss.css">
</head>
<body>
	<%@ include file="./head.jspf"%>
	<div class="container">
		<div class="row">
			<div class="col-sm-8">
				<div class="small_border">
					<!-- 				头部标题 -->
					<div class="row">
						<i class="dot"></i> <font class="title-word">分享生活</font>
						<div class="introduce_my">
							<button class="btn btn-info btn_img" id="introduce"></button>
						</div>
					</div>
					<!-- 					公告板提示 -->
					<div class="row black_row">
						<button class="btn_notice">公告板</button>
						分享一下，快乐的更加快乐，悲伤的不在悲伤！

					</div>
					<div class="row">
						<!-- 					筛选条件 -->
						<div class="row find_ul">
							<ul>
								<li><a><i class="active_selected">条件一 </i></a></li>
								<li>l</li>
								<li><a><i>条件二</i></a></li>
								<li>l</li>
								<li><a><i>条件三</i></a></li>

							</ul>
						</div>
						<!-- 						具体讨论的内容 -->
						<div class="row">
							<div class="row content">
								<div class="col-sm-1" style="margin-bottom: 10px;">
									<img src="./images/test1.png"
										style="border-radius: 50%; width: 60px; height: 60px;" />
								</div>
								<div class="col-sm-11">
									<div class="row">全部标题的显示</div>
									<div class="row">
										作者:<font color="#f90">(可换色)</font> 发表时间：<i class="show_color">2016-03-30</i>
										标签：<i class="show_color">奋斗</i>
										<div class="takls show_color">
											回复：100&nbsp;赞：0&nbsp;浏览次数:0</div>
									</div>
								</div>
								<div class="col-sm-12"><hr style="height: 1px; border-color: #F0F0F0;" width="100%" /></div>
								
							</div>
							<div class="row content">
								<div class="col-sm-1" style="margin-bottom: 10px;">
									<img src="./images/test1.png"
										style="border-radius: 50%; width: 60px; height: 60px;" />
								</div>
								<div class="col-sm-11">
									<div class="row">全部标题的显示</div>
									<div class="row">
										作者:<font color="#f90">(可换色)</font> 发表时间：<i class="show_color">2016-03-30</i>
										标签：<i class="show_color">奋斗</i>
										<div class="takls show_color">
											回复：100&nbsp;赞：0&nbsp;浏览次数:0</div>
									</div>
								</div>
								<div class="col-sm-12"><hr style="height: 1px; border-color: #F0F0F0;" width="100%" /></div>
							</div>
						</div>
						<!--end 						具体讨论的内容 -->
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<!-- 			编主推荐 -->
				<div class="row small_border border_right"
					style="margin-left: 10px;">
					<div class="row">
						<i class="small_dot"></i> <font class="title-word litter">编主推荐</font>
						<hr style="height: 2px; border-color: #F0F0F0;" width="100%" />
					</div>
					<div class="row">
						<div class="row">
							<div class="col-sm-4">
								<a><img src="./images/ziliao.jpg" /></a>
							</div>
							<div class="col-sm-4">
								<a><img src="./images/ziliao.jpg" /></a>
							</div>
							<div class="col-sm-4">
								<a><img src="./images/ziliao.jpg" /></a>
							</div>
						</div>
						<div class="row" style="padding: 5px;">
							<ul>
								<li>标题： 作者：</li>
								<li>标题： 作者：</li>
								<li>标题： 作者：</li>
							</ul>
						</div>
					</div>
				</div>
				<!-- 			end  编主推荐	  -->
				<!-- 			根据人名或文章名查询 -->
				<div class="row" style="padding: 10px; margin-left: 10px;">
					<div class="form-group">
						<div class="col-sm-7">
							<input type="text" class="form-control" id="serach"
								placeholder="贴主/标题名">
						</div>
						<div class="col-sm-2">
							<button type="submit" class="btn btn-info">搜索</button>
						</div>
					</div>
				</div>
				<div class="row small_border border_right"
					style="margin-left: 10px; margin-top: 5px;">
					<ul>
						<li>1.查询列表</li>
						<li>2.</li>
						<li>3.</li>
						<li>4.</li>
					</ul>

				</div>
				<div class="row" style="margin-left: 10px; margin-top: 10px;">
					<img src="./images/ziliao.jpg" width="300px" height="100px" />
				</div>
			</div>
		</div>
	</div>
	<%@include file="../common/jsp/footer.jsp"%>
</body>
</html>