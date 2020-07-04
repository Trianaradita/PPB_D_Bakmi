package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Makanan1 extends AppCompatActivity {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan1);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("Nasi");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView1 = findViewById(R.id.imageView1_makanan1);
        imageView2 = findViewById(R.id.imageView2_makanan1);
        imageView3 = findViewById(R.id.imageView3_makanan1);
        imageView4 = findViewById(R.id.imageView4_makanan1);
        imageView5 = findViewById(R.id.imageView5_makanan1);
        imageView6 = findViewById(R.id.imageView6_makanan1);
        imageView7 = findViewById(R.id.imageView7_makanan1);
        imageView8 = findViewById(R.id.imageView8_makanan1);
        imageView9 = findViewById(R.id.imageView9_makanan1);
        imageView10 = findViewById(R.id.imageView10_makanan1);
        imageView11 = findViewById(R.id.imageView11_makanan1);
        textView1 = findViewById(R.id.textView1_makanan1);
        textView2 = findViewById(R.id.textView2_makanan1);
        textView3 = findViewById(R.id.textView3_makanan1);
        textView4 = findViewById(R.id.textView4_makanan1);
        textView5 = findViewById(R.id.textView5_makanan1);
        textView6 = findViewById(R.id.textView6_makanan1);
        textView7 = findViewById(R.id.textView7_makanan1);
        textView8 = findViewById(R.id.textView8_makanan1);
        textView9 = findViewById(R.id.textView9_makanan1);
        textView10 = findViewById(R.id.textView10_makanan1);
        textView11 = findViewById(R.id.textView11_makanan1);

        imageView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan1.this, DeskripsiMakanan3.class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Makanan1.this, DeskripsiMakanan4.class);
                startActivity(intent2);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan1.this, DeskripsiMakanan14.class);
                startActivity(intent);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Makanan1.this, DeskripsiMakanan15.class);
                startActivity(intent2);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan1.this, DeskripsiMakanan16.class);
                startActivity(intent);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Makanan1.this, DeskripsiMakanan17.class);
                startActivity(intent2);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan1.this, DeskripsiMakanan18.class);
                startActivity(intent);
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Makanan1.this, DeskripsiMakanan31.class);
                startActivity(intent2);
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan1.this, DeskripsiMakanan32.class);
                startActivity(intent);
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Makanan1.this, DeskripsiMakanan33.class);
                startActivity(intent2);
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan1.this, DeskripsiMakanan34.class);
                startActivity(intent);
            }
        });
    }
}
