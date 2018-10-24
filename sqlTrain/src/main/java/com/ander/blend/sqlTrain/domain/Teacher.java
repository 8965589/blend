package com.ander.blend.sqlTrain.domain;

import java.io.Serializable;

/**
 * teacher
 * @author 
 */
public class Teacher implements Serializable {
    private String tnum;

    private String tname;

    private static final long serialVersionUID = 1L;

    public String getTnum() {
        return tnum;
    }

    public void setTnum(String tnum) {
        this.tnum = tnum;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
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
        Teacher other = (Teacher) that;
        return (this.getTnum() == null ? other.getTnum() == null : this.getTnum().equals(other.getTnum()))
            && (this.getTname() == null ? other.getTname() == null : this.getTname().equals(other.getTname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTnum() == null) ? 0 : getTnum().hashCode());
        result = prime * result + ((getTname() == null) ? 0 : getTname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tnum=").append(tnum);
        sb.append(", tname=").append(tname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}