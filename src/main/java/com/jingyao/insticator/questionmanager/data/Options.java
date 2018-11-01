package com.jingyao.insticator.questionmanager.data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Options {

    @Id
    private int oid;
    private String oname;
    private String ochoices;//Actually List<String>

    public Options(){}

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public String getOchoices() {
        return ochoices;
    }

    public void setOchoices(String ochoices) {
        this.ochoices = ochoices;
    }
}
