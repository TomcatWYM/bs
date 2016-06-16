<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="../common/jsp/head_file.jspf" %>
<style>
    .hasShow {
        color: rgb(200, 193, 193);
    }
</style>
<div class="row">
    <div class="col-sm-5">
        <center>
            <button class="btn btn-info" style="width: 200px;">已接受信息</button>
        </center>

        <c:forEach items="${receiveList}" var="msg">
            <div class="panel panel-default message-item-panel ${(msg.hasShow==1)?'hasShow':''}"
                 style="margin-top: 5px;">
                <div class="panel-body">
                    <div class="row">
                        <font color="#f90"><b>${msg.senderName}</b></font> : ${msg.content}
                    </div>
                </div>
                <div class="row" style="margin: 5px 10px">
                    <div style="float: left">
                            ${msg.sendDate}
                    </div>
                    <div style="float: right">
                        <c:if test="${msg.messageType=='common'}">
                            <button class="btn btn-default">回复</button>
                        </c:if>
                        <c:if test="${msg.messageType=='friendApply'}">
                            <button class="btn btn-primary friend-apply-accept-btn" message-id="${msg.id}">同意</button>
                            <button class="btn btn-danger friend-apply-reject-btn" message-id="${msg.id}">拒绝</button>
                        </c:if>
                        <button class="btn btn-warning message-delete-btn" message-id="${msg.id}">删除</button>
                    </div>

                </div>
            </div>

        </c:forEach>
    </div>

    <div class="col-sm-5 col-sm-offset-1">
        <center>
            <button class="btn btn-info" style="width: 200px;">已发送信息</button>
        </center>

        <c:forEach items="${sendList}" var="msg">
            <div class="panel panel-default" style="margin-top: 10px;">
                <div class="panel-body">
                    <div class="row">
                        <font color="#f90"><b>${msg.senderName}</b></font> : ${msg.content}
                    </div>
                </div>
                <div class="row" style="margin: 5px 10px">
                    <div style="float: left">
                            ${msg.sendDate}
                    </div>
                    <div style="float: right">
                        <button class="btn btn-default">撤销</button>
                        <button class="btn btn-warning">修改/重新发送</button>
                    </div>

                </div>
            </div>
        </c:forEach>

    </div>


</div>

<script type="text/javascript">
    $(function () {
        $(".message-delete-btn").on('click', function () {
            var $btn = $(this);
            var msgId = $btn.attr('message-id');
            if (msgId) {
                $.get("${pageContext.request.contextPath}/message/delete.do", {id: msgId}, function (data) {
                    ajaxSuccessHandler(data, false, function () {
                        $btn.parents('.message-item-panel').remove();
                    });
                });
            } else {
                alert('没有找到要删除的消息');
            }
        });

        $(".friend-apply-accept-btn").on('click', function () {
            var $btn = $(this);
            var msgId = $btn.attr('message-id');
            if (msgId) {
                $.get("${pageContext.request.contextPath}/friendShip/acceptApply.do",
                        {messageId: msgId},
                        function (data) {
                            ajaxSuccessHandler(data);
                        }
                )
            }
        });
    });

</script>


	