package com.caipiao.quantanliu.caipiao;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.caipiao.quantanliu.caipiao.crawler.bean.Danmaku;
import com.caipiao.quantanliu.caipiao.crawler.bean.DanmakuDao;
import com.caipiao.quantanliu.caipiao.crawler.config.Config;
import com.caipiao.quantanliu.caipiao.crawler.thread.CrawlerThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by quantan.liu on 2018/1/27 0027 21:54.
 */

public class ShuangSeQiuCaiPiaoActivity extends Activity {

    int handlerTime;
    int fristNum;
    int secondNum;
    int thirdNum;
    int fourthNum;
    int fifthNum;
    int sixthNum;
    int seventhNum;
    private ArrayList<Integer> zhongjiangArrayList = new ArrayList();
    private ArrayList<Danmaku> currentDanmaKuList = new ArrayList();
    private ArrayList<Danmaku> zhongjJiangDanmaKuList = new ArrayList();

    @BindView(R.id.tv_cai_piao_shuang_se_qiu_1)
    TextView tv_cai_piao_shuang_se_qiu_1;
    @BindView(R.id.tv_cai_piao_shuang_se_qiu_2)
    TextView tv_cai_piao_shuang_se_qiu_2;
    @BindView(R.id.tv_cai_piao_shuang_se_qiu_3)
    TextView tv_cai_piao_shuang_se_qiu_3;
    @BindView(R.id.tv_cai_piao_shuang_se_qiu_4)
    TextView tv_cai_piao_shuang_se_qiu_4;
    @BindView(R.id.tv_cai_piao_shuang_se_qiu_5)
    TextView tv_cai_piao_shuang_se_qiu_5;
    @BindView(R.id.tv_cai_piao_shuang_se_qiu_6)
    TextView tv_cai_piao_shuang_se_qiu_6;
    @BindView(R.id.tv_cai_piao_shuang_se_qiu_7)
    TextView tv_cai_piao_shuang_se_qiu_7;
    private DanmakuDao danmakuDao;

    @OnClick({R.id.tv_cai_piao_shuang_se_qiu_1, R.id.tv_cai_piao_shuang_se_qiu_2, R.id.tv_cai_piao_shuang_se_qiu_3, R.id.tv_cai_piao_shuang_se_qiu_4, R.id.tv_cai_piao_shuang_se_qiu_5, R.id.tv_cai_piao_shuang_se_qiu_6, R.id.tv_cai_piao_shuang_se_qiu_7})
    public void caiPiao(View view) {
        handlerTime = 0;
        switch (view.getId()) {
            case R.id.tv_cai_piao_shuang_se_qiu_1:
                handler.sendEmptyMessageDelayed(1, handlerTime);
                break;
            case R.id.tv_cai_piao_shuang_se_qiu_2:
                handler.sendEmptyMessageDelayed(2, handlerTime);

                break;
            case R.id.tv_cai_piao_shuang_se_qiu_3:
                handler.sendEmptyMessageDelayed(3, handlerTime);

                break;
            case R.id.tv_cai_piao_shuang_se_qiu_4:
                handler.sendEmptyMessageDelayed(4, handlerTime);

                break;
            case R.id.tv_cai_piao_shuang_se_qiu_5:
                handler.sendEmptyMessageDelayed(5, handlerTime);

                break;
            case R.id.tv_cai_piao_shuang_se_qiu_6:
                handler.sendEmptyMessageDelayed(6, handlerTime);

                break;
            case R.id.tv_cai_piao_shuang_se_qiu_7:
                handler.sendEmptyMessageDelayed(7, handlerTime);

                break;
        }
    }

    @OnClick(R.id.tv_zhuaDanMuStart)
    public void zhuaDanMuStart(View view) {
        Zhibo.getInstance().currentDanmaKuList.clear();
        currentDanmaKuList.clear();
        List<Danmaku> list = danmakuDao.queryBuilder().list();
        System.out.println(list);
    }
    @OnClick(R.id.tv_zhuaDanMuEnd)
    public void zhuaDanMuEnd(View view) {
        System.out.println("Zhibo.getInstance().currentDanmaKuList"+ Zhibo.getInstance().currentDanmaKuList);
        currentDanmaKuList.addAll(Zhibo.getInstance().currentDanmaKuList);
        System.out.println("Zhibo.getInstance().currentDanmaKuListCaipiao"+ currentDanmaKuList);
    }

        Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                handlerTime += 8;
                switch (msg.what) {
                    case 1:
                        fristNum = getAnInt();
                        zhongjianNumber(fristNum, tv_cai_piao_shuang_se_qiu_1, 1);
                        break;
                    case 2:
                        secondNum = getAnInt();
                        zhongjianNumber(secondNum, tv_cai_piao_shuang_se_qiu_2, 2);
                        break;
                    case 3:
                        thirdNum = getAnInt();
                        zhongjianNumber(thirdNum, tv_cai_piao_shuang_se_qiu_3, 3);
                        break;
                    case 4:
                        fourthNum = getAnInt();
                        zhongjianNumber(fourthNum, tv_cai_piao_shuang_se_qiu_4, 4);
                        break;
                    case 5:
                        fifthNum = getAnInt();
                        zhongjianNumber(fifthNum, tv_cai_piao_shuang_se_qiu_5, 5);
                        break;
                    case 6:
                        sixthNum = getAnInt();
                        zhongjianNumber(sixthNum, tv_cai_piao_shuang_se_qiu_6, 6);
                        break;

                    case 7:
                        if (handlerTime >= 300) {
                            tv_cai_piao_shuang_se_qiu_7.setText(getAnInt16() + "");
                            handlerTime = 0;
                        } else {
                            tv_cai_piao_shuang_se_qiu_7.setText(getAnInt16() + "");
                            handler.sendEmptyMessageDelayed(7, handlerTime);
                        }
                        break;
                }

            }
        };

    private void zhongjianNumber(int number, TextView textView, int what) {
        if (handlerTime >= 300 && !zhongjiangArrayList.contains(number)) {
            zhongjiangArrayList.add(number);
            textView.setText(number + "");
            handlerTime = 0;
        } else {
            textView.setText(number + "");
            handler.sendEmptyMessageDelayed(what, handlerTime);
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //无title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_shuang_se_qiu_cai_piao);
        ButterKnife.bind(this);
        main();
        danmakuDao = App.getApp().getDaoSession().getDanmakuDao();

    }

    private int getAnInt() {
        Random random = new Random();
        return random.nextInt(37);
    }

    private int getAnInt16() {
        Random random = new Random();
        return 1 + random.nextInt(16);
    }

    public void main() {
        if (!Config.loadSuccess) return;

        Set<String> nameSet = Config.ROOM_MAP.keySet();

        for (String name : nameSet) {
            new Thread(new CrawlerThread(name, Config.ROOM_MAP.get(name)), "Crawler-" + name).start();
        }
    }
}
