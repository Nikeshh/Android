package com.example.PSGITECH2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
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

import layout.otheractivities.cgpacalculator1;
import layout.otheractivities.chattypes;

public class thirdpage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdpage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Welcome to PSG ITECH", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.nav_timeline) {


            Intent intent = new Intent(this, com.example.PSGITECH2.MainActivity.class);
            startActivity(intent);
            return true;

        }
        int id8 = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id8 == R.id.nav_navigation) {


            Intent intent = new Intent(this, in.wptrafficanalyzer.locationroutemylocationv2.MainActivity.class);
            startActivity(intent);
            return true;

        }
        int id1 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id1 == R.id.nav_gallery) {
            Intent intent = new Intent(this, com.etiennelawlor.imagegallery.activities.MainActivity.class);
            startActivity(intent);
            return true;
        }
        int id2 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id2 == R.id.nav_chat) {
            Intent intent = new Intent(this, com.pubnub.chatpubnub.MainActivity.class);
            startActivity(intent);
            return true;
        }
        int id3 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id3 == R.id.nav_report) {
            Intent intent = new Intent(this, com.example.report1.class);
            startActivity(intent);
            return true;
        }
        int id4 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id4 == R.id.nav_cgpacalculator) {
            Intent intent = new Intent(this, cgpacalculator1.class);
            startActivity(intent);
            return true;
        }
        int id5 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id5 == R.id.nav_materials) {
            Intent intent = new Intent(this, layout.education.materials.class);
            startActivity(intent);
            return true;
        }
        int id35 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id35 == R.id.nav_news) {
            Intent intent = new Intent(this, layout.otheractivities.news.class);
            startActivity(intent);
            return true;
        }
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
        int id16 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id16 == R.id.nav_studentprofile) {
            Intent intent = new Intent(this, com.processfast.csce492.AndroidGPACalculatorActivity.class);
            startActivity(intent);
            return true;
        }
        int id17 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id17 == R.id.nav_notes) {
            Intent intent = new Intent(this, com.moonpi.swiftnotes.MainActivity.class);
            startActivity(intent);
            return true;
        }
        int id18 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id18 == R.id.nav_scientificcalculator) {
            Intent intent = new Intent(this, com.numix.calculator.Calculator.class);
            startActivity(intent);
            return true;
        }
        int id19 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id19 == R.id.nav_english) {
            Intent intent = new Intent(this, layout.subjects.english.class);
            startActivity(intent);
            return true;
        }
        int id22 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id22 == R.id.nav_physics) {
            Intent intent = new Intent(this, layout.subjects.physics.class);
            startActivity(intent);
            return true;
        }
        int id23 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id23 == R.id.nav_chemistry) {
            Intent intent = new Intent(this, layout.subjects.chemistry.class);
            startActivity(intent);
            return true;
        }
        int id24 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id24 == R.id.nav_maths) {
            Intent intent = new Intent(this, layout.subjects.maths.class);
            startActivity(intent);
            return true;
        }
        int id25 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id25 == R.id.nav_computerscience) {
            Intent intent = new Intent(this, layout.subjects.computerscience.class);
            startActivity(intent);
            return true;
        }
        int id26 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id26 == R.id.nav_cse) {
            Intent intent = new Intent(this, layout.departments.cse.class);
            startActivity(intent);
            return true;
        }
        int id27 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id27 == R.id.nav_ece) {
            Intent intent = new Intent(this, layout.departments.ece.class);
            startActivity(intent);
            return true;
        }
        int id28 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id28 == R.id.nav_eee) {
            Intent intent = new Intent(this, layout.departments.eee.class);
            startActivity(intent);
            return true;
        }
        int id29 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id29 == R.id.nav_mech) {
            Intent intent = new Intent(this, layout.departments.mech.class);
            startActivity(intent);
            return true;
        }
        int id30 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id30 == R.id.nav_civil) {
            Intent intent = new Intent(this, layout.departments.civil.class);
            startActivity(intent);
            return true;
        }
        int id31 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id31 == R.id.nav_universityresults1) {
            Intent intent = new Intent(this, layout.universityresults.university_results1.class);
            startActivity(intent);
            return true;
        }
        int id32 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id32 == R.id.nav_universityresults2) {
            Intent intent = new Intent(this, layout.universityresults.university_results2.class);
            startActivity(intent);
            return true;
        }
        int id33 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id33 == R.id.nav_moodle) {
            Intent intent = new Intent(this, com.extra.moodle.class);
            startActivity(intent);
            return true;
        }
        int id34 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id34 == R.id.nav_feedback) {
            Intent intent = new Intent(this, com.extra.feedback.class);
            startActivity(intent);
            return true;
        }
        int id41 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id41 == R.id.nav_suggestion_box) {
            Intent intent = new Intent(this, com.extra.suggestion.class);
            startActivity(intent);
            return true;
        }
        int id42 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id42 == R.id.nav_website) {
            Intent intent = new Intent(this, com.extra.website.class);
            startActivity(intent);
            return true;
        }
        int id43 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id43 == R.id.nav_academiccalender) {
            Intent intent = new Intent(this, com.extra.academiccalendar.class);
            startActivity(intent);
            return true;
        }
        int id44 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id44 == R.id.nav_canteen) {
            Intent intent = new Intent(this, com.example.android.wizardpager.MainActivity.class);
            startActivity(intent);
            return true;
        }
        int id37 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id37 == R.id.nav_creative_zone) {
            Intent intent = new Intent(this, layout.otheractivities.creativezone_website.class);
            startActivity(intent);
            return true;
        }
        int id38 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id38 == R.id.nav_ini_oru_vidhi_seivom) {
            Intent intent = new Intent(this, layout.otheractivities.inioruvidhiseivom.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.nav_timeline) {


            Intent intent = new Intent(this, com.example.PSGITECH2.MainActivity.class);
            startActivity(intent);
            return true;

        }
        int id8 = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id8 == R.id.nav_navigation) {


            Intent intent = new Intent(this, in.wptrafficanalyzer.locationroutemylocationv2.MainActivity.class);
            startActivity(intent);
            return true;

        }
        int id1 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id1 == R.id.nav_gallery) {
            Intent intent = new Intent(this, com.etiennelawlor.imagegallery.activities.MainActivity.class);
            startActivity(intent);
            return true;
        }
        int id2 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id2 == R.id.nav_chat) {
            Intent intent = new Intent(this, com.pubnub.chatpubnub.MainActivity.class);
            startActivity(intent);
            return true;
        }
        int id3 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id3 == R.id.nav_report) {
            Intent intent = new Intent(this, com.example.report1.class);
            startActivity(intent);
            return true;
        }
        int id4 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id4 == R.id.nav_cgpacalculator) {
            Intent intent = new Intent(this, cgpacalculator1.class);
            startActivity(intent);
            return true;
        }
        int id5 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id5 == R.id.nav_materials) {
            Intent intent = new Intent(this, layout.education.materials.class);
            startActivity(intent);
            return true;
        }
        int id35 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id35 == R.id.nav_news) {
            Intent intent = new Intent(this, layout.otheractivities.news.class);
            startActivity(intent);
            return true;
        }
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
        int id16 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id16 == R.id.nav_studentprofile) {
            Intent intent = new Intent(this, com.processfast.csce492.AndroidGPACalculatorActivity.class);
            startActivity(intent);
            return true;
        }
        int id17 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id17 == R.id.nav_notes) {
            Intent intent = new Intent(this, com.moonpi.swiftnotes.MainActivity.class);
            startActivity(intent);
            return true;
        }
        int id18 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id18 == R.id.nav_scientificcalculator) {
            Intent intent = new Intent(this, com.numix.calculator.Calculator.class);
            startActivity(intent);
            return true;
        }
        int id19 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id19 == R.id.nav_english) {
            Intent intent = new Intent(this, layout.subjects.english.class);
            startActivity(intent);
            return true;
        }
        int id22 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id22 == R.id.nav_physics) {
            Intent intent = new Intent(this, layout.subjects.physics.class);
            startActivity(intent);
            return true;
        }
        int id23 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id23 == R.id.nav_chemistry) {
            Intent intent = new Intent(this, layout.subjects.chemistry.class);
            startActivity(intent);
            return true;
        }
        int id24 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id24 == R.id.nav_maths) {
            Intent intent = new Intent(this, layout.subjects.maths.class);
            startActivity(intent);
            return true;
        }
        int id25 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id25 == R.id.nav_computerscience) {
            Intent intent = new Intent(this, layout.subjects.computerscience.class);
            startActivity(intent);
            return true;
        }
        int id26 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id26 == R.id.nav_cse) {
            Intent intent = new Intent(this, layout.departments.cse.class);
            startActivity(intent);
            return true;
        }
        int id27 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id27 == R.id.nav_ece) {
            Intent intent = new Intent(this, layout.departments.ece.class);
            startActivity(intent);
            return true;
        }
        int id28 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id28 == R.id.nav_eee) {
            Intent intent = new Intent(this, layout.departments.eee.class);
            startActivity(intent);
            return true;
        }
        int id29 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id29 == R.id.nav_mech) {
            Intent intent = new Intent(this, layout.departments.mech.class);
            startActivity(intent);
            return true;
        }
        int id30 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id30 == R.id.nav_civil) {
            Intent intent = new Intent(this, layout.departments.civil.class);
            startActivity(intent);
            return true;
        }
        int id31 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id31 == R.id.nav_universityresults1) {
            Intent intent = new Intent(this, layout.universityresults.university_results1.class);
            startActivity(intent);
            return true;
        }
        int id32 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id32 == R.id.nav_universityresults2) {
            Intent intent = new Intent(this, layout.universityresults.university_results2.class);
            startActivity(intent);
            return true;
        }
        int id33 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id33 == R.id.nav_moodle) {
            Intent intent = new Intent(this, com.extra.moodle.class);
            startActivity(intent);
            return true;
        }
        int id34 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id34 == R.id.nav_feedback) {
            Intent intent = new Intent(this, com.extra.feedback.class);
            startActivity(intent);
            return true;
        }
        int id41 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id41 == R.id.nav_suggestion_box) {
            Intent intent = new Intent(this, com.extra.suggestion.class);
            startActivity(intent);
            return true;
        }
        int id42 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id42 == R.id.nav_website) {
            Intent intent = new Intent(this, com.extra.website.class);
            startActivity(intent);
            return true;
        }
        int id43 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id43 == R.id.nav_academiccalender) {
            Intent intent = new Intent(this, com.extra.academiccalendar.class);
            startActivity(intent);
            return true;
        }
        int id44 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id44 == R.id.nav_canteen) {
            Intent intent = new Intent(this, com.example.android.wizardpager.MainActivity.class);
            startActivity(intent);
            return true;
        }
        int id37 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id37 == R.id.nav_creative_zone) {
            Intent intent = new Intent(this, layout.otheractivities.creativezone_website.class);
            startActivity(intent);
            return true;
        }
        int id38 = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id38 == R.id.nav_ini_oru_vidhi_seivom) {
            Intent intent = new Intent(this, layout.otheractivities.inioruvidhiseivom.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
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
        getMenuInflater().inflate(R.menu.thirdpage, menu);
        return true;
    }
    public void groupmailnext2(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Timeline")) {

            Intent intent = new Intent(this, com.example.PSGITECH2.MainActivity.class);
            startActivity(intent);

        }
        else if (button_text.equals("Gallery")) {

            Intent intent = new Intent(this, com.etiennelawlor.imagegallery.activities.MainActivity.class);
            startActivity(intent);

        }
        else if (button_text.equals("Chat")) {

            Intent intent = new Intent(this, chattypes.class);
            startActivity(intent);

        }
        else if (button_text.equals("Navigation")) {

            Intent intent = new Intent(this, in.wptrafficanalyzer.locationroutemylocationv2.MainActivity.class);
            startActivity(intent);
        }
        else if (button_text.equals("Creative Zone")) {
            Intent intent = new Intent(this, layout.otheractivities.activity_creativezone.class);
            startActivity(intent);

        }
        else if (button_text.equals("Clubs")) {

            Intent intent = new Intent(this, layout.otheractivities.clubs.class);
            startActivity(intent);

        }

    }

}

