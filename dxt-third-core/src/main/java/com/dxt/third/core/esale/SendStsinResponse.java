package com.dxt.third.core.esale;

import lombok.Data;


@Data
public class SendStsinResponse {

    /**
     * 状态（0 失败，1 保存成功审核失败，2 审核成功）
     */
    private Integer result;
    /**
     * 描述
     */
    private String desc;
    /**
     * 单号
     */
    private String stsid;

}
