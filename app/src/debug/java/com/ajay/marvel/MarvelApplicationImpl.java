package com.ajay.marvel;

import timber.log.Timber;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

public class MarvelApplicationImpl extends MarvelApplication {

    @Override
    public void initApplication() {

        // initialize Timber in debug version to log
        Timber.plant(new Timber.DebugTree() {
            @Override
            protected String createStackElementTag(StackTraceElement element) {
                // adding line number to logs
                return super.createStackElementTag(element) + ":" + element.getLineNumber();
            }
        });

    }
}
