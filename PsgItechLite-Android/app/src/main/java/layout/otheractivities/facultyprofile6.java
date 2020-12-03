package layout.otheractivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nikeshhbaskaran.psgitech.R;

public class facultyprofile6 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultyprofile6);
    }
    public boolean buttonClicked(View view) {
        if (view.getId() == R.id.che_mail1) {

            Intent intent = new Intent(this, com.mail.mail38.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.che_mail2) {

            Intent intent = new Intent(this, com.mail.mail39.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.che_mail3){

            Intent intent = new Intent(this, com.mail.mail40.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.che_mail4){
            Intent intent = new Intent(this, com.mail.mail41.class);
            startActivity(intent);
            return true;
        }
        return false;
    }
}
