package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void addition(View view){
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView answer = findViewById(R.id.answer);

        int one = Integer.parseInt(number1.getText().toString());
        int two = Integer.parseInt(number2.getText().toString());

        int sum = one + two;

        answer.setText("" + sum);
    }

    @SuppressLint("SetTextI18n")
    public void subtraction(View view){
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView answer = findViewById(R.id.answer);

        int one = Integer.parseInt(number1.getText().toString());
        int two = Integer.parseInt(number2.getText().toString());

        int difference = one - two;

        answer.setText("" + difference);
    }

    @SuppressLint("SetTextI18n")
    public void multiplication(View view){
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView answer = findViewById(R.id.answer);

        int one = Integer.parseInt(number1.getText().toString());
        int two = Integer.parseInt(number2.getText().toString());

        int product = one * two;

        answer.setText("" + product);
    }

    @SuppressLint("SetTextI18n")
    public void division(View view){
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView answer = findViewById(R.id.answer);

        int one = Integer.parseInt(number1.getText().toString());
        int two = Integer.parseInt(number2.getText().toString());

        double product = (double)(one)/two;

        answer.setText("" + product);
    }

}