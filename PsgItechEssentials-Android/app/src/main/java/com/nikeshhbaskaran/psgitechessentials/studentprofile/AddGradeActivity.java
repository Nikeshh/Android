package com.nikeshhbaskaran.psgitechessentials.studentprofile;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.nikeshhbaskaran.psgitechessentials.R;

import java.util.List;

public class AddGradeActivity extends Activity implements OnClickListener {

	private CoursesDataSource coursesSource;
	private AssignmentTypesSource typeSource;
	private GradesDataSource gradeSource;

	List<Course> courses;
	List<AssignmentType> types;

	Button btnCancel, btnSubmit;
	Spinner spCourse, spType;
	EditText etName, etGradeNum, etGradeDen;
	String selectedName, selectedCourse, selectedType;
	float numGrade, max_grade;
	int courseID, typeID;
	Grade grade = new Grade();
	Course course = new Course();
	AssignmentType type = new AssignmentType();

	AlertDialog errorMessage;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.addgrade);
		init();

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {

		case R.id.btn_AG_Submit:
			if (validateGrade()) {
				selectedName = etName.getText().toString();
				numGrade = Long.valueOf(etGradeNum.getText().toString());
				max_grade = Long.valueOf(etGradeDen.getText().toString());
				courseID = course.getId();
				typeID = type.getId();

				// Add the grade to the database
				gradeSource.open();
				gradeSource.createGrade(typeID, courseID, max_grade,
						selectedName, numGrade);
				gradeSource.close();
				Intent returnIntent = new Intent();
				setResult(RESULT_OK, returnIntent);
				finish();
			}
			break;

		case R.id.btn_AG_Cancel:
			finish();
			break;
		}
	}

	private boolean validateGrade() {
		String errors = "You have made the following error(s): \n";
		boolean inputError = false;

		// Ensure assignment name is not empty
		if (etName.getText().toString().length() == 0) {
			errors += "-Assignment name cannot be left blank.\n";
			inputError = true;
		}

		// Ensure grade isn't blank
		if (etGradeNum.getText().toString().length() == 0) {
			errors += "- Grade numerator cannot be left blank.\n";
		}
		// Ensure max grade isn't blank
		if (etGradeDen.getText().toString().length() == 0) {
			errors += "- Grade denominator cannot be left blank.\n";
		}

		if (inputError == true) {
			errorMessage.setMessage(errors);
			errorMessage.show();
			return false;
		}
		return true;
	}

	public void setupCourseSpinner() {

		coursesSource.open();

		int defaultPos = 0;

		courses = coursesSource.getAllCourses();
		int size = courses.size();

		ArrayAdapter<CharSequence> adapter1 = new ArrayAdapter<CharSequence>(
				this, android.R.layout.simple_spinner_item);
		adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		for (int i = 0; i < size; i++) {
			if (courses.get(i).getId() == getIntent().getIntExtra("courseID",
					-1)) {
				defaultPos = i;
			}
			adapter1.add(courses.get(i).getCourseTitle());
		}
		spCourse.setAdapter(adapter1);
		spCourse.setSelection(defaultPos);
		if (getIntent().getIntExtra("courseID", -1) > 0) {
			updateAssignmentTypeSelection(getIntent().getIntExtra("courseID",
					-1));
		}

		spCourse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> adapter1, View v, int i,
					long lng) {
				course = courses.get(i);
				updateAssignmentTypeSelection(course.getId());

			}

			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO I think nothing goes here
			}
		});
		coursesSource.close();
	}

	public void updateAssignmentTypeSelection(int courseID) {

		typeSource = new AssignmentTypesSource(this);
		typeSource.open();

		int defaultPos = 0;

		types = typeSource.getAllAssignmentTypesForCourse(courseID);
		int size = types.size();
		final ArrayAdapter<CharSequence> adapter2 = new ArrayAdapter<CharSequence>(
				this, android.R.layout.simple_spinner_item);

		adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		for (int i = 0; i < size; i++) {
			if (types.get(i).getId() == getIntent().getIntExtra(
					"assignmentTypeID", -1)) {
				defaultPos = i;
			}
			adapter2.add(types.get(i).getName());
		}

		type = types.get(0);
		spType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> adapter2, View v, int i,
					long lng) {
				type = types.get(i);

			}

			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO I think nothing goes here
			}
		});
		spType.setAdapter(adapter2);
		spType.setSelection(defaultPos);
		typeSource.close();
	}

	public void init() {
		btnCancel = (Button) findViewById(R.id.btn_AG_Cancel);
		btnSubmit = (Button) findViewById(R.id.btn_AG_Submit);
		spCourse = (Spinner) findViewById(R.id.spinner_AG_course);
		spType = (Spinner) findViewById(R.id.spinner_AG_type);
		etName = (EditText) findViewById(R.id.et_AG_name);
		etGradeNum = (EditText) findViewById(R.id.et_AG_numirator);
		etGradeDen = (EditText) findViewById(R.id.et_AG_denominator);

		btnCancel.setOnClickListener(this);
		btnSubmit.setOnClickListener(this);

		gradeSource = new GradesDataSource(this);
		coursesSource = new CoursesDataSource(this);

		setupCourseSpinner();

		errorMessage = new AlertDialog.Builder(this).create();
		errorMessage.setTitle("Input error!");
		errorMessage.setButton("OK", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				return;
			}
		});

	}
}