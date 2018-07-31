package com.ramyfradwan.themovieapp.feature.presenters;

import com.ramyfradwan.themovieapp.feature.base.BasePresenterListener;
import com.ramyfradwan.themovieapp.feature.model.Movie;
import com.ramyfradwan.themovieapp.feature.model.MoviesResponse;

import java.util.List;

public interface MoviesPresenterListener extends BasePresenterListener {
    void getMoviesResponse(MoviesResponse moviesResponse);

    void getMovies(List<Movie> movies);

}
