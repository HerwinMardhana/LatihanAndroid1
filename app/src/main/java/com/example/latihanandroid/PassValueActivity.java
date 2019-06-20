package com.example.latihanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.latihanandroid.model.Mahasiswa;

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

        String data=getIntent().getStringExtra(BelajarIntentActivity.DATA);
        Mahasiswa mhs=getIntent().getParcelableExtra(BelajarIntentActivity.DATA_MHS);


        tvData.setText(data);
        tvNim.setText(mhs.getNim());
        tvNama.setText(mhs.getNama());
        tvAlamat.setText(mhs.getAlamat());
        tvKontak.setText(mhs.getKontak());
    }
}
