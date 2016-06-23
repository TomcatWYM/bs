

function log(_object){
    console.log(_object);
}



function alertInfo(message){
    window.wxc.xcConfirm(message, window.wxc.xcConfirm.typeEnum.info);
}
function alertSuccess(message){
    window.wxc.xcConfirm(message, window.wxc.xcConfirm.typeEnum.success);
}
function alertWarning(message){
    window.wxc.xcConfirm(message, window.wxc.xcConfirm.typeEnum.warning);
}
function alertError(message){
    window.wxc.xcConfirm(message, window.wxc.xcConfirm.typeEnum.error);
}


/**
 * select 可以自动根据 select中的 key 选中对应value的option
 */
function autoSelect(){
    $(".auto-select").each(function(){
        var $select = $(this);
        var key = $select.attr("key");
        if(!key){
            key = $select.attr("value");
        }
        if(key){
            key = key.trim();
            $select.find("option[value='"+key+"']").attr("selected","true");
        }
    })
}



function ajaxSuccessHandler(data,isReload,successCallback,failCallback,callback){
    if(data){
        if(data.success){
            if(isReload){
                location.reload();
            }
            alertSuccess(data.message);
            if(successCallback){
                successCallback(data);
            }

        }else{
            alertError(data.message);
            if(failCallback){
                failCallback(data);
            }

        }
        if(callback){
            callback();
        }
    }
}