package layout.otheractivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nikeshhbaskaran.psgitech.R;

public class facultyprofile3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultyprofile3);
    }
    public boolean buttonClicked(View view) {
        if (view.getId() == R.id.civil_mail1) {

            Intent intent = new Intent(this, com.mail.mail18.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.civil_mail2) {

            Intent intent = new Intent(this, com.mail.mail19.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.civil_mail3){

            Intent intent = new Intent(this, com.mail.mail20.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.civil_mail4){
            Intent intent = new Intent(this, com.mail.mail21.class);
            startActivity(intent);
            return true;
        }
        else if (view.getId() == R.id.civil_mail5){

            Intent intent = new Intent(this, com.mail.mail22.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.civil_mail6){

            Intent intent = new Intent(this, com.mail.mail23.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.civil_mail7){

            Intent intent = new Intent(this, com.mail.mail24.class);
            startActivity(intent);
            return true;

        }
        return false;
    }
}
