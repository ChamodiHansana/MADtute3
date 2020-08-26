package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText eTnum1;
    EditText eTnum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eTnum1=findViewById(R.id.etn1);
        eTnum2=findViewById(R.id.etn2);

    }
    public void openSecondActivity(View view){
        Intent intent=new Intent(this, SecondActivity.class);
        intent.putExtra("n1", eTnum1.getText().toString());
        intent.putExtra("n2", eTnum2.getText().toString());
        startActivity(intent);
        Toast.makeText(this, "Opening Calculator", Toast.LENGTH_SHORT).show();

    }
}