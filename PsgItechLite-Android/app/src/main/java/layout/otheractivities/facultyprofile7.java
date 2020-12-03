package layout.otheractivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nikeshhbaskaran.psgitech.R;

public class facultyprofile7 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultyprofile7);
    }
    public boolean buttonClicked(View view) {
        if (view.getId() == R.id.mathematics_mail1) {

            Intent intent = new Intent(this, com.mail.mail42.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.mathematics_mail2) {

            Intent intent = new Intent(this, com.mail.mail43.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.mathematics_mail3){

            Intent intent = new Intent(this, com.mail.mail44.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.mathematics_mail4){
            Intent intent = new Intent(this, com.mail.mail45.class);
            startActivity(intent);
            return true;
        }
        else if (view.getId() == R.id.mathematics_mail5){

            Intent intent = new Intent(this, com.mail.mail46.class);
            startActivity(intent);
            return true;

        }
        return false;
    }

}
