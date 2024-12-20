package com.example.moviereview.repositories;

import com.example.moviereview.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.moviereview.repositories.MovieRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
