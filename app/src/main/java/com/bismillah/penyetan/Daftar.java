package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Daftar extends AppCompatActivity {
    Button btnberhasil;

    protected View.OnClickListener clickBerhasil=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btndaftar:
                    Intent intent=new Intent(Daftar.this,Berhasil.class);
                    startActivity(intent);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        btnberhasil=findViewById(R.id.btndaftar);
        btnberhasil.setOnClickListener(clickBerhasil);
    }
}
