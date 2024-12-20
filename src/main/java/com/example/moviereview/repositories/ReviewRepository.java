package com.example.moviereview.repositories;

import com.example.moviereview.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReviewRepository extends JpaRepository<Review, Long> {

}
