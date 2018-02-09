package com.caipiao.quantanliu.caipiao.crawler.thread;


import com.caipiao.quantanliu.caipiao.crawler.bean.Request;
import com.caipiao.quantanliu.caipiao.crawler.handler.MessageHandler;
import com.caipiao.quantanliu.caipiao.crawler.util.LogUtil;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by Brucezz on 2016/01/04.
 * DouyuCrawler
 */
public class KeepLiveThread implements Runnable {
    private Socket s;

    public KeepLiveThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {

        LogUtil.i("KeepLive", "心跳包线程启动 ...");

        while (s != null && s.isConnected()) {
            try {
                Thread.sleep(40000);
                MessageHandler.send(s, Request.keepLive((int) (System.currentTimeMillis() / 1000)));
                LogUtil.d("KeepLive", "Keep Live ...");
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}