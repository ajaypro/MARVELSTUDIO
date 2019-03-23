package com.ajay.marvel.database;

import com.ajay.marvel.database.model.CharacterModel;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

public interface DatabaseHelper {

    int addCharacter(CharacterModel character) throws SQLException;

    List<CharacterModel> selectLast5Characters() throws SQLException;

    List<CharacterModel> selectAllCharacters() throws SQLException;

}
