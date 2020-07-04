package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Makanan extends AppCompatActivity {
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
    ImageView imageView15;
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
    TextView textView15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("Bakmi");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView1 = findViewById(R.id.imageView1_makanan);
        imageView2 = findViewById(R.id.imageView2_makanan);
        imageView3 = findViewById(R.id.imageView3_makanan);
        imageView4 = findViewById(R.id.imageView4_makanan);
        imageView5 = findViewById(R.id.imageView5_makanan);
        imageView6 = findViewById(R.id.imageView6_makanan);
        imageView7 = findViewById(R.id.imageView7_makanan);
        imageView8 = findViewById(R.id.imageView8_makanan);
        imageView9 = findViewById(R.id.imageView9_makanan);
        imageView10 = findViewById(R.id.imageView10_makanan);
        imageView11 = findViewById(R.id.imageView11_makanan);
        imageView12 = findViewById(R.id.imageView12_makanan);
        imageView13 = findViewById(R.id.imageView13_makanan);
        imageView14 = findViewById(R.id.imageView14_makanan);
        imageView15 = findViewById(R.id.imageView15_makanan);
        textView1 = findViewById(R.id.textView1_makanan);
        textView2 = findViewById(R.id.textView2_makanan);
        textView3 = findViewById(R.id.textView3_makanan);
        textView4 = findViewById(R.id.textView4_makanan);
        textView5 = findViewById(R.id.textView5_makanan);
        textView6 = findViewById(R.id.textView6_makanan);
        textView7 = findViewById(R.id.textView7_makanan);
        textView8 = findViewById(R.id.textView8_makanan);
        textView9 = findViewById(R.id.textView9_makanan);
        textView10 = findViewById(R.id.textView10_makanan);
        textView11 = findViewById(R.id.textView11_makanan);
        textView12 = findViewById(R.id.textView12_makanan);
        textView13 = findViewById(R.id.textView13_makanan);
        textView14 = findViewById(R.id.textView14_makanan);
        textView15 = findViewById(R.id.textView15_makanan);


        imageView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan1.class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan2.class);
                startActivity(intent);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan7.class);
                startActivity(intent);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan8.class);
                startActivity(intent);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan9.class);
                startActivity(intent);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan10.class);
                startActivity(intent);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan11.class);
                startActivity(intent);
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan12.class);
                startActivity(intent);
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan13.class);
                startActivity(intent);
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan25.class);
                startActivity(intent);
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan26.class);
                startActivity(intent);
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan27.class);
                startActivity(intent);
            }
        });
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan28.class);
                startActivity(intent);
            }
        });
        imageView14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan29.class);
                startActivity(intent);
            }
        });
        imageView15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan30.class);
                startActivity(intent);
            }
        });
    }
}

