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
            <div class="panel panel-default ${(msg.hasShow==1)?'hasShow':''}" style="margin-top: 5px;">
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
                        <button class="btn btn-default">回复</button>
                        <button class="btn btn-warning">删除</button>
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



	