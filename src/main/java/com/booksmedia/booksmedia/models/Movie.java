package com.booksmedia.booksmedia.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Date;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String imdbLink;
    private String imageUrl;
    private boolean owned;
    private Date lastWatched;

    //**********************************************************

    // Constructors

    //**********************************************************


    public Movie(String title, String imdbLink, String imageUrl, boolean owned, Date lastWatched) {
        this.title = title;
        this.imdbLink = imdbLink;
        this.imageUrl = imageUrl;
        this.owned = owned;
        this.lastWatched = lastWatched;
    }

    public Movie(){}


    //**********************************************************

    // Getters and Setters

    //**********************************************************


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImdbLink() {
        return imdbLink;
    }

    public void setImdbLink(String imdbLink) {
        this.imdbLink = imdbLink;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isOwned() {
        return owned;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }

    public Date getLastWatched() {
        return lastWatched;
    }

    public void setLastWatched(Date lastWatched) {
        this.lastWatched = lastWatched;
    }
}
