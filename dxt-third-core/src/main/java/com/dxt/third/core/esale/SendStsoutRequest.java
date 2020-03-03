package com.dxt.third.core.esale;

import com.dxt.third.core.entity.Product;
import lombok.Data;

import java.util.List;

@Data
public class SendStsoutRequest {
    /**
     * 帐套ID
     */
    private Integer accountId;
    /**
     * 调出门店 迪信优品接口传送过来的是调出
     */
    private Integer storeSource;
    /**
     * 调入门店
     */
    private Integer StoreTarget;
    /**
     * 对方门店
     */
    private Integer storeOrigin;
    /**
     * 制单人
     */
    private String userName;
    /**
     * 备注
     */
    private String mainmemo;
    /**
     * 调拨单类型(0调拨入库，1调拨出库) 不走在途 接口发送-1
     */
    private Integer stsType;
    /**
     * 商品信息
     */
    List<SendProductRequest> list;
    /**
     * 调拨单单号传0
     */
    private Integer storetostoreid;


   
}
