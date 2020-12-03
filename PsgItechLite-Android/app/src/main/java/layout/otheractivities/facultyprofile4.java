package layout.otheractivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nikeshhbaskaran.psgitech.R;

public class facultyprofile4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultyprofile4);
    }
    public boolean buttonClicked(View view) {
        if (view.getId() == R.id.eee_mail1) {

            Intent intent = new Intent(this, com.mail.mail25.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.eee_mail2) {

            Intent intent = new Intent(this, com.mail.mail26.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.eee_mail3){

            Intent intent = new Intent(this, com.mail.mail27.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.eee_mail4){
            Intent intent = new Intent(this, com.mail.mail28.class);
            startActivity(intent);
            return true;
        }
        else if (view.getId() == R.id.eee_mail5){

            Intent intent = new Intent(this, com.mail.mail29.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.eee_mail6){

            Intent intent = new Intent(this, com.mail.mail30.class);
            startActivity(intent);
            return true;

        }
        return false;
    }
}
