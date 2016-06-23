<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/jsp/head_file.jspf"%>
<form action="" method="post">
	<div class="row">
		<div class="col-sm-2">
			<font style="float: right; margin-top: 7px;">姓名：</font>
		</div>
		<div class="col-sm-4">
			<input type="text" class="form-control" value="${stu.username}">
		</div>

		<div class="col-sm-2">
			<font style="float: right; margin-top: 7px;">真实姓名：</font>
		</div>
		<div class="col-sm-4">
			<input type="text" class="form-control" value="${stu.realName}">
		</div>
	</div>
	<div class="row">
		<div class="col-sm-2">
			<font style="float: right; margin-top: 7px;">性别：</font>
		</div>
		<div class="col-sm-4">
			<select class="form-control auto-select" value="${stu.sex}">
				<option value="男">男</option>
				<option value="女">女</option>
			</select>
		</div>
		<div class="col-sm-2">
			<font style="float: right; margin-top: 7px;">出生日期：</font>
		</div>
		<div class="col-sm-4">
			<input type="text" class="form-control" value="${stu.birthDate}">
		</div>
	</div>
	<div class="row">
		<div class="col-sm-2">
			<font style="float: right; margin-top: 7px;">电话：</font>
		</div>
		<div class="col-sm-4">
			<input type="text" class="form-control" value="${stu.phoneNumber}">
		</div>

		<div class="col-sm-2">
			<font style="float: right; margin-top: 7px;">真实姓名：</font>
		</div>
		<div class="col-sm-4">
			<input type="text" class="form-control" value="${stu.realName}">
		</div>
	</div>
	<div class="row" style="margin-top: 10px;">
		<div class="col-sm-2">
			<font style="float: right; margin-top: 7px;">QQ：</font>
		</div>
		<div class="col-sm-6">
			<input type="text" class="form-control" value="${stu.qq}">
		</div>
	</div>
	<div class="row">
		<div class="col-sm-2">
			<font style="float: right; margin-top: 7px;">微信：</font>
		</div>
		<div class="col-sm-6">
			<input type="text" class="form-control" value="${stu.weixin}">
		</div>
	</div>
	<div class="row">
		<div class="col-sm-2">
			<font style="float: right; margin-top: 7px;">邮编：</font>
		</div>
		<div class="col-sm-6">
			<input type="text" class="form-control" value="110">
		</div>
	</div>
	<div class="row">
		<div class="col-sm-2">
			<font style="float: right; margin-top: 7px;">家庭地址：</font>
		</div>
		<div class="col-sm-6">
			<input type="text" class="form-control" value="${stu.address}">
		</div>
	</div>
	<div class="row" style="margin-top: 20px; text-align: center;">
		<input class="btn btn-info" type="reset" value="重置">
		<input class="btn btn-info"  value="提交">
	</div>

</form>

<script type="text/javascript">
    $(function(){
        autoSelect();
    });
</script>