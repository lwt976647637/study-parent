package com.dxt.third.core.client;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.dxt.third.core.dao.InterfaceLogMapper;
import com.dxt.third.core.dao.OrderMapper;
import com.dxt.third.core.dao.PinBackOrderMapper;
import com.dxt.third.core.dao.ProductMapper;
import com.dxt.third.core.entity.*;
import com.dxt.third.core.esale.*;
import com.dxt.third.core.service.InterfaceLogService;
import com.dxt.third.core.utils.ESaleConstants;
import com.dxt.third.core.utils.ExceptionUtil;
import com.dxt.third.core.utils.MD5Util;
import com.dxt.third.core.utils.StringUtils;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HTTP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: dxt-interface-parent
 * @Package: com.dxt.manage.esale.client
 * @ClassName: ESaleOrdeClient
 * @Description:E商订单接口客户端
 * @Author: 李维涛
 * @CreateDate: 2018/11/28 16:53
 */
@Component
public class ESaleOrderClient {
    private Logger logger = LoggerFactory.getLogger(ESaleOrderClient.class);


    @Value("${esale.charge.order.send.key}")
    private String key;
    /**
     * E商销账订单数据发送接口地址
     */
    @Value("${esale.charge.order.send.address}")
    private String esaleChargeOrderSendAddress;

    @Value("${esale.charge.order.stsout.address}")
    //E商调拨出库单生成接口
    private String esaleChargeOrderStsoutAddress;

    @Value("${esale.charge.order.stsin.address}")
    //E商调拨入库单生成接口
    private String esaleChargeOrderStsinAddress;

    @Value("${esale.charge.order.stsout.key}")
    private String stsoutKey;


    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private PinBackOrderMapper pinBackOrderMapper;

    @Autowired
    private InterfaceLogService interfaceLogService;

    /**
     * HttpClient httpClient = new DefaultHttpClient() 替代方式
     *
     * @return
     */
    public static CloseableHttpClient createDefault() {
        return HttpClientBuilder.create().build();
    }

    /**
     * 初始化发送给E商接口
     *
     * @param order
     * @return
     */
    private SendOrderRequest initSendChargeOrder(Order order) {
        SendOrderRequest sendOrderRequest = new SendOrderRequest();
        sendOrderRequest.setAuOrderID(order.getOrderNo());
        sendOrderRequest.setAccountId(order.getAccountId());
        sendOrderRequest.setStore(Integer.valueOf(order.getStoreId()));
        sendOrderRequest.setFlag("9");
        sendOrderRequest.setUser(ESaleConstants.ESALE_DXYP_USER_INFO);
        sendOrderRequest.setUser1(ESaleConstants.ESALE_DXYP_USER_INFO);
        sendOrderRequest.setMobile(order.getMobile());
        sendOrderRequest.setTotalAmount(order.getTotalAmount());
        sendOrderRequest.setPayType(order.getPayType());
        sendOrderRequest.setSaleId("");
        sendOrderRequest.setMainmemo("");
        sendOrderRequest.setReturnid(null);
        return sendOrderRequest;
    }


    /**
     * @return
     * @method
     * @description 处理E商销售请求实体信息
     * @date: 2019/4/15 17:34
     * @author: 李维涛
     */
    public SendOrderRequest operationOrder(Order order) {
        List<SendProductRequest> productList = new ArrayList<>();
        SendProductRequest sendProductRequest = null;
        SendOrderRequest sendOrderRequest = initSendChargeOrder(order);
        for (Product product : order.getProductList()) {
            sendProductRequest = new SendProductRequest();
            sendProductRequest.setProductid(product.getProductId());
            sendProductRequest.setProductname(product.getProductName());
            sendProductRequest.setProductserial(StringUtils.isNotEmpty(product.getProductSerial()) ? product.getProductSerial() : "");
            sendProductRequest.setProductprice(product.getProductPrice());
            sendProductRequest.setProductnumber(Integer.valueOf(product.getProductNumber()));
            sendProductRequest.setMemolist(StringUtils.isNotEmpty(product.getRemark()) ? product.getRemark() : "");
            productList.add(sendProductRequest);
        }
        //设置商品信息
        sendOrderRequest.setList(productList);
        return sendOrderRequest;
    }


