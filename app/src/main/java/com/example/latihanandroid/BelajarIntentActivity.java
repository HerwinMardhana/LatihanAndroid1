package com.example.latihanandroid;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.latihanandroid.model.Mahasiswa;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BelajarIntentActivity extends AppCompatActivity {

    final static String DATA="data";
    final static String DATA_MHS="data_mahasiswa";
    final static int CODE_REQUEST =105;
    final static int CODE_RESULT=200;
    final static String DATA_RESULT="RESULT";

    @BindView(R.id.inputdata)
    EditText inputdata;
    @BindView(R.id.tvResult)
    TextView tvResult;

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
        intent.putExtra(DATA,inputdata.getText().toString());
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

        Mahasiswa mhs=new Mahasiswa();
        mhs.setNama("Herwin");
        mhs.setNim("1007055124");
        mhs.setAlamat("Jl.Perjuangan");
        mhs.setKontak("082154174441");

        intent.putExtra(DATA_MHS,mhs);

        startActivity(intent);
    }

    @OnClick(R.id.btelp)
    public void btelp(){
        String phone="+6282154174441";
        Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone));
        startActivity(intent);
    }

    @OnClick(R.id.bResult)
    public void result(){
        Intent intent=new Intent(BelajarIntentActivity.this,ResultActivity.class);
        startActivityForResult(intent, CODE_REQUEST);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode== CODE_REQUEST){
            if (resultCode==CODE_RESULT) {
                String result = data.getStringExtra(DATA_RESULT);
                tvResult.setText(result);
            }
        }
    }
}
