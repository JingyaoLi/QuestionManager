package com.jingyao.insticator.questionmanager.data;



//A trivia is a question have two to four options with one of them is the correct answer.
//        e.g. Which team won the 2017 super bowl?
//        - Falcons
//        - Patriots

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Trivia {
    @Id
    private int tid;
    private String tquestion;
    private String tanswer;
    private String tchoices; //Actually List<String>

    public Trivia(){}

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTquestion() {
        return tquestion;
    }

    public void setTquestion(String tquestion) {
        this.tquestion = tquestion;
    }

    public String getTanswer() {
        return tanswer;
    }

    public void setTanswer(String tanswer) {
        this.tanswer = tanswer;
    }

    public String getTchoices() {
        return tchoices;
    }

    public void setTchoices(String tchoices) {
        this.tchoices = tchoices;
    }
}
