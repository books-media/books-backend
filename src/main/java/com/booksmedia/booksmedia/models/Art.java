package com.booksmedia.booksmedia.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Art {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String imageUrl;

    //TODO: talk to someone(Merry?) about what sort of things people want to save about art pieces

    //**********************************************************

    // Constructors

    //**********************************************************

    //**********************************************************

    // Getters and Setters

    //**********************************************************
}
