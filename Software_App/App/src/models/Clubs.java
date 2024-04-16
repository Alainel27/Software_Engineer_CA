package models;

import java.util.Objects;

public class Clubs {

    private String name;
    private int cost;
    private String desc;

    public Clubs(String name, int cost, String desc) {
        this.name = name;
        this.cost = cost;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getDesc() {
        return desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clubs clubs = (Clubs) o;
        return cost == clubs.cost && Objects.equals(name, clubs.name) && Objects.equals(desc, clubs.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, desc);
    }

    @Override
    public String toString() {
        return  "Name: '" + name + '\'' +
                ", Cost: " + cost +
                ", Desc: '" + desc + '\'';
    }
}
