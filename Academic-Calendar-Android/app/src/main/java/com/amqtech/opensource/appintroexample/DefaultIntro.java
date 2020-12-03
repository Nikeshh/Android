package com.amqtech.opensource.appintroexample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

import mehdi.sakout.aboutpage.sample.R;

public class DefaultIntro extends AppIntro2 {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("January", "This month is called as", R.drawable.ic_slide1, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("February", "This month is called as", R.drawable.ic_slide1, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("March", "This month is called as", R.drawable.ic_slide1, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("April", "This month is called as", R.drawable.ic_slide1, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("May", "This month is called as", R.drawable.ic_slide1, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("June", "This month is called as", R.drawable.ic_slide1, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("July", "This month is called as", R.drawable.ic_slide1, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("August", "This month is called as", R.drawable.ic_slide1, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("September", "This month is called as", R.drawable.ic_slide1, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("October", "This month is called as", R.drawable.ic_slide1, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("November", "This month is called as", R.drawable.ic_slide1, Color.parseColor("#1976D2")));
        addSlide(AppIntroFragment.newInstance("December", "This month is called as", R.drawable.ic_slide1, Color.parseColor("#1976D2")));
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        finish();
    }
}
