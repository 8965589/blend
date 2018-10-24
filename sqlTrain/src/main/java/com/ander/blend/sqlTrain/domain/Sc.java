package com.ander.blend.sqlTrain.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * sc
 * @author 
 */
public class Sc implements Serializable {
    //SC(S#,C#,score) --S# 学生编号,C# 课程编号,score 分数
    private String snum;

    private String cnum;

    private BigDecimal score;

    private static final long serialVersionUID = 1L;

    public String getSnum() {
        return snum;
    }

    public void setSnum(String snum) {
        this.snum = snum;
    }

    public String getCnum() {
        return cnum;
    }

    public void setCnum(String cnum) {
        this.cnum = cnum;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
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
        Sc other = (Sc) that;
        return (this.getSnum() == null ? other.getSnum() == null : this.getSnum().equals(other.getSnum()))
            && (this.getCnum() == null ? other.getCnum() == null : this.getCnum().equals(other.getCnum()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSnum() == null) ? 0 : getSnum().hashCode());
        result = prime * result + ((getCnum() == null) ? 0 : getCnum().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", snum=").append(snum);
        sb.append(", cnum=").append(cnum);
        sb.append(", score=").append(score);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}