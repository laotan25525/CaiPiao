package com.caipiao.quantanliu.caipiao;

import android.app.Application;

import com.blankj.utilcode.utils.Utils;
import com.caipiao.quantanliu.caipiao.crawler.bean.DaoMaster;
import com.caipiao.quantanliu.caipiao.crawler.bean.DaoSession;


/**
 * Created by codeest on 2016/8/2.
 */
public class App extends Application{

    //现在只完成了dagger2和Retrofit配合完成网络请求
    private static App instance;
    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Utils.init(this);//一个utils库的初始化 https://github.com/Blankj/AndroidUtilCode/blob/master/README-CN.md
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(getApplicationContext(), "douyudanmu.db", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        daoSession = daoMaster.newSession();

    }
    public DaoSession getDaoSession() {
        return daoSession;
    }


    public static App getApp(){
        return instance;
    }

}
