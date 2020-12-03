package layout.otheractivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.nikeshhbaskaran.psgitech.R;

public class news extends Activity implements OnClickListener {
    Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        b1 = (Button)findViewById(R.id.button32);
        b2 = (Button)findViewById(R.id.button33);
        b3 = (Button)findViewById(R.id.button34);
        b4 = (Button)findViewById(R.id.button35);
        b5 = (Button)findViewById(R.id.button36);
        b6 = (Button)findViewById(R.id.button37);



        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button32:
                Intent intent1 = new Intent(this, layout.otheractivities.bbc.class);
                startActivity(intent1);
                break;

            case R.id.button33:
                Intent intent2 = new Intent(this, layout.otheractivities.indiatoday.class);
                startActivity(intent2);
                break;

            case R.id.button34:
                Intent intent3 = new Intent(this, layout.otheractivities.thehindu.class);
                startActivity(intent3);
                break;

            case R.id.button35:
                Intent intent4 = new Intent(this, layout.otheractivities.toi.class);
                startActivity(intent4);
                break;

            case R.id.button36:
                Intent intent5 = new Intent(this, layout.otheractivities.ndtv.class);
                startActivity(intent5);
                break;

            case R.id.button37:
                Intent intent6 = new Intent(this, layout.otheractivities.googlenews.class);
                startActivity(intent6);
                break;
        }

    }
}
