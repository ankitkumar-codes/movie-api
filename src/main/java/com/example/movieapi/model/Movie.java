package com.example.movieapi.model;

/**
 * Movie entity representing an item in the system.
 * Stored in-memory using ArrayList.
 */
public class Movie {

    private int id;
    private String title;
    private String description;
    private String genre;
    private double rating;

    // Default constructor (required for JSON mapping)
    public Movie() {
    }

    // Parameterized constructor
    public Movie(int id, String title, String description, String genre, double rating) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.rating = rating;
    }

    // Getters and Setters
    public int getId() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}