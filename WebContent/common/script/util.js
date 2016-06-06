
//工具类
var util ={
		 loading:{
			 /**
			  * loading 动画效果 obj展示动画容器id
			  */
			show:function(obj){
				$("#"+obj).html("<div class=\"spinner\"><div class=\"bounce1\"></div><div class=\"bounce2\"></div><div class=\"bounce3\"></div><p>加载中...</p></div>")
			} 
		 },
		 computing:{
			 /**
			  * computing 动画效果 obj展示动画容器id
			  */
			show:function(obj){
				$("#"+obj).html("<div class=\"spinner\"><div class=\"bounce1\"></div><div class=\"bounce2\"></div><div class=\"bounce3\"></div><p>正在计算,请稍后...</p></div>")
			} 
		 },
		 iframe:{
			 /**
			  * 重置父页面iframe高度
			  * @param parent iframeID
			  * @param div_height 当前页面高度
			  */
		 	resizeFrame:function(parent,div_height){
		 		  var content_iframe = window.parent.document.getElementById(parent);//获取iframeID
			        content_iframe.style.height = div_height+"px";
			        $("body",window.parent.document).animate({scrollTop:0}, 'slow');
		 	}
		 },
		 nav : {
			 clickHandle : function(that){
				 $(that).addClass("active").siblings("li").removeClass("active");
			 },
			 //显示后台管理相关的菜单 主要是相关的标准和系统设置
			 showBackManager : function(){
				 $(".belong-frontManager").hide();
				 $(".belong-backManager").css("display","block").show();
				 $("#backManager").hide();
				 $("#frontManager").css("display","block").show();
				 $(".belong-backManager:first").addClass("active").siblings().removeClass("active");
				 
			 },
			//显示前台管理相关的菜单 主要是考核和报表
			 showFrontManager : function(){
				 $(".belong-frontManager").css("display","block").show();
				 $(".belong-backManager").hide();
				 $("#backManager").css("display","block").show();
				 $("#frontManager").hide();
				 $(".belong-frontManager:first").addClass("active").siblings().removeClass("active");
				 
			 },
			 getDatas : function(){
				 //切换菜单时候，加载相关数据使用
			 }
		 },
		 select:{
			 /**
			  * selId :select 标签的ID
			  * value :option的value值
			  * text  :option的text值
			  * **/
			getSelObj : function(selId){
				return  document.getElementById(selId);
			},
			//判断value为某个值的option是否存在
			isExistByValue : function(selId,value){
				var _isExist = false;
				var _selObj =this.getSelObj(selId);
				if(_selObj){
					 var _options = _selObj.options;
					 for(var i =0;i	<_selObj.options.length;i++){
						if( _options[i].value == value){
							_isExist = true;
							break;
						}
					 }
				}
				return _isExist;
			},
			//判断text为某个值的option是否存在
			isExistByText : function(selId,text){
				var _isExist = false;
				var _selObj =this.getSelObj(selId);
				if(_selObj){
					 var _options = _selObj.options;
					 for(var i =0;i	<_selObj.options.length;i++){
						if( _options[i].text == text){
							_isExist = true;
							break;
						}
					 }
				}
				return _isExist;
			},
			//添加指定的value和text的option
			addOption : function(selId,value,text){
				var _selObj =this.getSelObj(selId);
				if(_selObj &&!this.isExistByText(selId,value)){
					var _newOption = new Option(text,value);
					_selObj.add(_newOption);
				}
			},
			//选中option
			selectOption : function(selId,value){ 
				var _selObj =this.getSelObj(selId);
				if(_selObj ){
					 var _options = _selObj.options;
					 for(var i =0;i	<_selObj.options.length;i++){
						if( _options[i].value == value){
							_options[i].selected = true;
						}
					 }
				}
			   return _selObj.selectedIndex;
			},
			getSelectedOpValue:function(selId){
				var _selObj = util.select.getSelObj(selId);
				if(_selObj ){
					 var _options = _selObj.options;
					 for(var i =0;i	<_selObj.options.length;i++){
						if( _options[i].selected == true){
							return _options[i].value;
						}
					 }
					 return "-1";
				}	
			},
			//删除指定value的某个option
			delOptionByValue : function(selId,value){
				var _selObj =this.getSelObj(selId);
				if(_selObj){
					 var _options = _selObj.options;
					 for(var i =0;i	<_selObj.options.length;i++){
						if( _options[i].value == value){
							_options[i]=null;
						}
					 }
				}
			},
			//删除指定text的某个option
			delOptionByText : function(selId,text){
				var _selObj =this.getSelObj(selId);
				if(_selObj){
					 var _options = _selObj.options;
					 for(var i =0;i	<_selObj.options.length;i++){
						if( _options[i].text == text){
							_options[i]=null;
						}
					 }
				}
			},
			//清除option
			clearOptions : function(selId){
				var _selObj =this.getSelObj(selId);
				_selObj.options.length = 0;
			},
			
			selectAllHandle : function(className,thisObj){
				  if($(thisObj).attr("checked")){
					  $(thisObj).prop("checked",false).attr("checked",false);
					  $("."+className).prop("checked",false).attr("checked",false);
				  }else{
					  $(thisObj).prop("checked",true).attr("checked",true);
					  $("."+className).prop("checked",true).attr("checked",true);
				  } 
			},
			selectOneHandle: function(checkAllId,className,thisObj){
				 if($(thisObj).attr("checked")){
					 $(thisObj).prop("checked",false).attr("checked",false); 
					 if($("#"+checkAllId).attr("checked"))
							$("#"+checkAllId).prop("checked",false).attr("checked",false);
				 }else{
					$(thisObj).prop("checked",true).attr("checked",true); 
					var allChecked=($("."+className+":checked").length == $("."+className).length )? true :false;
					if(allChecked)
						$("#"+checkAllId).prop("checked",true).attr("checked",true); 
				 }
			}
			
		},
		table:{
			changeTabTitle : function(len,theads){
				 var width =130;
				 var title="<tr><th><input type=\"checkbox\"  id=\"checkAll\" /></th>"; 
				 $.each(theads,function(index,theadTitle){
					 width+=theadTitle.length*16+30;
					 title+="<th  >"+theadTitle+"</th>"
				 });
				 title+="</tr>"
				var outerWidth = $(".div-content").innerWidth();	 
				if(outerWidth<width)$("#contentTab ").css("width",width);	 
				$("#contentTab thead ").empty().html(title);
				$("#contentTab tbody").empty();
			}
		},
		//需要加载artdialog
		dialog:{
			showSuccessMessage:function(content){
				var d = dialog({
    			    content: "<span class='success-icon'></span>"+content
    			});
    			d.show();
    			setTimeout(function () {
    			    d.close().remove();
    			}, 2000);
			},
			showWarningMessage:function(content){
				var d = dialog({
    			    content: "<span class='warning-icon'></span>"+content
    			});
    			d.show();
    			setTimeout(function () {
    			    d.close().remove();
    			}, 2000);
			},
			showErrorMessage:function(content){
				var d = dialog({
					title:"错误",
    			    content: "<span class='error-icon'></span>"+content,
    			    ok:true,
    			    okValue:"确定"
    			});
    			d.showModal();
    			return d;
			},
			showModalMessage : function(content){
				var d = dialog({
    			    content: "<span class='warning-icon'></span>"+content,
    			});
    			d.showModal();
    			setTimeout(function () {
    			    d.close().remove();
    			}, 3000);
			},
			showModalConfirmMessage:function(content,okFun,cancelFun){
				var d = dialog({
					title:"警告",
    			    content: "<span class='warning-green-icon'></span>"+content,
    			    ok:function(){
    			    	if(okFun) okFun();
    			    },
    			    okValue:"确定",
    			    cancel:function(){
    			    	if(cancelFun)cancelFun();
    			    },
    			    cancelValue:"取消"
    			});
    			d.showModal();
    			return d;
			},
			showConfirmMessage:function(content,okFun,cancelFun){
				var d = dialog({
					title:"警告",
    			    content: "<span class='warning-green-icon'></span>"+content,
    			    ok:function(){
    			    	if(okFun) okFun();
    			    },
    			    okValue:"确定",
    			    cancel:function(){
    			    	if(cancelFun)cancelFun();
    			    },
    			    cancelValue:"取消"
    			});
    			d.show();
    			return d;
			}
		},
		// 页面上的bootstrap信息提示框
		message:(function(){
			//msgType：消息类型 msgBoxId:在对象后添加消息div content：消息内容 
			showMsg=function(msgType,msgBoxId,content){
				var divMsg = createDivMsg(msgType);
				var box = $(document.getElementById(msgBoxId));
				if(content){
					divMsg.html(content);
				}
				box.after(divMsg);
				if(msgType==='success'|| msgType ==='warning'){
					setTimeout(function(){
						divMsg.remove();
					}, 2000)
				}
			}
			createDivMsg = function(msgType){
				if(msgType==='success'){
					return $("<div class='alert alert-success' role='alert'>成功</div>");
				}else if(msgType==='warning'){
					return $("<div class='alert alert-warning' role='alert'>警告!</div>");
				}else if(msgType==='error'){
					return $("<div class='alert alert-danger' role='alert'>出现错误，请检查后重试！</div>");
				}else{
					return $("<div class='alert info' role='alert'>info!</div>");
				}
			}
			return {
				showMsg:showMsg
			}
		})()
};
//========= 错误提示及loading加载 =======//
(function($){
	//备份jquery的ajax方法
	var _ajax=$.ajax;
	//重写jquery的ajax方法
	$.ajax=function(opt){
		//备份opt中error和success方法
		var fn = {
			error:function(XMLHttpRequest, textStatus, errorThrown){},
			success:function(data, textStatus){}
		}
		if(opt.error){
			fn.error=opt.error;
		}
		if(opt.success){
			fn.success=opt.success;
		}
		//扩展增强处理
		var _opt = $.extend({},{"dialogType":1},opt,{
				error:function(XMLHttpRequest, textStatus, errorThrown){
					//错误方法增强处理
					if(error(XMLHttpRequest, textStatus, errorThrown,_opt.dataType,_opt.dialogType)){
						fn.error(XMLHttpRequest, textStatus, errorThrown);
					}
				},
				success:function(data, textStatus){
					//成功回调方法增强处理
					if(beforeSuccess(data,_opt.dataType,_opt.dialogType)){
						fn.success(data, textStatus);
					}
				}
			});
		_ajax(_opt);
	};
})(jQuery);
// json处理
// 登陆过期
function beforeSuccess(data,dataType,dialogType){  
	if(dataType=="json"){
		if(data.error&&data.type=="outofdate"){
			try {
				if (dialogType == 1) {
					if (window.top && window.top.util) {
						window.top.util.dialog.showConfirmMessage(data.message,
								function() {
									window.location.reload();
								});
					} else {
						util.dialog.showConfirmMessage(data.message,
								function() {
									window.location.reload();
								});
					}

				} else {
					if (confirm(data.message)) {
						window.location.reload();
					}
				}
			} catch (e) {
				// TODO: handle exception
				if (confirm("ex:"+data.message)) {
					window.location.reload();
				}
			}
			return false;
		}
		if(data.code=="BUSINESSERROR"||data.code=="SYSTEMERROR"){  
			try {
				if (dialogType == 1) {//默认启动对话框形式
					if (window.top && window.top.util) { 
						window.top.util.dialog.showErrorMessage(data.name + ":"+ data.content);
					} else { 
						util.dialog.showErrorMessage(data.name + ":" + data.content);
					}

				}else {
					alert(data.name + ":" + data.content)
				}
			} catch (e) {
				// TODO: handle exception
				alert("ex:"+data.name + ":" + data.content)
			}
			return false;
		}	
	}
	
	return true;
}
function error(XMLHttpRequest, textStatus, errorThrown,dataType,dialogType){ 
	util.dialog.showErrorMessage("系统错误！<br/><br/><div class=\"alert alert-danger\" role=\"alert\"><small>"+textStatus+":"+errorThrown+"</small></div>");
}