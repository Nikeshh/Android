package com.himebaugh.calculator;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.nikeshhbaskaran.psgitech.R;

import java.text.DecimalFormat;

public class MainActivity extends Activity implements OnClickListener {
 
    private TextView calculatorDisplay;
    private static final String DIGITS = "0123456789.";
    private Boolean userIsInTheMiddleOfTypingANumber = false;
 
    DecimalFormat df = new DecimalFormat("@###########");
 
    CalculatorBrain brain;
 
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        // hide the window title.
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // hide the status bar and other OS-level chrome
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);
 
        brain = new CalculatorBrain();
 
        calculatorDisplay = (TextView) findViewById(R.id.textView1);
 
        df.setMinimumFractionDigits(0);
        df.setMinimumIntegerDigits(1);
        df.setMaximumIntegerDigits(8);
 
        findViewById(R.id.button0).setOnClickListener(this);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
        findViewById(R.id.button9).setOnClickListener(this);
 
        findViewById(R.id.buttonAdd).setOnClickListener(this);
        findViewById(R.id.buttonSubtract).setOnClickListener(this);
        findViewById(R.id.buttonMultiply).setOnClickListener(this);
        findViewById(R.id.buttonDivide).setOnClickListener(this);
        findViewById(R.id.buttonToggleSign).setOnClickListener(this);
        findViewById(R.id.buttonDecimalPoint).setOnClickListener(this);
        findViewById(R.id.buttonEquals).setOnClickListener(this);
        findViewById(R.id.buttonClear).setOnClickListener(this);
        findViewById(R.id.buttonClearMemory).setOnClickListener(this);
        findViewById(R.id.buttonAddToMemory).setOnClickListener(this);
        findViewById(R.id.buttonSubtractFromMemory).setOnClickListener(this);
        findViewById(R.id.buttonRecallMemory).setOnClickListener(this);
        
        // The following buttons only exist in layout-land (Landscape mode) and require extra attention.
        // The messier option is to place the buttons in the regular layout too and set android:visibility="invisible".	
		if (findViewById(R.id.buttonSquareRoot) != null) {
			findViewById(R.id.buttonSquareRoot).setOnClickListener(this);
		}	
		if (findViewById(R.id.buttonInvert) != null) {
			findViewById(R.id.buttonInvert).setOnClickListener(this);
		}
		if (findViewById(R.id.buttonCos) != null) {
			findViewById(R.id.buttonCos).setOnClickListener(this);
		}	
		if (findViewById(R.id.buttonSin) != null) {
			findViewById(R.id.buttonSin).setOnClickListener(this);
		}
        
//		Another way to hide the window title and actionbar, but only in newer sdk's
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//            ActionBar actionBar = getActionBar();
//            actionBar.setDisplayShowHomeEnabled(false);
//            actionBar.setDisplayShowTitleEnabled(false);
//            actionBar.hide();
//        }
    }
 
    // @Override
    public void onClick(View view) {
 
        String buttonPressed = ((Button) view).getText().toString();
        // String digits = "0123456789.";
 
        if (DIGITS.contains(buttonPressed)) {
            // digit was pressed
            if (userIsInTheMiddleOfTypingANumber) {
                calculatorDisplay.append(buttonPressed);
            } else {
                calculatorDisplay.setText(buttonPressed);
                userIsInTheMiddleOfTypingANumber = true;
            }
        } else {
            // operation was pressed
            if (userIsInTheMiddleOfTypingANumber) {
                brain.setOperand(Double.parseDouble(calculatorDisplay.getText().toString()));
                userIsInTheMiddleOfTypingANumber = false;
            }
 
            brain.performOperation(buttonPressed);
            calculatorDisplay.setText(df.format(brain.getResult()));
 
        }
    }
 
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save variables on screen orientation change
        outState.putDouble("OPERAND", brain.getResult());
        outState.putDouble("MEMORY", brain.getMemory());
    }
 
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore variables on screen orientation change
        brain.setOperand(savedInstanceState.getDouble("OPERAND"));
        brain.setMemory(savedInstanceState.getDouble("MEMORY"));
        calculatorDisplay.setText(df.format(brain.getResult()));
    }
 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
 
}