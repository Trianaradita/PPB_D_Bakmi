package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Makanan2 extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;
    ImageView imageView11;
    ImageView imageView12;
    ImageView imageView13;
    ImageView imageView14;
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
    TextView textView11;
    TextView textView12;
    TextView textView13;
    TextView textView14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan2);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if (toolbarText != null && toolbar != null) {
            toolbarText.setText("Makanan Pendamping");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView1 = findViewById(R.id.imageView1_makanan2);
        imageView2 = findViewById(R.id.imageView2_makanan2);
        imageView3 = findViewById(R.id.imageView3_makanan2);
        imageView4 = findViewById(R.id.imageView4_makanan2);
        imageView5 = findViewById(R.id.imageView5_makanan2);
        imageView6 = findViewById(R.id.imageView6_makanan2);
        imageView7 = findViewById(R.id.imageView7_makanan2);
        imageView8 = findViewById(R.id.imageView8_makanan2);
        imageView9 = findViewById(R.id.imageView9_makanan2);
        imageView10 = findViewById(R.id.imageView10_makanan2);
        imageView11 = findViewById(R.id.imageView11_makanan2);
        imageView12 = findViewById(R.id.imageView12_makanan2);
        imageView13 = findViewById(R.id.imageView13_makanan2);
        imageView14 = findViewById(R.id.imageView14_makanan2);
        textView1 = findViewById(R.id.textView1_makanan2);
        textView2 = findViewById(R.id.textView2_makanan2);
        textView3 = findViewById(R.id.textView3_makanan2);
        textView4 = findViewById(R.id.textView4_makanan2);
        textView5 = findViewById(R.id.textView5_makanan2);
        textView6 = findViewById(R.id.textView6_makanan2);
        textView7 = findViewById(R.id.textView7_makanan2);
        textView8 = findViewById(R.id.textView8_makanan2);
        textView9 = findViewById(R.id.textView9_makanan2);
        textView10 = findViewById(R.id.textView10_makanan2);
        textView11 = findViewById(R.id.textView11_makanan2);
        textView12 = findViewById(R.id.textView12_makanan2);
        textView13 = findViewById(R.id.textView13_makanan2);
        textView14 = findViewById(R.id.textView14_makanan2);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Makanan2.this, DeskripsiMakanan5.class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Makanan2.this, DeskripsiMakanan6.class);
                startActivity(intent2);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Makanan2.this, DeskripsiMakanan19.class);
                startActivity(intent);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Makanan2.this, DeskripsiMakanan20.class);
                startActivity(intent2);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Makanan2.this, DeskripsiMakanan21.class);
                startActivity(intent);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Makanan2.this, DeskripsiMakanan22.class);
                startActivity(intent2);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Makanan2.this, DeskripsiMakanan23.class);
                startActivity(intent);
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Makanan2.this, DeskripsiMakanan24.class);
                startActivity(intent2);
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Makanan2.this, DeskripsiMakanan35.class);
                startActivity(intent);
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Makanan2.this, DeskripsiMakanan36.class);
                startActivity(intent2);
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Makanan2.this, DeskripsiMakanan37.class);
                startActivity(intent);
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Makanan2.this, DeskripsiMakanan38.class);
                startActivity(intent2);
            }
        });
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Makanan2.this, DeskripsiMakanan39.class);
                startActivity(intent);
            }
        });
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Makanan2.this, DeskripsiMakanan40.class);
                startActivity(intent2);
            }
        });

    }
}
