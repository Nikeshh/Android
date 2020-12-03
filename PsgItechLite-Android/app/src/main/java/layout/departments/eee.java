package layout.departments;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import com.example.nikeshhbaskaran.psgitech.R;

//Implement SurfaceHolder interface to Play video
//Implement this interface to receive information about changes to the surface
public class eee extends Activity implements SurfaceHolder.Callback{

    MediaPlayer mediaPlayer;
    SurfaceView surfaceView;
    SurfaceHolder surfaceHolder;
    boolean pausing = false;;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee);

        Button buttonPlayVideo = (Button)findViewById(R.id.play);

        getWindow().setFormat(PixelFormat.UNKNOWN);

        buttonPlayVideo.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {

                // VideoView refference see main.xml
                VideoView mVideoView = (VideoView)findViewById(R.id.videoView);

                String uriPath = "android.resource://com.example.nikeshhbaskaran.psgitech/"+R.raw.core4;

                Uri uri = Uri.parse(uriPath);
                mVideoView.setVideoURI(uri);
                mVideoView.requestFocus();
                mVideoView.start();


            }});
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
    public void button3(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("SKIP INTRO")) {

            Intent intent = new Intent(this, layout.departments.eee1.class);
            startActivity(intent);

        }
    }
}