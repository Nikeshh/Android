package com.example.nikeshhbaskaran.academiccalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import mehdi.sakout.aboutpage.sample.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.detail).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,com.amqtech.opensource.appintroexample.DefaultIntro.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.january).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,mehdi.sakout.aboutpage.January.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.february).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,mehdi.sakout.aboutpage.February.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.march).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,mehdi.sakout.aboutpage.March.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.april).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,mehdi.sakout.aboutpage.April.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.may).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,mehdi.sakout.aboutpage.May.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.june).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,mehdi.sakout.aboutpage.June.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.july).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,mehdi.sakout.aboutpage.July.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.august).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,mehdi.sakout.aboutpage.August.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.september).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,mehdi.sakout.aboutpage.September.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.october).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,mehdi.sakout.aboutpage.October.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.november).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,mehdi.sakout.aboutpage.November.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.december).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,mehdi.sakout.aboutpage.December.class);
                startActivity(intent);
            }
        });


    }

}
