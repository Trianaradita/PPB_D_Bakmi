package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DeskripsiKrispy extends AppCompatActivity {
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
        setContentView(R.layout.activity_deskripsi_krispy);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if (toolbarText != null && toolbar != null) {
            toolbarText.setText("Krispy Cheese Sauce");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView = findViewById(R.id.imageView_krispy);
        textView1 = findViewById(R.id.textView1_krispy);
        textView2 = findViewById(R.id.textView2_krispy);
        textView3 = findViewById(R.id.textView3_krispy);
        textView4 = findViewById(R.id.textView4_krispy);
        textView5 = findViewById(R.id.textView5_krispy);
        textView6 = findViewById(R.id.textView6_krispy);
        textView7 = findViewById(R.id.textView7_krispy);
        textView8 = findViewById(R.id.textView8_krispy);
        textView9 = findViewById(R.id.textView9_krispy);
        textView10 = findViewById(R.id.textView10_krispy);

        button = findViewById(R.id.button_keranjang);
    }
}