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
                            <div class="list-group friend-list">
                            </div>
						</div>
					</div>
					<div class="col-sm-7">
						<br />
						<div class="row" id="friend-selected-container">
							发送给:<span class="friend-selected-info"></span>
							<span style="display: none" class="friend-selected-userId"></span>
						</div>
						请输入信息：
						<div class="row">
							<textarea class="form-control" id="message-input-area" rows="6" disabled></textarea>
						</div>

					</div>

				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-info" disabled="disabled"
					id="send-message-btn">发送</button>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">

    var $sendMessageModal = $('#sendMessageModal');
    var $friendList = $(".friend-list");
    var $friendSelectedInfo= $(".friend-selected-info");
    var $friendSelectedUserId= $(".friend-selected-userId");
    var $messageInputArea =  $("#message-input-area");
    var $sendMessageBtn = $("#send-message-btn");

    $(function(){
        $.get('${pageContext.request.contextPath}/friendShip/list.do',{},
            function(data){
                if(data.success){
                    var stuList= data.item;

                    $.each(stuList,function(index){
                        var stuInfo = this.realName+"("+this.username+")";

                        var item = $("<button type='button' class='list-group-item' " +
                                "userId='"+this.userID+"'>"+stuInfo+"</button>");
                        $friendList.append(item);

                    });
                    friendSelectEvent();
                }else{
                    alertWarning('查询好友列表失败');
                }
            });
        initModalOnShowEvent();
        friendSelectEvent();
        sendMessageEvent();
    });

    function initModalOnShowEvent(){
        //模态显示的时候

        $sendMessageModal.on('show.bs.modal',function(){
            $friendSelectedInfo.html('');
            $friendSelectedUserId.html('');
            $messageInputArea.val('');
            $messageInputArea.attr('disabled','disabled');
            $sendMessageBtn.attr('disabled','disabled');
        });
    }

    //好友被选中时候的事件
    function friendSelectEvent(){
        $('.friend-list .list-group-item').click(function(){
            var userId = $(this).attr('userId');
            var userInfo = $(this).html();
            if(userId){
                $friendSelectedInfo.html(userInfo);
                $friendSelectedUserId.html(userId);
                $messageInputArea.removeAttr('disabled');
                $sendMessageBtn.removeAttr('disabled');
            }
        });
    }

    function sendMessageEvent(){
        $('#send-message-btn').click(function() {
            var userId = $friendSelectedUserId.html();
            if (userId ) {
                var content = $messageInputArea.val();
                if(content){
                    $.post('${pageContext.request.contextPath}/message/send.do',
                            {receiverId:userId,content:content},
                            function(data){
                                ajaxSuccessHandler(data,false);
                            }
                    );
                }else{
                    alertError('您还没有输入消息！');
                }
            } else {
                alertError('用户Id不存在！请刷新页面重试');
            }
        });

    }
</script>