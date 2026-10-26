package com.bookmymovie.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bookmymovie.backend.entity.Movie;


public interface MovieRepository extends JpaRepository<Movie, Long> {
}
