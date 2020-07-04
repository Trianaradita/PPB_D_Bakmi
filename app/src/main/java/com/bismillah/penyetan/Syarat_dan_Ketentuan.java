package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Syarat_dan_Ketentuan extends AppCompatActivity {
    CheckBox cb;
    Button gb;

    protected View.OnClickListener clickTuju=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId()==R.id.lanjut1 && cb.isChecked()) {
                Intent intent=new Intent(Syarat_dan_Ketentuan.this,Masuk.class);
                startActivity(intent);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syarat_dan__ketentuan);
        cb=findViewById(R.id.ceksyarat);
        gb=findViewById(R.id.lanjut1);
        gb.setOnClickListener(clickTuju);
    }

}
