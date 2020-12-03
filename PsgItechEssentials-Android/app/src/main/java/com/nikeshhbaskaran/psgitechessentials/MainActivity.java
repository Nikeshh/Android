package com.nikeshhbaskaran.psgitechessentials;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.numix.calculator.Calculator;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void groupmailnext(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("CGPA CALCULATOR")) {

            Intent intent = new Intent(this, com.nikeshhbaskaran.psgitechessentials.cgpacalculator.Main.class);
            startActivity(intent);

        } else if (button_text.equals("NEWS")) {

            Intent intent = new Intent(this, com.nikeshhbaskaran.psgitechessentials.news.news.class);
            startActivity(intent);

        }
        else if (button_text.equals("STUDENT PROFILE")) {

            Intent intent = new Intent(this, com.nikeshhbaskaran.psgitechessentials.studentprofile.HomeActivity.class);
            startActivity(intent);

        }
        else if (button_text.equals("NOTES")) {

            Intent intent = new Intent(this, com.nikeshhbaskaran.psgitechessentials.notes.MainActivity.class);
            startActivity(intent);

        }
        else if (button_text.equals("MATERIALS")) {

            Intent intent = new Intent(this, com.nikeshhbaskaran.psgitechessentials.materials.materials.class);
            startActivity(intent);

        }
        else if (button_text.equals("SCIENTIFIC CALCULATOR")) {

            Intent intent = new Intent(this, Calculator.class);
            startActivity(intent);

        }

    }

}
