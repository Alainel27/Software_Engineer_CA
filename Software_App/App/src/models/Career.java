package models;

import java.util.Objects;

public class Career {

    private String name;

    private String location;

    private boolean internship;

    private boolean part_time;

    private int hourly_rate;

    private String desc;

    public Career(String name,String location, boolean internship, boolean part_time, int hourly_rate, String desc) {
        setName(name);
        setLocation(location);
        setInternship(internship);
        setPart_time(part_time);
        setHourly_rate(hourly_rate);
        setDesc(desc);
    }

    public String getName() {
        return name;
    }

    public String getLocation(){
        return location;
    }

    public boolean isInternship() {
        return internship;
    }

    public boolean isPart_time() {
        return part_time;
    }

    public int getHourly_rate() {
        return hourly_rate;
    }

    public String getDesc() {
        return desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setInternship(boolean internship) {
        this.internship = internship;
    }

    public void setPart_time(boolean part_time) {
        this.part_time = part_time;
    }

    public void setHourly_rate(int hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Career career = (Career) o;
        return internship == career.internship && part_time == career.part_time && hourly_rate == career.hourly_rate && Objects.equals(name, career.name) && Objects.equals(desc, career.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, internship, part_time, hourly_rate, desc);
    }

    @Override
    public String toString() {
        return  "Name: '" + name + '\'' +
                ", Internship: " + internship +
                ", Part-time: " + part_time +
                ", Hourly Rate: " + hourly_rate +
                ", Description: '" + desc + '\'';
    }
}
