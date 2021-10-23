package com.example.defi021;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySecond extends AppCompatActivity {
    String message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        System.out.println( "***************************************");




        Intent intent = getIntent();
        if (intent.getStringExtra(MainActivity.EXTRA_MESSAGE1) != null){
            message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE1);
        }else if (intent.getStringExtra(MainActivity.EXTRA_MESSAGE2) != null){
            message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        }else if (intent.getStringExtra(MainActivity.EXTRA_MESSAGE3) != null){
            message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE3);
        }

//        System.out.println(message);

        TextView textView = findViewById(R.id.text_header);
        textView.setText(message);









    }

    public void launchSecondActivity(View view) {
    }
}
