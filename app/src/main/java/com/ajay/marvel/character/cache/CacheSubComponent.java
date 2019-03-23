package com.ajay.marvel.character.cache;

import dagger.Subcomponent;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

@Cache
@Subcomponent(modules = {
        CacheModule.class
})
public interface CacheSubComponent {

    void inject(CacheFragment fragment);

}
