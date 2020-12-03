package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nikeshhbaskaran.psgitech.R;

public class leave1 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave);
    }
    public void buttonleave(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("LEAVE FORM")) {

            Intent intent = new Intent(this, com.example.leaveform.class);
            startActivity(intent);

        }
        else if (button_text.equals("OD")) {

            Intent intent = new Intent(this, com.example.OD.class);
            startActivity(intent);

        }
        else if (button_text.equals("LEAVE")) {

            Intent intent = new Intent(this, com.example.leave2.class);
            startActivity(intent);

        }
    }
}