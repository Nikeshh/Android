package layout.otheractivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nikeshhbaskaran.psgitech.R;

public class facultyprofile5 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultyprofile5);
    }
    public boolean buttonClicked(View view) {
        if (view.getId() == R.id.mech_mail1) {

            Intent intent = new Intent(this, com.mail.mail31.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.mech_mail2) {

            Intent intent = new Intent(this, com.mail.mail32.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.mech_mail3){

            Intent intent = new Intent(this, com.mail.mail33.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.mech_mail4){
            Intent intent = new Intent(this, com.mail.mail34.class);
            startActivity(intent);
            return true;
        }
        else if (view.getId() == R.id.mech_mail5){

            Intent intent = new Intent(this, com.mail.mail35.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.mech_mail6){

            Intent intent = new Intent(this, com.mail.mail36.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.mech_mail7){

            Intent intent = new Intent(this, com.mail.mail37.class);
            startActivity(intent);
            return true;

        }
        return false;
    }
}
