package com.example.cinurawaapps.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cinurawa.unity.UnityPlayerActivity;
import com.example.cinurawaapps.R;
import com.example.cinurawaapps.data.Scan;
import com.example.cinurawaapps.ui.detail.DetailFragment;


public class MainActivity extends AppCompatActivity {

//    Variable :
    //card view
//    CardView cardView;

    //start button
    AppCompatButton startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //card view
//        cardView = findViewById(R.id.card_view);
//        cardView.setBackgroundResource(R.drawable.card_bg);

        //start button
        startButton = findViewById(R.id.start_button);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(MainActivity.this, UnityPlayerActivity.class);
                startActivity(start);
            }
        });


        Button btnShowDialog = findViewById(R.id.btn_show_dialog);
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailFragment detailFragment = new DetailFragment();
                Bundle args = new Bundle();
                Scan scan = getScan();
                args.putParcelable("data", scan );
                detailFragment.setArguments(args);
                detailFragment.show(getSupportFragmentManager(), detailFragment.getTag());
            }
        });

    }

    private Scan getScan() {
        //TODO : datanya dari mana ?
        return new Scan("1","Rumah Unit Melati Tipe 51/96", "https://blogpictures.99.co/desain-rumah-minimalis-2-lantai.jpg",
                "Bebas Banjir\n" +
                        "Dekat Rumah Sakit\n" +
                        "Akses Dekat Angkutan Umum\n" +
                        "jalan lebar\n" +
                        "daerah asri\n" +
                        "sertifikat hak milik\n" +
                        "dekat perkantoran\n" +
                        "LB: 51 m2\n" +
                        "LT: 96 m2","Jl. Indra Sroka, Citraloka, Yogyakarta", -7.797068, 110.370529);
    }
}
