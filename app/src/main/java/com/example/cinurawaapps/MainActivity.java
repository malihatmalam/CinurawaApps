package com.example.cinurawaapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cinurawa.unity.UnityPlayerActivity;


public class MainActivity extends AppCompatActivity {

//    Variable :
    //card view
    CardView cardView;

    //start button
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //card view
        cardView = findViewById(R.id.card_view);
        cardView.setBackgroundResource(R.drawable.card_bg);

        //start button
        startButton = findViewById(R.id.start_button);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(MainActivity.this, UnityPlayerActivity.class);
                startActivity(start);
            }
        });
    }
}
