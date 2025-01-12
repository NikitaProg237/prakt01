package ru.tolmazanov;



import static java.lang.Math.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startNewActivity(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }


    public void calculatePerimeter(View v) {
        EditText inputFieldA = findViewById(R.id.inputFieldA);
        EditText inputFieldB = findViewById(R.id.inputFieldB);

        TextView resultField = findViewById(R.id.resultField);


        String inputB = inputFieldB.getText().toString();
        String inputA = inputFieldA.getText().toString();




        double a = Double.parseDouble(inputA);
        double b = Double.parseDouble(inputB);


        double c=sqrt(a*b);



        resultField.setText(String.format("c =%.2f ",c));
    }
}
