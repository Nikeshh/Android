package com.extra;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CalendarView;

import com.example.nikeshhbaskaran.psgitech.R;

public class academiccalendar extends ActionBarActivity {
    CalendarView calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        // this can be add to make calendar
        calendar = (CalendarView) findViewById(R.id.calendar);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){

            @Override
            public void onSelectedDayChange(CalendarView view,
                                            int year, int month, int dayOfMonth) {

                if(year == 2016 && month == 7 && dayOfMonth == 2)
                {

                    Snackbar.make(view, "Institutional Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 7 && dayOfMonth == 3)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 7 && dayOfMonth == 4)
                {

                    Snackbar.make(view, "Commencement of Senior classes/Parent's Meeting", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 7 && dayOfMonth == 6)
                {

                    Snackbar.make(view, "Ramzan", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }

                if(year == 2016 && month == 7 && dayOfMonth == 10)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 7 && dayOfMonth == 11)
                {

                    Snackbar.make(view, "First Class Committee meeting for seniors", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 7 && dayOfMonth == 16)
                {

                    Snackbar.make(view, "Institutional Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 7 && dayOfMonth == 17)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 7 && dayOfMonth == 21)
                {

                    Snackbar.make(view, "Last Date for tuition fees payement(seniors)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 7 && dayOfMonth == 24)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 7 && dayOfMonth == 25)
                {

                    Snackbar.make(view, "Commencement of 1st Internal Assessment Test(seniors)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 7 && dayOfMonth == 31)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 1)
                {

                    Snackbar.make(view, "Orientation of 1st year students", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 3)
                {

                    Snackbar.make(view, "Commencement of First year classes", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 4)
                {

                    Snackbar.make(view, "Mid Semester-Students Feedback(seniors)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 5)
                {

                    Snackbar.make(view, "Result Analysis(seniors)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 6)
                {

                    Snackbar.make(view, "Institutional Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 7)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 7 && dayOfMonth == 1)
                {

                    Snackbar.make(view, "Welcome to PSG ITECH", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 10)
                {

                    Snackbar.make(view, "First Class Committee meeting for 1st year", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 12)
                {

                    Snackbar.make(view, "2nd CCM for seniors", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 14)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 15)
                {

                    Snackbar.make(view, "Independence Day", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 16)
                {

                    Snackbar.make(view, "Commencement of 2nd Internal Assessment Test(seniors)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 20)
                {

                    Snackbar.make(view, "Institutional Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 21)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 25)
                {

                    Snackbar.make(view, "Krishna Jayanthi", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 27)
                {

                    Snackbar.make(view, "Cultural's Day", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 28)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 8 && dayOfMonth == 31)
                {

                    Snackbar.make(view, "Commencement of 1st Internal Assessment Test(1st year)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 9 && dayOfMonth == 2)
                {

                    Snackbar.make(view, "Mid Semester-Students Feedback(1st year)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 9 && dayOfMonth == 3)
                {

                    Snackbar.make(view, "Institutional Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 9 && dayOfMonth == 4)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 9 && dayOfMonth == 5)
                {

                    Snackbar.make(view, "Teacher's Day/Vinayagar Chaturthi", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 9 && dayOfMonth == 9)
                {

                    Snackbar.make(view, "Result Analysis(seniors & 1st year)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 9 && dayOfMonth == 11)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 9 && dayOfMonth == 13)
                {

                    Snackbar.make(view, "Bakrid", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 9 && dayOfMonth == 14)
                {

                    Snackbar.make(view, "Onam", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 9 && dayOfMonth == 15)
                {

                    Snackbar.make(view, "Commencement of 3rd Internal Assessment Test(seniors)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 9 && dayOfMonth == 18)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 9 && dayOfMonth == 24)
                {

                    Snackbar.make(view, "Institutional Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 9 && dayOfMonth == 25)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 9 && dayOfMonth == 26)
                {

                    Snackbar.make(view, "Commencement of 2nd Internal Assessment Test(1st year)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 1)
                {

                    Snackbar.make(view, "Institutional Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 2)
                {

                    Snackbar.make(view, "Holiday/Gandhi Jayanthi", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 3)
                {

                    Snackbar.make(view, "Second Class Committee meeting for 1st year/Third CCM(seniors)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 4)
                {

                    Snackbar.make(view, "Result Analysis(seniors)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 6)
                {

                    Snackbar.make(view, "Final students Feedback(seniors)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 7)
                {

                    Snackbar.make(view, "Result Analysis(1st year)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 8)
                {

                    Snackbar.make(view, "Last Instructional Day(seniors)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 9)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 10)
                {

                    Snackbar.make(view, "Ayutha Pooja", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 11)
                {

                    Snackbar.make(view, "Vijaya Dasami", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 12)
                {

                    Snackbar.make(view, "Muharram", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 13)
                {

                    Snackbar.make(view, "Commencement of 4th Internal Assessment Test(seniors)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }

                if(year == 2016 && month == 10 && dayOfMonth == 16)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 17)
                {

                    Snackbar.make(view, "University Lab Exam Commences(Seniors)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 20)
                {

                    Snackbar.make(view, "Commencement of 3rd Internal Assessment Test(1st year)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 23)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 24)
                {

                    Snackbar.make(view, "Commencement of End Semester Examinations(seniors)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 29)
                {

                    Snackbar.make(view, "Deepavali", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 10 && dayOfMonth == 30)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 11 && dayOfMonth == 4)
                {

                    Snackbar.make(view, "Result Analysis(1st year)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 11 && dayOfMonth == 5)
                {

                    Snackbar.make(view, "Institutional Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 11 && dayOfMonth == 6)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 11 && dayOfMonth == 7)
                {

                    Snackbar.make(view, "Third Class Committee meeting(1st year)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 11 && dayOfMonth == 9)
                {

                    Snackbar.make(view, "Vacation for faculty handling senior classess starts", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 11 && dayOfMonth == 10)
                {

                    Snackbar.make(view, "Final Students Feedback(1st year)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 11 && dayOfMonth == 11)
                {

                    Snackbar.make(view, "Timetable for Even Semester-meeting", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 11 && dayOfMonth == 12)
                {

                    Snackbar.make(view, "Last Instructional day(1st year)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 11 && dayOfMonth == 13)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 11 && dayOfMonth == 14)
                {

                    Snackbar.make(view, "Commencement of Model Exam(1st year)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 11 && dayOfMonth == 19)
                {

                    Snackbar.make(view, "Institutional Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 11 && dayOfMonth == 20)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 11 && dayOfMonth == 24)
                {

                    Snackbar.make(view, "University Lab Exam(1st year)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 11 && dayOfMonth == 27)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 11 && dayOfMonth == 30)
                {

                    Snackbar.make(view, "Vacation for faculty handling 1st year classes starts", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 12 && dayOfMonth == 1)
                {

                    Snackbar.make(view, "Commencement of End Semester Examinations(1st year)", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 12 && dayOfMonth == 3)
                {

                    Snackbar.make(view, "Institutional Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 12 && dayOfMonth == 11)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 12 && dayOfMonth == 13)
                {

                    Snackbar.make(view, "Meelad-Un Nabi", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 12 && dayOfMonth == 17)
                {

                    Snackbar.make(view, "Institutional Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 12 && dayOfMonth == 20)
                {

                    Snackbar.make(view, "Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 12 && dayOfMonth == 21)
                {

                    Snackbar.make(view, "Reopening for Faculty", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 12 && dayOfMonth == 25)
                {

                    Snackbar.make(view, "Christmas/Holiday", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
                if(year == 2016 && month == 12 && dayOfMonth == 26)
                {

                    Snackbar.make(view, "Reopening for students", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
            }});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}