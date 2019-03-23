package com.ajay.marvel.base;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.ajay.marvel.MarvelApplication;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

public abstract class BaseFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        injectDependencies(MarvelApplication.get(getContext()));

        // can be used for general purpose in all Fragments of Application
    }

    protected abstract void injectDependencies(MarvelApplication application);

}