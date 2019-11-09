package com.booksmedia.booksmedia.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int numberOfEpisodes;
    private int numberOfSeasons;
    private boolean stillRunning;
    private String imageUrl;
    private boolean owned;
    private int lastEpisodeSeen;
    private boolean subbed;
    private boolean dubbed;


    //**********************************************************

    // Constructors

    //**********************************************************


    public Anime(String name, int numberOfEpisodes, int numberOfSeasons, boolean stillRunning, String imageUrl, boolean owned, int lastEpisodeSeen, boolean subbed, boolean dubbed) {
        this.name = name;
        this.numberOfEpisodes = numberOfEpisodes;
        this.numberOfSeasons = numberOfSeasons;
        this.stillRunning = stillRunning;
        this.imageUrl = imageUrl;
        this.owned = owned;
        this.lastEpisodeSeen = lastEpisodeSeen;
        this.subbed = subbed;
        this.dubbed = dubbed;
    }

    public Anime(){}

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

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public boolean isStillRunning() {
        return stillRunning;
    }

    public void setStillRunning(boolean stillRunning) {
        this.stillRunning = stillRunning;
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

    public int getLastEpisodeSeen() {
        return lastEpisodeSeen;
    }

    public void setLastEpisodeSeen(int lastEpisodeSeen) {
        this.lastEpisodeSeen = lastEpisodeSeen;
    }

    public boolean isSubbed() {
        return subbed;
    }

    public void setSubbed(boolean subbed) {
        this.subbed = subbed;
    }

    public boolean isDubbed() {
        return dubbed;
    }

    public void setDubbed(boolean dubbed) {
        this.dubbed = dubbed;
    }
}
