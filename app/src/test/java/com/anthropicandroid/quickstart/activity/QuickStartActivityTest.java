package com.anthropicandroid.quickstart.activity;


import com.anthropicandroid.quickstart.BuildConfig;
import com.anthropicandroid.quickstart.testUtils.RoboTestRunner;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLog;

import java.util.ArrayList;
import java.util.List;

import rx.android.plugins.RxAndroidPlugins;
import rx.observers.TestSubscriber;

/*
 * Created by Andrew Brin on 5/20/2016.
 */

@RunWith(RoboTestRunner.class)
@Config(constants = BuildConfig.class)
public class QuickStartActivityTest extends TestCase {

    public static final String TAG = QuickStartActivityTest.class.getSimpleName();
    private QuickStartActivity subject;

    @Before
    public void setUp() throws Exception {
        ShadowLog.stream = System.out;
        subject = Robolectric.setupActivity(QuickStartActivity.class);
    }

    @After
    public void tearDown(){
        RxAndroidPlugins.getInstance().reset();
    }

    @Test
    public void testCheckIfRoboAndRxArePlayingNice() throws Exception {
        TestSubscriber<Integer> testSubscriber = new TestSubscriber<>();
        subject.getFirstObs().subscribe(testSubscriber);
        List<Integer> events = testSubscriber.getOnNextEvents();
        testSubscriber.assertNoErrors();
        assertEquals(
                new ArrayList<Integer>() {{
                    add(0);
                    add(3);
                    add(6);
                    add(9);
                }},
                events);
        testSubscriber.assertCompleted();
    }

}