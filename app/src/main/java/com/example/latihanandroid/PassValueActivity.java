package com.example.latihanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PassValueActivity extends AppCompatActivity {

    TextView tvData;
    TextView tvNim;
    TextView tvNama;
    TextView tvAlamat;
    TextView tvKontak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_value);

        tvData=findViewById(R.id.tvData);
        tvNim=findViewById(R.id.tvNim);
        tvNama=findViewById(R.id.tvNama);
        tvAlamat=findViewById(R.id.tvAlamat);
        tvKontak=findViewById(R.id.tvKontak);

        String data=getIntent().getStringExtra("data");


        tvData.setText(data);
    }
}
