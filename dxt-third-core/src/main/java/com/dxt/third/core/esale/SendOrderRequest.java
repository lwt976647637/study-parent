package com.dxt.third.core.esale;

import com.dxt.third.core.entity.Product;
import lombok.Data;

import java.util.List;

/**
 * @ProjectName: dxt-interface-parent
 * @Package: com.dxt.manage.esale.pojo
 * @ClassName: SendChargeOffRequest
 * @Description: E商销单接口请求实体
 * @Author: 李维涛
 * @CreateDate: 2018/12/3 10:18
 */
@Data
public class SendOrderRequest {
    /**
     * 账套Id
     */
    private String accountId;
    /**
     * 调用方标识
     */
    private String flag;
    /**
     * 第三方订单号
     */
    private String auOrderID;
    /**
     * 门店Id
     */
    private Integer store;
    /**
     * 收银员
     */
    private String user;
    /**
     * 营业员
     */
    private String user1;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 金额(单位元)
     */
    private String totalAmount;
    /**
     * 收款方式
     */
    private String payType;
    /**
     * 签名(MD5(key+ Store+ AUOrderID+ TotalAmount))
     */
    private String signature;
    /**
     * 要修改的e商单据号
     */
    private String saleId;
    /**
     * 备注
     */
    private String mainmemo;
    /**
     * 原e商销售出库单id
     */
    private Integer returnid;
    /**
     * 商品信息
     */
    List<SendProductRequest> list;


}
