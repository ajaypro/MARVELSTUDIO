package com.ajay.marvel.character.cache.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ajay.marvel.BR;
import com.ajay.marvel.database.model.CharacterModel;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

public class CharacterViewHolder extends RecyclerView.ViewHolder {

    public final View view;
    private CharacterModel character;
    private ViewDataBinding binding;

    public CharacterViewHolder(View view) {
        super(view);
        this.view = view;

        binding = DataBindingUtil.bind(view);

    }

    public CharacterModel getCharacter() {
        return character;
    }

    public void setCharacter(CharacterModel character) {
        this.character = character;

        binding.setVariable(BR.character, character);
        binding.executePendingBindings();
    }
}
