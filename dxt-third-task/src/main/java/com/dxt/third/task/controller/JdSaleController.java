package com.dxt.third.task.controller;

import com.dxt.third.core.service.JdSaleService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "JD履约单据生成", tags = {"JD履约单据生成"})
@RestController
@RequestMapping("/jdSale")
public class JdSaleController {

    @Autowired
    private JdSaleService jdSaleService;


    /**
     * 形成订单
     */
    @RequestMapping(value = "/orderProcess/{orderNo}", method = RequestMethod.GET)
    public void createESaleOrder(@PathVariable("orderNo") String orderNo) {
        jdSaleService.orderProcess(orderNo);
    }
}
