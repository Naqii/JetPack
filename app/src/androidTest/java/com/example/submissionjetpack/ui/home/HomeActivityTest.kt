package com.example.submissionjetpack.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.submissionjetpack.R
import com.example.submissionjetpack.utils.DataDummy
import org.junit.Rule
import org.junit.Test

class HomeActivityTest {
    private val dummyMovie = DataDummy.generateDummyMovie()
    private val dummyTv = DataDummy.generateDummyTv()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadTab() {
        onView(withId(R.id.tabs)).check(matches(isDisplayed()))
        onView(withId(R.id.view_pager)).perform(swipeLeft())
        onView(withId(R.id.view_pager)).perform(swipeRight())
    }

    @Test
    fun loadMovie() {
        onView(withId(R.id.movie_series)).check(matches(isDisplayed()))
        onView(withId(R.id.movie_series)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovie.size
            )
        )
    }

    @Test
    fun loadDetaiMovie() {
        onView(withId(R.id.movie_series)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.detail_image)).check(matches(isDisplayed()))

        onView(withId(R.id.detail_title)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_title)).check(matches(withText(dummyMovie[0].title)))

        onView(withId(R.id.detail_year)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_year)).check(matches(withText(dummyMovie[0].year)))

        onView(withId(R.id.detail_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_genre)).check(matches(withText(dummyMovie[0].genre)))

        onView(withId(R.id.detail_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_rating)).check(matches(withText(dummyMovie[0].rating.toString())))

        onView(withId(R.id.overview)).check(matches(isDisplayed()))
        onView(withId(R.id.overview)).check(matches(withText(dummyMovie[0].detail)))
    }

    @Test
    fun loadTvSeries() {
        onView(withId(R.id.view_pager)).perform(swipeLeft())
        onView(withId(R.id.tv_series)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_series)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyTv.size
            )
        )
    }

    @Test
    fun loadTvSeriesDetail() {
        onView(withId(R.id.view_pager)).perform(swipeLeft())
        onView(withId(R.id.tv_series)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.detail_image)).check(matches(isDisplayed()))

        onView(withId(R.id.detail_title)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_title)).check(matches(withText(dummyTv[0].title)))

        onView(withId(R.id.detail_year)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_year)).check(matches(withText(dummyTv[0].year)))

        onView(withId(R.id.detail_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_genre)).check(matches(withText(dummyTv[0].genre)))

        onView(withId(R.id.detail_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.detail_rating)).check(matches(withText(dummyTv[0].rating.toString())))

        onView(withId(R.id.overview)).check(matches(isDisplayed()))
        onView(withId(R.id.overview)).check(matches(withText(dummyTv[0].detail)))
    }
}