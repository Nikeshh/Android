package com.etiennelawlor.imagegallery.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.etiennelawlor.imagegallery.library.activities.ImageGalleryActivity;
import com.etiennelawlor.imagegallery.library.enums.PaletteColorType;
import com.example.nikeshhbaskaran.psgitech.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gallery);
    }

    public void gallery(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Campus")) {
            Intent intent = new Intent(MainActivity.this, ImageGalleryActivity.class);

            ArrayList<String> images = new ArrayList<>();

            images.add("http://www.psgitech.ac.in/data1/images/1.jpg");
            images.add("http://www.psgitech.ac.in/data1/images/2.jpg");
            images.add("http://www.psgitech.ac.in/data1/images/3.jpg");
            images.add("http://www.psgitech.ac.in/data1/images/4.jpg");
            images.add("http://www.psgitech.ac.in/data1/images/5.jpg");
            images.add("http://www.psgitech.ac.in/img/Academics_banner.jpg");

            intent.putStringArrayListExtra("images", images);
            intent.putExtra("palette_color_type", PaletteColorType.VIBRANT);

            startActivity(intent);
        }
        else if (button_text.equals("Library")) {
            Intent intent = new Intent(MainActivity.this, ImageGalleryActivity.class);

            ArrayList<String> images = new ArrayList<>();

            images.add("http://www.psgitech.ac.in/admin/library_image2/library_12.jpg");
            images.add("http://www.psgitech.ac.in/admin/library_image3/library_12.jpg");
            images.add("http://www.psgitech.ac.in/admin/library_image1/library_12.jpg");

            intent.putStringArrayListExtra("images", images);
            intent.putExtra("palette_color_type", PaletteColorType.VIBRANT);

            startActivity(intent);
        }
        else if (button_text.equals("Class Rooms")) {
            Intent intent = new Intent(MainActivity.this, ImageGalleryActivity.class);

            ArrayList<String> images = new ArrayList<>();

            images.add("http://www.psgitech.ac.in/admin/class_room_image1/class_room_6.jpg");
            images.add("http://www.psgitech.ac.in/admin/class_room_image2/class_room_6.jpg");
            images.add("http://www.psgitech.ac.in/admin/class_room_image3/class_room_6.jpg");

            intent.putStringArrayListExtra("images", images);
            intent.putExtra("palette_color_type", PaletteColorType.VIBRANT);

            startActivity(intent);
        }
        else if (button_text.equals("Hostels")) {
            Intent intent = new Intent(MainActivity.this, ImageGalleryActivity.class);

            ArrayList<String> images = new ArrayList<>();

            images.add("http://www.psgitech.ac.in/admin/hostel_image1/hostel_6.jpg");
            images.add("http://www.psgitech.ac.in/admin/hostel_image2/hostel_6.jpg");
            images.add("http://www.psgitech.ac.in/admin/hostel_image3/hostel_6.jpg");

            intent.putStringArrayListExtra("images", images);
            intent.putExtra("palette_color_type", PaletteColorType.VIBRANT);

            startActivity(intent);
        }
        else if (button_text.equals("Conference Halls")) {
            Intent intent = new Intent(MainActivity.this, ImageGalleryActivity.class);

            ArrayList<String> images = new ArrayList<>();

            images.add("http://www.psgitech.ac.in/admin/conference_hall_image2/conference_hall_5.JPG");
            images.add("http://www.psgitech.ac.in/admin/conference_hall_image3/conference_hall_5.JPG");
            images.add("http://www.psgitech.ac.in/admin/conference_hall_image1/conference_hall_5.JPG");

            intent.putStringArrayListExtra("images", images);
            intent.putExtra("palette_color_type", PaletteColorType.VIBRANT);

            startActivity(intent);
        }
        else if (button_text.equals("Facilities")) {
            Intent intent = new Intent(MainActivity.this, ImageGalleryActivity.class);

            ArrayList<String> images = new ArrayList<>();

            images.add("http://www.psgitech.ac.in/admin/medical_care_image1/medical_care_4.jpg");
            images.add("http://www.psgitech.ac.in/admin/medical_care_image2/medical_care_4.jpg");
            images.add("http://www.psgitech.ac.in/admin/medical_care_image3/medical_care_4.jpg");
            images.add("http://www.psgitech.ac.in/admin/transport_image1/transport_5.jpg");

            intent.putStringArrayListExtra("images", images);
            intent.putExtra("palette_color_type", PaletteColorType.VIBRANT);

            startActivity(intent);
        }
        else if (button_text.equals("More Photos")) {

            Intent intent = new Intent(MainActivity.this, morephotos.class);
            startActivity(intent);

        }
        else if (button_text.equals("Videos")) {

            Intent intent = new Intent(MainActivity.this, videos.class);
            startActivity(intent);

        }
    }
}
