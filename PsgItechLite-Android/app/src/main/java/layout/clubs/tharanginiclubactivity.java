package layout.clubs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.nikeshhbaskaran.psgitech.R;

public class tharanginiclubactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clubpage);
    }
    public void groupmailnext3(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Chat")) {

            Intent intent = new Intent(this, com.extensions1.ext12_1.class);
            startActivity(intent);
        } else if (button_text.equals("Club")) {
            Intent intent = new Intent(this, com.extensions1.ext12_2.class);
            startActivity(intent);
        }
        else if (button_text.equals("Group Mail")) {
            Intent intent = new Intent(this, com.extensions1.ext12_3.class);
            startActivity(intent);
        }
    }
}
