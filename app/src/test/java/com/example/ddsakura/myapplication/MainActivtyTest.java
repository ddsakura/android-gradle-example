package com.example.ddsakura.myapplication;

import android.app.Activity;
import android.os.Build;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

/**
 * Created by ddsakurambpr on 4/30/15.
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.JELLY_BEAN)
public class MainActivtyTest {
    @Test
    public void titleIsCorrect() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        assertTrue(activity.getTitle().toString().equals("MyApplication"));
    }

}
