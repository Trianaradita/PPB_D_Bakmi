package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DeskripsiEsLemonTea extends AppCompatActivity {
    ImageView imageView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView textView10;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_es_lemon_tea);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if (toolbarText != null && toolbar != null) {
            toolbarText.setText("Lomon Es Teh");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView = findViewById(R.id.imageView_LemonTea);
        textView1 = findViewById(R.id.textView1_LemonTea);
        textView2 = findViewById(R.id.textView2_LemonTea);
        textView3 = findViewById(R.id.textView3_LemonTea);
        textView4 = findViewById(R.id.textView4_LemonTea);
        textView5 = findViewById(R.id.textView5_LemonTea);
        textView6 = findViewById(R.id.textView6_LemonTea);
        textView7 = findViewById(R.id.textView7_LemonTea);
        textView8 = findViewById(R.id.textView8_LemonTea);
        textView9 = findViewById(R.id.textView9_LemonTea);
        textView10 = findViewById(R.id.textView10_LemonTea);

        button = findViewById(R.id.button_keranjang);
    }
}