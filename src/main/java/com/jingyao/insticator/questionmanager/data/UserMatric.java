package com.jingyao.insticator.questionmanager.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(UserMatricPK.class)
public class UserMatric {

    @Id
    private int uuid;
    private int mid;
    private String umanswer; //Actually List<String>

    public UserMatric() {}

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

    public String getUmanswer() {
        return umanswer;
    }

    public void setUmanswer(String umanswer) {
        this.umanswer = umanswer;
    }
}
