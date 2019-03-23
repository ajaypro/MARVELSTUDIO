package com.ajay.marvel.character.search;

import dagger.Subcomponent;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

@Search
@Subcomponent(modules = {
        SearchModule.class
})
public interface SearchSubComponent {

    void inject(SearchFragment fragment);

}
