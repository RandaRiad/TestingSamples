package com.randa.testingapp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class MainActivityTest  {


   @Rule
   public ActivityScenarioRule<MainActivity> activityRule =
           new ActivityScenarioRule<>(MainActivity.class);

   @Test
   public void textEditText(){
      onView(withId(R.id.textranda)).perform(typeText("Text"));

      onView(withId(R.id.button)).perform(click());

      onView(withId(R.id.textViewranda)).check(matches(withText("Text")));
   }
}