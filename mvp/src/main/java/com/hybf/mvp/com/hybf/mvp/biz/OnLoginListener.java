package com.hybf.mvp.com.hybf.mvp.biz;

import com.hybf.mvp.com.hybf.mvp.bean.Student;

/**
 * Created by Han on 2015/11/10.
 */
public interface OnLoginListener {
    void loginSuccess(Student stu);
    void loginFailed();
}
