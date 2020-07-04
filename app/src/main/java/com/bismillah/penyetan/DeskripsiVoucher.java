package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DeskripsiVoucher extends AppCompatActivity {
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
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_voucher);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if (toolbarText != null && toolbar != null) {
            toolbarText.setText("Voucher 50 RB");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView = findViewById(R.id.imageView_voucher);
        textView1 = findViewById(R.id.textView1_voucher);
        textView2 = findViewById(R.id.textView2_voucher);
        textView3 = findViewById(R.id.textView3_voucher);
        textView4 = findViewById(R.id.textView4_voucher);
        textView5 = findViewById(R.id.textView5_voucher);
        textView6 = findViewById(R.id.textView6_voucher);
        textView7 = findViewById(R.id.textView7_voucher);
        textView8 = findViewById(R.id.textView8_voucher);
        textView9 = findViewById(R.id.textView9_voucher);

        button = findViewById(R.id.button_keranjang);
    }
}