    /**
     * @return
     * @method
     * @description 销售单据生成接口
     * @date: 2018/12/3 10:16
     * @author: 李维涛
     */
    public SendOrderResponse sendESaleOrderOrderInfo(SendOrderRequest sendOrderRequest) throws Exception {
        String totalAmount;
        SendOrderResponse sendOrderResponse;
        if (sendOrderRequest.getTotalAmount().endsWith(".0")) {
            totalAmount = sendOrderRequest.getTotalAmount().replaceAll("\\.0", "");
        } else if (sendOrderRequest.getTotalAmount().endsWith(".00")) {
            totalAmount = sendOrderRequest.getTotalAmount().replaceAll("\\.00", "");
        } else {
            totalAmount = sendOrderRequest.getTotalAmount();
        }
        //封装签名信息
        String signParam = key + sendOrderRequest.getStore() + sendOrderRequest.getAuOrderID() + totalAmount;
        logger.info("ESaleOrderHttpClient：signParam:销售订单生成签名参数：" + signParam);
        String sign = MD5Util.string2MD5(signParam);
        logger.info("ESaleOrderHttpClient：signParam:销售订单生成签名加密：" + sign.toUpperCase());
        sendOrderRequest.setSignature(sign.toUpperCase());
        String paramJson = JSON.toJSONString(sendOrderRequest, SerializerFeature.WriteMapNullValue);
        logger.info("ESaleOrderHttpClient：send：销售订单发送接口发送报文：" + paramJson);
        HttpClient httpClient = ESaleOrderClient.createDefault();
        logger.info("销售接口:esaleChargeOrderSendAddress:" + esaleChargeOrderSendAddress);
        HttpPost httpPost = new HttpPost(esaleChargeOrderSendAddress);
        httpPost.addHeader(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded");
        StringEntity stringEntity = new StringEntity(paramJson, Charset.forName("gb2312"));
        httpPost.setEntity(stringEntity);
        HttpResponse response = httpClient.execute(httpPost);
        InputStream inStream = response.getEntity().getContent();
        //请注意这里的编码 
        BufferedReader reader = new BufferedReader(new InputStreamReader(inStream, "gbk"));
        StringBuilder resultJson = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            resultJson.append(line);
        }
        inStream.close();
        logger.info("ESaleOrderHttpClient：send：销账订单发送接口反馈报文：" + resultJson.toString());
        sendOrderResponse = JSON.parseObject(resultJson.toString(), new TypeReference<SendOrderResponse>() {
        });
        return sendOrderResponse;


    }

    /**
     * @return
     * @method
     * @description 调用E商标准接口形成销售订单
     * @date: 2018/12/6 9:42
     * @author: 李维涛
     */
    public SendOrderResponse sendESaleOrder(Order order, Map map, JdStore jdStore) throws Exception {
        logger.info("~~~~~~~~~~形成销售订单开始=======START");
        SendOrderResponse sendOrderResponse = null;
        String sendResult = null;
        //4、调用E商标准接口，发送销售订单数据
        SendOrderRequest sendOrderRequest = copySendOrder(order, jdStore.getNsrinvid().trim(), Integer.valueOf(jdStore.getNsrdepotid().trim()));
        map.put("sendOrderRequestKey", sendOrderRequest);
        //调用E商接口形成销账订单
        sendOrderResponse = this.sendESaleOrderOrderInfo(sendOrderRequest);
        if (null != sendOrderResponse) {

            order.setStatus(String.valueOf(sendOrderResponse.getResult()));
            order.setRemark(sendOrderResponse.getDesc());
            order.setSaleId(String.valueOf(sendOrderResponse.getSaleId()));
            order.setUpdateTime(new Date());
            orderMapper.updateStatusByOrderId(order);
            logger.info("ChargeOffOrderServiceImpl: 销售订单更新状态：" + order.getStatus());
        }
        logger.info("~~~~~~~~~~形成销售订单结束=======END");
        interfaceLogService.saveOrderRecord(order.getOrderNo(),JSON.toJSONString(sendOrderRequest),JSON.toJSONString(sendOrderResponse),"销售订单");

        return sendOrderResponse;
    }


