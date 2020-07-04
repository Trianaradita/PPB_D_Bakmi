package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DeskripsiNasiAyam extends AppCompatActivity {
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
        setContentView(R.layout.activity_deskripsi_nasi_ayam);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if (toolbarText != null && toolbar != null) {
            toolbarText.setText("Nasi Ayam GM");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView = findViewById(R.id.imageView_NasiAyam);
        textView1 = findViewById(R.id.textView1_NasiAyam);
        textView2 = findViewById(R.id.textView2_NasiAyam);
        textView3 = findViewById(R.id.textView3_NasiAyam);
        textView4 = findViewById(R.id.textView4_NasiAyam);
        textView5 = findViewById(R.id.textView5_NasiAyam);
        textView6 = findViewById(R.id.textView6_NasiAyam);
        textView7 = findViewById(R.id.textView7_NasiAyam);
        textView8 = findViewById(R.id.textView8_NasiAyam);
        textView9 = findViewById(R.id.textView9_NasiAyam);
        textView10 = findViewById(R.id.textView10_NasiAyam);

        button = findViewById(R.id.button_keranjang);
    }
}