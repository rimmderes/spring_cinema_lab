package com.example.spring_cinema_lab.models;


import javax.persistence.*;


@Entity (name = "movies")                         // create table
public class Movie {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @Column
    private String rating;

    @Column
    private int duration;


    public Movie(String title, String rating, int duration) {
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }


    public Movie(){}                                        // empty constructor = deserialise


    // GETTERS AND SETTERS

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
