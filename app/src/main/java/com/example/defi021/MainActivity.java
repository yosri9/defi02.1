package com.example.defi021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.android.defi021.extra.MESSAGE";
    public static final String EXTRA_MESSAGE1 = EXTRA_MESSAGE + "1";
    public static final String EXTRA_MESSAGE2 = EXTRA_MESSAGE + "2";
    public static final String EXTRA_MESSAGE3 = EXTRA_MESSAGE + "3";


    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    String message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne = findViewById(R.id.button_one);
        buttonTwo = findViewById(R.id.button_two);
        buttonThree = findViewById(R.id.button_three);

    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, ActivitySecond.class);
        if (view.getId() == buttonOne.getId()) {


            message = buttonOne.getText().toString();
            intent.putExtra(EXTRA_MESSAGE1, message);
        } else if (view.getId() == buttonTwo.getId()) {
            message = buttonTwo.getText().toString();
            intent.putExtra(EXTRA_MESSAGE2, message);


        } else if (view.getId() == buttonThree.getId()) {
            message = buttonThree.getText().toString();
            intent.putExtra(EXTRA_MESSAGE2, message);

        }


        Log.d(LOG_TAG, "Button clicked!");
        startActivity(intent);


    }
}