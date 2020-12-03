package com.nikeshhbaskaran.psgitechmini;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.widget.VideoView;

//Implement SurfaceHolder interface to Play video
//Implement this interface to receive information about changes to the surface
public class splash extends Activity implements SurfaceHolder.Callback{

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        getWindow().setFormat(PixelFormat.UNKNOWN);
        Thread mThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5000);
                    Intent startFIRSTPAGE = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(startFIRSTPAGE);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        mThread.start();

        // VideoView refference see main.xml
        VideoView mVideoView = (VideoView) findViewById(R.id.videoView);

        String uriPath = "android.resource://com.example.nikeshhbaskaran.psgitech/" +R.raw.splash;

        Uri uri = Uri.parse(uriPath);
        mVideoView.setVideoURI(uri);
        mVideoView.requestFocus();
        mVideoView.start();

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width,
                               int height) {
        // TODO Auto-generated method stub

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        // TODO Auto-generated method stub

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        // TODO Auto-generated method stub

    }
}