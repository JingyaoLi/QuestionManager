package com.jingyao.insticator.questionmanager.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(UserPollPK.class)
public class UserPoll {

    @Id
    private int uuid;
    private int pid;
    private String upanswer;

    public UserPoll(){}

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getUpanswer() {
        return upanswer;
    }

    public void setUpanswer(String upanswer) {
        this.upanswer = upanswer;
    }
}
