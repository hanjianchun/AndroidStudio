package com.hybf.mvp.com.hybf.mvp.biz.impl;

import com.hybf.mvp.com.hybf.mvp.bean.Student;
import com.hybf.mvp.com.hybf.mvp.biz.IUserBiz;
import com.hybf.mvp.com.hybf.mvp.biz.OnLoginListener;
import com.hybf.mvp.com.hybf.mvp.utils.HttpUtils;

/**
 * Created by Han on 2015/11/10.
 */
public class UserBizImpl implements IUserBiz {

    @Override
    public void login(final String stuName, final String password, final OnLoginListener loginListener) {
        HttpUtils.doPostAsyn("", null, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {
                if ("hjc".equals(stuName) && "123".equals(password)){
                    Student stu = new Student();
                    stu.setPassword(password);
                    stu.setStuName(stuName);
                    loginListener.loginSuccess(stu);
                }else{
                    loginListener.loginFailed();
                }
            }
        });
    }
}
