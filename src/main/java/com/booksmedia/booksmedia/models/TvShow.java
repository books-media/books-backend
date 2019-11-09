package com.booksmedia.booksmedia.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class TvShow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int numberOfEpisodes;
    private boolean owned;
    private int lastEpisodeSeen;

    //**********************************************************

    // Constructors

    //**********************************************************

    public TvShow(String name, int numberOfEpisodes, boolean owned, int lastEpisodeSeen) {
        this.name = name;
        this.numberOfEpisodes = numberOfEpisodes;
        this.owned = owned;
        this.lastEpisodeSeen = lastEpisodeSeen;
    }

    public TvShow(){}

    //**********************************************************

    // Getters and Setters

    //**********************************************************


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public boolean isOwned() {
        return owned;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }

    public int getLastEpisodeSeen() {
        return lastEpisodeSeen;
    }

    public void setLastEpisodeSeen(int lastEpisodeSeen) {
        this.lastEpisodeSeen = lastEpisodeSeen;
    }
}
