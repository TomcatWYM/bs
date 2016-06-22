<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
  <head>
<%@ include file="../common/jsp/head_file.jspf"%>
	<title>试卷篮</title>
	<style type="text/css">
		.num {margin-left: 20px}
		.quest {font-size: medium;margin-top: 10px}
		.questArea {margin-top: 10px;padding-left: 50px}
		.nav-left {position: fixed;width: 60px;height: 60px}
	</style>

  </head>
  
  <body  style="background-color: #ddd">
    	<div class="container">
    		 
    		<div class="row">
    			<div class="col-xs-3">
					 <div class="panel panel-default">
					<div class="panel-heading">试卷名称：${paper.title }</div>
					<div class="panel-body">
						<div class="row">考试时间：90分钟</div>
						<div class="row">标签：${paper.label }</div>
						<div class="row">
							<table class="table table-striped">
								<tr>
									<td>题型</td>
									<td>说明</td>
									<td>数量</td>
									<td>成绩</td>
								</tr>
								<c:forEach items="${instructsList }" var="list">
									<tr>
										<td><c:if test="${list.proType=='1' }">单选题</c:if> <c:if
												test="${list.proType=='2' }">多选题</c:if> <c:if test="${list.proType=='3' }">填空题</c:if>
											<c:if test="${list.proType=='4' }">简答题</c:if></td>
										<td>${list.instruct }</td>
										<td>${list.number }</td>
										<td>${list.allScore }</td>
									</tr>
								</c:forEach>
							</table>
						</div>
						<div class="row">
						<a id="showModal" class="btn btn-warning" data-toggle="modal" data-target="#myModal"> 生成试卷</a>
						</div>
					</div>
					
				</div>
    			</div>
    			<div class="col-xs-9">
    					<div class="panel panel-warning">
						  <div class="panel-heading">
						    <h3 class="panel-title">试卷篮</h3>
						  </div>
						  <div class="panel-body">
						  		<div class="row">
						  			<div class="col-xs-8">
						  				<div class="page-header">
										  <h1>  <a href="${pageContext.request.contextPath}/paper/paper/item/1.do"> << 返回试题列表</a>  
										  	 <small>继续添加试题</small></h1>
										</div>
						  			</div>
						  			<div class="col-xs-4">
						  				<ul class="list-group">
										  <li class="list-group-item">单选题：已选<span class="label label-danger num">${paperCart.singleNumber}个</span></li>
										  <li class="list-group-item">多选题：已选<span class="label label-danger num">${paperCart.multChoiceNumber}个</span></li>
										  <li class="list-group-item">判断题：已选<span class="label label-danger num">${paperCart.judgeNumber}个</span></li>
										  <li class="list-group-item">简答题：已选<span class="label label-danger num">${paperCart.questionNumber}个</span></li>
										</ul>
						  			</div>
						  		</div>
						  		<div class="panel panel-info">
								  <div class="panel-heading">
								    <h3 class="panel-title">已选试题列表</h3>
								  </div>
								  <div class="panel-body">
								    	
									  <div class="col-xs-11">
											<!--单选题 -->
											<div class="panel panel-primary" id="part1">
											  <div class="panel-heading">
											    <h3 class="panel-title">第一部分 单选题</h3>
											  </div>
											  
											  <c:forEach items="${ singles}" var="pro" varStatus="s">
												  <div style="background-color: gray;" class="pro">
						    						<div class="panel panel-default item">
													  <div class="panel-heading">
													  	<div class="row">
													  		<div class="col-xs-2 ">第${ s.count }题</div>
													  		<div class="col-xs-4">试题难度:${pro.difficulty}</div>
													  		<div class="col-xs-4">试题标签:${pro.label}</div>
													  		<div class="col-xs-2"><button class="btn btn-primary remove" id="${pro.id}">删除</button></div>
													  	</div>
													  </div>
													  <div class="panel-body">
														  	<span style="color: blue;">题目:${pro.title}</span><hr>
														    A:${pro.optA }<br>
														    B:${pro.optB }<br>
														    C:${pro.optC }<br>
														    D:${pro.optD }<br>
													  </div>
													</div>
						    					  </div>
					    					  </c:forEach>	
											</div><!--单选题 -->
											
											<!-- 多选题 -->
											<div class="panel panel-primary" id="part2">
											  <div class="panel-heading">
											    <h3 class="panel-title">第二部分 多选题</h3>
											  </div>
											  <c:forEach items="${multChoices}" var="pro" varStatus="s">
											  <div style="background-color: gray;" class="pro">
					    						<div class="panel panel-default item">
												  <div class="panel-heading">
												  	<div class="row">
												  		<div class="col-xs-2">第${ s.count }题</div>
												  		<div class="col-xs-4">试题难度:${pro.difficulty}</div>
												  		<div class="col-xs-4">试题标签:${pro.label}</div>
												  		<div class="col-xs-2"><button class="btn btn-primary remove" id="${pro.id}">删除</button></div>
												  	</div>
												  </div>
												  <div class="panel-body">
													  	<span style="color: blue;">题目:${pro.title}</span><hr>
													    A:${pro.optA }<br>
													    B:${pro.optB }<br>
													    C:${pro.optC }<br>
													    D:${pro.optD }<br>
												  </div>
												</div>
					    					  </div>	
					    					  </c:forEach>
											</div><!--多选题  -->
											
											<!-- 多选题 -->
											<div class="panel panel-primary" id="part3" >
											  <div class="panel-heading">
											    <h3 class="panel-title">第三部分 判断题</h3>
											  </div>
											  <c:forEach items="${judges}" var="pro" varStatus="s">
											  <div style="background-color: gray;" class="pro">
					    						<div class="panel panel-default item">
												  <div class="panel-heading">
												  	<div class="row">
												  		<div class="col-xs-2">第${ s.count }题</div>
												  		<div class="col-xs-4">试题难度:${pro.difficulty}</div>
												  		<div class="col-xs-4">试题标签:${pro.label}</div>
												  		<div class="col-xs-2"><button class="btn btn-primary remove" id="${pro.id}">删除</button></div>
												  	</div>
												  </div>
												  <div class="panel-body">
													  	<span style="color: blue;">题目:${pro.title}</span>
												  </div>
												</div>
					    					  </div>	
					    					  </c:forEach>
											</div><!--多选题  -->
											
											<!-- 简答题 -->
											<div class="panel panel-primary" id="part4" >
											  <div class="panel-heading">
											    <h3 class="panel-title">第四部分 简答题</h3>
											  </div>
											  <c:forEach items="${questions}" var="pro" varStatus="s">
											  <div style="background-color: gray;" class="pro">
					    						<div class="panel panel-default item">
												  <div class="panel-heading">
												  	<div class="row">
												  		<div class="col-xs-2">第${ s.count }题</div>
												  		<div class="col-xs-4">试题难度:${pro.difficulty}</div>
												  		<div class="col-xs-4">试题标签:${pro.label}</div>
												  		<div class="col-xs-2"><button class="btn btn-primary remove" id="${pro.id}">删除</button></div>
												  	</div>
												  </div>
												  <div class="panel-body">
													  	<span style="color: blue;">题目:${pro.title}</span>
												  </div>
												</div>
					    					  </div>	
					    					  </c:forEach>
											</div><!-- 简答题 -->
										   </div><!-- col-xs-11 -->
										   <!--右侧的导航条 -->
									  		<div class="col-xs-1">
								  			<ul class="nav nav-pills nav-stacked nav-left" role="tablist" id="nav" >
							  					  <li role="presentation" class="pre active"><a href="#part1" >单选</a></li>
												  <li role="presentation" class="pre"><a href="#part2" >多选</a></li>
												  <li role="presentation" class="pre"><a href="#part3" >判断</a></li>
												  <li role="presentation" class="pre"><a href="#part4" >问答</a></li>
											</ul>
									 	 </div><!--左侧的导航条 -->
								  </div>
								</div>
						    	
						  </div>
						</div>
    			</div>
    		</div>
    		
    	</div>
    	
    	<!-- Modal -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
		        <h3 class="modal-title" id="myModalLabel">确定要生成试卷吗？试卷一旦生成，不可修改</h4>
		      </div>
		      
		      <!-- 模态表单体 -->
		      <div class="modal-body">
		        	<form class="form-horizontal" action="${pageContext.request.contextPath}/admin/paper/save" role="form" method="post">
					  <div class="form-group">
					    <label  class="col-xs-2 control-label">试卷标题</label>
					    <div class="col-xs-8">
					      <input type="text" class="form-control" id="" name="title" value="${paper.title }">
					    </div>
					  </div>
					  
					  <div class="form-group">
					  <div class="col-xs-6">
					  <ul>
							<c:forEach items="${instructsList }" var="list">
									<li class="list-group-item"><c:if test="${list.proType=='1' }">单选题：</c:if> <c:if
												test="${list.proType=='2' }">多选题：</c:if> <c:if test="${list.proType=='3' }">填空题：</c:if>
											<c:if test="${list.proType=='4' }">简答题：</c:if>
										预计 <span class="label label-danger num"> ${list.number } 个</span>
										
										 
									</li>
								</c:forEach>
						</ul>
						</div>
					    <div class="col-xs-6">
			  				<ul class="list-group">
							  <li class="list-group-item">单选题：现有<span class="label label-danger num">${paperCart.singleNumber}个</span></li>
							  <li class="list-group-item">多选题：现有<span class="label label-danger num">${paperCart.multChoiceNumber}个</span></li>
							  <li class="list-group-item">判断题：现有<span class="label label-danger num">${paperCart.judgeNumber}个</span></li>
							  <li class="list-group-item">简答题：现有<span class="label label-danger num">${paperCart.questionNumber}个</span></li>
							</ul>
						</div>
						
					  </div>
					  
					</form>
					
		      </div><!-- 模态表单体 -->
		       <div class="modal-footer">
		       <button type="submit" class="btn btn-warning">提交试卷</button>
		        <button type="button" class="btn btn-primary" data-dismiss="modal">关闭并返回修改</button>
		      </div>
		    </div>
		  </div>
		</div><!-- Modal -->
		
		
    	 
    	<script type="text/javascript">
    		//右侧 选择框控制
			$(function(){
				$("#showModal").click(function(){
					$('#myModal').modal('show')
					return false;
				});
				
				$(".pre").click(function(){
					//alert("ok");
					$(this).addClass("active");
					$(this).siblings().removeClass("active");
				});
			 
    			$(".remove").click(function(){
        			var id = $(this).attr("id");
        			$.post("/bs/paperCart/paperCart/action/remove.do",{"id":id});
        			$(this).parents(".pro").remove();
        		});
    		});
	</script>
  </body>
</html>
