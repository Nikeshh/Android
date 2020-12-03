package com.nikeshhbaskaran.psgitechmini;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void groupmailnext(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("FACULTY")) {

            Intent intent = new Intent(this, com.nikeshhbaskaran.psgitechmini.android.faculty.FacultyActivity.class);
            startActivity(intent);

        }
        else if (button_text.equals("STUDENT")) {

            Intent intent = new Intent(this, com.nikeshhbaskaran.psgitechmini.android.student.StudentActivity.class);
            startActivity(intent);

        }

    }

}
