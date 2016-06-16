<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Modal -->
<div class="modal fade" id="find-friend-modal" tabindex="-1"
	role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">添加好友</h4>
			</div>
			<div class="modal-body">
				 <div class="row">
				 	<div class="col-sm-4">请输入用户名：</div>
				 	<div class="col-sm-8"><input type="text" class="form-control" id="username"></div>
				 </div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-info"  
					id="add-friend-btn">添加</button>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
    $(function(){
        $("#add-friend-btn").click(function(){

            var username = $('#username').val();
            if(username){
                $.get('${pageContext.request.contextPath}/friendShip/add.do', {username:username},
                        function(data){
                            ajaxSuccessHandler(data,false,function(){
                                $("#find-friend-modal").modal('hide');
                            });
                        }
                )
            }else{
                alert('请输入用户名');
            }
        });
    });
</script>