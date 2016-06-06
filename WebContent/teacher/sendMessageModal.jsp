<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Modal -->
<div class="modal fade" id="sendMessageModal" tabindex="-1"
	role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">发送信息</h4>
			</div>
			<div class="modal-body">
				<div class="row ">
					<div class="col-sm-5">
						<div class="row leftName">
							<div class="col-sm-6">
								<input type="checkbox" value="">真实姓名(用户名)
							</div>
							<div class="col-sm-6">
								<input type="checkbox" value="">真实姓名(用户名)
							</div>
						</div>
					</div>
					<div class="col-sm-7">
						已选中：<br />
						<div class="row" id="hasSelected">
							<i class="remove">真实姓名(用户名)</i> <i class="remove">真实姓名(用户名)</i>
						</div>
						请输入信息：
						<div class="row">
							<textarea class="form-control" rows="6"></textarea>
						</div>

					</div>

				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-info" data-dismiss="modal"
					id="sendNow">发送</button>
			</div>
		</div>
	</div>
</div>