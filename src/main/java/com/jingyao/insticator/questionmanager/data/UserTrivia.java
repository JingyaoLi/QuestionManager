package com.jingyao.insticator.questionmanager.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;


@Entity
@IdClass(UserTriviaPK.class)
public class UserTrivia {

    @Id
    private int uuid;
    private int tid;
    private String utanswer;

    public UserTrivia(){}

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getUtanswer() {
        return utanswer;
    }

    public void setUtanswer(String utanswer) {
        this.utanswer = utanswer;
    }
}

