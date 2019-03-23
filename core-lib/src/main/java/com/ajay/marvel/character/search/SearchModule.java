package com.ajay.marvel.character.search;

import dagger.Module;
import dagger.Provides;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

@Module
public class SearchModule {

    @Provides
    @Search
    public SearchInteractor provideInteractor(SearchInteractorImpl interactor) {
        return interactor;
    }

    @Provides
    @Search
    public SearchPresenter providePresenter(SearchPresenterImpl presenter) {
        return presenter;
    }

}
