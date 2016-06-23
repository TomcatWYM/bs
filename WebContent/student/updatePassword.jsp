<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form class="form-horizontal" id="reset-pwd-from">
	<div class=" form-group">
		<div class="col-sm-3" style="text-align: right;">输入原先的密码：</div>
		<div class="col-sm-6">
			<input class="form-control" type="password" name="oldPwd" id="old-pwd" required>
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-3" style="text-align: right;">输入新密码：</div>
		<div class="col-sm-6">
			<input class="form-control" type="text" name="pwd" id="pwd"  required>
		</div>
	</div>
	<div class="form-group" style="margin-top: 10px;">
		<center>
			<input type="submit" value="确认更改" class="btn btn-info">
		</center>
	</div>
</form>
<script>
    $(function(){
        $('#reset-pwd-from').submit(function(e){
            e.preventDefault();
            var form = $('#reset-pwd-from');
            var oldPwd = $('#old-pwd').val();
            var pwd = $('#pwd').val();
            if(oldPwd && pwd){
                $.post('${pageContext.request.contextPath}/user/resetPwd.do',form.serialize(),function(data){
                    ajaxSuccessHandler(data,false);
                });
            }else{
                alertError('请输入原密码和新密码');
            }
        });
    });
</script>