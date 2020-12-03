package com.android.student;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nikeshhbaskaran.psgitech.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class HomeActivity extends Activity implements SurfaceHolder.Callback {

    ImageView imageProfile;
    TextView textViewName, textViewEmail, textViewGender;
    String textName, textEmail, textGender, userImageUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        textViewName = (TextView) findViewById(R.id.textViewNameValue);
        imageProfile = (ImageView) findViewById(R.id.imageView1);
        Intent intent = getIntent();
        textEmail = intent.getStringExtra("email_id");
        System.out.println(textEmail);

        try {
            JSONObject profileData = new JSONObject(AbstractGetNameTask.GOOGLE_USER_DATA);

            if(profileData.has("picture")) {
                userImageUrl = profileData.getString("picture");
                new GetImageFromUrl().execute(userImageUrl);
            }
            if(profileData.has("name")) {
                textName = profileData.getString("name");
                textViewName.setText(textName);
            }
            if(profileData.has("gender")) {
                textGender = profileData.getString("gender");
                textViewGender.setText(textGender);
            }

        } catch(JSONException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }


    public class GetImageFromUrl extends AsyncTask<String, Void, Bitmap> {
        @Override
        protected Bitmap doInBackground(String... urls) {

            Bitmap map = null;
            for(String url : urls) {
                map = downloadImage(url);
            }

            return map;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            imageProfile.setImageBitmap(bitmap);
        }

        private Bitmap downloadImage(String url) {
            Bitmap bitmap = null;
            InputStream stream = null;
            BitmapFactory.Options bmOptions = new BitmapFactory.Options();
            bmOptions.inSampleSize = 1;

            try {
                stream = getHttpConnection(url);
                bitmap = BitmapFactory.decodeStream(stream, null, bmOptions);
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return bitmap;
        }

        private InputStream getHttpConnection(String urlString) throws IOException{
            InputStream stream = null;
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();

            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) connection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();

                if(httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    stream = httpURLConnection.getInputStream();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            return stream;
        }
    }
    public void groupmailnext(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Student Details")) {

            Intent intent = new Intent(this, com.example.details.class);
            startActivity(intent);

        }
        else if (button_text.equals("Group Mail")) {

            Intent intent = new Intent(this, com.android.student.GroupMail.class);
            startActivity(intent);

        }
        else if (button_text.equals("Next")) {

            Intent intent = new Intent(this, com.example.PSGITECH2.thirdpage.class);
            startActivity(intent);

        }
    }
}
