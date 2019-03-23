package com.ajay.marvel.character.search;

import com.ajay.marvel.base.BaseInteractor;
import com.ajay.marvel.domain.model.CharactersResponse;

import io.reactivex.Single;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

interface SearchInteractor extends BaseInteractor {

    Single<CharactersResponse> loadCharacter(String query, String privateKey, String publicKey, long timestamp);

}
