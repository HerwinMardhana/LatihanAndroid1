package com.example.latihanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.latihanandroid.model.Mahasiswa;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BelajarIntentActivity extends AppCompatActivity {

    @BindView(R.id.inputdata)
    EditText inputdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_intent);
        ButterKnife.bind(this);


    }
    @OnClick(R.id.bMainactivity2)
    public void bukaMainActivity(){
        Intent intent=new Intent(BelajarIntentActivity.this,MainActivity.class);
        startActivity(intent);
    }


    @OnClick(R.id.bSenddata)
    public void sendData(){
        Intent intent=new Intent(BelajarIntentActivity.this,PassValueActivity.class);
        intent.putExtra("data",inputdata.getText().toString());
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

        Mahasiswa mhs=new Mahasiswa();
        mhs.setNama("Herwin");
        mhs.setNim("1007055124");
        mhs.setAlamat("Jl.Perjuangan");
        mhs.setKontak("082154174441");

        intent.putExtra("data_mahasiswa",mhs);

        startActivity(intent);
    }

}
