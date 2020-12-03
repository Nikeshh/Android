package com.nikeshhbaskaran.psgitechmini;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }
    public void groupmailnext(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Attendance")) {

            Intent intent = new Intent(this, com.nikeshhbaskaran.psgitechmini.Attendance.class);
            startActivity(intent);

        }
        else if (button_text.equals("Other Details")) {

            Intent intent = new Intent(this, com.nikeshhbaskaran.psgitechmini.otherdetails.class);
            startActivity(intent);

        }
        else if (button_text.equals("Report")) {

            Intent intent = new Intent(this, com.nikeshhbaskaran.psgitechmini.report1.class);
            startActivity(intent);

        }
        else if (button_text.equals("Fees")) {

            Intent intent = new Intent(this, com.nikeshhbaskaran.psgitechmini.fees.class);
            startActivity(intent);

        }
        else if (button_text.equals("Leave")) {

            Intent intent = new Intent(this, com.nikeshhbaskaran.psgitechmini.leave1.class);
            startActivity(intent);

        }

    }

}
