package com.example.nikeshhbaskaran.psgitech;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

//Implement SurfaceHolder interface to Play video
//Implement this interface to receive information about changes to the surface
public class firstpage extends Activity implements SurfaceHolder.Callback{

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        Button buttonPlayVideo = (Button)findViewById(R.id.play);
        ImageView image=(ImageView)findViewById(R.id.imageButton2);

        getWindow().setFormat(PixelFormat.UNKNOWN);

        buttonPlayVideo.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                // VideoView refference see main.xml
                VideoView mVideoView = (VideoView) findViewById(R.id.videoView);

                String uriPath = "android.resource://com.example.nikeshhbaskaran.psgitech/" + R.raw.front;

                Uri uri = Uri.parse(uriPath);
                mVideoView.setVideoURI(uri);
                mVideoView.requestFocus();
                mVideoView.start();


            }
        });

        image.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstpage.this, com.example.PSGITECH2.thirdpage.class);
                startActivity(intent);
            }});
    }

    public void signinselection(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("FACULTY")) {

            Intent intent = new Intent(this, com.android.faculty.FacultyActivity.class);
            startActivity(intent);
        } else if (button_text.equals("STUDENT")) {
            Intent intent = new Intent(this, com.android.student.StudentActivity.class);
            startActivity(intent);
        }
        else if (button_text.equals("QUICK LAUNCH")) {
            Intent intent = new Intent(this, com.gooeymenu.MainActivity.class);
            startActivity(intent);
        }
        else if (button_text.equals("NOTIFICATION")) {
            Intent intent = new Intent(this, com.gcm.MainActivity.class);
            startActivity(intent);
        }
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