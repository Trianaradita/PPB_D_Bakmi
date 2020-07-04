package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DeskripsiBeranda11_masuk extends AppCompatActivity {
    ImageView imageView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_beranda11_masuk);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("FREE DELIVERY");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView = findViewById(R.id.imageView_beranda11);
        textView1 = findViewById(R.id.textView1_beranda11);
        textView2 = findViewById(R.id.textView2_beranda11);
        textView3 = findViewById(R.id.textView3_beranda11);
        textView4 = findViewById(R.id.textView4_beranda11);
        textView5 = findViewById(R.id.textView5_beranda11);
        textView6 = findViewById(R.id.textView6_beranda11);
        textView7 = findViewById(R.id.textView7_beranda11);
    }
}
