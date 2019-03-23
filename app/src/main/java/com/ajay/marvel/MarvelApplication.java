package com.ajay.marvel;

import android.app.Application;
import android.content.Context;

import com.ajay.marvel.character.cache.CacheModule;
import com.ajay.marvel.character.cache.CacheSubComponent;
import com.ajay.marvel.character.search.SearchModule;
import com.ajay.marvel.character.search.SearchSubComponent;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

public abstract class MarvelApplication extends Application {

    private static ApplicationComponent component;
    private CacheSubComponent cacheSubComponent;
    private SearchSubComponent searchSubComponent;

    public static ApplicationComponent getComponent() {
        return component;
    }

    public static MarvelApplication get(Context context) {
        return (MarvelApplication) context.getApplicationContext();
    }

    public CacheSubComponent getCacheSubComponent() {
        if (null == cacheSubComponent)
            createCacheSubComponent();

        return cacheSubComponent;
    }

    public CacheSubComponent createCacheSubComponent() {
        cacheSubComponent = component.plus(new CacheModule());
        return cacheSubComponent;
    }

    public void releaseCacheSubComponent() {
        cacheSubComponent = null;
    }

    public SearchSubComponent getSearchSubComponent() {
        if (null == searchSubComponent)
            createSearchSubComponent();

        return searchSubComponent;
    }

    public SearchSubComponent createSearchSubComponent() {
        searchSubComponent = component.plus(new SearchModule());
        return searchSubComponent;
    }

    public void releaseSearchSubComponent() {
        searchSubComponent = null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        initApplication();

        component = createComponent();
    }

    public ApplicationComponent createComponent() {
        return DaggerApplicationComponent.builder()
                .androidModule(new AndroidModule(this))
                .build();
    }

    public abstract void initApplication();

}
