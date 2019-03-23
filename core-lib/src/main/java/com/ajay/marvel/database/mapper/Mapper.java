package com.ajay.marvel.database.mapper;

import com.ajay.marvel.database.model.CharacterModel;
import com.ajay.marvel.domain.model.CharactersResponse;
import com.ajay.marvel.util.Constants;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

public class Mapper {

    public static CharacterModel mapCharacterResponseToCharacter(
            CharactersResponse charactersResponse) {
        CharacterModel character = new CharacterModel();

        character.setName(charactersResponse.getData().getResults()[0].getName());
        character.setDescription(charactersResponse.getData().getResults()[0].getDescription());
        character.setThumbnail(String.format("%s/%s.%s",
                charactersResponse.getData().getResults()[0].getThumbnail().getPath(),
                Constants.STANDARD_XLARGE,
                charactersResponse.getData().getResults()[0].getThumbnail().getExtension()));
        character.setImage(String.format("%s/%s.%s",
                charactersResponse.getData().getResults()[0].getThumbnail().getPath(),
                Constants.PORTRAIT_XLARGE,
                charactersResponse.getData().getResults()[0].getThumbnail().getExtension()));

        return character;
    }
}
