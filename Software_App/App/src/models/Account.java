package models;

import Utils.Utils;

import java.util.Objects;


public class Account {

    private String name = "Student Name Error";

    private String course = "W001";

    private int id = 20000000;

    private String contactInfo = "20000000@mail.setu.ie";

    public Account(String name,String course, int id, String contactInfo){
        setName(name);
        setCourse(course);
        setId(id);
        setContactInfo(contactInfo);
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getId() {
        return id;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setName(String name) {
        if(Utils.validStringLength(name,35)) {
            this.name = name;
        }
    }

    public void setCourse(String course) {
        if(Utils.validStringLength(course,4)) {
            this.course = course;
        }
    }

    public void setId(int id) {
        if((id >= 10000000) && (id <= 99999999)) {
            this.id = id;
        }
    }


    public void setContactInfo(String contactInfo) {
        if(Utils.validStringLength(contactInfo,25)) {
            this.contactInfo = contactInfo;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && Objects.equals(name, account.name) && Objects.equals(course, account.course) && Objects.equals(contactInfo, account.contactInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, id, contactInfo);
    }

    @Override
    public String toString() {
        return "Name: '" + name + '\'' +
                ", Course='" + course + '\'' +
                ", Id=" + id +
                ", Contact Info='" + contactInfo + '\'';
    }
}
