package com.ander.blend.sqlTrain.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * student
 * @author 
 */
public class Student implements Serializable {
    private String snum;

    private String sname;

    private Date sage;

    private String ssex;

    private static final long serialVersionUID = 1L;

    public String getSnum() {
        return snum;
    }

    public void setSnum(String snum) {
        this.snum = snum;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getSage() {
        return sage;
    }

    public void setSage(Date sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Student other = (Student) that;
        return (this.getSnum() == null ? other.getSnum() == null : this.getSnum().equals(other.getSnum()))
            && (this.getSname() == null ? other.getSname() == null : this.getSname().equals(other.getSname()))
            && (this.getSage() == null ? other.getSage() == null : this.getSage().equals(other.getSage()))
            && (this.getSsex() == null ? other.getSsex() == null : this.getSsex().equals(other.getSsex()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSnum() == null) ? 0 : getSnum().hashCode());
        result = prime * result + ((getSname() == null) ? 0 : getSname().hashCode());
        result = prime * result + ((getSage() == null) ? 0 : getSage().hashCode());
        result = prime * result + ((getSsex() == null) ? 0 : getSsex().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", snum=").append(snum);
        sb.append(", sname=").append(sname);
        sb.append(", sage=").append(sage);
        sb.append(", ssex=").append(ssex);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}