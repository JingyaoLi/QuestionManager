package com.jingyao.insticator.questionmanager.data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.List;

@Entity
public class CheckBox {
    @Id
    private int cid;
    private String cquestion;
    private String cchoices; //Actually List<String>

    public CheckBox() {}

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCquestion() {
        return cquestion;
    }

    public void setCquestion(String cquestion) {
        this.cquestion = cquestion;
    }

    public String getCchoices() {
        return cchoices;
    }

    public void setCchoices(String cchoices) {
        this.cchoices = cchoices;
    }
}
