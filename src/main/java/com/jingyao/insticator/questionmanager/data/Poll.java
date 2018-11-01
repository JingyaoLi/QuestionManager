package com.jingyao.insticator.questionmanager.data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Poll {
    @Id
    private int pid;
    private String pquestion;
    private String pchoices; //Actually List<String>

    public Poll(){}

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPquestion() {
        return pquestion;
    }

    public void setPquestion(String pquestion) {
        this.pquestion = pquestion;
    }

    public String getPchoices() {
        return pchoices;
    }

    public void setPchoices(String pchoices) {
        this.pchoices = pchoices;
    }
}
