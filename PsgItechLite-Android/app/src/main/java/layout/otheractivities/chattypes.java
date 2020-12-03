package layout.otheractivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nikeshhbaskaran.psgitech.R;

public class chattypes extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chattypes);
    }
    public void chat(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Bluetooth Chat")) {

            Intent intent = new Intent(this, com.example.android.bluetoothchat.MainActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Chat")){
            Intent intent = new Intent(this, layout.otheractivities.chat.class);
            startActivity(intent);
        }
        else if (button_text.equals("Clubs Chat")){
            Intent intent = new Intent(this, layout.otheractivities.clubs.class);
            startActivity(intent);
        }
    }

}
