package com.ramyfradwan.themovieapp.feature.controllers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.ramyfradwan.themovieapp.feature.base.BaseCoreController;
import com.ramyfradwan.themovieapp.feature.model.Movie;
import com.ramyfradwan.themovieapp.feature.model.MoviesResponse;
import com.ramyfradwan.themovieapp.feature.utils.network.ApiClient;
import com.ramyfradwan.themovieapp.feature.utils.network.ConfigApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.ramyfradwan.themovieapp.feature.utils.ConstantsPrivate.API_KEY;

public class MoviesController extends BaseCoreController {
    private final Context context;
    MoviesControllerListener moviesControllerListener;

    public MoviesController(MoviesControllerListener moviesControllerListener, Context context){
        super(moviesControllerListener);
        this.moviesControllerListener = moviesControllerListener;
        this.context = context;
    }

    public void getPopularMovies(@NonNull final String className){

        ConfigApi apiService =
                ApiClient.getClient().create(ConfigApi.class);

        Call<MoviesResponse> call = apiService.getMostPopularMovies(API_KEY);
        call.enqueue(new Callback<MoviesResponse>() {
            @Override
            public void onResponse(Call<MoviesResponse>call, Response<MoviesResponse> response) {
                List<Movie> movies = response.body().getResults();
                moviesControllerListener.getMovies(movies);
                Log.d(className, "Number of movies received: " + movies.size());
            }

            @Override
            public void onFailure(Call<MoviesResponse>call, Throwable t) {
                // Log error here since request failed
                Log.e(className, t.toString());
            }
        });
    }

    public void getTopRatedMovies(@NonNull final String className){

        ConfigApi apiService =
                ApiClient.getClient().create(ConfigApi.class);

        Call<MoviesResponse> call = apiService.getTopRatedMovies(API_KEY);
        call.enqueue(new Callback<MoviesResponse>() {
            @Override
            public void onResponse(Call<MoviesResponse>call, Response<MoviesResponse> response) {
                List<Movie> movies = response.body().getResults();
                moviesControllerListener.getMovies(movies);
                Log.d(className, "Number of movies received: " + movies.size());
            }

            @Override
            public void onFailure(Call<MoviesResponse>call, Throwable t) {
                // Log error here since request failed
                Log.e(className, t.toString());
            }
        });
    }
}
