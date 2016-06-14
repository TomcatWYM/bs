package com.bs.controller;

import com.bs.base.BaseResult;
import com.bs.pojo.FriendShip;
import com.bs.pojo.Message;
import com.bs.pojo.Student;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/friendShip")
public class FriendShipController extends BaseController {

    private static final Log logger = LogFactory.getLog(FriendShipController.class);

	@RequestMapping(value="/save.do")
    @ResponseBody
	public BaseResult index(
            @RequestParam() Integer userId,
            @RequestParam() Integer friendId
    ){

        FriendShip friendShip = new FriendShip(userId,friendId);
        friendShipService.save(friendShip);
		return BaseResult.createSuccess("ok");
	}



}
