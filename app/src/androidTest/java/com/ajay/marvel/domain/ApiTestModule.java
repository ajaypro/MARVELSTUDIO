package com.ajay.marvel.domain;

import com.ajay.marvel.domain.client.MarvelApi;

import retrofit2.Retrofit;

import static org.mockito.Mockito.mock;

/**
 * @Author Created by AjayDeepak on 08/09/201821/10/2016.
 */

public class ApiTestModule extends ApiModule {

    @Override
    public MarvelApi provideMarvelApiService(Retrofit retrofit) {
        // replace real MarvelApi with Mock one
        return mock(MarvelApi.class);
    }

}
