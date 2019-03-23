package com.ajay.marvel.activity;

import android.content.Intent;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ajay.marvel.BuildConfig;
import com.ajay.marvel.R;
import com.ajay.marvel.database.model.CharacterModel;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @Author Created by AjayDeepak on 08/09/201813/11/2016.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class CharacterActivityRobolectricTest {

    private static final String TEST_CHARACTER_NAME = "Test Name";
    private static final String TEST_CHARACTER_DESCRIPTION = "Test Description";
    private static final String TEST_CHARACTER_THUMBNAIL = "Test Thumbnail";

    private CharacterActivity activity;

    @Before
    public void setUp() {
        // Set up the stub we want to return in the mock
        CharacterModel character = new CharacterModel(0, TEST_CHARACTER_NAME, TEST_CHARACTER_DESCRIPTION, TEST_CHARACTER_THUMBNAIL);

        Intent intent = CharacterActivity.newIntent(RuntimeEnvironment.application, character);

        activity = Robolectric.buildActivity(CharacterActivity.class, intent)
                .create().get();

        assertNotNull(activity);
    }

    @Test
    public void viewFunctionality() {
        TextView title = (TextView) ((ViewGroup) activity.findViewById(R.id.toolbar)).getChildAt(0);
        assertTrue(title.getText().toString().equals(TEST_CHARACTER_NAME));
    }

    @Test
    public void finishIfNoCharacter() {
        Intent intent = CharacterActivity.newIntent(RuntimeEnvironment.application, null);

        activity = Robolectric.buildActivity(CharacterActivity.class, intent)
                .create().get();

        assertTrue(activity.isFinishing());
    }
}
