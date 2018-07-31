package com.ramyfradwan.themovieapp.feature.base;

interface BaseCoreControllerListener {
    void onFinishController(BaseResponseModel response, String tag);

    void onErrorController(String string, String tag);

    void onConnectionFailure(String serviceName);

}
