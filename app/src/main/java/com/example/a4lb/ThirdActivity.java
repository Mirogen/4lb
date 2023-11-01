package com.example.a4lb;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

   TextView question3;
    Button previous_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        previous_button = (Button) findViewById(R.id.third_activity_previous_button);
        question3 = (TextView) findViewById(R.id.question3_id);

        question3.setText("Q 3 - кто режиссёр    фильма хранители?\n" + "\n" + "Ans- Зак Снайдер");
       previous_button.setOnClickListener(v -> {
           Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
           startActivity(intent);
        });
    }
}
