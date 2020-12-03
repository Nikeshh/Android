package com.nikeshhbaskaran.advaya;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class splashscreen2 extends Activity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen2);

        final ImageView imageView1 =(ImageView)findViewById(R.id.imageView1);
        final ImageView imageView2 =(ImageView)findViewById(R.id.imageView2);
        final TextView textView =(TextView)findViewById(R.id.textView);

        final Handler handler1 = new Handler();
        Runnable runnable1 = new Runnable() {
            public void run() {
                imageView1.setImageResource(R.drawable.collegelogo);
            }
        };
        handler1.postDelayed(runnable1, 1000);

        final Handler handler2 = new Handler();
        Runnable runnable2 = new Runnable() {
            public void run() {
                imageView2.setImageResource(R.drawable.psgitech);
            }
        };
        handler2.postDelayed(runnable2, 1500);

        final Handler handler3 = new Handler();
        Runnable runnable3 = new Runnable() {
            public void run() {
                textView.setText("Culturals");
            }
        };
        handler2.postDelayed(runnable3, 2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashscreen2.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}

