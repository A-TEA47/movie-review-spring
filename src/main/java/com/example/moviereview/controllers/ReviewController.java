package com.example.moviereview.controllers;

import com.example.moviereview.models.Review;
import com.example.moviereview.services.ReviewService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    private static final Logger logger = LoggerFactory.getLogger(ReviewController.class);

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public Review addReview(@RequestBody Review review) {
        logger.info("Received Review: {}", review); // Logging instead of println
        return reviewService.saveReview(review);
    }
}
