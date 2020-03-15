package com.pancts.tpush;

//import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
//import android.util.Log;
import android.widget.EditText;

import com.pancts.ypush.SelectManufacturer;

//import com.umeng.commonsdk.UMConfigure;
//import com.umeng.message.IUmengRegisterCallback;
//import com.umeng.message.PushAgent;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getName();
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.editText);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                if (!App.dt.isEmpty()) {
//                    editText.setText(App.dt);
//                }
//            }
//        }, 2000);


        try {
            SelectManufacturer.init();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
