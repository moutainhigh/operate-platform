package com.zr.returnhandling.model;

import com.zr.util.PageVo;
import lombok.Data;
@Data
public class ReturnHandlingSelectVo extends PageVo {

    //商户名称
    private String merchant;
    //客户名称
    private String customerName;
    //审核状态
    private Integer sendingStatus;
    private String  sendingStatusName;
    //申请日期==生成日期
    private String createTime;
    //处理日期==退货日期
    private String updateTime;

}
