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
     * @param passport - passport.
     */
    private Passport passport;

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
    public User(Integer id, String name, String profession) {
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
     * getPassport - sets passport.
     * @return - returns passport.
     */
    public Passport getPassport() {
        return passport;
    }

    /**
     * setpassport - sets passport.
     * @param passport - passport.
     */
    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    /**
     * equals - returns true or false.
     * @param obj - obj.
     * @return - returns tru or false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User user = (User) obj;
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(profession, user.profession) &&
                Objects.equals(passport, user.passport);
    }

    /**
     * hashCode - returns hashcode for user.
     * @return - returns hashcode for user.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name, profession, passport);
    }

    /**
     * toString - returns string format about user.
     * @return - returns string format about user.
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", passport=" + passport +
                '}';
    }

}