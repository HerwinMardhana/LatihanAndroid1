package com.example.latihanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ResultActivity extends AppCompatActivity {

    @BindView(R.id.etResult)
    EditText etResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.bResult)
    public void actionSImpan(){
        Intent intent=new Intent();
        intent.putExtra(BelajarIntentActivity.DATA_RESULT,etResult.getText().toString());
        setResult(BelajarIntentActivity.CODE_RESULT,intent);
        finish();
    }
}
