package com.beisun.vms.service.impl;

import com.beisun.vms.mapper.Bill_grade_sendMapper;
import com.beisun.vms.model.Bill_grade_send;
import com.beisun.vms.service.RevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-10-25 16:24
 * @description 激活卡在线申领实现类
 **/
@Service
public class RevServiceImpl implements RevService{
    @Autowired
    Bill_grade_sendMapper bill_grade_sendMapper;


    /**
     * 根据云助理登录的用户名（37010400034740）,前六位对应rev_branch_no,后八位对应rev_clerk_code
     * 获取该用户已领用的激活卡列表
     * @param userName
     * @return
     */
    @Override
    public List<Bill_grade_send> getRevList(String userName) {
        //领用人机构号
        String rev_branch_no = userName.substring(0,6);
        //领用人代码
        String rev_clerk_code = userName.substring(6) ;
        List<Bill_grade_send> revList = bill_grade_sendMapper.getBillGradeSendList(rev_branch_no,rev_clerk_code);
        return revList;
    }
}
