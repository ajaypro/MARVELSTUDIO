package com.ajay.marvel.character.cache;

import com.ajay.marvel.base.BaseView;
import com.ajay.marvel.database.model.CharacterModel;

import java.util.List;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

interface CacheView extends BaseView {

    void setLast5CharactersCachedData(List<CharacterModel> characterModels);

    void showError(Throwable throwable);

}
