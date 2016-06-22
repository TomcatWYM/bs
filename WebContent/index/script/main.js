 
	//轮播图效果
	var carouselFigure=(function(){
		 init=function(){
			// autoSlide:2000, 
			var oBigController = $("#carouselBig").msCarousel({width:1000, height:369,callback:bigSlideControl, showMessage:true, messageOpacity:1}).data("msCarousel");
			var thumbs = $("#carouselThumb").msCarousel({boxClass:'li', width:900, height:78, callback:thumbSlideControl, scrollSpeed:500}).data("msCarousel");
			//big button click
			$("#imgRightBig").click(function() {
				oBigController.next();
			});
			$("#imgLeftBig").click(function() {
				oBigController.previous();
			})
			 
		},
		activateThumb=function (no) {
			$("#carouselThumb li").removeClass("active");
			$("#carouselThumb li:eq("+no+")").addClass("active");
		},
		bigSlideControl=function (arg) {
			var oBigController = arg;
			var currentItem = oBigController.getCurrentID();
			activateThumb(currentItem);
			if(currentItem==0) {
				$("#imgLeftBig").css({opacity:0.4});
			} else {
				$("#imgLeftBig").css({opacity:1});
			}
			
			 
		},
		thumbSlideControl=function (arg) {
			var oController = arg;
			var currentItem = oController.getCurrentID();
			if(currentItem==0) {
				$("#imgLeftThumb").css({opacity:0.4});
			} else {
					$("#imgLeftThumb").css({opacity:1})
			}
		}
		return  {
			init : init 
		}
		
	})();

	$(document).ready(function(){
		carouselFigure.init();
	});

