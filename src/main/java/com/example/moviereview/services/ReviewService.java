package com.example.moviereview.services;

import com.example.moviereview.models.Movie;
import com.example.moviereview.models.Review;
import com.example.moviereview.repositories.MovieRepository;
import com.example.moviereview.repositories.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final MovieRepository movieRepository;

    public ReviewService(ReviewRepository reviewRepository, MovieRepository movieRepository) {
        this.reviewRepository = reviewRepository;
        this.movieRepository = movieRepository;
    }

    public Review saveReview(Review review) {
        // Fetch the full movie object and set it in the review
        Movie movie = movieRepository.findById(review.getMovie().getId())
                .orElseThrow(() -> new RuntimeException("Movie not found"));
        review.setMovie(movie);
        return reviewRepository.save(review);
    }
}
