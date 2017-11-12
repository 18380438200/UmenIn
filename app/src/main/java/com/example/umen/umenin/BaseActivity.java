package com.example.umen.umenin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.umeng.analytics.MobclickAgent;
import com.umeng.message.PushAgent;

/**
 *
 * Activity基类
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //统计应用启动数据
        PushAgent.getInstance(this).onAppStart();
    }

    //友盟session的统计
    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }

}