    /**
     * @return
     * @method
     * @description 销退订单生成
     * @date: 2018/12/6 9:42
     * @author: 李维涛
     */
    public SendOrderResponse pinBackOrder(Order order, JdStore jdStore) throws Exception {
        SendOrderResponse sendOrderResponse = null;
        SendProductRequest sendProductRequest;
        //判断当前订单是否成功生成销退订单
        PinBackOrderExample pinBackOrderExample = new PinBackOrderExample();
        pinBackOrderExample.createCriteria().andOrderNoEqualTo(order.getOrderNo());
        List<PinBackOrder> pinBackOrders = pinBackOrderMapper.selectByExample(pinBackOrderExample);
        if (!pinBackOrders.isEmpty()) {
            return sendOrderResponse;
        }
        logger.info("pinBackEsaleChargeOrder~~~~~~~~~~形成销退单据开始=======START");

        List<SendProductRequest> productList = new ArrayList<>();
        order.setAccountId(jdStore.getGtaccountid());
        order.setStoreId(jdStore.getGtdepotid());
        SendOrderRequest sendOrderRequest = initSendChargeOrder(order);
        if (order.getTotalAmount().equals("0.0") || order.getTotalAmount().equals("0.00")) {
            sendOrderRequest.setTotalAmount("0");
        } else {
            sendOrderRequest.setTotalAmount(String.valueOf(Double.parseDouble(order.getTotalAmount()) * -1));
        }
        //根据当前编码获取商品集合
        for (Product product : order.getProductList()) {
            if(Double.valueOf(product.getProductPrice()) > 0.0){
                sendProductRequest = new SendProductRequest();
                sendProductRequest.setProductid(product.getProductId());
                sendProductRequest.setProductname(product.getProductName());
                sendProductRequest.setProductserial(StringUtils.isNotEmpty(product.getProductSerial()) ? product.getProductSerial() : "");
                sendProductRequest.setProductprice(product.getProductPrice());
                sendProductRequest.setProductnumber(Integer.valueOf(product.getProductNumber()) * -1);
                sendProductRequest.setMemolist(StringUtils.isNotEmpty(product.getRemark()) ? product.getRemark() : "");
                productList.add(sendProductRequest);
            }

        }

        sendOrderRequest.setList(productList);
        //调用E商接口形成销账订单
        sendOrderResponse = this.sendESaleOrderOrderInfo(sendOrderRequest);
        logger.info("pinBackEsaleChargeOrder~~~~~~~~~~形成销退单据结束=======END");

        //将销退订单保存到数据库中
        PinBackOrder pinBackOrder = new PinBackOrder();
        BeanUtils.copyProperties(order, pinBackOrder);
        pinBackOrder.setCreateTime(new Date());
        pinBackOrder.setUpdateTime(new Date());
        pinBackOrder.setSaleId(String.valueOf(sendOrderResponse.getSaleId()));
        pinBackOrder.setStatus(String.valueOf(sendOrderResponse.getResult()));
        pinBackOrder.setRemark(sendOrderResponse.getDesc());
        pinBackOrderMapper.insert(pinBackOrder);
        interfaceLogService.saveOrderRecord(order.getOrderNo(),JSON.toJSONString(sendOrderRequest),JSON.toJSONString(sendOrderResponse),"销退订单");
        return sendOrderResponse;
    }


