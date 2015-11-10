package com.hybf.androidstudio;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hybf.androidstudio.com.hybf.androidstudio.bean.Student;

import java.util.List;

/**
 * MainActivity主入口函数
 */
public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TextView t = (TextView) findViewById(R.id.text);

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你好",Toast.LENGTH_SHORT).show();
                loadData();
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
    }

    /**
     * TODO 加载数据，并打印日志
     */
    private void loadData(){
        String str = "[{\"code\":\"000001\",\"state\":\"1\"},{\"code\":\"000002\",\"state\":\"1\"},{\"code\":\"000003\",\"state\":\"1\"},{\"code\":\"000004\",\"state\":\"1\"},{\"code\":\"000005\",\"state\":\"1\"},{\"code\":\"000006\",\"state\":\"1\"},{\"code\":\"000007\",\"state\":\"1\"},{\"code\":\"000008\",\"state\":\"1\"},{\"code\":\"000009\",\"state\":\"1\"},{\"code\":\"000010\",\"state\":\"1\"},{\"code\":\"000011\",\"state\":\"1\"},{\"code\":\"000012\",\"state\":\"1\"},{\"code\":\"000013\",\"state\":\"0\"},{\"code\":\"000014\",\"state\":\"1\"},{\"code\":\"000015\",\"state\":\"1\"},{\"code\":\"000016\",\"state\":\"1\"},{\"code\":\"000017\",\"state\":\"1\"},{\"code\":\"000018\",\"state\":\"1\"},{\"code\":\"000019\",\"state\":\"1\"},{\"code\":\"000020\",\"state\":\"1\"},{\"code\":\"000021\",\"state\":\"1\"},{\"code\":\"000022\",\"state\":\"1\"},{\"code\":\"000023\",\"state\":\"1\"},{\"code\":\"000024\",\"state\":\"1\"},{\"code\":\"000025\",\"state\":\"1\"},{\"code\":\"000026\",\"state\":\"1\"},{\"code\":\"000027\",\"state\":\"1\"},{\"code\":\"000028\",\"state\":\"1\"},{\"code\":\"000029\",\"state\":\"0\"},{\"code\":\"000030\",\"state\":\"0\"},{\"code\":\"000031\",\"state\":\"0\"},{\"code\":\"000032\",\"state\":\"0\"},{\"code\":\"000033\",\"state\":\"0\"},{\"code\":\"000034\",\"state\":\"0\"},{\"code\":\"000035\",\"state\":\"1\"},{\"code\":\"000036\",\"state\":\"0\"},{\"code\":\"000037\",\"state\":\"0\"},{\"code\":\"000038\",\"state\":\"1\"},{\"code\":\"000039\",\"state\":\"0\"},{\"code\":\"000040\",\"state\":\"1\"},{\"code\":\"000041\",\"state\":\"0\"},{\"code\":\"000042\",\"state\":\"0\"},{\"code\":\"000043\",\"state\":\"0\"},{\"code\":\"000044\",\"state\":\"0\"},{\"code\":\"000045\",\"state\":\"0\"},{\"code\":\"000046\",\"state\":\"0\"},{\"code\":\"000047\",\"state\":\"0\"},{\"code\":\"000048\",\"state\":\"0\"},{\"code\":\"000049\",\"state\":\"1\"},{\"code\":\"000050\",\"state\":\"0\"},{\"code\":\"000051\",\"state\":\"0\"},{\"code\":\"000052\",\"state\":\"0\"},{\"code\":\"000053\",\"state\":\"0\"}]";

        Gson g = new Gson();

        List<Student> listStu;
        listStu = g.fromJson(str,new TypeToken<List<Student>>(){}.getType());
        Log.v(TAG,"START================");
        for (Student s : listStu){
            Log.v(TAG,s.getCode());
        }
        Log.v(TAG,"END================");
    }
}
