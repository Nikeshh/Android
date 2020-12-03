package layout.otheractivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.nikeshhbaskaran.psgitech.R;

public class clubs extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.clubs, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id6 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id6 == R.id.nav_tarangini) {
            Intent intent = new Intent(this, layout.clubs.tharanginiclublogin.class);
            startActivity(intent);
            return true;
        }
        int id7 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id7 == R.id.nav_ecoclub) {
            Intent intent = new Intent(this, layout.clubs.ecoclublogin.class);
            startActivity(intent);
            return true;
        }
        int id88 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id88 == R.id.nav_nss) {
            Intent intent = new Intent(this, layout.clubs.club3login.class);
            startActivity(intent);
            return true;
        }
        int id9 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id9 == R.id.nav_ncc) {
            Intent intent = new Intent(this, layout.clubs.club4login.class);
            startActivity(intent);
            return true;
        }
        int id10 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id10 == R.id.nav_club5) {
            Intent intent = new Intent(this, layout.clubs.club5login.class);
            startActivity(intent);
            return true;
        }
        int id11 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id11 == R.id.nav_club6) {
            Intent intent = new Intent(this, layout.clubs.club6login.class);
            startActivity(intent);
            return true;
        }
        int id12 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id12 == R.id.nav_club7) {
            Intent intent = new Intent(this, layout.clubs.club7login.class);
            startActivity(intent);
            return true;
        }
        int id13 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id13 == R.id.nav_club8) {
            Intent intent = new Intent(this, layout.clubs.club8login.class);
            startActivity(intent);
            return true;
        }
        int id14 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id14 == R.id.nav_club9) {
            Intent intent = new Intent(this, layout.clubs.club9login.class);
            startActivity(intent);
            return true;
        }
        int id15 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id15 == R.id.nav_club10) {
            Intent intent = new Intent(this, layout.clubs.club10login.class);
            startActivity(intent);
            return true;
        }
        int id39 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id39 == R.id.nav_club11) {
            Intent intent = new Intent(this, layout.clubs.club11login.class);
            startActivity(intent);
            return true;
        }
        int id40 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id40 == R.id.nav_club12) {
            Intent intent = new Intent(this, layout.clubs.club12login.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id6 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id6 == R.id.nav_tarangini) {
            Intent intent = new Intent(this, layout.clubs.tharanginiclublogin.class);
            startActivity(intent);
            return true;
        }
        int id7 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id7 == R.id.nav_ecoclub) {
            Intent intent = new Intent(this, layout.clubs.ecoclublogin.class);
            startActivity(intent);
            return true;
        }
        int id88 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id88 == R.id.nav_nss) {
            Intent intent = new Intent(this, layout.clubs.club3login.class);
            startActivity(intent);
            return true;
        }
        int id9 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id9 == R.id.nav_ncc) {
            Intent intent = new Intent(this, layout.clubs.club4login.class);
            startActivity(intent);
            return true;
        }
        int id10 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id10 == R.id.nav_club5) {
            Intent intent = new Intent(this, layout.clubs.club5login.class);
            startActivity(intent);
            return true;
        }
        int id11 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id11 == R.id.nav_club6) {
            Intent intent = new Intent(this, layout.clubs.club6login.class);
            startActivity(intent);
            return true;
        }
        int id12 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id12 == R.id.nav_club7) {
            Intent intent = new Intent(this, layout.clubs.club7login.class);
            startActivity(intent);
            return true;
        }
        int id13 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id13 == R.id.nav_club8) {
            Intent intent = new Intent(this, layout.clubs.club8login.class);
            startActivity(intent);
            return true;
        }
        int id14 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id14 == R.id.nav_club9) {
            Intent intent = new Intent(this, layout.clubs.club9login.class);
            startActivity(intent);
            return true;
        }
        int id15 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id15 == R.id.nav_club10) {
            Intent intent = new Intent(this, layout.clubs.club10login.class);
            startActivity(intent);
            return true;
        }
        int id39 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id39 == R.id.nav_club11) {
            Intent intent = new Intent(this, layout.clubs.club11login.class);
            startActivity(intent);
            return true;
        }
        int id40 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id40 == R.id.nav_club12) {
            Intent intent = new Intent(this, layout.clubs.club12login.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
    public void clubs(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("TARANGINI")) {

            Intent intent = new Intent(this, layout.clubs.tharanginiclublogin.class);
            startActivity(intent);
        } else if (button_text.equals("ECO CLUB")) {
            Intent intent = new Intent(this, layout.clubs.ecoclublogin.class);
            startActivity(intent);
        }
        else if (button_text.equals("NSS")) {
            Intent intent = new Intent(this, layout.clubs.club3login.class);
            startActivity(intent);
        }
        else if (button_text.equals("NCC")) {
            Intent intent = new Intent(this, layout.clubs.club4login.class);
            startActivity(intent);
        }
        else if (button_text.equals("Club5")) {
            Intent intent = new Intent(this, layout.clubs.club5login.class);
            startActivity(intent);
        }
        else if (button_text.equals("Club6")) {
            Intent intent = new Intent(this, layout.clubs.club6login.class);
            startActivity(intent);
        }
        else if (button_text.equals("Club7")) {
            Intent intent = new Intent(this, layout.clubs.club7login.class);
            startActivity(intent);
        }
        else if (button_text.equals("Club8")) {
            Intent intent = new Intent(this, layout.clubs.club8login.class);
            startActivity(intent);
        }
        else if (button_text.equals("Club9")) {
            Intent intent = new Intent(this, layout.clubs.club9login.class);
            startActivity(intent);
        }
        else if (button_text.equals("Club10")) {
            Intent intent = new Intent(this, layout.clubs.club10login.class);
            startActivity(intent);
        }
    }
}
