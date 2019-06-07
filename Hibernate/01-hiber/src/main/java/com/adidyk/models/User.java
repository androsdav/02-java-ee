package com.adidyk.models;

import java.util.Objects;

 public class User {

    private int id;

    private String name;

    private String profession;

    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public User(int id, String name, String profession) {
        this.id = id;
        this.name = name;
        this.profession = profession;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(profession, user.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, profession);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profesion='" + profession + '\'' +
                '}';
    }
}