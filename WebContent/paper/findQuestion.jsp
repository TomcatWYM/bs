<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Modal -->
<div class="modal fade bs-example-modal-lg" id="findQuestion"
	tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">试题查询</h4>
			</div>
			<div class="modal-body">
				<div class="row">
					请输入试题标签：<input type="text" id="findTitle">
					<button id="findBtn">查找</button>
				</div>
				<div class="row" id="question">
					<!-- 					 数据加载区 -->
				</div>
				<div class="row" id="fenye">
					<!-- 				分页 -->
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-default">确认添加</button>
			</div>
		</div>
	</div>
</div>