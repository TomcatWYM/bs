
	$(function() {
		 
		$("#begtnCreatePaper").click(function(){
			var paperName=$("#paperName").val();
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
			var paperInfo=paperName+"-"+testAllTime+"-"+paperNumber+"-"+paperTitle;
			 $.post("/bs/paper/addInstruce.do",{"paperInfo":paperInfo,"data":type});
			 window.location.href = '/bs/paper/paper/item/1.do?cur=1';
		}) ;
	});
 