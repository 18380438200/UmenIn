package com.example.umen.umenin;

import android.app.Application;
import com.umeng.analytics.MobclickAgent;

/**
 *
 * Application类
 */
public class MyApp extends Application {
    public static String DEVICE_TOKEN;

    @Override
    public void onCreate() {
        super.onCreate();

        init();
    }

    private void init() {

        //友盟统计功能开关
        MobclickAgent.setCatchUncaughtExceptions(true);

    }

}
