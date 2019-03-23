package com.ajay.marvel;

import android.content.Context;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

@Module
public class AndroidModule {
    private MarvelApplication application;

    public AndroidModule(MarvelApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return application.getApplicationContext();
    }

    @Provides
    @Singleton
    Resources provideResources() {
        return application.getResources();
    }

}
