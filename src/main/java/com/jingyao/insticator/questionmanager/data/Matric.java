package com.jingyao.insticator.questionmanager.data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Matric {
    @Id
    private int mid;
    private String mquestion;
    private String moptions;//Actually List<Options>

    public Matric(){}

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

    public String getMoptions() {
        return moptions;
    }

    public void setMoptions(String moptions) {
        this.moptions = moptions;
    }
}
