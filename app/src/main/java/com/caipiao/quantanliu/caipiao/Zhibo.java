package com.caipiao.quantanliu.caipiao;


import com.caipiao.quantanliu.caipiao.crawler.bean.Danmaku;

import java.util.ArrayList;

/**
 * Created by quantan.liu on 2018/1/28 0028 23:37.
 */

public class Zhibo {

    public ArrayList<Danmaku> currentDanmaKuList = new ArrayList<>();

    public ArrayList<Danmaku> zhongJiangDanmaKuList = new ArrayList<>();

    private void Zhibo() {
    }

    public static Zhibo getInstance() {
        return ZhiboInstance.mZhibo;
    }

    private static class ZhiboInstance {
        public static final Zhibo mZhibo = new Zhibo();
    }
}
