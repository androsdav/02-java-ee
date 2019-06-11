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
     * @param profession - profession.
     */
    private String profession;

    /**
     * User - constructor.
     */
    public User() {
    }

    /**
     * User - constructor.
     * @param id - user id.
     */
    public User(int id) {
        this.id = id;
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

    /**
     * getId - returns user id.
     * @return - returns user id.
     */
    public int getId() {
        return id;
    }

    /**
     * setId - sets user id.
     * @param id - user id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getName - returns user name.
     * @return - returns user name.
     */
    public String getName() {
        return name;
    }

    /**
     * setName - sets user name.
     * @param name - user name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getProfession - returns user profession.
     * @return - returns user profession.
     */
    public String getProfession() {
        return profession;
    }

    /**
     * setProfession - sets user profession.
     * @param profession - sets user profession.
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * equals - returns true or false.
     * @param obj - obj.
     * @return - returns tru or false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return this.getId() == user.id &&
                Objects.equals(this.getName(), user.name) &&
                Objects.equals(this.getProfession(), user.profession);
    }

    /**
     * hashCode - returns hashcode for user.
     * @return - returns hashcode for user.
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getName(), this.getProfession());
    }

    /**
     * toString - returns string format about user.
     * @return - returns string format about user.
     */
    @Override
    public String toString() {
        return String.format("%s%s%s%s%s%s%s%s",
                "User{", "id=", this.getId(), ", name=", this.getName(), ", profession=", this.getProfession(), "}");
    }
}
