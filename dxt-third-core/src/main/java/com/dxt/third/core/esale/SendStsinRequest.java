package com.dxt.third.core.esale;

import lombok.Data;


@Data
public class SendStsinRequest {
    /**
     * 调拨出库单号
     */
    private String Storetostoreid;
    /**
     * 制单人
     */
    private String Username;
    /**
     * 调拨类型(0调拨入库，1调拨出库)
     */
    private Integer Ststype;
    /**
     * 调拨入库单单号
     */
    private Integer stsid;
    private Integer accountid;


}
