package com.beisun.vms.model;


import lombok.Getter;
import lombok.Setter;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-10-25 11:40
 * @description 激活卡在线申领实体类
 **/
public class Bill_grade_send {
    //序号
    private @Getter @Setter String send_seq;
    //单证代码
    private @Getter @Setter String bill_class;
    //发放机构代码
    private @Getter @Setter String send_branch_no;
    //发放人代码
    private @Getter @Setter String send_clerk_code;
    //发放人类型
    private @Getter @Setter String send_clerk_type;
    //发放人姓名
    private @Getter @Setter String send_clerk_name;
    //流水号起
    private @Getter @Setter String bill_start_no;
    //流水号止
    private @Getter @Setter String bill_end_no;
    //
    private @Getter @Setter String send_level;
    //发放日期
    private @Getter @Setter String date_out;
    //失效日期
    private @Getter @Setter String invalid_date;
    //保单号
    private @Getter @Setter String bill_number;
    //领用机构代码
    private @Getter @Setter String rev_branch_no;
    //领用人代码
    private @Getter @Setter String rev_clerk_code;
    //领用人类型
    private @Getter @Setter String rev_clerk_type;
    //领用人姓名
    private @Getter @Setter String rev_clerk_name;
    //营销员组号
    private @Getter @Setter String rev_frame_no;
    //操作机构代码
    private @Getter @Setter String oclk_branch_no;
    //操作员代码
    private @Getter @Setter String oclk_clerk_code;
    //操作员类型
    private @Getter @Setter String oclk_clerk_type;
    //操作员姓名
    private @Getter @Setter String oclk_clerk_name;
    //登记日期
    private @Getter @Setter String regist_date;
    //
    private @Getter @Setter String stock_seq;
    //
    private @Getter @Setter String asc_ledger_seq;
    //核销状态
    private @Getter @Setter String chk_flag;
    //单证单价
    private @Getter @Setter String bill_price;
    //备注
    private @Getter @Setter String remark;
    //渠道代码
    private @Getter @Setter String sys_flag;
    //
    private @Getter @Setter String op_flag;
    //单证名称
    private @Getter @Setter String bill_name;



}
