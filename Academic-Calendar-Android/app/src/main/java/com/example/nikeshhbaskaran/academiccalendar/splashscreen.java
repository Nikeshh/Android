package com.example.nikeshhbaskaran.academiccalendar;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mikhaellopez.circularfillableloaderssample.loader;

import mehdi.sakout.aboutpage.sample.R;

public class splashscreen extends AppCompatActivity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

         /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(splashscreen.this,com.example.nikeshhbaskaran.academiccalendar.MainActivity.class);
                startActivity(mainIntent);
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
