 
	$(function() {
		 
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
					title:paperTitle,
					name:paperName,
					type:type,
					createDate:createTime,
					useDate:beginTime,
					showTime:testAllTime,
					allScore:paperNumber
			};
			$.ajax({  
				type: "post", // 请求方式  
				url: "addPaper.do", //url地址  
				data:{
					title:paperTitle,
					name:paperName,
					type:type,
					createDate:createTime,
					useDate:beginTime,
					showTime:testAllTime,
					allScore:paperNumber
				},//数据  

				success: function (data) {  
					alert("success");  
				}, error: function () {  
					alert("error");  
				}  
			}) 


		}) ;
	});
 