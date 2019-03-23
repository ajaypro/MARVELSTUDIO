package com.ajay.marvel.character.search;

import com.ajay.marvel.base.BasePresenter;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

interface SearchPresenter extends BasePresenter<SearchView> {

    void doSearch(boolean isConnected, String query, long timestamp);

    boolean isQueryValid(String query);

    void loadCharactersCachedData();

}
