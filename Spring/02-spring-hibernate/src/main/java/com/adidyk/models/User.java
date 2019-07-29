package com.adidyk.models;

import java.util.Objects;

/**
 * Class User.
 */
public class User {

    /**
     * @param id - user id.
     */
    private int id;

    /**
     * @param name - user name.
     */
    private String name;

    /**
     * @param profession - user profession.
     */
    private String profession;

    /**
     * User - constructor.
     */
    public User() {
    }

    /**
     * User -constructor.
     * @param id - user id.
     */
    public User(int id) {
        this.id = id;
    }

    /**
     * User - constructor.
     * @param name - user name.
     * @param profession - user profession.
     */
    public User(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    /**
     * User - constructor.
     * @param id - user id.
     * @param name - user name.
     * @param profession - user profession.
     */
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
        if (!(o instanceof User)) return false;
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
                ", profession='" + profession + '\'' +
                '}';
    }

}