    /**
     * @return
     * @method
     * @description 调用调拨出库单生成
     * @date: 2018/12/14 2:49
     * @author: 李维涛
     */
    public SendStsoutResponse createStsoutOrder(Order order, Map map, JdStore jdStore) {
        logger.info("~~~~~~~~~~形成调拨出库单开始~~~~~~~~~~START");
        SendStsoutResponse sendStsoutResponse = null;
        SendStsoutRequest sendStsoutRequest = null;
        /* 区分合约编码 */
        SendOrderRequest sendOrderRequest = copySendOrder(order, jdStore.getGtaccountid().trim(), Integer.valueOf(jdStore.getGtdepotid().trim()));
        if (null != sendOrderRequest && null != jdStore) {
            //封装E商调拨单形成接口参数
            sendStsoutRequest = new SendStsoutRequest();
            //获取调入门店id ztdepotid
            sendStsoutRequest.setStoreTarget(Integer.valueOf(jdStore.getZtdepotid().trim()));
            //对方门店 idepotid
            sendStsoutRequest.setStoreOrigin(Integer.valueOf(jdStore.getNsrdepotid().trim()));

            logger.info("~~~~~~~~~~形成调拨出库单~~~~~~~~~对方门店：StoreOrigin：" + sendStsoutRequest.getStoreOrigin());
            logger.info("~~~~~~~~~~形成调拨出库单~~~~~~~~~调出门店：StoreSource：" + sendStsoutRequest.getStoreSource());
            //调拨出库单账套以调出门店账套为主
            sendStsoutRequest.setAccountId(Integer.valueOf(order.getAccountId().trim()));
            //调出门店 odepotid
            sendStsoutRequest.setStoreSource(Integer.valueOf(jdStore.getGtdepotid().trim()));
            sendStsoutRequest.setMainmemo("京东履约形成调拨出库单");
            sendStsoutRequest.setStoretostoreid(0);
            sendStsoutRequest.setStsType(1);
            sendStsoutRequest.setUserName(ESaleConstants.ESALE_DXYP_USER_INFO);
            sendStsoutRequest.setList(sendOrderRequest.getList());
            //调出门店和对方门店相等则不生成调拨单
            if (!sendStsoutRequest.getStoreOrigin().equals(sendStsoutRequest.getStoreSource())) {
                //调用E商调拨单接口,形成调拨单单据
                String resultStsout = sendESaletSoutInfo(sendStsoutRequest, map);
                if (StringUtils.isNotEmpty(resultStsout)) {
                    sendStsoutResponse = JSON.parseObject(resultStsout, new TypeReference<SendStsoutResponse>() {
                    });
                    order.setStsoutStatus(String.valueOf(sendStsoutResponse.getResult()));
                    order.setStsoutSaleId(sendStsoutResponse.getStsid());
                    order.setStsoutRemark(sendStsoutResponse.getDesc());
                    order.setUpdateTime(new Date());
                    //将更新调拨单状态
                    orderMapper.updateStatusByOrderId(order);
                }
            } else {
                logger.info("~~~~~~~~~~调出门店和对方门店相等,调拨单未生成");
                order.setRemark("调出门店和对方门店相等,调拨单未生成{}" + "对方门店：StoreOrigin" + sendStsoutRequest.getStoreOrigin() + "调出门店：StoreSource" + sendStsoutRequest.getStoreSource());
                //将更新调拨单状态
                order.setUpdateTime(new Date());
                order.setStsoutStatus("5");
                order.setStsoutSaleId("");
                order.setStsoutRemark("调出门店和对方门店相等,调拨单未生成!" + "对方门店：StoreOrigin" + sendStsoutRequest.getStoreOrigin() + "调出门店：StoreSource" + sendStsoutRequest.getStoreSource());
                orderMapper.updateStatusByOrderId(order);
            }
        }
        logger.info("~~~~~~~~~~形成调拨出库单结束~~~~~~~~~~END");
        interfaceLogService.saveOrderRecord(order.getOrderNo(),JSON.toJSONString(sendStsoutRequest),JSON.toJSONString(sendStsoutResponse),"调拨出库单");

        return sendStsoutResponse;
    }


    /**
     * @return
     * @method
     * @description 形成调拨出库单
     * @date: 2018/12/13 13:59
     * @author: 李维涛
     */
    public String sendESaletSoutInfo(SendStsoutRequest sendStsoutRequest, Map map) {

        String result = null;
        try {

            String encode = URLEncoder.encode(ESaleConstants.ESALE_DXYP_USER_INFO);
            //封装签名信息
            String signParam = stsoutKey + encode + sendStsoutRequest.getStoreSource();
            logger.info("ESaleOrderHttpClient：send：调拨出库单生成接口签名信息" + signParam);
            String sign = MD5Util.string2MD5(signParam);
            logger.info("ESaleOrderHttpClient：send：调拨出库单生成接口签名" + sign.toUpperCase());
            String paramJson = JSON.toJSONString(sendStsoutRequest);
            HttpClient httpClient = createDefault();
            logger.info("ESaleOrderHttpClient：send：调拨出库单生成接口发送报文：" + paramJson);
            map.put("sendStsoutRequest", paramJson);
            //调用调拨单生成接口
            logger.info("调拨出库接口:esaleChargeOrderStsoutAddress:" + esaleChargeOrderStsoutAddress + sign.toUpperCase());
            HttpPost httpPost = new HttpPost(esaleChargeOrderStsoutAddress + sign.toUpperCase());
            httpPost.addHeader(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded");
            StringEntity stringEntity = new StringEntity(paramJson, Charset.forName("gbk"));
            httpPost.setEntity(stringEntity);
            HttpResponse response = httpClient.execute(httpPost);
            InputStream inStream = response.getEntity().getContent();
            //请注意这里的编码 
            BufferedReader reader = new BufferedReader(new InputStreamReader(inStream, "gbk"));
            StringBuilder resultJson = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                resultJson.append(line);
            }
            inStream.close();
            logger.info("ESaleOrderHttpClient：send：调拨出库单生成接口反馈报文：" + resultJson.toString());
            map.put("sendStsoutResponse", resultJson.toString());
            //将报文信息记录到日志表中
            return resultJson.toString();
        } catch (IOException e) {
            logger.info("ESaleOrderHttpClient：send：调拨出库单生成接口异常：" + ExceptionUtil.getExceptionInfo(e));
            e.printStackTrace();
        }
        return result;

    }


