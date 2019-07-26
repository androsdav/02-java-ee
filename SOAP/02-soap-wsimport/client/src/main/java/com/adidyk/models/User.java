package com.adidyk.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Objects;

/**
 * Class User.
 */
@XmlRootElement (name = "user")
public class User implements Serializable {

    /**
     * @param id - user id.
     */
    private String id;

    /**
     * @param firstName - user first name.
     */
    private String firstName;

    /**
     * @param lastName - user last name.
     */
    private String lastName;

    /**
     * @param age - user age.
     */
    private int age;

    /**
     * User - constructor.
     */
    public User() {
    }

    /**
     * User - constructor.
     * @param firstName - user first name.
     * @param lastName - user last name.
     * @param age - user age.
     */
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * User - constructor.
     * @param id - user id.
     * @param firstName - user first name.
     * @param lastName - user last name.
     * @param age - user age.
     */
    public User(String id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * getId - returns user id.
     * @return - returns user id.
     */
    @XmlElement(name = "id")
    public String getId() {
        return id;
    }

    /**
     * setId - sets user id.
     * @param id - user id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * getFirstName - returns user first name.
     * @return - returns user first name.
     */
    @XmlElement(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * setFirstName - sets user first name.
     * @param firstName - user first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getLastName - returns user last name.
     * @return - returns user last name.
     */
    @XmlElement(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * setLastName - sets user last name.
     * @param lastName - user last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * getAge - returns user age.
     * @return - returns user age.
     */
    @XmlElement(name = "age")
    public int getAge() {
        return age;
    }

    /**
     * setAge - sets user age.
     * @param age - user age.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * equals - return true or false.
     * @param o - user object.
     * @return - returns true or false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id &&
                age == user.age &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName);
    }

    /**
     * hashCode - returns hash code.
     * @return - returns hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age);
    }

    /**
     * toString - returns all information about user (string format).
     * @return - returns all information about user (string format).
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

}