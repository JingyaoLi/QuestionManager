package com.jingyao.insticator.questionmanager.view;

import com.jingyao.insticator.questionmanager.data.Options;

import java.util.List;

public class MatricView {

    private int mid;
    private String mquestion;
    private List<Options> moptions;//Actually List<Integer> to store the id of options

    public MatricView(){}

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMquestion() {
        return mquestion;
    }

    public void setMquestion(String mquestion) {
        this.mquestion = mquestion;
    }

    public List<Options> getMoptions() {
        return moptions;
    }

    public void setMoptions(List<Options> moptions) {
        this.moptions = moptions;
    }


}
