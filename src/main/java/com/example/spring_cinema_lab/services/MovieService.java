package com.example.spring_cinema_lab.services;

import com.example.spring_cinema_lab.controllers.MovieController;
import com.example.spring_cinema_lab.models.Movie;
import com.example.spring_cinema_lab.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    private ArrayList<Movie> movies;

    private Movie movie;

    public MovieService(){}

    // Method
    public Movie addNewMovie(Movie movie) {
        movieRepository.save(movie);
        return movie;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById (long id) {
        return movieRepository.findById(id);
    }


    // GETTERS AND SETTERS

//    public MovieService getMovieService() {
//        return movieService;
//    }
//
//    public void setMovieService(MovieService movieService) {
//        this.movieService = movieService;
//    }
//
//    public MovieController getMovieController() {
//        return movieController;
//    }
//
//    public void setMovieController(MovieController movieController) {
//        this.movieController = movieController;
//    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

}
