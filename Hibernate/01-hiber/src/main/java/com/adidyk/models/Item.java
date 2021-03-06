package com.adidyk.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class Item.
 */
public class Item {

    /**
     * @param id - item id.
     */
    private int id;

    /**
     * @param name - item name.
     */
    private String name;

    /**
     * @param description - description item.
     */
    private String description;

    /**
     * @param user - item user.
     */
    private User user;

    /**
     * @param comments - list comments.
     */
    private List<Comment> comments = new ArrayList<>();

    /**
     * Item - constructor.
     */
    public Item() {
    }

    /**
     * Item - constructor.
     * @param id - item id.
     * @param name - item name.
     * @param description - description item.
     * @param user - user item.
     */
    public Item(int id, String name, String description, User user) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.user = user;
    }

    /**
     * Item - constructor.
     * @param name - item name.
     * @param description - description item.
     */
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Item - constructor.
     * @param id - item id.
     */
    public Item(int id) {
        this.id = id;
    }

    /**
     * getId - returns item id.
     * @return - returns item id.
     */
    public int getId() {
        return id;
    }

    /**
     * setId - sets item id.
     * @param id - item id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getName - returns item name.
     * @return - returns item name.
     */
    public String getName() {
        return name;
    }

    /**
     * setName - sets item name.
     * @param name - item name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getDescription - returns item description.
     * @return - returns item description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * setDescription - sets item description.
     * @param description - item description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * getUser - returns item user.
     * @return - returns item user.
     */
    public User getUser() {
        return user;
    }

    /**
     * setUser - sets item user.
     * @param user - item user.
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * getComments - returns list comments.
     * @return - returns lis comments.
     */

    public List<Comment> getComments() {
        return comments;
    }

    /**
     * setComments - sets comments.
     * @param comments - list comments.
     */
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    /**
     * equals - returns true or false.
     * @param obj - obj.
     * @return - returns true or false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Item)) return false;
        Item item = (Item) obj;
        return this.getId() == item.id &&
                Objects.equals(this.getName(), item.name) &&
                Objects.equals(this.getDescription(), item.description) &&
                Objects.equals(this.getUser(), item.user) &&
                Objects.equals(this.getComments(), item.comments);
    }

    /**
     * hashCode - returns hashcode for item.
     * @return - returns hashcode for item.
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getName(), this.getDescription(), this.getUser(), this.getComments());
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", comments=" + comments +
                '}';
    }

}