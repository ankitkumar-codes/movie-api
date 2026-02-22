package com.example.movieapi.controller;

import com.example.movieapi.model.Movie;
import com.example.movieapi.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller to handle movie APIs.
 */
@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    // Constructor injection
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    /**
     * Add a new movie
     */
    @PostMapping
    public ResponseEntity<?> addMovie(@RequestBody Movie movie) {

        // Input validation
        if (movie.getTitle() == null || movie.getTitle().trim().isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Movie title is required");
        }

        if (movie.getRating() < 0 || movie.getRating() > 10) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Rating must be between 0 and 10");
        }

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(movieService.addMovie(movie));
    }

    /**
     * Get a movie by ID
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable int id) {

        Movie movie = movieService.getMovieById(id);

        if (movie == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Movie not found with id: " + id);
        }

        return ResponseEntity.ok(movie);
    }
}