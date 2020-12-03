package hp.nikeshhbaskaran.com.hpadweb;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;

public class splashscreen extends Activity{

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        getWindow().setFormat(PixelFormat.UNKNOWN);
        Thread mThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent startFIRSTPAGE = new Intent(getApplicationContext(), com.example.android.io2014.MainActivity.class);
                    startActivity(startFIRSTPAGE);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        mThread.start();

    }

}