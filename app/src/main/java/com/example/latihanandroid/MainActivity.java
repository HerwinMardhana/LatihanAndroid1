package com.example.latihanandroid;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewNama;

    EditText nilai1;
    EditText nilai2;
    EditText hasil;
    Button btnHitung;
    Button btnKurang;
    Button btnBagi;
    Button btnKali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //Menhubungkan variabel di java dengan xml layout
        nilai1=findViewById(R.id.nilai1);
        nilai2=findViewById(R.id.nilai2);
        hasil=findViewById(R.id.Hasil);
        btnHitung=findViewById(R.id.btnHitung);
        btnBagi=findViewById(R.id.btnBagi);
        btnKali=findViewById(R.id.btnKali);
        btnKurang=findViewById(R.id.btnKurang);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Mendapatkan text di variabel kemudian do convert ke int
                int a=Integer.parseInt(nilai1.getText().toString());
                int b=Integer.parseInt(nilai2.getText().toString());

                //proses penjumlahan
                int c=a+b;

                hasil.setText("Hasil : "+c);

            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a=Integer.parseInt(nilai1.getText().toString());
                int b=Integer.parseInt(nilai2.getText().toString());

                //proses penjumlahan
                int c=a-b;

                hasil.setText("Hasil : "+c);
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(nilai1.getText().toString());
                int b=Integer.parseInt(nilai2.getText().toString());

                //proses penjumlahan
                int c=a/b;

                hasil.setText("Hasil : "+c);
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(nilai1.getText().toString());
                int b=Integer.parseInt(nilai2.getText().toString());

                //proses penjumlahan
                int c=a*b;

                hasil.setText("Hasil : "+c);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
