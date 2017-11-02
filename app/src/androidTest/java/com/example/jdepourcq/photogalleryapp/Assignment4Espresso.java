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
    public void DisplayAll1() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("first")));
        onView(withId(R.id.locationText)).check(matches(withText("London")));
        onView(withId(R.id.dateText)).check(matches(withText("05/22/2017")));
    }

    @Test
    public void DisplayAll2() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("second")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("22")));
    }

    @Test
    public void DisplayAll3() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("Howdy")));
        onView(withId(R.id.locationText)).check(matches(withText("Toronto")));
        onView(withId(R.id.dateText)).check(matches(withText("22")));
    }

    @Test
    public void DisplayAll4() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("baseball")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("63")));
    }

    @Test
    public void DisplayAll5() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("kgkhg")));
        onView(withId(R.id.locationText)).check(matches(withText("Toronto")));
        onView(withId(R.id.dateText)).check(matches(withText("33")));
    }

    @Test
    public void DisplayAll6() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("wklj")));
        onView(withId(R.id.locationText)).check(matches(withText("blah")));
        onView(withId(R.id.dateText)).check(matches(withText("2")));
    }

    @Test
    public void DisplayAll7() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("WINNERS")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("01/11/2017")));
    }

    @Test
    public void DisplayAll8() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("abcd")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("22")));
    }

    @Test
    public void DisplayAll9() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("abcd")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("22")));
    }

    @Test
    public void DisplayAll10() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.prevButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("first")));
        onView(withId(R.id.locationText)).check(matches(withText("London")));
        onView(withId(R.id.dateText)).check(matches(withText("05/22/2017")));
    }

    @Test
    public void DisplayAll11() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("WINNERS")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("01/11/2017")));
    }

    @Test
    public void DisplayAll12() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("wklj")));
        onView(withId(R.id.locationText)).check(matches(withText("blah")));
        onView(withId(R.id.dateText)).check(matches(withText("2")));
    }

    @Test
    public void DisplayAll13() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("kgkhg")));
        onView(withId(R.id.locationText)).check(matches(withText("Toronto")));
        onView(withId(R.id.dateText)).check(matches(withText("33")));
    }

    @Test
    public void DisplayAll14() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("baseball")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("63")));
    }

    @Test
    public void DisplayAll16() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("Howdy")));
        onView(withId(R.id.locationText)).check(matches(withText("Toronto")));
        onView(withId(R.id.dateText)).check(matches(withText("22")));
    }

    @Test
    public void DisplayAll17() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("second")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("22")));
    }

    @Test
    public void DisplayAll18() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("first")));
        onView(withId(R.id.locationText)).check(matches(withText("London")));
        onView(withId(R.id.dateText)).check(matches(withText("05/22/2017")));
    }

    @Test
    public void DisplayAll19() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());
        onView(withId(R.id.prevButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("first")));
        onView(withId(R.id.locationText)).check(matches(withText("London")));
        onView(withId(R.id.dateText)).check(matches(withText("05/22/2017")));
    }

    @Test
    public void HoustonSearch1() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.location)).perform(typeText("Houston"), closeSoftKeyboard());

        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("second")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("22")));
    }

    @Test
    public void HoustonSearch2() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.location)).perform(typeText("Houston"), closeSoftKeyboard());

        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("baseball")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("63")));
    }

    @Test
    public void HoustonSearch3() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.location)).perform(typeText("Houston"), closeSoftKeyboard());

        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("WINNERS")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("01/11/2017")));
    }

    @Test
    public void HoustonSearch4() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.location)).perform(typeText("Houston"), closeSoftKeyboard());

        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("abcd")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("22")));
    }

    @Test
    public void HoustonSearch5() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.location)).perform(typeText("Houston"), closeSoftKeyboard());

        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("abcd")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("22")));
    }

    @Test
    public void HoustonSearch6() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.location)).perform(typeText("Houston"), closeSoftKeyboard());

        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.prevButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("second")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("22")));
    }

    @Test
    public void iSearch1() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.keyword)).perform(typeText("i"), closeSoftKeyboard());

        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("first")));
        onView(withId(R.id.locationText)).check(matches(withText("London")));
        onView(withId(R.id.dateText)).check(matches(withText("05/22/2017")));
    }

    @Test
    public void iSearch2() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.keyword)).perform(typeText("i"), closeSoftKeyboard());

        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("WINNERS")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("01/11/2017")));
    }

    @Test
    public void iSearch3() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.keyword)).perform(typeText("i"), closeSoftKeyboard());

        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("WINNERS")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("01/11/2017")));
    }

    @Test
    public void iSearch4() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.keyword)).perform(typeText("i"), closeSoftKeyboard());

        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.prevButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("first")));
        onView(withId(R.id.locationText)).check(matches(withText("London")));
        onView(withId(R.id.dateText)).check(matches(withText("05/22/2017")));
    }

    @Test
    public void eAndHoustonSearch1() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.keyword)).perform(typeText("e"), closeSoftKeyboard());
        onView(withId(R.id.location)).perform(typeText("Houston"), closeSoftKeyboard());

        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("second")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("22")));
    }

    @Test
    public void eAndHoustonSearch2() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.keyword)).perform(typeText("e"), closeSoftKeyboard());
        onView(withId(R.id.location)).perform(typeText("Houston"), closeSoftKeyboard());

        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("baseball")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("63")));
    }

    @Test
    public void eAndHoustonSearch3() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.keyword)).perform(typeText("e"), closeSoftKeyboard());
        onView(withId(R.id.location)).perform(typeText("Houston"), closeSoftKeyboard());

        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("WINNERS")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("01/11/2017")));
    }

    @Test
    public void eAndHoustonSearch4() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.keyword)).perform(typeText("e"), closeSoftKeyboard());
        onView(withId(R.id.location)).perform(typeText("Houston"), closeSoftKeyboard());

        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());
        onView(withId(R.id.nextButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("WINNERS")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("01/11/2017")));
    }

    @Test
    public void eAndHoustonSearch5() {
        onView(withId(R.id.logInButton)).perform(click());

        onView(withId(R.id.searchButton)).perform(click());

        onView(withId(R.id.keyword)).perform(typeText("e"), closeSoftKeyboard());
        onView(withId(R.id.location)).perform(typeText("Houston"), closeSoftKeyboard());

        onView(withId(R.id.searchButton2)).perform(click());

        onView(withId(R.id.prevButton)).perform(click());

        onView(withId(R.id.descriptionText)).check(matches(withText("second")));
        onView(withId(R.id.locationText)).check(matches(withText("Houston")));
        onView(withId(R.id.dateText)).check(matches(withText("22")));
    }

}
