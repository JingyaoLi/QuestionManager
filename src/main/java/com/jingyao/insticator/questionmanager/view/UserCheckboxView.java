package com.jingyao.insticator.questionmanager.view;

import java.util.List;

public class UserCheckboxView {

    private int uuid;
    private int cid;
    private List<String> ucanswer;

    public UserCheckboxView(){}

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public List<String> getUcanswer() {
        return ucanswer;
    }

    public void setUcanswer(List<String> ucanswer) {
        this.ucanswer = ucanswer;
    }
}
