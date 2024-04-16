package models;

import java.util.Objects;

public class Class {

    private String name;

    private int length;

    private String lectureName;

    private String room;

    private String type;

    public Class(String name, int length, String lectureName, String room, String type) {
        setName(name);
        setLength(length);
        setLectureName(lectureName);
        setRoom(room);
        setType(type);
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public String getLectureName() {
        return lectureName;
    }

    public String getRoom() {
        return room;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return length == aClass.length && Objects.equals(name, aClass.name) && Objects.equals(lectureName, aClass.lectureName) && Objects.equals(room, aClass.room) && Objects.equals(type, aClass.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length, lectureName, room, type);
    }

    @Override
    public String toString() {
        return  "Name: " + name + '\'' +
                ", Length:" + length +
                ", Lecture: " + lectureName + '\'' +
                ", Room: " + room + '\'' +
                ", Type: " + type + '\'';
    }
}
