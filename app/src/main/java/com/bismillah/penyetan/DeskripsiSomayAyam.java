package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DeskripsiSomayAyam extends AppCompatActivity {
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
        setContentView(R.layout.activity_deskripsi_somay_ayam);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if (toolbarText != null && toolbar != null) {
            toolbarText.setText("Somay Ayam (2pc");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        imageView = findViewById(R.id.imageView_SomayAyam);
        textView1 = findViewById(R.id.textView1_SomayAyam);
        textView2 = findViewById(R.id.textView2_SomayAyam);
        textView3 = findViewById(R.id.textView3_SomayAyam);
        textView4 = findViewById(R.id.textView4_SomayAyam);
        textView5 = findViewById(R.id.textView5_SomayAyam);
        textView6 = findViewById(R.id.textView6_SomayAyam);
        textView7 = findViewById(R.id.textView7_SomayAyam);
        textView8 = findViewById(R.id.textView8_SomayAyam);
        textView9 = findViewById(R.id.textView9_SomayAyam);
        textView10 = findViewById(R.id.textView10_SomayAyam);

        button = findViewById(R.id.button_keranjang);
    }
}