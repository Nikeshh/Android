package layout.otheractivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nikeshhbaskaran.psgitech.R;

public class facultyprofile2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultyprofile2);
    }
    public boolean buttonClicked(View view) {
        if (view.getId() == R.id.ece_mail1) {

            Intent intent = new Intent(this, com.mail.mail10.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.ece_mail2) {

            Intent intent = new Intent(this, com.mail.mail11.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.ece_mail3){

            Intent intent = new Intent(this, com.mail.mail12.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.ece_mail4){
            Intent intent = new Intent(this, com.mail.mail13.class);
            startActivity(intent);
            return true;
        }
        else if (view.getId() == R.id.ece_mail5){

            Intent intent = new Intent(this, com.mail.mail14.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.ece_mail6){

            Intent intent = new Intent(this, com.mail.mail15.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.ece_mail7){

            Intent intent = new Intent(this, com.mail.mail16.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.ece_mail8){

            Intent intent = new Intent(this, com.mail.mail17.class);
            startActivity(intent);
            return true;

        }
        return false;
    }
}
