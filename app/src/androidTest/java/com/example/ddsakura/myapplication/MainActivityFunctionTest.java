package com.example.ddsakura.myapplication;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import junit.framework.Assert;

/**
 * Created by ddsakurambpr on 5/1/15.
 */
public class MainActivityFunctionTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public MainActivityFunctionTest() {
        super(MainActivity.class);
    }

    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testPreferenceIsSaved() throws Exception {

        Assert.assertTrue(solo.searchText("Hello world!"));

    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
}
