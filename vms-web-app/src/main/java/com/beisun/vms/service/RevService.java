package com.beisun.vms.service;

import com.beisun.vms.model.Bill_grade_send;

import java.util.List;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-10-25 16:23
 * @description 激活卡在线申领接口
 **/
public interface RevService {
    public List<Bill_grade_send> getRevList(String userName);
}
