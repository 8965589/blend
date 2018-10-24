package com.ander.blend.domain;

import java.io.Serializable;

/**
 * job_grades
 * @author 
 */
public class JobGrades implements Serializable {
    private String gradeLevel;

    private Integer lowestSal;

    private Integer highestSal;

    private static final long serialVersionUID = 1L;

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Integer getLowestSal() {
        return lowestSal;
    }

    public void setLowestSal(Integer lowestSal) {
        this.lowestSal = lowestSal;
    }

    public Integer getHighestSal() {
        return highestSal;
    }

    public void setHighestSal(Integer highestSal) {
        this.highestSal = highestSal;
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
        JobGrades other = (JobGrades) that;
        return (this.getGradeLevel() == null ? other.getGradeLevel() == null : this.getGradeLevel().equals(other.getGradeLevel()))
            && (this.getLowestSal() == null ? other.getLowestSal() == null : this.getLowestSal().equals(other.getLowestSal()))
            && (this.getHighestSal() == null ? other.getHighestSal() == null : this.getHighestSal().equals(other.getHighestSal()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGradeLevel() == null) ? 0 : getGradeLevel().hashCode());
        result = prime * result + ((getLowestSal() == null) ? 0 : getLowestSal().hashCode());
        result = prime * result + ((getHighestSal() == null) ? 0 : getHighestSal().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gradeLevel=").append(gradeLevel);
        sb.append(", lowestSal=").append(lowestSal);
        sb.append(", highestSal=").append(highestSal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}