package com.specialpoint.crawlercoloringpageskid.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by thinhdd
 * Date 5/17/2017.
 */
@Entity
@Table(name = "category")
public class Category {
    private String name;
    @ManyToMany(mappedBy = "categories")
    private List<Image> imageEntities;

    public Category() {
    }

    public Category(String name, List<Image> imageEntities) {
        this.name = name;
        this.imageEntities = imageEntities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Image> getImageEntities() {
        return imageEntities;
    }

    public void setImageEntities(List<Image> imageEntities) {
        this.imageEntities = imageEntities;
    }
}