package com.jingyao.insticator.questionmanager.view;

import com.jingyao.insticator.questionmanager.data.Options;

import java.util.List;

public class UserMatricView {

    private int uuid;
    private int mid;
    private List<String> umanswer;

    public UserMatricView() {}

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public List<String> getUmanswer() {
        return umanswer;
    }

    public void setUmanswer(List<String> umanswer) {
        this.umanswer = umanswer;
    }
}
