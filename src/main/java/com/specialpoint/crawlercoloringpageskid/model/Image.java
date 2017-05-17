package com.specialpoint.crawlercoloringpageskid.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by thinhdd
 * Date 5/17/2017.
 */
@Entity
@Table(name = "image")
public class Image extends BaseEntity {
    private String url;
    private String ownerUrl;
    private String title;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOwnerUrl() {
        return ownerUrl;
    }

    public void setOwnerUrl(String ownerUrl) {
        this.ownerUrl = ownerUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
