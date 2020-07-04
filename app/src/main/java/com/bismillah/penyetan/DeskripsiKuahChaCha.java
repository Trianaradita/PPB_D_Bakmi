package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DeskripsiKuahChaCha extends AppCompatActivity {
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
        setContentView(R.layout.activity_deskripsi_kuah_cha_cha);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if (toolbarText != null && toolbar != null) {
            toolbarText.setText("Bakmi Kuah Cha Cha");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView = findViewById(R.id.imageView_chacha);
        textView1 = findViewById(R.id.textView1_chacha);
        textView2 = findViewById(R.id.textView2_chacha);
        textView3 = findViewById(R.id.textView3_chacha);
        textView4 = findViewById(R.id.textView4_chacha);
        textView5 = findViewById(R.id.textView5_chacha);
        textView6 = findViewById(R.id.textView6_chacha);
        textView7 = findViewById(R.id.textView7_chacha);
        textView8 = findViewById(R.id.textView8_chacha);
        textView9 = findViewById(R.id.textView9_chacha);
        textView10 = findViewById(R.id.textView10_chacha);

        button = findViewById(R.id.button_keranjang);
    }
}