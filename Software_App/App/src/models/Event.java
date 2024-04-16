package models;

import Utils.Utils;

import java.util.Objects;

public class Event {

    private String name = "Event Name Error";

    private String date = "00/00/00";

    private String time = "00.00";

    private String desc = "Event Description";

    public Event(String name, String date, String time, String desc) {
        setName(name);
        setDate(date);
        setTime(time);
        setDesc(desc);
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
        if(Utils.validStringLength(name,35)) {
            this.name = name;
        }
    }

    public void setDate(String date) {
        if(Utils.validStringLength(date,8)) {
            this.date = date;
        }
    }

    public void setTime(String time) {
        if(Utils.validStringLength(time,5)) {
            this.time = time;
        }
    }

    public void setDesc(String desc) {
        if(Utils.validStringLength(desc,55)) {
            this.desc = desc;
        }
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
