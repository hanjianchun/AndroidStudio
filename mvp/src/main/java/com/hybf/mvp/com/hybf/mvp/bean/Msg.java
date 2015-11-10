package com.hybf.mvp.com.hybf.mvp.bean;

/**
 * Created by Han on 2015/11/10.
 */
public class Msg {
    public static final int TYPE_RECEIVE = 0;
    public static final int TYPE_SEND = 1;
    private int type;
    private String content;

    public int getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public Msg(int type, String content) {
        this.type = type;
        this.content = content;
    }
}
