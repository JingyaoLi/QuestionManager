package com.jingyao.insticator.questionmanager.view;

import java.util.List;

public class TriviaView {

    private int tid;
    private String tquestion;
    private List<String> tchoices; //Actually List<String>

    public TriviaView(){}

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

    public List<String> getTchoices() {
        return tchoices;
    }

    public void setTchoices(List<String> tchoices) {
        this.tchoices = tchoices;
    }
}
