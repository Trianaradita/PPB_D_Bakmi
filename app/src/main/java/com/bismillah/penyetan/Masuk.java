package com.bismillah.penyetan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Masuk extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    EditText editText2;
    Button msk2;
    Button msk;
    String user;

    private static final String TAG = "LoginActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);


        msk2=findViewById(R.id.masukya2);
        msk=findViewById(R.id.masukya);
        editText=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);

        msk.setOnClickListener((View.OnClickListener) this);
        msk2.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.masukya) {
            getEmployee();
        } else if (i == R.id.masukya2) {
            Toast.makeText(getApplicationContext(),"Daftar",Toast.LENGTH_LONG).show();
        }
    }


    private void getEmployee(){
        class GetEmployee extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(Masuk.this,"Fetching...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                showEmployee(s);
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                user = editText.getText().toString();
                String s = rh.sendGetRequestTwoParam(konfigurasi.URL_GET_USER,user,editText2.getText().toString());
                return s;
            }
        }
        GetEmployee ge = new GetEmployee();
        ge.execute();
    }

    private void showEmployee(String json){
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray result = jsonObject.getJSONArray(konfigurasi.TAG_JSON_ARRAY);
            if(result.length()==0){
                Toast.makeText(getApplicationContext(),"Maaf akun tidak ada",Toast.LENGTH_LONG).show();
            }
            else{
                Intent intent = new Intent(getApplicationContext(), Berhasil.class);
                startActivity(intent);
            }

        } catch (JSONException e) {
            Toast.makeText(getApplicationContext(),"Maaf akun tidak ada",Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }
}