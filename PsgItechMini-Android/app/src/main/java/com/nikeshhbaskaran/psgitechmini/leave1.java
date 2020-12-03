package com.nikeshhbaskaran.psgitechmini;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

            Intent intent = new Intent(this, com.nikeshhbaskaran.psgitechmini.leaveform.class);
            startActivity(intent);

        }
        else if (button_text.equals("NEXT")) {

            Intent intent = new Intent(this, com.nikeshhbaskaran.psgitechmini.leave2.class);
            startActivity(intent);

        }

    }

}