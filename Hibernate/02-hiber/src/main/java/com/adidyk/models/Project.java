package com.adidyk.models;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class Project.
 */
@Entity
@Table(name = "projects")
public class Project {

    /**
     * @param id - project id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    /**
     * @param name - project name.
     */
    @Column(name = "name")
    private String name;

    /**
     * @param users - all users.
     */
    @ManyToMany(mappedBy = "projects")
    private List<User> users = new ArrayList<>();

    /**
     * Project - constructor.
     */
    public Project() {
    }

    /**
     * Project - constructor.
     * @param id - project id.
     */
    public Project(int id) {
        this.id = id;
    }

    /**
     * Project - constructor.
     * @param name - project name.
     */
    public Project(String name) {
        this.name = name;
    }

    /**
     * Project - constructor.
     * @param id - project id.
     * @param name - project name.
     */
    public Project(int id, String name) {
        this.id = id;
        this.name = name;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Project)) return false;
        Project project = (Project) obj;
        return id == project.id &&
                Objects.equals(name, project.name) &&
                Objects.equals(users, project.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, users);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }

}