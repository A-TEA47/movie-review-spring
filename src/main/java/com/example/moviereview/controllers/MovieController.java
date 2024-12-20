package com.example.moviereview.controllers;

import com.example.moviereview.models.Movie;
import com.example.moviereview.services.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private static final Logger logger = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private MovieService movieService;

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        logger.info("Received Movie: {}", movie); // Logging instead of println
        return movieService.saveMovie(movie);
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        logger.info("Fetching all movies...");
        return movieService.getAllMovies();
    }

    @GetMapping("/top-rated")
    public List<Movie> getTopRatedMovies(@RequestParam String genre) {
        logger.info("Fetching top-rated movies for genre: {}", genre);
        return movieService.getTopRatedMoviesByGenre(genre);
    }
}
