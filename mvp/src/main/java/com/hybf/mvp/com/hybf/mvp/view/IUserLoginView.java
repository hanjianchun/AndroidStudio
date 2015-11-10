package com.hybf.mvp.com.hybf.mvp.view;

import com.hybf.mvp.com.hybf.mvp.bean.Student;

/**
 * Created by Han on 2015/11/10.
 */
public interface IUserLoginView {
    String getStuName();

    String getPassword();

    void clearStuName();

    void clearPassword();

    void showLoading();

    void hidenLoading();

    void toMainActivity(Student stu);

    void showFaildError();

}
