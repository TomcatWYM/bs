require([ "jquery", "bootstrap" ], function($, bootstrap) {
	$(function() {
		$("#addQuestion").click(function() {
			var html = $(".copy:first").prop("outerHTML");
			$(".copy:last").after(html);
			var length = $(".copy").length;
			$(".copy:last .change").html("<input type='checkbox' class='deleteThis' >第" + length + "大题:");
		});
		$("#deletQuestion").click(function(){
			if($(".deleteThis:checked").length==0){
				alert("请点击选择框！！");
			}else{
				$(".deleteThis:checked").parents(".copy").remove();
			}

		});
		$("#beginPaper").click(function(){
			var paperName=$("#paperName").val();
			var beginTime=$("#beginTime").val();
			var testAllTime=$("#testAllTime").val();
			var paperNumber=$("#paperNumber").val();
			var paperTitle=$("#paperTitle").val();
			var date=new Date();
			var createTime=date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate();
			var type="";
			$(".questionType").each(function(index){
				type=type+$(this).children("option:selected").val()+"_"+$(".questionName:eq("+index+")").val()
						+"_"+$(".questionNumber:eq("+index+")").val()
						+"_"+$(".questionGrade:eq("+index+")").val()+";";
			});
			var paper={
					"title":paperTitle,
					"name":paperName,
					"type":type,
					"createDate":createTime,
					"useDate":beginTime,
					"showTime":testAllTime,
					"allScore":paperNumber
			};
			$.ajax({  
                type: "post", // 请求方式  
                url: "addPaper.do", //url地址  
                data:paper,//数据  
                contentType: "application/json",  
                dataType: "json",  
                success: function (data) {  
                    alert("success");  
                }, error: function () {  
                    alert("error");  
                }  
            }) 
			 
			
		}) ;
	});
})