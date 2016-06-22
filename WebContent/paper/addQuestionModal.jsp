<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Modal -->

<div class="modal fade bs-example-modal-lg" id="addQuestion"
	tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">创建试题</h4>
			</div>
			<div class="modal-body">
				<div class="row">
					标签：<input type="text" value="1;2">类型：<font color="red"
						id="QuestionType"></font>
				</div>
				<div class="row">
					<div class="col-sm-6" id="questionContent">
						<section id="editor">
							<div id='edit'>请输入内容。。。</div>
						</section>

					</div>
					<div class="col-sm-6" id="questionAnwser">答案：</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-default">确认添加</button>
			</div>
		</div>
	</div>
</div>