package com.example.movieapi.service;

import com.example.movieapi.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service layer to manage movies using in-memory storage.
 */
@Service
public class MovieService {

    // In-memory data store
    private final List<Movie> movies = new ArrayList<>();

    /**
     * Add a new movie to the list
     */
    public Movie addMovie(Movie movie) {
        movies.add(movie);
        return movie;
    }

    /**
     * Get a movie by its ID
     */
    public Movie getMovieById(int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }
}