package models;

import Utils.Utils;

import java.util.Objects;

public class Clubs {

    private String name = "Club Name Error";
    private int cost = 10;
    private String desc = "Clubs Description";

    public Clubs(String name, int cost, String desc) {
        setName(name);
        setCost(cost);
        setDesc(desc);
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
        if (Utils.validStringLength(name, 35)) {
            this.name = name;
        }
    }

    public void setCost(int cost) {
        if((cost >= 5) && (cost <= 25)){
            this.cost = cost;
        }
    }

    public void setDesc(String desc) {
        if (Utils.validStringLength(desc, 35)) {
            this.desc = desc;
        }
    }

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
