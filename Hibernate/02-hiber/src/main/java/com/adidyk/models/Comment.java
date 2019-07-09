package com.adidyk.models;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Objects;

/**
 * Class Comment.
 */
@Entity
@Table(name = "comments")
public class Comment {

    /**
     * @param id - comment id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    /**
     * @param name - comment name.
     */
    @Column(name = "name")
    private String name;

    /**
     * @param description - comment name.
     */
    @Column(name = "description")
    private String description;

    /**
     * @param item - item.
     */
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "item_id")
    private Item item;

    /**
     * Comment - constructor.
     */
    public Comment() {
    }

    /**
     * Comment - constructor.
     * @param name - comment name.
     * @param description - comment description.
     */
    public Comment(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Comment - constructor.
     * @param id - comment id.
     * @param name - comment name.
     * @param description - comment description.
     */
    public Comment(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;
        Comment comment = (Comment) o;
        return id == comment.id &&
                Objects.equals(name, comment.name) &&
                Objects.equals(description, comment.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }

    @Override
    public String toString() {
        return String.format("%s%s%s%s%s%s%s%s",
                "Comment{", "id=", this.getId(), ", name=", this.getName(), ", description=", this.getDescription(), "}");
    }

}