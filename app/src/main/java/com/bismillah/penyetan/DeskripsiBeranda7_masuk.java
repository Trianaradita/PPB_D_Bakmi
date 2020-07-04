package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DeskripsiBeranda7_masuk extends AppCompatActivity {
    ImageView imageView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_beranda7_masuk);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("WEEKLY MEMBER PRICE");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView = findViewById(R.id.imageView_beranda7);
        textView1 = findViewById(R.id.textView1_beranda7);
        textView2 = findViewById(R.id.textView2_beranda7);
        textView3 = findViewById(R.id.textView3_beranda7);
        textView4 = findViewById(R.id.textView4_beranda7);
        textView5 = findViewById(R.id.textView5_beranda7);
        textView6 = findViewById(R.id.textView6_beranda7);
    }
}
