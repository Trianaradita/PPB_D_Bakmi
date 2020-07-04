package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Berhasil extends AppCompatActivity {
    Button btnatur,btnlwti;

    protected View.OnClickListener atur=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.editp:
                    Intent intent=new Intent(Berhasil.this,AturProfil.class);
                    startActivity(intent);
                    break;
            }
        }
    };

    protected View.OnClickListener lewati=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.lwt:
                    Intent intent=new Intent(Berhasil.this,Mainclone.class);
                    startActivity(intent);
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berhasil);
        btnatur=findViewById(R.id.editp);
        btnlwti=findViewById(R.id.lwt);
        btnatur.setOnClickListener(atur);
        btnlwti.setOnClickListener(lewati);
    }
}
