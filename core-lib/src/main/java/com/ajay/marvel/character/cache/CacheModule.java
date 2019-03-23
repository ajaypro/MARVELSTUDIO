package com.ajay.marvel.character.cache;

import dagger.Module;
import dagger.Provides;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

@Module
public class CacheModule {

    @Provides
    @Cache
    public CachePresenter providePresenter(CachePresenterImpl presenter) {
        return presenter;
    }

}
