package layout.otheractivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nikeshhbaskaran.psgitech.R;

public class facultyprofile11 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultyprofile11);
    }
    public boolean buttonClicked(View view) {
        if (view.getId() == R.id.language2_mail1) {

            Intent intent = new Intent(this, com.mail.mail58.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.language2_mail2) {

            Intent intent = new Intent(this, com.mail.mail59.class);
            startActivity(intent);
            return true;

        } else if (view.getId() == R.id.language2_mail3){

            Intent intent = new Intent(this, com.mail.mail60.class);
            startActivity(intent);
            return true;

        }
        else if (view.getId() == R.id.language2_mail4){
            Intent intent = new Intent(this, com.mail.mail61.class);
            startActivity(intent);
            return true;
        }
        else if (view.getId() == R.id.language2_mail5){
            Intent intent = new Intent(this, com.mail.mail62.class);
            startActivity(intent);
            return true;
        }
        else if (view.getId() == R.id.language2_mail6){
            Intent intent = new Intent(this, com.mail.mail63.class);
            startActivity(intent);
            return true;
        }
        return false;
    }
}
