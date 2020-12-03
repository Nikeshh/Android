package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nikeshhbaskaran.psgitech.R;

public class report1 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
    }

    public void buttonreport(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("NEXT")) {

            Intent intent = new Intent(this, com.example.report2.class);
            startActivity(intent);

        }
    }
}