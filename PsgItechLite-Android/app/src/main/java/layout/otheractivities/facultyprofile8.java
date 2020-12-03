package layout.otheractivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nikeshhbaskaran.psgitech.R;

public class facultyprofile8 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultyprofile8);
    }
    public boolean buttonClicked(View view) {
        if (view.getId() == R.id.physics_mail1) {

            Intent intent = new Intent(this, com.mail.mail47.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.physics_mail2) {

            Intent intent = new Intent(this, com.mail.mail48.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.physics_mail3){

            Intent intent = new Intent(this, com.mail.mail49.class);
            startActivity(intent);
            return true;

        }
        return false;
    }
}
