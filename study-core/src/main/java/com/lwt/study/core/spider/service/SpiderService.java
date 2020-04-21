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

}
