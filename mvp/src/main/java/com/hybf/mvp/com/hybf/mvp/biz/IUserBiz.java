package com.hybf.mvp.com.hybf.mvp.biz;

/**
 * Created by Han on 2015/11/10.
 */
public interface IUserBiz {
    public void login(String stuName,String password,OnLoginListener loginListener);
}
