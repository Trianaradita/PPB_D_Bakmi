package com.bismillah.penyetan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
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
    TextView textView1;
    TextView textView2;
    Button button1;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("Beranda");
            setSupportActionBar(toolbar);
        }

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.beranda);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.beranda:
                        finish();
                        return true;
                    case R.id.hadiah:
                        startActivity(new Intent(getApplicationContext(), Main2_GabungActivity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.toko:
                        startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.menu:
                        startActivity(new Intent(getApplicationContext(), Main4Activity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.lainnya:
                        startActivity(new Intent(getApplicationContext(), Main5Activity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                }
                return false;
            }
        });

        imageView1 = findViewById(R.id.imageView1_beranda);
        imageView2 = findViewById(R.id.imageView2_beranda);
        imageView3 = findViewById(R.id.imageView3_beranda);
        imageView4 = findViewById(R.id.imageView4_beranda);
        imageView5 = findViewById(R.id.imageView5_beranda);
        imageView6 = findViewById(R.id.imageView6_beranda);
        imageView7 = findViewById(R.id.imageView7_beranda);
        imageView8 = findViewById(R.id.imageView8_beranda);
        imageView9 = findViewById(R.id.imageView9_beranda);
        imageView10 = findViewById(R.id.imageView10_beranda);
        imageView11 = findViewById(R.id.imageView11_beranda);
        imageView12 = findViewById(R.id.imageView12_beranda);
        textView1 = findViewById(R.id.textView1_beranda);
        textView2 = findViewById(R.id.textView2_beranda);
        button1 = findViewById(R.id.button1_beranda);
        button2 = findViewById(R.id.button2_beranda);

        imageView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, DeskripsiBeranda1.class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DeskripsiBeranda2.class);
                startActivity(intent);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DeskripsiBeranda3.class);
                startActivity(intent);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DeskripsiBeranda4.class);
                startActivity(intent);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DeskripsiBeranda5.class);
                startActivity(intent);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, DeskripsiBeranda6.class);
                startActivity(intent);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DeskripsiBeranda7.class);
                startActivity(intent);
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DeskripsiBeranda8.class);
                startActivity(intent);
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DeskripsiBeranda9.class);
                startActivity(intent);
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DeskripsiBeranda10.class);
                startActivity(intent);
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DeskripsiBeranda11.class);
                startActivity(intent);
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Permainan.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Syarat_dan_Ketentuan.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Syarat_dan_Ketentuan.class);
                startActivity(intent);
            }
        });
    }
}
