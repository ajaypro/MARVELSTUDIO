package com.ajay.marvel.character.cache;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
@interface Cache {
}
