package com.ajay.marvel.character.cache;


import com.ajay.marvel.base.BasePresenter;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

interface CachePresenter extends BasePresenter<CacheView> {

    void loadLast5CharactersCachedData();

}
