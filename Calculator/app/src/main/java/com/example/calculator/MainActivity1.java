package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }
    public void clickFunction1(View view) {
        EditText enteredText = findViewById(R.id.myTextField);
        EditText enteredText2 = findViewById(R.id.myTextField2);
        int num = Integer.parseInt(enteredText.getText().toString());
        int num2 = Integer.parseInt(enteredText2.getText().toString());
        int answer = num+num2;
        goToActivity2(answer);
    }

    public void clickFunction2(View view) {
        EditText enteredText = findViewById(R.id.myTextField);
        EditText enteredText2 = findViewById(R.id.myTextField2);
        int num1 = Integer.parseInt(enteredText.getText().toString());
        int num2 = Integer.parseInt(enteredText2.getText().toString());
        int answer = num1-num2;
        goToActivity2(answer);
    }

    public void clickFunction3(View view) {
        EditText enteredText = findViewById(R.id.myTextField);
        EditText enteredText2 = findViewById(R.id.myTextField2);
        int num1 = Integer.parseInt(enteredText.getText().toString());
        int num2 = Integer.parseInt(enteredText2.getText().toString());
        int answer = num1*num2;
        goToActivity2(answer);
    }

    public void clickFunction4(View view) {
        EditText enteredText = findViewById(R.id.myTextField);
        EditText enteredText2 = findViewById(R.id.myTextField2);
        int num1 = Integer.parseInt(enteredText.getText().toString());
        int num2 = Integer.parseInt(enteredText2.getText().toString());
        int answer = num1/num2;
        goToActivity2(answer);
    }

    public void goToActivity2(int answer){
        Intent intent = new Intent(this,MainActivity2.class);
        String str = String.valueOf(answer);
        intent.putExtra("answer",str);
        startActivity(intent);
    }


}