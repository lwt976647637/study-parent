package com.dxt.third.core.esale;

import lombok.Data;

import java.io.Serializable;

@Data
public class SendProductRequest implements Serializable {
    private String productserial;
    private String productid;
    private String productname;
    private String productprice;
    private Integer productnumber;
    /**
     * 行备注
     */
    private String memolist;


}
