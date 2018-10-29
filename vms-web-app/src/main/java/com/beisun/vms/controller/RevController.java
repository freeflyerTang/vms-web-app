package com.beisun.vms.controller;

import com.beisun.vms.model.Bill_grade_send;
import com.beisun.vms.service.RevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-10-25 14:34
 * @description 激活卡在线申领
 **/
@Controller
public class RevController {
    @Autowired
    RevService revService;

    /**
     * 获取登录用户已领用的激活卡列表
     * @param userName
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getRevList.do",method = RequestMethod.GET)
    public String getRevList(@RequestParam String userName, HttpServletRequest request, HttpServletResponse response){

        List<Bill_grade_send> revList = revService.getRevList(userName);
        request.setAttribute("revList",revList);
        return "revList";
    }

    @RequestMapping(value = "/apply.do",method = RequestMethod.GET)
    public String apply(@RequestParam String userName,HttpServletRequest request,HttpServletResponse response){

        request.setAttribute("userName",userName);
        return "apply";
    }
}
