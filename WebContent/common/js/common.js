

function log(_object){
    console.log(_object);
}

function alert(message){

    var $remodalContainer = $('[data-remodal-id=modal]');
    $remodalContainer.find('#remodal-body').html(message);
    $remodalContainer.find('#remodal-title').html('提示消息');
    $remodalContainer.find('.remodal-confirm').hide();
    jQuery.noConflict();
    var $remodal = $remodalContainer.remodal({});
    $remodal.open();
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



function ajaxSuccessHandler(data,isReload,successCallback,failCallback){
    if(data){
        if(data.success){
            if(isReload){
                location.reload();
            }
            alert(data.message);
            successCallback(data);
        }else{
            alert(data.message);
            failCallback(data);
        }
    }
}