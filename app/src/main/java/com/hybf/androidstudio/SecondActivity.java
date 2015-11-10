package com.hybf.androidstudio;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.hybf.androidstudio.com.hybf.androidstudio.bean.Student;
import com.hybf.androidstudio.com.hybf.androidstudio.bean.okhttp.OkHttpClientManager;
import com.hybf.androidstudio.com.hybf.androidstudio.bean.okhttp.callback.ResultCallback;
import com.hybf.androidstudio.com.hybf.androidstudio.bean.okhttp.request.OkHttpRequest;
import com.squareup.okhttp.Request;

import java.util.HashMap;
import java.util.Map;

/**
 * 跳转到第二个Activity
 * Created by Han on 2015/11/9.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loadDatas();
    }

    /**
     * 加载数据
     */
    private void loadDatas() {

    }


}
