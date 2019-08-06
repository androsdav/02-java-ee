package com.adidyk.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Class User.
 */
@Entity
@Table(name = "users")
public class User implements Serializable {

    /**
     * @param id - user id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    /**
     * @param name - user name.
     */
    @Column(name = "name")
    private String name;

    /**
     * @param profession - user profession.
     */
    @Column(name = "profession")
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
     * getProfession - returns profession.
     * @return - returns profession.
     */
    public String getProfession() {
        return profession;
    }

    /**
     * setProfession - sets profession.
     * @param profession - user profession.
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * equals - returns boolean result.
     * @param obj - object.
     * @return - returns boolean result.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User user = (User) obj;
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(profession, user.profession);
    }

    /**
     * hashCode - returns hash code.
     * @return - returns hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name, profession);
    }

    /**
     * toString - returns string format.
     * @return - returns string format.
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }

}