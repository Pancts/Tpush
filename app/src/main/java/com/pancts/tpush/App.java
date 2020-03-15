package com.pancts.tpush;

import android.app.Application;
//import android.util.Log;

//import com.umeng.commonsdk.UMConfigure;
//import com.umeng.message.IUmengRegisterCallback;
//import com.umeng.message.PushAgent;

public class App extends Application {
    private static final String TAG = App.class.getName();
    public static String dt = null;
    @Override
    public void onCreate() {
        super.onCreate();

//        UMConfigure.setLogEnabled(true);
//        UMConfigure.init(this,
//                "5e6ddd410cafb220e200000c",
//                "Umeng",
//                UMConfigure.DEVICE_TYPE_PHONE,
//                "e20c756f33d01aa5d8fcadfd030caf32");
//
//
//        PushAgent mPushAgent = PushAgent.getInstance(this);
//        //注册推送服务，每次调用register方法都会回调该接口
//        mPushAgent.register(new IUmengRegisterCallback() {
//            @Override
//            public void onSuccess(final String deviceToken) {
//                //注册成功会返回deviceToken deviceToken是推送消息的唯一标志
//                dt = deviceToken;
//                Log.i(TAG,"注册成功：deviceToken：-------->  " + deviceToken);
//            }
//            @Override
//            public void onFailure(String s, String s1) {
//                Log.e(TAG,"注册失败：-------->  " + "s:" + s + ",s1:" + s1);
//            }
//        });
    }
}
