package com.example.moviereview.services;

import com.example.moviereview.models.Review;
import com.example.moviereview.repositories.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll(); // Fetches all reviews from the database
    }

    public Review saveReview(Review review) {
        return reviewRepository.save(review); // Saves a new review to the database
    }
}
