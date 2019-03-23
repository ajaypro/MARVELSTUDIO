package com.ajay.marvel;

import com.ajay.marvel.character.cache.CacheModule;
import com.ajay.marvel.character.cache.CacheSubComponent;
import com.ajay.marvel.character.search.SearchModule;
import com.ajay.marvel.domain.ApiModule;
import com.ajay.marvel.domain.ClientModule;
import com.ajay.marvel.activity.CharacterActivity;
import com.ajay.marvel.activity.MainActivity;
import com.ajay.marvel.activity.SplashActivity;
import com.ajay.marvel.character.search.SearchSubComponent;
import com.ajay.marvel.database.DatabaseModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

@Singleton
@Component(modules = {
        AndroidModule.class,
        ApplicationModule.class,
        ApiModule.class,
        DatabaseModule.class,
        ClientModule.class
})
public interface ApplicationComponent {

    void inject(SplashActivity activity);

    void inject(MainActivity activity);

    void inject(CharacterActivity characterActivity);

    SearchSubComponent plus(SearchModule module);

    CacheSubComponent plus(CacheModule module);

}