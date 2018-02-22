package assignment.vend_awais.twittersearchapi;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import assignment.vendawais.twittersearchapi.R;
import assignment.vendawais.twittersearchapi.search.view.activity.SearchActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by syed.awais.mazhar on 2/15/2018.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class SearchActivityTest {
    @Rule
    public ActivityTestRule<SearchActivity> searchActivityActivityTestRule =
            new ActivityTestRule(SearchActivity.class);
    @Test
    public void testDataFiledProperly(){
        onView(withId(R.id.et_search))
                .perform(typeText("#NA154"),closeSoftKeyboard());
        onView(withId(R.id.iv_search)).perform(click());
        onView(withId(R.id.et_search)).check(matches(withText("#NA154")));
    }
    @Test
    public void testProgressBarVisible(){
        onView(withId(R.id.et_search))
                .perform(typeText("#NA154"),closeSoftKeyboard());
        onView(withId(R.id.iv_search)).perform(click());
        onView(withId(R.id.pb_loading)).check(matches(isDisplayed()));
    }
}
