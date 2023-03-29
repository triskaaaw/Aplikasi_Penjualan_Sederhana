package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class StartPage extends AppCompatActivity {

    EditText etusername, etpass;
    Button btnmasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        etusername = findViewById(R.id.etUsername);
        etpass = findViewById(R.id.etPass);

        btnmasuk = findViewById(R.id.btnMasuk);

        //menambahkan aksi pada saat button di pencet
        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(getApplicationContext(),MainActivity.class)});
            }
        });
    }
}