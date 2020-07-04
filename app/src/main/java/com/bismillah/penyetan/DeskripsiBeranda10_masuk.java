package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DeskripsiBeranda10_masuk extends AppCompatActivity {
    ImageView imageView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_beranda10_masuk);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("FROZEN FOOD");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView = findViewById(R.id.imageView_beranda10);
        textView1 = findViewById(R.id.textView1_beranda10);
        textView2 = findViewById(R.id.textView2_beranda10);
        textView3 = findViewById(R.id.textView3_beranda10);
        textView4 = findViewById(R.id.textView4_beranda10);
        textView5 = findViewById(R.id.textView5_beranda10);
        textView6 = findViewById(R.id.textView6_beranda10);
        textView7 = findViewById(R.id.textView7_beranda10);
        textView8 = findViewById(R.id.textView8_beranda10);
    }
}
