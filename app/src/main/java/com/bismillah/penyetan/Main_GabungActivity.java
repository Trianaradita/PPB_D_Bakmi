package com.bismillah.penyetan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Main_GabungActivity extends AppCompatActivity {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__gabung);

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

        imageView1 = findViewById(R.id.imageView1_beranda2);
        imageView2 = findViewById(R.id.imageView2_beranda2);
        imageView3 = findViewById(R.id.imageView3_beranda2);
        imageView4 = findViewById(R.id.imageView4_beranda2);
        imageView5 = findViewById(R.id.imageView5_beranda2);
        imageView6 = findViewById(R.id.imageView6_beranda2);
        imageView7 = findViewById(R.id.imageView7_beranda2);
        imageView8 = findViewById(R.id.imageView8_beranda2);
        imageView9 = findViewById(R.id.imageView9_beranda2);
        imageView10 = findViewById(R.id.imageView10_beranda2);
        imageView11 = findViewById(R.id.imageView11_beranda2);
        imageView12 = findViewById(R.id.imageView12_beranda2);
        textView1 = findViewById(R.id.textView1_beranda2);
        textView2 = findViewById(R.id.textView2_beranda2);

        imageView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Main_GabungActivity.this, DeskripsiBeranda1_masuk.class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_GabungActivity.this, DeskripsiBeranda2_masuk.class);
                startActivity(intent);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_GabungActivity.this, DeskripsiBeranda3_masuk.class);
                startActivity(intent);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_GabungActivity.this, DeskripsiBeranda4_masuk.class);
                startActivity(intent);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_GabungActivity.this, DeskripsiBeranda5_masuk.class);
                startActivity(intent);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Main_GabungActivity.this, DeskripsiBeranda6_masuk.class);
                startActivity(intent);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_GabungActivity.this, DeskripsiBeranda7_masuk.class);
                startActivity(intent);
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_GabungActivity.this, DeskripsiBeranda8_masuk.class);
                startActivity(intent);
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_GabungActivity.this, DeskripsiBeranda9_masuk.class);
                startActivity(intent);
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_GabungActivity.this, DeskripsiBeranda10_masuk.class);
                startActivity(intent);
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_GabungActivity.this, DeskripsiBeranda11_masuk.class);
                startActivity(intent);
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_GabungActivity.this, Permainan2.class);
                startActivity(intent);
            }
        });
    }

}
