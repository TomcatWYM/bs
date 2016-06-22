 
	/*
	 *初始化部分页面数据
	 */
	
	var begin=(function(){
		var viewHeight;//浏览器窗口可视高度
		var viewWidth;//浏览器窗口可视宽度
		var pageHeight;//文档页面高度
		var pageWidth;//文档页面宽度
		var initB = function(){
			//window是在所有元素均加载完成后才开始运行，注意区别
			//延迟加载,用于处理部分因DOM加载耗时较长引起的BUG
			var t_load = setTimeout(function(){
				//刷新部分全局数据
				getValue();
				//进行页面调整
				pageAdjust();

			},300);//delayTime
		},
		getValue=function () {
			/*全局变量
			 * 浏览器窗口可视高度
			 */
			viewHeight = $(window).height();

			/*全局变量
			 * 浏览器窗口可视宽度
			 */
			viewWidth = $(window).width();
			//获取部分全局变量
			/*全局变量
			 * 文档高度
			 */
			pageHeight = $(document).height();

			/*全局变量
			 * 文档宽度
			 */
			pageWidth = $(document).width();

		},
		pageAdjust=function () {
			//页面样式的调整
			//在初始化和页面尺寸变化时，从getValue()调用
			/*
			 *nav_list的调整
			 */
			var width_header_menu_list = $('#header').width() - 416;
			$('#header_menu_list').width(width_header_menu_list);
			var left_header_menu_list  = (width_header_menu_list*0.28-12)/2+208;
			$('#header_menu_list').css('marginLeft', left_header_menu_list);
			//section_button_list位置调整
			console.log(viewHeight/2-50) 
			$("#section_button").css('top', viewHeight/2-50 + "px");

			for (var i = 0; i <6; i++) {
				$('.header_detail_container').eq(i).css('left', 1000*i+'px');
			}
		}
		  return {
			  init:initB,
			  getValue:getValue,
			  pageAdjust:pageAdjust
		  }
	})();
	/*
	 *header_nav_list上移动menu_detail移动特效
	 *
	 */
	var menu_detail= function(){
		var open_status = false;//true表示打开状态
		var run_status =false;//动画运行状态，true表示正在运行
		var run1_status = false;//nav的动画状态
		$('.header_menu_list').on('mouseenter',function(){
			if($(this).attr("value")){
				//鼠标离开nav区域，关闭header_menu_details
				$('#header_menu_details').slideUp(300,function(){
					run1_status = false;
				});
				//关闭完毕，标记状态
				open_status = false;
				return false;
			}
			/*移动到header_nav_list上时，
			 *先判断menu_detail有没有打开，如果打开就直接进行左右切换，如果没有打开则先进行左右切换再打开
			 *
			 */
			if(open_status)
			{
				//打开状态
				if(!run_status)
				{
					run_status = true;//正在运行
					var index = $(this).index();
					$('#header_menu_details_mask').animate({
						left: -1000*index+'px'}, 300,function(){
							run_status = false;//结束运行状态
						})
				}
			} else {
				//关闭状态
				var index = $(this).index();
				$('#header_menu_details_mask').css('left', -1000*index+'px');
				if(!run1_status)
				{
					$('#header_menu_details').slideDown();
					run1_status = true;
					//打开完毕，标记状态
					open_status = true;
				}
			}
		});
		$('#header_nav').on('mouseleave',function(){
			//鼠标离开nav区域，关闭header_menu_details
			$('#header_menu_details').slideUp(300,function(){
				run1_status = false;
			});
			//关闭完毕，标记状态
			open_status = false;
		}) 
	} ;

	$(document).ready(function(){
		menu_detail();
		begin.init();
		
		$(window).resize(function(){
			//刷新部分全局数据
			begin.getValue();
			//进行页面调整
			begin.pageAdjust();

		});
	});//不会自动提升

 