    /**
     * @return
     * @method
     * @description 调拨入库单生成
     * @date: 2018/12/27 9:06
     * @author: 李维涛
     */
    public SendStsinResponse sendESaletSinInfo(SendStsinRequest sendStsinRequest, Map<String, Object> map, String storesource) {
        logger.info("~~~~~~~~~~~~~~~~~~~~~~~~：调拨入库单生成开始：START");
        SendStsinResponse sendStsinResponse = null;
        try {
            String encode = URLEncoder.encode(ESaleConstants.ESALE_DXYP_USER_INFO, "UTF-8");
            //封装签名信息
            String signParam = stsoutKey + encode + storesource;
            logger.info("ESaleOrderHttpClient：send：调拨入库单生成接口签名信息" + signParam);
            String sign = MD5Util.string2MD5(signParam);
            String paramJson = JSON.toJSONString(sendStsinRequest);
            HttpClient httpClient = createDefault();
            logger.info("ESaleOrderHttpClient：send：调拨入库单生成接口发送报文：" + paramJson);
            map.put("sendStsinRequest", paramJson);
            //调用调拨入库单生成接口
            logger.info("调拨入库接口:esaleChargeOrderStsinAddress:" + esaleChargeOrderStsinAddress);
            HttpPost httpPost = new HttpPost(esaleChargeOrderStsinAddress + sign.toUpperCase());
            httpPost.addHeader(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded");
            StringEntity stringEntity = new StringEntity(paramJson, Charset.forName("gbk"));
            httpPost.setEntity(stringEntity);
            HttpResponse response = httpClient.execute(httpPost);
            InputStream inStream = response.getEntity().getContent();
            //请注意这里的编码 
            BufferedReader reader = new BufferedReader(new InputStreamReader(inStream, "gbk"));
            StringBuilder resultJson = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                resultJson.append(line);
            }
            inStream.close();
            logger.info("ESaleOrderHttpClient：send：调拨入库单生成接口反馈报文：" + resultJson.toString());
            map.put("sendStsinResponse", resultJson.toString());
            String resultString = resultJson.toString();
            if (StringUtils.isNotEmpty(resultString)) {
                sendStsinResponse = JSON.parseObject(resultString, new TypeReference<SendStsinResponse>() {
                });
                return sendStsinResponse;
            }
            //将报文信息记录到日志表中
        } catch (IOException e) {
            logger.info("ESaleOrderHttpClient：send：调拨入库单生成接口异常：" + ExceptionUtil.getExceptionInfo(e));
            e.printStackTrace();
        }

        logger.info("~~~~~~~~~~~~~~~~~~~~~~~~：调拨入库单生成结束：END");
        interfaceLogService.saveOrderRecord(sendStsinRequest.getStoretostoreid(),JSON.toJSONString(sendStsinRequest),JSON.toJSONString(sendStsinResponse),"调拨入库单");

        return sendStsinResponse;
    }


    private SendOrderRequest copySendOrder(Order order, String accountId, Integer store) {
        List<SendProductRequest> productList = new ArrayList<>();
        SendProductRequest sendProductRequest;
        SendOrderRequest sendOrderRequest = new SendOrderRequest();
        sendOrderRequest.setAuOrderID(order.getOrderNo());
        sendOrderRequest.setAccountId(accountId);
        sendOrderRequest.setStore(store);
        sendOrderRequest.setFlag("9");
        sendOrderRequest.setUser(ESaleConstants.ESALE_DXYP_USER_INFO);
        sendOrderRequest.setUser1(ESaleConstants.ESALE_DXYP_USER_INFO);
        sendOrderRequest.setMobile(order.getMobile());
        sendOrderRequest.setTotalAmount(order.getTotalAmount());
        sendOrderRequest.setPayType(order.getPayType());
        sendOrderRequest.setSaleId("");
        sendOrderRequest.setMainmemo("");
        sendOrderRequest.setReturnid(null);
        for (Product product : order.getProductList()) {
            if(Double.valueOf(product.getProductPrice())>0.0){
                sendProductRequest = new SendProductRequest();
                sendProductRequest.setProductid(product.getProductId());
                sendProductRequest.setProductname(product.getProductName());
                sendProductRequest.setProductserial(StringUtils.isEmpty(product.getProductSerial()) ? "" : product.getProductSerial());
                sendProductRequest.setProductprice(product.getProductPrice());
                sendProductRequest.setProductnumber(product.getProductNumber());
                sendProductRequest.setMemolist(StringUtils.isNotEmpty(product.getRemark()) ? product.getRemark() : "");
                productList.add(sendProductRequest);
            }


        }
        //设置商品信息
        sendOrderRequest.setList(productList);
        return sendOrderRequest;
    }

}
