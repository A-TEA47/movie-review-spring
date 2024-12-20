package com.example.moviereview.services;

import com.example.moviereview.models.Movie;
import com.example.moviereview.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public List<Movie> getTopRatedMoviesByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }
}
