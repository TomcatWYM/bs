package com.bs.controller;

import com.bs.base.BaseResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/message")
public class MessageController extends BaseController {

    private static final Log logger = LogFactory.getLog(MessageController.class);

    @RequestMapping(value = "/delete.do")
    @ResponseBody
    public BaseResult index(
            @RequestParam() Integer id
    ) {
        messageService.delete(id);
        return BaseResult.createSuccess("删除成功");
    }



}
