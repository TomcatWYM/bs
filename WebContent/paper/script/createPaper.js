require([ "jquery", "bootstrap","froala_editor"], function($, bootstrap,froala_editor) {
	var showType=0;
	var currentPage=1;
	var question=function(paperQuestion,typeName){
		$("#beginAddQuestion").find("font").each(function(index,i){
			if(index==0) $(this).html($(paperQuestion).html());
			if(index==1) $(this).html($(paperQuestion).attr("number"));
			if(index==2) $(this).html($(paperQuestion).attr("allScore"));
			if(index==3) $(this).html(typeName);
		});
	};
	$(function() {
		 $('#edit').editable({inlineMode: false, alwaysBlank: true});
		for(var i=1;i<5;i++){
			$("#"+i).click(function(){
				var typeName="";
				if(i==1) typeName="单选";
				if(i==2) typeName="多选";
				if(i==3) typeName="填空";
				if(i==4) typeName="简答";
				question(this,typeName);
				showType=i;
			});
		}
		//创建试题
		
		//查找题库
		$("#findtiku").click(function(){
			$.ajax({  
				type: "post", // 请求方式  
				url: "showQuestion.do", //url地址  
				data:{"currentpage":"1"},//数据  
				contentType: "application/json",  
				dataType: "json",  
				success: function (data) {  
					alert(data);
					var div=$("#question");
					$.each(data.map.data,function(index,paperQuestion){
						var divOut = $("<div class='col-sm-1' style='text-align: center;'></div>");
						var input=$("<input type='checkbox' value='"+paperQuestion.id+"'>");
						divOut.append(input);
						var two=$("<div class='col-sm-11'></div>");
						two.append($("<div class='row'>"+paperQuestion.content+"</div>"));
						two.append($("<div class='row'>"+paperQuestion.answer+"</div>"));
						div.append(divOut);
						div.append(two);
					});
					$("#fenye").html(data.map.pageFooter);
				}, error: function () {  
					alert("error");  
				}  
			}) 
		});

	})
})