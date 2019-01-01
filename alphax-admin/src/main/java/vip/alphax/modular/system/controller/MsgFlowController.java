package vip.alphax.modular.system.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import vip.alphax.modular.system.entity.MsgFlow;
import vip.alphax.modular.system.service.IMsgFlowService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @auther Alpha丶X
 * @create 2019-01-01 23:15:04
 * @describe 推送记录前端控制器
 */
//@Api
@Controller
@RequestMapping("/system/msg-flow")
public class MsgFlowController {

    @Autowired
    private IMsgFlowService msgFlowService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String get(HttpServletRequest request){
        request.setAttribute("beetl","官网www.ibeetl.com");
        request.setAttribute("test","springboot 集成 beetl 一起来学呀");
        List<MsgFlow> list = msgFlowService.list(new QueryWrapper<>());
        return "index.html";
    }

}

