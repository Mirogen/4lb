package com.example.a4lb;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView question2;

    Button next_button, previous_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

         next_button = (Button) findViewById(R.id.second_activity_next_button);
        previous_button = (Button) findViewById(R.id.second_activity_previous_button);
        question2 = (TextView) findViewById(R.id.question2_id);

       question2.setText("Q 2 - В каком году происходят действия фильма?\n" + "\n" + "Ans- В 1985 году");

        next_button.setOnClickListener(v -> {
           Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(intent);
        });

        previous_button.setOnClickListener(v -> {
           Intent intent = new Intent(SecondActivity.this, Oneactivity.class);
            startActivity(intent);
        });
    }
}
