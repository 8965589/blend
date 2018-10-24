package com.ander.blend.sqlTrain.domain;

import java.io.Serializable;

/**
 * course
 * @author 
 */
public class Course implements Serializable {
    // --C# --课程编号,Cname 课程名称,T# 教师编号
    private String cnum;

    private String cname;

    private String tnum;

    private static final long serialVersionUID = 1L;

    public String getCnum() {
        return cnum;
    }

    public void setCnum(String cnum) {
        this.cnum = cnum;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTnum() {
        return tnum;
    }

    public void setTnum(String tnum) {
        this.tnum = tnum;
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
        Course other = (Course) that;
        return (this.getCnum() == null ? other.getCnum() == null : this.getCnum().equals(other.getCnum()))
            && (this.getCname() == null ? other.getCname() == null : this.getCname().equals(other.getCname()))
            && (this.getTnum() == null ? other.getTnum() == null : this.getTnum().equals(other.getTnum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCnum() == null) ? 0 : getCnum().hashCode());
        result = prime * result + ((getCname() == null) ? 0 : getCname().hashCode());
        result = prime * result + ((getTnum() == null) ? 0 : getTnum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cnum=").append(cnum);
        sb.append(", cname=").append(cname);
        sb.append(", tnum=").append(tnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}