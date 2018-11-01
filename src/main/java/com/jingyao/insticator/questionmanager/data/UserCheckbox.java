package com.jingyao.insticator.questionmanager.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(UserCheckboxPK.class)
public class UserCheckbox {

    @Id
    private int uuid;
    private int cid;
    private String ucanswer; //Actually List<String>

    public UserCheckbox(){}

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

    public String getUcanswer() {
        return ucanswer;
    }

    public void setUcanswer(String ucanswer) {
        this.ucanswer = ucanswer;
    }
}
