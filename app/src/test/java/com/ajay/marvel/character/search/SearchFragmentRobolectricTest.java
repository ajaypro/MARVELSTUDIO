package com.ajay.marvel.character.search;

import com.ajay.marvel.test.support.Assert;
import com.ajay.marvel.BuildConfig;
import com.ajay.marvel.R;
import com.ajay.marvel.activity.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowToast;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;

/**
 * @Author Created by AjayDeepak on 08/09/201821/10/2016.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class SearchFragmentRobolectricTest {

    private MainActivity activity;
    private SearchFragment fragment;

    @Before
    public void setUp() {
        // setup activity
        activity = Robolectric.setupActivity(MainActivity.class);
        assertNotNull(activity);

        // setup fragment
        fragment = (SearchFragment) activity.getSupportFragmentManager().findFragmentByTag(MainActivity.TAG_SEARCH_FRAGMENT);
        assertNotNull(fragment);

    }

    @Test
    public void testShowProgress() {
        fragment.showProgress();

        Assert.assertProgressDialogIsShown(R.string.please_wait);
    }

    @Test
    public void testHideProgress() {
        fragment.showProgress();
        fragment.hideProgress();

        Assert.assertProgressDialogIsShown(R.string.please_wait);
    }

    @Test
    public void testShowQueryNoResult() {
        fragment.showQueryNoResult();

        assertThat(activity.getString(R.string.no_result), equalTo(ShadowToast.getTextOfLatestToast()));
    }
}