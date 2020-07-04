package com.bismillah.penyetan;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AturProfil extends AppCompatActivity {


    protected View.OnClickListener selesai=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.slesai:
                    Intent intent=new Intent(AturProfil.this,Mainclone.class);
                    startActivity(intent);
                    break;
            }
        }
    };

    Button btnpria, btnwn, btnsel;
    EditText ema;
    EditText ealm;
    EditText ekot;
    EditText kod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atur_profil);
        ema = (EditText)findViewById(R.id.Ema);
        ealm = (EditText)findViewById(R.id.Ealamat);
        ekot = (EditText)findViewById(R.id.Ekot);
        kod = (EditText)findViewById(R.id.EKpo);
        btnpria=findViewById(R.id.pr);
        btnwn=findViewById(R.id.wn);
        btnsel=findViewById(R.id.slesai);
        btnsel.setOnClickListener(selesai);
        getEmployee();
    }

    private void getEmployee(){
        class GetEmployee extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(AturProfil.this,"Fetching...","Wait...",false,false);
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
                String s = rh.sendGetRequest(konfigurasi.URL_GET_PROFIL);
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
            for(int i = 0; i<result.length(); i++){
                JSONObject jo = result.getJSONObject(i);
                ema.setText(jo.getString("email"));
                ealm.setText(jo.getString("alamat"));
                ekot.setText(jo.getString("kota_bakmi"));
                kod.setText(jo.getString("kode_pos"));

            }


        } catch (JSONException e) {
            //Toast.makeText(getApplicationContext(),"Maaf akun tidak ada",Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }
}
