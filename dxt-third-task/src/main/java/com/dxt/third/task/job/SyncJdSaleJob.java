package com.dxt.third.task.job;


import com.dxt.third.core.entity.JdSale;
import com.dxt.third.core.service.JdSaleService;
import com.dxt.third.core.utils.DateUtils;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@EnableScheduling
public class SyncJdSaleJob implements SchedulingConfigurer {
    private Logger logger = LoggerFactory.getLogger(SyncJdSaleJob.class);

    @Autowired
    private JdSaleService jdSaleService;

    @Autowired
    private static String cron;


    //修改之后的cron
    public static void setCron(String cron) {
        SyncJdSaleJob.cron = cron;
    }

    public SyncJdSaleJob() {
        // 每10分钟进行PS数据的同步
        cron = "0 0/5 * * * ?";
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.addTriggerTask(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                logger.info("同步京东履约销售列表信息～开始");
                Date endDate = DateUtils.dateFormatToDate(new Date());
                Date beginDate = DateUtils.dateAddMonths(endDate, -1);
                List<JdSale> jdSales = jdSaleService.selectJdSaleList(beginDate, endDate);
                logger.info("等待同步履约订单数量:" + jdSales.size());
                for (JdSale jdSale : jdSales) {
                    try {
                        jdSaleService.saveJdSale(jdSale);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                logger.info("同步京东履约销售列表信息～结束");
            }
        }, new Trigger() {
            @Override
            public Date nextExecutionTime(TriggerContext triggerContext) {
                CronTrigger trigger = new CronTrigger(cron);
                return trigger.nextExecutionTime(triggerContext);
            }
        });
    }


}