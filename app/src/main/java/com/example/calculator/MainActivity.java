package com.example.calculator;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {

    private EditText display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.tvdisplay);
        display.setShowSoftInputOnFocus(false);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.display).equals(display.getText().toString())){
                    display.setText("");
                }
            }
        });

    }

    public void updateDisplay(String strToAdd){
        String oldStr = display.getText().toString();
        int cursorPosition = display.getSelectionStart();
        String leftStr = oldStr.substring(0,cursorPosition);
        String rightStr = oldStr.substring(cursorPosition);
        if (getString(R.string.display).equals(display.getText().toString())){
            display.setText(strToAdd);
        }
        else {
            display.setText(String.format("%s%s%s",leftStr,strToAdd,rightStr));
        }
        display.setSelection(cursorPosition + 1);

    }

    public void zeroBTN(View view){
        updateDisplay("0");

    }
    public void oneBTN(View view){
        updateDisplay("1");

    }
    public void twoBTN(View view){
        updateDisplay("2");

    }
    public void threeBTN(View view){
        updateDisplay("3");

    }
    public void fourBTN(View view){
        updateDisplay("4");

    }
    public void fiveBTN(View view){
        updateDisplay("5");

    }
    public void sixBTN(View view){
        updateDisplay("6");

    }
    public void sevenBTN(View view){
        updateDisplay("7");

    }
    public void eightBTN(View view){
        updateDisplay("8");

    }
    public void nineBTN(View view){
        updateDisplay("9");

    }
    public void periodBTN(View view){
        updateDisplay(".");

    }
    public void deleteBTN(View view){
        int cursorPos = display.getSelectionStart();
        int textLength = display.getText().length();

        if (cursorPos != 0 && textLength != 0 ){
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPos-1,cursorPos,"");
            display.setText(selection);
            display.setSelection(cursorPos-1);
        }

    }
    public void equalBTN(View view){
        String userExp = display.getText().toString();
        userExp = userExp.replaceAll("÷","/");
        userExp = userExp.replaceAll("×","*");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());
        display.setText(result);
        display.setSelection(result.length());

    }
    public void additionBTN(View view){
        updateDisplay("+");

    }
    public void subtractionBTN(View view){
        updateDisplay("-");

    }
    public void multiplicationBTN(View view){
        updateDisplay("×");

    }
    public void divisionBTN(View view){
        updateDisplay("÷");

    }
    public void percentageBTN(View view){
        updateDisplay("%");

    }
    public void bracketBTN(View view){
        int cursorPos = display.getSelectionStart();
        int openBracket = 0;
        int closingBracket = 0;
        int textLength = display.getText().length();

        for (int i = 0; i < cursorPos; i++){
            if (display.getText().toString().substring(i,i+1).equals("(")){
                openBracket += 1;
            }
            if (display.getText().toString().substring(i,i+1).equals(")")){
                closingBracket += 1;
            }
        }
        if (openBracket == closingBracket || display.getText().toString().substring(textLength-1,textLength).equals("(")){
            updateDisplay("(");
        }
        if (closingBracket < openBracket && !display.getText().toString().substring(textLength-1,textLength).equals("(")){
            updateDisplay(")");
        }
        display.setSelection(cursorPos+1);

    }
    public void clearBTN(View view){
        display.setText("");

    }
}

