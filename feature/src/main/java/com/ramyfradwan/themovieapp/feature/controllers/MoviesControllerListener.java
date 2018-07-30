package com.ramyfradwan.themovieapp.feature.controllers;

import com.ramyfradwan.themovieapp.feature.model.Movie;

import java.util.List;

interface MoviesControllerListener {
    void getMovies(List<Movie> movies);
}
