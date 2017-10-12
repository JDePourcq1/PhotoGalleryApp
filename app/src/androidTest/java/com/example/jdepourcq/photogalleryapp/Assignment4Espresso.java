package com.example.jdepourcq.photogalleryapp;

/**
 * Created by JDePourcq on 2017-10-05.
 */
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
public class Assignment4Espresso {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void ensureTextChangesWork() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.location))
                .perform(typeText("Vancouver"), closeSoftKeyboard());
        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.results)).check(matches(withText("ID: 1 ,Location: Vancouver ID: 4 ,Location: Vancouver ID: 7 ,Location: Vancouver ID: 10 ,Location: Vancouver ID: 13 ,Location: Vancouver ID: 16 ,Location: Vancouver ID: 19 ,Location: Vancouver ")));

    }
}
