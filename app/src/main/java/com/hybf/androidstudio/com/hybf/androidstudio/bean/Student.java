package com.hybf.androidstudio.com.hybf.androidstudio.bean;

import java.io.Serializable;

/**
 * Created by Han on 2015/11/6.
 */
public class Student implements Serializable{
    private String state;
    private String code;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Student(String state, String code) {
        this.state = state;
        this.code = code;
    }
}
