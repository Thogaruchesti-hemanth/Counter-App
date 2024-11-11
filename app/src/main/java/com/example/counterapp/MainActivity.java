package com.example.counterapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private Button buttonIncrease, buttonDecrease, buttonReset;

    private TextView textView;

    int count=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonIncrease= findViewById(R.id.incrementButton);
        buttonDecrease=findViewById(R.id.decrementButton);
        buttonReset=findViewById(R.id.resetButton);
        textView=findViewById(R.id.textView);

        buttonIncrease.setOnClickListener(v->{
            count++;
            updateTextview();

        });

        buttonDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count--;
                updateTextview();
            }
        });

        buttonReset.setOnClickListener(view->{

            count=0;
            updateTextview();
        });
        updateTextview();
    }

    private void updateTextview() {

        textView.setText(String.valueOf(count));
    }
}