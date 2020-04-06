package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn_add,btn_minus,btn_multiply,btn_divide,btn_Del,btn_equal,btn_bracket,btn_percent,btn_dot,btn_clear;
    private TextView textViewInput,textViewOutput;
    private String process;
    private boolean checkBrackets=false;
    private boolean opPressed=false;
    private double firstNo=0;
    private int secondNumberIndex=0;
    private char currentOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Button btn0=findViewById(R.id.btn0);
        final Button btn1=findViewById(R.id.btn1);
        final Button btn2=findViewById(R.id.btn2);
        final Button btn3=findViewById(R.id.btn3);
        final Button  btn4=findViewById(R.id.btn4);
        final Button btn5=findViewById(R.id.btn5);
        final Button  btn6=findViewById(R.id.btn6);
        final Button  btn7=findViewById(R.id.btn7);
        final Button  btn8=findViewById(R.id.btn8);
        final Button btn9=findViewById(R.id.btn9);

        final Button btn_add=findViewById(R.id.btn_addition);
        final Button  btn_minus=findViewById(R.id.btn_subtraction);
        final Button  btn_multiply=findViewById(R.id.btn_multiplication);
        final Button  btn_divide=findViewById(R.id.btn_division);

        final Button  btn_bracket=findViewById(R.id.btn_brackets);
        final Button  btn_clear=findViewById(R.id.btn_clear);
        final Button   btn_dot=findViewById(R.id.btn_dot);
        final Button   btn_equal=findViewById(R.id.btn_equal);
        final Button  btn_percent=findViewById(R.id.btn_percent);
        final Button btn_Del=findViewById(R.id.btn_del);

        textViewInput=findViewById(R.id.tvInput);
        textViewOutput=findViewById(R.id.tvOutput);

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText("");
                textViewOutput.setText("");
            }
        });

        btn0.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                textViewInput.setText(process+"0");
            }
        }));

        btn1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                textViewInput.setText(process+"1");
            }
        }));

        btn2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                textViewInput.setText(process+"2");
            }
        }));

        btn3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                textViewInput.setText(process+"3");
            }
        }));

        btn4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                textViewInput.setText(process+"4");
            }
        }));

        btn5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                textViewInput.setText(process+"5");
            }
        }));

        btn6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                textViewInput.setText(process+"6");
            }
        }));

        btn7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                textViewInput.setText(process+"7");
            }
        }));

        btn8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                textViewInput.setText(process+"8");
            }
        }));

        btn9.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                textViewInput.setText(process+"9");
            }
        }));

        btn_percent.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                secondNumberIndex=process.length()+1;
                firstNo=Double.parseDouble(process);
                opPressed=true;
                currentOp='%';
                textViewInput.setText(process+"%");
            }
        }));

        btn_dot.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                textViewInput.setText(process+".");
            }
        }));

        btn_add.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                secondNumberIndex=process.length()+1;
                firstNo=Double.parseDouble(process);
                opPressed=true;
                currentOp='+';
                textViewInput.setText(process+"+");
            }
        }));

        btn_minus.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                secondNumberIndex=process.length()+1;
                firstNo=Double.parseDouble(process);
                opPressed=true;
                currentOp='-';
                textViewInput.setText(process+"-");
            }
        }));

        btn_multiply.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                secondNumberIndex=process.length()+1;
                firstNo=Double.parseDouble(process);
                opPressed=true;
                currentOp='x';
                textViewInput.setText(process+"x");
            }
        }));

        btn_divide.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInput.getText().toString();
                secondNumberIndex=process.length()+1;
                firstNo=Double.parseDouble(process);
                opPressed=true;
                currentOp='/';
                textViewInput.setText(process+"/");
            }
        }));

        btn_bracket.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBrackets){
                    process=textViewInput.getText().toString();
                    textViewInput.setText(process+")");
                    checkBrackets=false;
                }
                else {
                    process = textViewInput.getText().toString();
                    textViewInput.setText(process + "(");
                    checkBrackets = true;
                }

            }
        }));

        btn_Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String displayedElements=textViewInput.getText().toString();
                int length=displayedElements.length();
                if (length>0){
                    displayedElements=displayedElements.substring(0,length-1);
                    textViewInput.setText(displayedElements);
                }
            }
        });

        btn_equal.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (opPressed){
                    if (currentOp=='+'){
                        process= textViewInput.getText().toString();
                        String secondNumberString=process.substring(secondNumberIndex,process.length());
                        double secondNumber=Double.parseDouble(secondNumberString);
                        secondNumber+=firstNo;
                        textViewOutput.setText(String.valueOf(secondNumber));
                    }
                    else if (currentOp=='-'){
                        process= textViewInput.getText().toString();
                        String secondNumberString=process.substring(secondNumberIndex,process.length());
                        double secondNumber=Double.parseDouble(secondNumberString);
                        secondNumber=firstNo-secondNumber;
                        textViewOutput.setText(String.valueOf(secondNumber));
                    }
                    else if (currentOp=='x'){
                        process= textViewInput.getText().toString();
                        String secondNumberString=process.substring(secondNumberIndex,process.length());
                        double secondNumber=Double.parseDouble(secondNumberString);
                        secondNumber=firstNo*secondNumber;
                        textViewOutput.setText(String.valueOf(secondNumber));
                    }
                    else if (currentOp=='/'){
                        process= textViewInput.getText().toString();
                        String secondNumberString=process.substring(secondNumberIndex,process.length());
                        double secondNumber=Double.parseDouble(secondNumberString);
                        secondNumber=firstNo/secondNumber;
                        textViewOutput.setText(String.valueOf(secondNumber));
                    }
                    else if (currentOp=='%'){
                        process= textViewInput.getText().toString();
                        String secondNumberString=process.substring(secondNumberIndex,process.length());
                        double secondNumber=Double.parseDouble(secondNumberString);
                        secondNumber=firstNo%secondNumber;
                        textViewOutput.setText(String.valueOf(secondNumber));
                    }

                }

            }

        }));

    }
}

