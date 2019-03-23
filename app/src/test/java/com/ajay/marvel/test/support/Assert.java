package com.ajay.marvel.test.support;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.support.annotation.StringRes;
import android.view.View;

import org.hamcrest.MatcherAssert;
import org.robolectric.shadows.ShadowAlertDialog;
import org.robolectric.shadows.ShadowProgressDialog;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertNotNull;
import static org.robolectric.Shadows.shadowOf;

/**
 * @Author Created by AjayDeepak on 08/09/201821/10/2016.
 */

public class Assert {

    public static void assertViewIsVisible(View view) {
        assertNotNull(view);
        assertThat(view.getVisibility(), equalTo(View.VISIBLE));
    }

    public static void assertViewIsNotVisible(View view) {
        assertNotNull(view);
        assertThat(view.getVisibility(), not(equalTo(View.VISIBLE)));
    }

    public static void assertAlertDialogIsShown(@StringRes int title, @StringRes int message) {
        AlertDialog alert = ShadowAlertDialog.getLatestAlertDialog();
        ShadowAlertDialog shadowAlertDialog = shadowOf(alert);
        MatcherAssert.assertThat(shadowAlertDialog.getTitle().toString(), equalTo(
                ResourceLocator.getString(title)));
        MatcherAssert.assertThat(shadowAlertDialog.getMessage().toString(), equalTo(
                ResourceLocator.getString(message)));
    }

    public static void assertProgressDialogIsShown(@StringRes int title) {
        ProgressDialog alert = (ProgressDialog) ShadowProgressDialog.getLatestAlertDialog();
        ShadowProgressDialog shadowProgressDialog = shadowOf(alert);
        MatcherAssert.assertThat(shadowProgressDialog.getTitle().toString(), equalTo(
                ResourceLocator.getString(title)));
    }
}
