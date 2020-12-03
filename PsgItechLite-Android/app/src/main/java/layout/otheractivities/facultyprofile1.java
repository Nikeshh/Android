package layout.otheractivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nikeshhbaskaran.psgitech.R;

public class facultyprofile1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultyprofile1);
    }
    public boolean buttonClicked(View view) {
        if (view.getId() == R.id.cse_mail1) {

            Intent intent = new Intent(this, com.mail.mail1.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.cse_mail2) {

            Intent intent = new Intent(this, com.mail.mail2.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.cse_mail3){

            Intent intent = new Intent(this, com.mail.mail3.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.cse_mail4){
            Intent intent = new Intent(this, com.mail.mail4.class);
            startActivity(intent);
            return true;
        }
        else if (view.getId() == R.id.cse_mail5){

            Intent intent = new Intent(this, com.mail.mail5.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.cse_mail6){

            Intent intent = new Intent(this, com.mail.mail6.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.cse_mail7){

            Intent intent = new Intent(this, com.mail.mail7.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.cse_mail8){

            Intent intent = new Intent(this, com.mail.mail8.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.cse_mail9){

            Intent intent = new Intent(this, com.mail.mail9.class);
            startActivity(intent);
            return true;

        }
        return false;
    }
}
