package com.ajay.marvel.util;

import io.reactivex.Scheduler;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

public interface SchedulerProvider {

    Scheduler mainThread();

    Scheduler backgroundThread();

}
