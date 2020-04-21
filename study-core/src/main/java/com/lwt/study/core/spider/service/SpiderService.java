package com.lwt.study.core.spider.service;

import java.io.IOException;

/**
 * java爬虫
 */
public interface SpiderService {
    /**
     * 爬取表情包:http://www.bbsnet.com
     *
     * @param url
     */
    void getDownloadMeme(String url) throws IOException;

    /**
     * 爬取搞笑视频
     * @param url
     */
    void downloadfunnyVideo(String url) throws IOException;

    /**
     * 获取电影天堂电影下载链接
     * @param url
     */
    void downloadDyttVideo(String url) throws IOException;
}
