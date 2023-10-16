package com.example.hangman

import androidx.fragment.app.testing.FragmentScenario
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ChooseLetterPanelInstrumentedTest {
    @Test
    fun buttonStateChangeOnClickTest() {
            ActivityScenario.launch(MainActivity::class.java)
            FragmentScenario.launchInContainer(ChooseLetterPanel::class.java)
            Espresso.onView(ViewMatchers.withId(R.id.a_button)).perform(ViewActions.click())
            Espresso.onView(ViewMatchers.withId(R.id.b_button)).perform(ViewActions.click())
            Espresso.onView(ViewMatchers.withId(R.id.c_button)).perform(ViewActions.click())
            Espresso.onView(ViewMatchers.withId(R.id.a_button)).check(ViewAssertions.matches(
                Matchers.not(ViewMatchers.isEnabled())))
            Espresso.onView(ViewMatchers.withId(R.id.b_button)).check(ViewAssertions.matches(
                Matchers.not(ViewMatchers.isEnabled())))
            Espresso.onView(ViewMatchers.withId(R.id.c_button)).check(ViewAssertions.matches(
                Matchers.not(ViewMatchers.isEnabled())))
        }
    }