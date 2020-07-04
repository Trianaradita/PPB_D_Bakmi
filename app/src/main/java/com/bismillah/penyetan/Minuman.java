package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Minuman extends AppCompatActivity {
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
    ImageView imageView16;
    ImageView imageView17;
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
    TextView textView16;
    TextView textView17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("Minuman");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView1 = findViewById(R.id.imageView1_minuman);
        imageView2 = findViewById(R.id.imageView2_minuman);
        imageView3 = findViewById(R.id.imageView3_minuman);
        imageView4 = findViewById(R.id.imageView4_minuman);
        imageView5 = findViewById(R.id.imageView5_minuman);
        imageView6 = findViewById(R.id.imageView6_minuman);
        imageView7 = findViewById(R.id.imageView7_minuman);
        imageView8 = findViewById(R.id.imageView8_minuman);
        imageView9 = findViewById(R.id.imageView9_minuman);
        imageView10 = findViewById(R.id.imageView10_minuman);
        imageView11 = findViewById(R.id.imageView11_minuman);
        imageView12 = findViewById(R.id.imageView12_minuman);
        imageView13 = findViewById(R.id.imageView13_minuman);
        imageView14 = findViewById(R.id.imageView14_minuman);
        imageView15 = findViewById(R.id.imageView15_minuman);
        imageView16 = findViewById(R.id.imageView16_minuman);
        imageView17 = findViewById(R.id.imageView17_minuman);
        textView1 = findViewById(R.id.textView1_minuman);
        textView2 = findViewById(R.id.textView2_minuman);
        textView3 = findViewById(R.id.textView3_minuman);
        textView4 = findViewById(R.id.textView4_minuman);
        textView5 = findViewById(R.id.textView5_minuman);
        textView6 = findViewById(R.id.textView6_minuman);
        textView7 = findViewById(R.id.textView7_minuman);
        textView8 = findViewById(R.id.textView8_minuman);
        textView9 = findViewById(R.id.textView9_minuman);
        textView10 = findViewById(R.id.textView10_minuman);
        textView11 = findViewById(R.id.textView11_minuman);
        textView12 = findViewById(R.id.textView12_minuman);
        textView13 = findViewById(R.id.textView13_minuman);
        textView14 = findViewById(R.id.textView14_minuman);
        textView15 = findViewById(R.id.textView15_minuman);
        textView16 = findViewById(R.id.textView16_minuman);
        textView17 = findViewById(R.id.textView17_minuman);


        imageView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Minuman.this, DeskripsiMinuman1.class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Minuman.this, DeskripsiMinuman2.class);
                startActivity(intent2);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Minuman.this, DeskripsiMinuman3.class);
                startActivity(intent);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Minuman.this, DeskripsiMinuman4.class);
                startActivity(intent2);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Minuman.this, DeskripsiMinuman5.class);
                startActivity(intent);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Minuman.this, DeskripsiMinuman6.class);
                startActivity(intent2);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Minuman.this, DeskripsiMinuman7.class);
                startActivity(intent);
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Minuman.this, DeskripsiMinuman8.class);
                startActivity(intent2);
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Minuman.this, DeskripsiMinuman9.class);
                startActivity(intent);
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Minuman.this, DeskripsiMinuman10.class);
                startActivity(intent2);
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Minuman.this, DeskripsiMinuman11.class);
                startActivity(intent);
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Minuman.this, DeskripsiMinuman12.class);
                startActivity(intent2);
            }
        });
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Minuman.this, DeskripsiMinuman13.class);
                startActivity(intent2);
            }
        });
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Minuman.this, DeskripsiMinuman14.class);
                startActivity(intent2);
            }
        });
        imageView15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Minuman.this, DeskripsiMinuman15.class);
                startActivity(intent);
            }
        });
        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Minuman.this, DeskripsiMinuman16.class);
                startActivity(intent2);
            }
        });
        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Minuman.this, DeskripsiMinuman17.class);
                startActivity(intent2);
            }
        });
    }
}
