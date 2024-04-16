package models;

import java.util.Objects;

public class Event {

    private String name;

    private String date;

    private String time;

    private String desc;

    public Event(String name, String date, String time, String desc) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDesc() {
        return desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(name, event.name) && Objects.equals(date, event.date) && Objects.equals(time, event.time) && Objects.equals(desc, event.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, time, desc);
    }

    @Override
    public String toString() {
        return  "Name='" + name + '\'' +
                ", Date='" + date + '\'' +
                ", Time='" + time + '\'' +
                ", Desc: '" + desc + '\'';
    }
}
