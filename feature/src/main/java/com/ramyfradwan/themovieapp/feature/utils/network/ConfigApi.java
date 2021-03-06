package com.ramyfradwan.themovieapp.feature.utils.network;

import com.ramyfradwan.themovieapp.feature.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ConfigApi {
        @GET("movie/top_rated")
        Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

        @GET("/movie/popular")
        Call<MoviesResponse> getMostPopularMovies(@Query("api_key") String apiKey);

        @GET("movie/{id}")
        Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);

//        @GET(" http://image.tmdb.org/t/p/w185//")
}

