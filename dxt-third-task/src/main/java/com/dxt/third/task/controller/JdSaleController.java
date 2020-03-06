package com.dxt.third.task.controller;

import com.dxt.third.core.service.JdSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/jdSale")
public class JdSaleController {

    @Autowired
    private JdSaleService jdSaleService;


    /**
     * 形成订单
     */
    @GetMapping("/orderProcess/{orderNo}")
    public void createESaleOrder(@PathVariable("orderNo") String orderNo) {
        jdSaleService.orderProcess(orderNo);
    }
}
