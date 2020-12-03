package com.roger.catloadingview;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.roger.catloadinglibrary.CatLoadingView;

import hp.nikeshhbaskaran.com.hpadweb.R;
import hp.nikeshhbaskaran.com.hpadweb.webpage2;

public class catview4 extends AppCompatActivity {

    CatLoadingView mView;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loader);

        getWindow().setFormat(PixelFormat.UNKNOWN);
        Thread mThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent startFIRSTPAGE = new Intent(getApplicationContext(), chatpubnub.MainActivity.class);
                    startActivity(startFIRSTPAGE);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        mThread.start();

        mView = new CatLoadingView();
        mView.show(getSupportFragmentManager(), "");
    }


    public void showDialog() {
        mView.show(getSupportFragmentManager(), "");
    }


    @Override public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
