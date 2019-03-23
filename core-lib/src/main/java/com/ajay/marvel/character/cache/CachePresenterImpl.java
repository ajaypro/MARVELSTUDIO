package com.ajay.marvel.character.cache;

import com.ajay.marvel.database.DatabaseHelper;

import java.sql.SQLException;

import javax.inject.Inject;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

class CachePresenterImpl implements CachePresenter {

    @Inject
    DatabaseHelper databaseHelper;

    private CacheView view;

    @Inject
    public CachePresenterImpl() {
    }

    @Override
    public void bind(CacheView view) {
        this.view = view;
    }

    @Override
    public void loadLast5CharactersCachedData() {
        if (null != view)
            try {
                view.setLast5CharactersCachedData(databaseHelper.selectLast5Characters());
            } catch (SQLException e) {
                view.showError(e);
            }
    }

    @Override
    public void unbind() {
        view = null;
    }
}
