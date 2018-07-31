package com.ramyfradwan.themovieapp.feature.presenters;

import android.content.Context;
import android.support.annotation.NonNull;

import com.ramyfradwan.themovieapp.feature.base.BasePresenter;
import com.ramyfradwan.themovieapp.feature.controllers.MoviesController;
import com.ramyfradwan.themovieapp.feature.controllers.MoviesControllerListener;

public class MoviesPresenter extends BasePresenter<MoviesController, MoviesPresenterListener> implements MoviesControllerListener {
    private MoviesPresenterListener moviesPresenterListener;
    private Context context;

    public MoviesPresenter(Context context, MoviesPresenterListener moviesPresenterListener) {
        this.context = context;
        controller = new MoviesController(this, context);
        this.listener = moviesPresenterListener;
    }

    public void getPopularMovies(@NonNull final String className) {
        controller.getPopularMovies(className);
    }

    public void getTopRatedMovies(@NonNull final String className) {
        controller.getPopularMovies(className);
    }

}

