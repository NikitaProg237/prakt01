package ru.tolmazanov;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void calculateSegments(View v) {
        EditText inputFieldX1 = findViewById(R.id.inputFieldX1);
        EditText inputFieldY1 = findViewById(R.id.inputFieldY1);
        EditText inputFieldX2 = findViewById(R.id.inputFieldX2);
        EditText inputFieldY2 = findViewById(R.id.inputFieldY2);
        EditText inputFieldX3 = findViewById(R.id.inputFieldX3);
        EditText inputFieldY3 = findViewById(R.id.inputFieldY3);
        TextView resultField = findViewById(R.id.resultField);

        String X1 = inputFieldX1.getText().toString();
        String Y1 = inputFieldY1.getText().toString();
        String X2 = inputFieldX2.getText().toString();
        String Y2 = inputFieldY2.getText().toString();
        String X3 = inputFieldX3.getText().toString();
        String Y3 = inputFieldY3.getText().toString();

        double x1 = Double.parseDouble(X1);
        double y1 = Double.parseDouble(Y1);
        double x2 = Double.parseDouble(X2);
        double y2 = Double.parseDouble(Y2);
        double x3 = Double.parseDouble(X3);
        double y3 = Double.parseDouble(Y3);


        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double p=(a+b+c)/2;
        double P=a+b+c;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        resultField.setText(String.format("P = %.2f\nS = %.2f\n", P, S));

    }
}
