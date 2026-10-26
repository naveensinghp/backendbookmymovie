package com.bookmymovie.backend.service;

import com.bookmymovie.backend.entity.Movie;
import com.bookmymovie.backend.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    public Optional<Movie> getMovieByID(Long id){
        return movieRepository.findById(id);
    }

    public boolean deleteMovie(Long id){
        if(!movieRepository.existsById(id)){
            return false;
        }
        movieRepository.deleteById(id);
        return true;
    }
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public Movie saveMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

}
