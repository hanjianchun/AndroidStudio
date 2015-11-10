package com.hybf.mvp.com.hybf.mvp.presenter;

import android.os.Handler;

import com.hybf.mvp.com.hybf.mvp.bean.Student;
import com.hybf.mvp.com.hybf.mvp.biz.IUserBiz;
import com.hybf.mvp.com.hybf.mvp.biz.OnLoginListener;
import com.hybf.mvp.com.hybf.mvp.biz.impl.UserBizImpl;
import com.hybf.mvp.com.hybf.mvp.view.IUserLoginView;


/**
 * Created by Han on 2015/11/10.
 */
public class UserLoginPresenter {
    private IUserBiz userBiz;
    private IUserLoginView userLoginView;
    private Handler mHandler = new Handler();

    public UserLoginPresenter(IUserLoginView userLoginView){
        this.userLoginView = userLoginView;
        this.userBiz = new UserBizImpl();
    }

    public void login(){
        userBiz.login(userLoginView.getStuName(), userLoginView.getPassword(), new OnLoginListener() {
            @Override
            public void loginSuccess(final Student stu) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.toMainActivity(stu);
                    }
                });
            }

            @Override
            public void loginFailed() {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.showFaildError();
                    }
                });
            }
        });
    }

    public void clear(){
        userLoginView.clearPassword();
        userLoginView.clearStuName();
    }
}
