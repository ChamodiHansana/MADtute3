package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText eTnum1;
    EditText eTnum2;
    String number1;
    String number2;
    int n1,n2;
    TextView lbldisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        eTnum1 = findViewById(R.id.etn1);
        eTnum2 = findViewById(R.id.etn2);
        lbldisplay = findViewById(R.id.lbldisplay);

        Intent intent = getIntent();
        String number1 = intent.getStringExtra("n1");
        String number2 = intent.getStringExtra("n2");
        eTnum1.setText(number1);
        eTnum2.setText(number2);
        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);

    }


        public void add(View view){
            lbldisplay.setText(number1+ "+" +number2+ "=" +(n1+n2));
        }
        public void subtraction(View view){
            lbldisplay.setText(number1+ "-" +number2+ "=" +(n1-n2));
        }
        public void multiplictaion(View view){
            lbldisplay.setText(number1+ "*" +number2+ "=" +(n1*n2));
        }
        public void division(View view){
            lbldisplay.setText(number1+ "/" +number2+ "=" +(n1/n2));
        }


}