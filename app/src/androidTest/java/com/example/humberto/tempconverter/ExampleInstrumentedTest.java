package com.example.humberto.tempconverter;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Before
    public void setUp() {
        onView(withId(R.id.temp_input))
                .perform(typeText(""));
        Espresso.closeSoftKeyboard();
    }

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.humberto.tempconverter", appContext.getPackageName());
    }

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void ensureCelsiusToFahIsChanged() {
        onView(withId(R.id.temp_input))
                .perform(typeText("0"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.cel_to_fah)).perform(click());

        onView(withId(R.id.temp_output)).check(matches(withText("32.0ºF")));


    }

    @Test
    public void ensureFahToCelsiusIsChanged() {
        onView(withId(R.id.temp_input))
                .perform(typeText("32"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.fah_to_cel)).perform(click());
        onView(withId(R.id.temp_output)).check(matches(withText("0.0")));
    }
}
