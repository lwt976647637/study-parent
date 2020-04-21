package com.lwt.study.core.spider.service.impl;


import com.lwt.study.core.spider.service.SpiderService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;

@Service
public class SpiderServiceImpl implements SpiderService {
    private static final Logger logger = LoggerFactory.getLogger(SpiderServiceImpl.class);

    private static final String FILE_PATH = "/home/meme/";


    @Override
    public void getDownloadMeme(String url) throws IOException {

        String[] userAgent = {
                "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/14.0.835.163 Safari/535.1",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36",
                "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_0) AppleWebKit/535.11 (KHTML, like Gecko) Chrome/17.0.963.56 Safari/535.11",
                "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:6.0) Gecko/20100101 Firefox/6.0",
                "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.6; rv:2.0.1) Gecko/20100101 Firefox/4.0.1",
                "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_6_8; en-us) AppleWebKit/534.50 (KHTML, like Gecko) Version/5.1 Safari/534.50",
                "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-us) AppleWebKit/534.50 (KHTML, like Gecko) Version/5.1 Safari/534.50",
                "Opera/9.80 (Macintosh; Intel Mac OS X 10.6.8; U; en) Presto/2.8.131 Version/11.11",
                "Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko",
                "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; Trident/4.0; SE 2.X MetaSr 1.0; SE 2.X MetaSr 1.0; .NET CLR 2.0.50727; SE 2.X MetaSr 1.0)",
                "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; 360SE)"
        };
        String randomAgent = userAgent[threadSleep("1-11")];
        Document document = Jsoup.connect(url)
                .header("Accept", "*/*")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Accept-Language", "zh-CN,zh;q=0.9")
                .header("Content-Type", "application/json;charset=UTF-8")
                .header("Host", "222.223.235.164:8090")
                .header("User-Agent", randomAgent)
                .timeout(100000).get();

        Elements images = document.select("img[src]");
        for (Element image : images) {
            String href = image.attr("src");
            if (href.endsWith(".gif")) {
                //将表情包保存到本地
                try {
                    File dir = new File(FILE_PATH);
                    if (!dir.isDirectory()) {
                        dir.mkdirs();
                    }
                    String fileName = FILE_PATH + UUID.randomUUID().toString() + ".gif";
                    downloadFile(href, fileName);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


        }
    }


    /**
     * 睡眠n-m秒
     *
     * @param time 1-6
     */

    public int threadSleep(String time) {
        //1-6
        String[] split = time.split("-");

        int first = Integer.parseInt(split[0]);

        int second = Integer.parseInt(split[1]);

        try {

            int i = first + (int) (Math.random() * (second - first));
            Thread.sleep(i * 1000);
            return i;
        } catch (InterruptedException e) {

            e.printStackTrace();

        }
        return 0;
    }


    public static File downloadFile(String urlPath, String downloadDir) {
        File file = null;
        try {
            // 统一资源
            URL url = new URL(urlPath);
            // 连接类的父类，抽象类
            URLConnection urlConnection = url.openConnection();
            // http的连接类
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            //设置超时
            httpURLConnection.setConnectTimeout(1000 * 5);
            //设置请求方式，默认是GET
            httpURLConnection.setRequestMethod("GET");
            // 设置字符编码
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            // 打开到此 URL引用的资源的通信链接（如果尚未建立这样的连接）。
            httpURLConnection.connect();
            // 文件大小
            int fileLength = httpURLConnection.getContentLength();
            // 控制台打印文件大小
            logger.info("您要下载的文件大小为:" + fileLength / (1024 * 1024) + "MB");
            // 建立链接从请求中获取数据
            URLConnection con = url.openConnection();
            BufferedInputStream bin = new BufferedInputStream(httpURLConnection.getInputStream());
            // 指定存放位置(有需求可以自定义)
            file = new File(downloadDir);
            // 校验文件夹目录是否存在，不存在就创建一个目录
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            OutputStream out = new FileOutputStream(file);
            int size = 0;
            int len = 0;
            byte[] buf = new byte[2048];
            while ((size = bin.read(buf)) != -1) {
                len += size;
                out.write(buf, 0, size);
                // 控制台打印文件下载的百分比情况
                logger.info("下载了-------> " + len * 100 / fileLength);
            }
            // 关闭资源
            bin.close();
            out.close();
            logger.info("文件下载成功！");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            logger.info("文件下载失败！");
        } finally {
            return file;
        }

    }

}
