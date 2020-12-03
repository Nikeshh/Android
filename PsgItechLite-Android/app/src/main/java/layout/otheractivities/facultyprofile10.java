package layout.otheractivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nikeshhbaskaran.psgitech.R;

public class facultyprofile10 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultyprofile10);
    }
    public boolean buttonClicked(View view) {
        if (view.getId() == R.id.language1_mail1) {

            Intent intent = new Intent(this, com.mail.mail52.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.language1_mail2) {

            Intent intent = new Intent(this, com.mail.mail53.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.language1_mail3){

            Intent intent = new Intent(this, com.mail.mail54.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.language1_mail4){
            Intent intent = new Intent(this, com.mail.mail55.class);
            startActivity(intent);
            return true;
        }
        else if (view.getId() == R.id.language1_mail5){
            Intent intent = new Intent(this, com.mail.mail56.class);
            startActivity(intent);
            return true;
        }
        else if (view.getId() == R.id.language1_mail6){
            Intent intent = new Intent(this, com.mail.mail57.class);
            startActivity(intent);
            return true;
        }
        return false;
    }
}
