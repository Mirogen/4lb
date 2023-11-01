package com.example.a4lb;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Oneactivity extends AppCompatActivity {

    TextView question1;
    Button next_Activity_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneactivity);


        next_Activity_button = (Button) findViewById(R.id.first_activity_button);
        question1 = (TextView) findViewById(R.id.question1_id);


        question1.setText("Q1 - В каком году вышел фильм хранители?\n" + "\n" + "Ans - В 2009 году");

        next_Activity_button.setOnClickListener(v -> {
            Intent intent = new Intent(Oneactivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }
}
