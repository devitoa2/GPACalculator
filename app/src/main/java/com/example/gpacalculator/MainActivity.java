package com.example.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Grade1;
    private EditText Grade2;
    private EditText Grade3;
    private EditText Grade4;
    private EditText Grade5;
    private TextView GPA;
    private TextView Compute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Grade1 = (EditText) findViewById(R.id.Class1Field);
        Grade2 = (EditText) findViewById(R.id.Class2Field);
        Grade3 = (EditText) findViewById(R.id.Class3Field);
        Grade4 = (EditText) findViewById(R.id.Class4Field);
        Grade5 = (EditText) findViewById(R.id.Class5Field);

        Button calculate = (Button) findViewById(R.id.Compute);
        GPA = (TextView) findViewById(R.id.GPA);
        Compute = (TextView) findViewById(R.id.Compute);

                        calculate.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (TextUtils.isEmpty(Grade1.getText().toString()))
                                {
                                    GPA.setTextSize(34);
                                    GPA.setText("Empty fields are not allowed. " +
                                            "Please fill in all 5 fields.");
                                }else if (TextUtils.isEmpty(Grade2.getText().toString()))
                                {
                                    GPA.setTextSize(34);
                                    GPA.setText("Empty fields are not allowed. " +
                                            "Please fill in all 5 fields.");
                                }
                                else if (TextUtils.isEmpty(Grade3.getText().toString()))
                                {
                                    GPA.setTextSize(34);
                                    GPA.setText("Empty fields are not allowed. " +
                                            "Please fill in all 5 fields.");
                                }
                                else if (TextUtils.isEmpty(Grade4.getText().toString()))
                                {
                                    GPA.setTextSize(34);
                                    GPA.setText("Empty fields are not allowed. " +
                                            "Please fill in all 5 fields.");
                                }
                                else if (TextUtils.isEmpty(Grade5.getText().toString()))
                                {
                                    GPA.setTextSize(34);
                                    GPA.setText("Empty fields are not allowed. " +
                                            "Please fill in all 5 fields.");
                                }
                                else if (TextUtils.isDigitsOnly(Grade1.getText().toString())== false)
                                {
                                    Grade1.setBackgroundColor(Color.RED);
                                    GPA.setText("Numerical values only.");
                                }
                                else if (TextUtils.isDigitsOnly(Grade2.getText().toString())== false)
                                {
                                    Grade2.setBackgroundColor(Color.RED);
                                    GPA.setText("Numerical values only.");
                                }
                                else if (TextUtils.isDigitsOnly(Grade3.getText().toString())== false)
                                {
                                    Grade3.setBackgroundColor(Color.RED);
                                    GPA.setText("Numerical values only.");
                                }
                                else if (TextUtils.isDigitsOnly(Grade4.getText().toString())== false)
                                {
                                    Grade4.setBackgroundColor(Color.RED);
                                    GPA.setText("Numerical values only.");
                                }
                                else if (TextUtils.isDigitsOnly(Grade5.getText().toString())== false)
                                {
                                    Grade5.setBackgroundColor(Color.RED);
                                    GPA.setText("Numerical values only.");
                                }
                                        else {
                                            Compute.setText("Clear form");
                                computeGPA();
                            }}
                        });
    }
    private void computeGPA() {
        double n1 = Double.valueOf(Grade1.getText().toString());
        double n2 = Double.valueOf(Grade2.getText().toString());
        double n3 = Double.valueOf(Grade3.getText().toString());
        double n4 = Double.valueOf(Grade4.getText().toString());
        double n5 = Double.valueOf(Grade5.getText().toString());
        double sum = n1 + n2 + n3 + n4 + n5;
        double gpa = sum / 5;

        if (gpa < 60)
        {
            GPA.setBackgroundColor(Color.RED);
        }
        else if (gpa > 60 && gpa < 80)
        {
            GPA.setBackgroundColor(Color.YELLOW);
        }
        else if (gpa >79)
        {
            GPA.setBackgroundColor(Color.GREEN);
        }

        String gpastring = String.valueOf(gpa);
        GPA.setText(gpastring);


    }



}