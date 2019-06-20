package com.example.latihanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PassValueActivity extends AppCompatActivity {

    TextView tvData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_value);

        tvData=findViewById(R.id.tvData);

        String data=getIntent().getStringExtra("data");


        tvData.setText(data);
    }
}
