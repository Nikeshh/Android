package com.mikhaellopez.circularfillableloaderssample;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.mikhaellopez.circularfillableloaders.CircularFillableLoaders;

import mehdi.sakout.aboutpage.sample.R;

public class loader extends AppCompatActivity {

    private CircularFillableLoaders circularFillableLoaders;

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loader);

        circularFillableLoaders = (CircularFillableLoaders) findViewById(R.id.circularFillableLoaders);

         /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(loader.this,com.example.nikeshhbaskaran.academiccalendar.splashscreen.class);
                startActivity(mainIntent);
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}
