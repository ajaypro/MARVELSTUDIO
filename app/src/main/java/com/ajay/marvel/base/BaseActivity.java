package com.ajay.marvel.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.ajay.marvel.ApplicationComponent;
import com.ajay.marvel.MarvelApplication;
import com.ajay.marvel.R;

import butterknife.BindView;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

public abstract class BaseActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        injectDependencies(MarvelApplication.get(this), MarvelApplication.getComponent());

        // can be used for general purpose in all Activities of Application
    }



    protected abstract void injectDependencies(MarvelApplication application, ApplicationComponent component);

    @Override
    public void finish() {
        super.finish();

        releaseSubComponents(MarvelApplication.get(this));
    }

    protected abstract void releaseSubComponents(MarvelApplication application);

}
