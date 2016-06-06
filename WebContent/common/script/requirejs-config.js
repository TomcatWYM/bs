requirejs.config({
	paths : {
		'jquery' : 'jquery-1.9.1.min',
		"bootstrap":"../common/script/bootstrap/bootstrap.min",
		"util":"util",
	},
	shim:{
		 "bootstrap" : {  
             deps : ['jquery'],  
             exports : 'bootstrap'  
        },
        "util" : {  
            deps : ['jquery'],  
            exports : 'util'  
       } 
	}
});

require(["bootstrap"],function(bootstrap){
	
})


