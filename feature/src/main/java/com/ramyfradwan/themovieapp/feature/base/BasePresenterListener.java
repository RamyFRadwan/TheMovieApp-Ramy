package com.ramyfradwan.themovieapp.feature.base;

public interface BasePresenterListener {
    void handleError(String errorMessage, String tag);

    void onConnectionError();

}
