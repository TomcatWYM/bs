<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<table class="table table-striped">

	<thead>
		<tr>
			<th>#头像</th>
			<th>名字</th>
			<th>真实姓名</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody>
        <c:forEach items="${friendList}" var="s">
            <tr>
                <td>photo</td>
                <td>${s.username}</td>
                <td>${s.realName}</td>
                <td><a class="btn btn-info" id="deleteFriend">删除</a></td>
            </tr>
        </c:forEach>

	</tbody>
</table>