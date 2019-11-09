package com.booksmedia.booksmedia.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Series {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Object seriesType;
    private String seriesName;
    private String imageUrl;

    //TODO: connections to media models

    //**********************************************************

    // Constructors

    //**********************************************************


    public Series(Object seriesType, String seriesName) {
        this.seriesType = seriesType;
        this.seriesName = seriesName;
    }

    public Series(){}

    //**********************************************************

    // Getters and Setters

    //**********************************************************


    public Long getId() {
        return id;
    }

    public Object getSeriesType() {
        return seriesType;
    }

    public void setSeriesType(Object seriesType) {
        this.seriesType = seriesType;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
