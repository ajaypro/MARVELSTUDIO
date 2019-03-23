package com.ajay.marvel.util;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

public abstract class Constants {

    public static final String BASE_URL = "http://gateway.marvel.com:80/";

    public static final String PUBLIC_KEY = "dead4f6991fd2b7f1f5b4d4523a7bb38";
    public static final String PRIVATE_KEY = "cb5e2e364275491a7aff12b35d58964649a1b08d";

    public static final int NETWORK_CONNECTION_TIMEOUT = 30; // 30 sec
    public static final long CACHE_SIZE = 10 * 1024 * 1024; // 10 MB
    public static final int CACHE_MAX_AGE = 2; // 2 min
    public static final int CACHE_MAX_STALE = 7; // 7 day

    public static final int CODE_OK = 200;

    public static final String PORTRAIT_XLARGE = "portrait_xlarge";
    public static final String STANDARD_XLARGE = "standard_xlarge";

}
