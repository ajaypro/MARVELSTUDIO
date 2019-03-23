package com.ajay.marvel.database;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

@Module
public class DatabaseModule {

    @Provides
    @Singleton
    DatabaseHelper provideDatabaseHelperService(DatabaseHelperImpl databaseHelper) {
        return databaseHelper;
    }

}
