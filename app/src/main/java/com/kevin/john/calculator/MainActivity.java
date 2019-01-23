package com.kevin.john.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
     Button btn_plus, btn_minus, btn_times, btn_divide;
     Button btn_clear, btn_equals;

     TextView textView_resultfinal, textView_result;

      private final char ADD = '+';
      private final char SUB = '-';
      private final char MUL = '*';
      private final char DIV = '/';
      private final char EQU = 0;

      private double val1 = Double.NaN;
      private double val2;
      private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIView();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_result.setText(textView_result.getText().toString() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_result.setText(textView_result.getText().toString() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_result.setText(textView_result.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_result.setText(textView_result.getText().toString() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_result.setText(textView_result.getText().toString() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_result.setText(textView_result.getText().toString() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_result.setText(textView_result.getText().toString() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_result.setText(textView_result.getText().toString() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_result.setText(textView_result.getText().toString() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_result.setText(textView_result.getText().toString() + "9");
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADD;
                textView_resultfinal.setText(String.valueOf(val1) + "+");
                textView_result.setText(null);
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUB;
                textView_resultfinal.setText(String.valueOf(val1) + "-");
                textView_result.setText(null);
            }
        });

        btn_times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MUL;
                textView_resultfinal.setText(String.valueOf(val1) + "*");
                textView_result.setText(null);
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIV;
                textView_resultfinal.setText(String.valueOf(val1) + "/");
                textView_result.setText(null);
            }
        });


        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQU;
                textView_resultfinal.setText(textView_resultfinal.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                textView_result.setText(null);
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView_result.getText().length() > 0){
                    CharSequence name = textView_result.getText().toString();
                    textView_result.setText(name.subSequence(0,name.length()-1));
                } else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    textView_result.setText(null);
                    textView_resultfinal.setText(null);
                }

            }
        });





    }

    public void compute (){
        if(!Double.isNaN(val1)) {
            val2 = Double.parseDouble(textView_result.getText().toString());

            switch (ACTION) {
                case ADD:
                    val1 = val1 + val2;
                    break;


                    case SUB:
                        val1 = val1 - val2;
                        break;


                        case MUL:
                            val1 = val1 * val2;
                            break;


                            case DIV:
                                val1 = val1 / val2;
                                break;
                            case EQU:
                                break;


                        }
        } else {

            val1 = Double.parseDouble(textView_result.getText().toString());


        }

    }

    private void setupUIView() {

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_times = findViewById(R.id.btn_times);
        btn_divide = findViewById(R.id.btn_divide);

        btn_clear = findViewById(R.id.btn_clear);
        btn_equals = findViewById(R.id.btn_equals);

        textView_resultfinal = findViewById(R.id.textView_resultfinal);
        textView_result = findViewById(R.id.textView_result);





    }
}
