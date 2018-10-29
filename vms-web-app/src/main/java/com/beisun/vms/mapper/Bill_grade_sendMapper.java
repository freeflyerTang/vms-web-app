package com.beisun.vms.mapper;

import com.beisun.vms.model.Bill_grade_send;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-10-25 11:41
 * @description 激活卡在线申领的接口
 **/
public interface Bill_grade_sendMapper {
    /**
     * 获取该用户已领用的激活卡列表
     * @param rev_branch_no 领用人机构号
     * @param rev_clerk_code 领用人代码
     * @return
     */
    public List<Bill_grade_send> getBillGradeSendList(@Param("rev_branch_no") String rev_branch_no,
                                                      @Param("rev_clerk_code")String rev_clerk_code);
}
