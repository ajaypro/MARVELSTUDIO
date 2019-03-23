package com.ajay.marvel.character.search;

import com.ajay.marvel.base.BaseView;
import com.ajay.marvel.database.model.CharacterModel;

import java.util.List;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

interface SearchView extends BaseView {

    void showQueryError(Throwable throwable);

    void showCharacter(CharacterModel character);

    void showRetryMessage(Throwable throwable);

    void showQueryNoResult();

    void setCharactersCachedData(List<CharacterModel> characters);

    void showError(Throwable throwable);

    void showProgress();

    void hideProgress();

    void showServiceError(ApiResponseCodeException throwable);

}
