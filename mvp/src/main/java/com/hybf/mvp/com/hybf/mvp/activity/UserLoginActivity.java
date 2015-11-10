package com.hybf.mvp.com.hybf.mvp.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hybf.mvp.MainActivity;
import com.hybf.mvp.R;
import com.hybf.mvp.com.hybf.mvp.bean.Student;
import com.hybf.mvp.com.hybf.mvp.presenter.UserLoginPresenter;
import com.hybf.mvp.com.hybf.mvp.view.IUserLoginView;

/**
 * Created by Han on 2015/11/10.
 */
public class UserLoginActivity extends Activity implements IUserLoginView {

    private EditText et_username,et_password;

    private Button btn_login;

    private UserLoginPresenter mUserLoginPresenter = new UserLoginPresenter(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        initViews();

    }

    /**
     * 启动UserLoginActivity
     * @param context
     * @param data1
     * @param data2
     */
    public static void actionStart(Context context,String data1,String data2){
        Intent intent = new Intent(context,UserLoginActivity.class);
        intent.putExtra("params1",data1);
        intent.putExtra("params2",data2);
        context.startActivity(intent);
    }

    private void initViews() {
        et_password = (EditText) findViewById(R.id.et_password);
        et_username = (EditText) findViewById(R.id.et_username);
        btn_login = (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mUserLoginPresenter.login();
            }
        });

    }

    @Override
    public String getStuName() {
        return et_username.getText().toString();
    }

    @Override
    public String getPassword() {
        return et_password.getText().toString();
    }

    @Override
    public void clearStuName() {

    }

    @Override
    public void clearPassword() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hidenLoading() {

    }

    @Override
    public void toMainActivity(Student stu) {

        Toast.makeText(this,"yes",Toast.LENGTH_LONG).show();
    }

    @Override
    public void showFaildError() {
        Toast.makeText(this,"errror",Toast.LENGTH_LONG).show();
        ProgressDialog progressDialog = new ProgressDialog
                (UserLoginActivity.this);
//        progressDialog.setTitle("This is ProgressDialog");
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(true);
        progressDialog.show();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("result_data","hjc");
        setResult(RESULT_OK,intent);
        finish();
    }
}
