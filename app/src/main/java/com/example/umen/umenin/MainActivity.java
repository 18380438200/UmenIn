package com.example.umen.umenin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;
import com.umeng.message.UmengRegistrar;

public class MainActivity extends AppCompatActivity {
    private PushAgent mPushAgent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        umengPush(true);
    }

    /**
     * 友盟推送设置
     */
    private void umengPush(boolean isOpenPush) {
        //开启友盟推送服务
        mPushAgent = PushAgent.getInstance(this);
        if (isOpenPush) {
            mPushAgent.enable(new IUmengRegisterCallback() {
                @Override
                public void onRegistered(String s) {
                }
            });
        } else {
            mPushAgent.disable();
        }

        MyApp.DEVICE_TOKEN = UmengRegistrar.getRegistrationId(this);
    }
}
