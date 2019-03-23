package com.ajay.marvel;


import com.ajay.marvel.domain.ApiTestModule;

/**
 * @Author Created by AjayDeepak on 08/09/201821/10/2016.
 */

public class MarvelTestApplication extends MarvelApplicationImpl {

    @Override
    public ApplicationTestComponent createComponent() {
        return DaggerApplicationTestComponent
                .builder()
                .androidModule(new AndroidModule(this))
                // replace Api Module with Mock one
                .apiModule(new ApiTestModule())
                .build();
    }

}
