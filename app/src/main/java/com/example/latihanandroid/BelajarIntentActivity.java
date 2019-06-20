package com.example.latihanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class BelajarIntentActivity extends AppCompatActivity {

    Button bMainactivity;
    Button bSenddata;
    EditText inputdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_intent);

        bMainactivity=findViewById(R.id.bMainactivity2);
        bSenddata=findViewById(R.id.bSenddata);
        inputdata=findViewById(R.id.inputdata);

        bMainactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BelajarIntentActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        bSenddata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BelajarIntentActivity.this,PassValueActivity.class);
                intent.putExtra("data",inputdata.getText().toString());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
    }

}
