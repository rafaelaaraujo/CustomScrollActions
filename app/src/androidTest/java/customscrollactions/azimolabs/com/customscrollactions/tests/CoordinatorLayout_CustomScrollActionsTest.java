package customscrollactions.azimolabs.com.customscrollactions.tests;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import customscrollactions.azimolabs.com.customscrollactions.R;
import customscrollactions.azimolabs.com.customscrollactions.ui.CoordinatorLayoutActivity;
import customscrollactions.azimolabs.com.customscrollactions.utils.CustomScrollActions;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by F1sherKK on 18/05/2017.
 */

public class CoordinatorLayout_CustomScrollActionsTest {

    @Rule
    public ActivityTestRule<CoordinatorLayoutActivity> activityRule = new ActivityTestRule<>(
            CoordinatorLayoutActivity.class, true, false
    );


    @Before
    public void setUp() throws Exception {
        activityRule.launchActivity(new Intent());
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test_shouldBeAbleToScroll_toAllViews() {
        onView(withId(R.id.tvText1))
                .perform(CustomScrollActions.nestedScrollTo())
                .check(matches(isCompletelyDisplayed()));

        onView(withId(R.id.tvText20))
                .perform(CustomScrollActions.nestedScrollTo())
                .check(matches(isCompletelyDisplayed()));
    }
}
