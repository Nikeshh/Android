package layout.otheractivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nikeshhbaskaran.psgitech.R;

public class facultyprofile9 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultyprofile9);
    }
    public boolean buttonClicked(View view) {
        if (view.getId() == R.id.english_mail1) {

            Intent intent = new Intent(this, com.mail.mail50.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.english_mail2) {

            Intent intent = new Intent(this, com.mail.mail51.class);
            startActivity(intent);
            return true;

        }
        return false;
    }
}
