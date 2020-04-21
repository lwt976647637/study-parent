package com.lwt.study.core.utils;



/**
 * 接口调用工具类
 * @author wangjingsong
 */
public class ReqSignUtil {
//
//	//日志对象
//	public static Logger logger = LoggerFactory.getLogger(ReqSignUtil.class);
//
//	/**
//	 * 接口调用签名验证
//	 * @param paramMaps
//	 * @param url 地址后缀
//	 * @return Map<String, Object>
//	 * @throws Exception
//	 */
//	public static Map<String, Object> reqSign(Map<String, Object> paramMaps, String url) throws Exception {
//		Map<String,Object> paramMap = JSONObject.parseObject(net.sf.json.JSONObject.fromObject(paramMaps).toString());
//		//读取配置文件的接口访问地址  + 地址后缀 拼接完整的调用地址
//		String svcUrl = "";
//		if(StringUtils.isNotBlank(url)){//Global.getSvcPrefix() 值的例子：
//			svcUrl=Global.getSvcPrefix()+url;
//		}
//		logger.warn(svcUrl);
//		Long timeStamp = new Date().getTime();
//		Collection<String> keyset = paramMaps.keySet();
//		List<String> list = new ArrayList<String>(keyset);
//
//		// 对key键值按字典升序排序
//		Collections.sort(list);
//		StringBuilder content = new StringBuilder();
//
//		for (int i = 0; i < list.size(); i++) {
//			content.append(list.get(i)).append(paramMap.get(list.get(i)));
//		}
//		//GlobalSecret.SECRET  接口私钥
//		String sign = MD5Util.string2MD5(GlobalSecret.SECRET + timeStamp + content);
//
//		JSONObject jsonObject = new JSONObject();
//		String dataJson =net.sf.json.JSONObject.fromObject(paramMaps).toString();
//		jsonObject.put("data", dataJson);
//		jsonObject.put("sign", sign);
//		jsonObject.put("timeStamp", timeStamp);
//		//来源
//		jsonObject.put("source", "wx");
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("paramJson", jsonObject.toJSONString());
//		//向接口发送验证请求
//		String re = HttpReqUtils.doPost(svcUrl, map);
//		System.out.println(re);
//		Map<String, Object> returnMap = JSONObject.parseObject(re);
//
//		return returnMap;
//	}
//
//	/**
//	 * 接口调用签名验证
//	 * @param paramMaps
//	 * @param url 地址后缀
//	 * @return Map<String, Object>
//	 * @throws Exception
//	 */
//	public static Map<String, Object> reqP2pSign(Map<String, Object> paramMaps, String url) throws Exception {
//		//读取配置文件的接口访问地址  + 地址后缀 拼接完整的调用地址
//		String svcUrl = "";
//		if(StringUtils.isNotBlank(url)){//Global.getSvcPrefix() 值的例子：
//			svcUrl=Global.getP2pSvcPrefix()+url;
//		}
//		logger.warn(svcUrl);
//		//向接口发送验证请求
//		String re = HttpReqUtils.doPost(svcUrl, paramMaps);
//		System.out.println(re);
//		Map<String, Object> returnMap = JSONObject.parseObject(re);
//		return returnMap;
//	}
//	/**
//	 * 接口调用签名验证
//	 * @param paramMaps
//	 * @param url 地址后缀
//	 * @return Map<String, Object>
//	 * @throws Exception
//	 */
//	public static Map<String, Object> reqUserSign(Map<String, Object> paramMaps, String url) throws Exception {
//		Map<String,Object> paramMap = JSONObject.parseObject(net.sf.json.JSONObject.fromObject(paramMaps).toString());
//		//读取配置文件的接口访问地址  + 地址后缀 拼接完整的调用地址
//		String svcUrl = "";
//		if(StringUtils.isNotBlank(url)){//Global.getSvcPrefix() 值的例子：
//			svcUrl=Global.getUserSvcPrefix()+url;
//		}
//		logger.warn(svcUrl);
//		Long timeStamp = new Date().getTime();
//		Collection<String> keyset = paramMaps.keySet();
//		List<String> list = new ArrayList<String>(keyset);
//
//		// 对key键值按字典升序排序
//		Collections.sort(list);
//		StringBuilder content = new StringBuilder();
//
//		for (int i = 0; i < list.size(); i++) {
//			content.append(list.get(i)).append(paramMap.get(list.get(i)));
//		}
//		//GlobalSecret.SECRET  接口私钥
//		//String sign = MD5Util.string2MD5(GlobalSecret.SECRET + timeStamp + content);
//		String sign = MD5Util.string2MD5("fzsm2hV1DWI=" + timeStamp + content);
//
//		JSONObject jsonObject = new JSONObject();
//		String dataJson =net.sf.json.JSONObject.fromObject(paramMaps).toString();
//		jsonObject.put("data", dataJson);
//		jsonObject.put("sign", sign);
//		jsonObject.put("timeStamp", timeStamp);
//		//来源
//		jsonObject.put("source", "wx");
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("paramJson", jsonObject.toJSONString());
//		//向接口发送验证请求
//		String re = HttpReqUtils.doPost(svcUrl, map);
//		Map<String, Object> returnMap = JSONObject.parseObject(re);
//
//		return returnMap;
//	}
//	/**
//	 * 调用demo
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		Map<String,Object> paramMap = new HashMap();
//		try {
//			  Map<String, Object> map = ReqSignUtil.reqSign(paramMap,"/es/api/es_findOrder");
//			  System.out.println(map.toString());
//		} catch (Exception e) {
//			logger.error(Exceptions.getStackTraceAsString(e));
//		}
//
//	}
}