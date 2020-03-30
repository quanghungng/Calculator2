package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button num0 ;
    Button num1 ;
    Button num2 ;
    Button num3 ;
    Button num4 ;
    Button num5 ;
    Button num6 ;
    Button num7 ;
    Button num8 ;
    Button num9 ;

    Button bs;
    Button c;
    Button ce;

    Button add;
    Button minus;
    Button time;
    Button divide;

    Button equal;

    int temp1;
    int temp2;
    int result;

    int operand;
    boolean checkOperand;

    TextView screen;
    TextView sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface typeface= Typeface.createFromAsset(getAssets(), "fonts/digit.TTF");

        temp1 = 0;
        temp2 = 0;
        result = 0;
        operand = 0;
        checkOperand = false;

        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);

        bs = findViewById(R.id.bs);
        c = findViewById(R.id.c);
        ce = findViewById(R.id.ce);

        add = findViewById(R.id.add);
        minus = findViewById(R.id.minus);
        time = findViewById(R.id.time);
        divide = findViewById(R.id.divide);

        equal = findViewById(R.id.equal);

        screen = findViewById(R.id.screen);
        sign = findViewById(R.id.sign);

       screen.setTypeface(typeface);
       sign.setTypeface(typeface);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 *= 10;
                temp1 += 0;
                screen.setText(String.valueOf(temp1));
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 *= 10;
                temp1 += 1;
                screen.setText(String.valueOf(temp1));
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 *= 10;
                temp1 += 2;
                screen.setText(String.valueOf(temp1));
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 *= 10;
                temp1 += 3;
                screen.setText(String.valueOf(temp1));
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 *= 10;
                temp1 += 4;
                screen.setText(String.valueOf(temp1));
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 *= 10;
                temp1 += 5;
                screen.setText(String.valueOf(temp1));
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 *= 10;
                temp1 += 6;
                screen.setText(String.valueOf(temp1));
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 *= 10;
                temp1 += 7;
                screen.setText(String.valueOf(temp1));
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 *= 10;
                temp1 += 8;
                screen.setText(String.valueOf(temp1));
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 *= 10;
                temp1 += 9;
                screen.setText(String.valueOf(temp1));
            }
        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 /= 10;
                screen.setText(String.valueOf(temp1));
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 = 0;
                result = 0;
                operand = 0;
                screen.setText(String.valueOf(result));
                sign.setText("");
            }
        });

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            sign.setText("");
            operand = 0;
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand == 1 || operand == 0) {
                    result += temp1;
                    temp1 = 0;
                }
                if(operand == 2) {
                    result -= temp1;
                    temp1 = 0;
                }
                if(operand == 3) {
                    result *= temp1;
                    temp1 = 0;
                }
                if(operand == 4) {
                    result /= temp1;
                    temp1 = 0;
                }
                screen.setText(String.valueOf(result));
                operand = 1;
                sign.setText("+");

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand == 1 || operand == 0) {
                    result += temp1;
                    temp1 = 0;
                }
                if(operand == 2) {
                    result -= temp1;
                    temp1 = 0;
                }
                if(operand == 3) {
                    result *= temp1;
                    temp1 = 0;
                }
                if(operand == 4) {
                    result /= temp1;
                    temp1 = 0;
                }
                screen.setText(String.valueOf(result));
                sign.setText("-");
                operand = 2;
            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand == 1 || operand == 0) {
                    result += temp1;
                    temp1 = 0;
                }
                if(operand == 2) {
                    result -= temp1;
                    temp1 = 0;
                }
                if(operand == 3) {
                    result *= temp1;
                    temp1 = 0;
                }
                if(operand == 4) {
                    result /= temp1;
                    temp1 = 0;
                }
                screen.setText(String.valueOf(result) );
                sign.setText("*");
                operand = 3;
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand == 1 || operand == 0) {
                    result += temp1;
                    temp1 = 0;
                }
                if(operand == 2) {
                    result -= temp1;
                    temp1 = 0;
                }
                if(operand == 3) {
                    result *= temp1;
                    temp1 = 0;
                }
                if(operand == 4) {
                    result /= temp1;
                    temp1 = 0;
                }
                screen.setText(String.valueOf(result));
                sign.setText("/");

                operand = 4;
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand == 1 || operand == 0) {
                    result += temp1;
                    temp1 = 0;
                }
                if(operand == 2) {
                    result -= temp1;
                    temp1 = 0;
                }
                if(operand == 3) {
                    result *= temp1;
                    temp1 = 0;
                }
                if(operand == 4) {
                    result /= temp1;
                    temp1 = 0;
                }
                screen.setText(String.valueOf(result));
                temp1 = 0;
                operand = 0;
                sign.setText("");
            }
        });
    }
}
