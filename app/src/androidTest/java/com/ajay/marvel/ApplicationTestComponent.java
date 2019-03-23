package com.ajay.marvel;

import com.ajay.marvel.activity.MainActivityTest;
import com.ajay.marvel.database.DatabaseModule;
import com.ajay.marvel.domain.ApiModule;
import com.ajay.marvel.domain.ClientModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @Author Created by AjayDeepak on 08/09/201821/10/2016.
 */

@Singleton
@Component(modules = {
        AndroidModule.class,
        ApplicationModule.class,
        ApiModule.class,
        DatabaseModule.class,
        ClientModule.class
})
public interface ApplicationTestComponent extends ApplicationComponent {

    void inject(MainActivityTest activity);

}