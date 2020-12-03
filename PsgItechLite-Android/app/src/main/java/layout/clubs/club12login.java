package layout.clubs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.nikeshhbaskaran.psgitech.R;

public class club12login extends Activity {
    Button b1;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clublogin);
    }
    public void button(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        b1=(Button)findViewById(R.id.button);
        ed1=(EditText)findViewById(R.id.editText);
        if (button_text.equals("login")) {
            if(ed1.getText().toString().equals("club126143")) {
                Intent intent = new Intent(this, layout.clubs.club3activity.class);
                startActivity(intent);
            }
        }
    }
}