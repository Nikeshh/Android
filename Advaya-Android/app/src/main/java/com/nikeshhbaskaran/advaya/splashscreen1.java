package com.nikeshhbaskaran.advaya;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class splashscreen1 extends Activity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen1);

        final ImageView imageView =(ImageView)findViewById(R.id.imageView);

        final Handler handler1 = new Handler();
        Runnable runnable1 = new Runnable() {
            public void run() {
                imageView.setImageResource(R.drawable.advaya1);
            }
        };
        handler1.postDelayed(runnable1, 1000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashscreen1.this, splashscreen2.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}

