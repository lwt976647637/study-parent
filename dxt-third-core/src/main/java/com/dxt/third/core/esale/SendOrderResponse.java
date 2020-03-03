package com.dxt.third.core.esale;

import lombok.Data;


@Data
public class SendOrderResponse {
    /**
     * 状态（0 保存失败，1 保存成功审核失败，2 审核成功）
     */
    private Integer result;
    /**
     * 销售单号（resutl非0时必填）
     */
    private Integer saleId;
    /**
     * 描述
     */
    private String desc;


}
