package com.gooeymenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.nikeshhbaskaran.psgitech.R;

import layout.otheractivities.cgpacalculator1;

public class MainActivity extends ActionBarActivity implements GooeyMenu.GooeyMenuInterface {

    private GooeyMenu mGooeyMenu;
    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gooeymenu);
        mGooeyMenu = (GooeyMenu) findViewById(R.id.gooey_menu);
        mGooeyMenu.setOnMenuListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void menuOpen() {

        showToast("Quick Launch Open");

    }

    @Override
    public void menuClose() {

        showToast("Quick Launch Close");

    }

    @Override
    public void menuItemClicked(int menuNumber) {

        if(menuNumber == 1){

            showToast( "Timeline");
            Intent intent = new Intent(this, com.example.PSGITECH2.MainActivity.class);
            startActivity(intent);

        }
        else if(menuNumber == 2)
        {

            showToast( "Gallery");
            Intent intent = new Intent(this, com.etiennelawlor.imagegallery.activities.MainActivity.class);
            startActivity(intent);

        }
        else if(menuNumber == 3)
        {

            showToast( "Chat");
            Intent intent = new Intent(this, com.pubnub.chatpubnub.MainActivity.class);
            startActivity(intent);

        }
        else if(menuNumber == 4)
        {

            showToast( "Navigation");
            Intent intent = new Intent(this, in.wptrafficanalyzer.locationroutemylocationv2.MainActivity.class);
            startActivity(intent);

        }
        else if(menuNumber == 5)
        {

            showToast( "Report");
            Intent intent = new Intent(this, com.example.report1.class);
            startActivity(intent);

        }
        else if(menuNumber == 6)
        {

            showToast( "CGPA CALCULATOR");
            Intent intent = new Intent(this, cgpacalculator1.class);
            startActivity(intent);

        }
        else if(menuNumber == 7)
        {

            showToast( "NEWS");
            Intent intent = new Intent(this, layout.otheractivities.news.class);
            startActivity(intent);

        }
        else if(menuNumber == 8)
        {

            showToast( "STUDENT PROFILE");
            Intent intent = new Intent(this, com.processfast.csce492.AndroidGPACalculatorActivity.class);
            startActivity(intent);

        }
        else if(menuNumber == 9)
        {

            showToast( "NOTES");
            Intent intent = new Intent(this, com.moonpi.swiftnotes.MainActivity.class);
            startActivity(intent);

        }
        else if(menuNumber == 10)
        {

            showToast( "MATERIALS");
            Intent intent = new Intent(this, layout.education.materials.class);
            startActivity(intent);

        }
        else if(menuNumber == 11)
        {

            showToast( "SCIENTIFIC CALCULATOR");
            Intent intent = new Intent(this, com.numix.calculator.Calculator.class);
            startActivity(intent);

        }
    }

   private void showToast(String msg){
        if(mToast!=null){
            mToast.cancel();
        }
       mToast= Toast.makeText(this,msg,Toast.LENGTH_SHORT);
       mToast.setGravity(Gravity.CENTER,0,0);
       mToast.show();
    }
}
