package model;


import java.util.Date;
import java.util.StringJoiner;

public class InterestingMoment {
    private String type;
    private Date time;

    public InterestingMoment(String type, Date time) {
        this.type = type;
        this.time = time;
    }

    public InterestingMoment() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", InterestingMoment.class.getSimpleName() + "[", "]")
                .add("type='" + type + "'")
                .add("time=" + time)
                .toString();
    }
}
