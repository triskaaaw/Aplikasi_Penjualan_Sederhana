package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etnama, etharga, etjumlah, etbayar;
    Button bttotal, bthasil, bthapus;
    TextView tvtotal, tvkembalian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = findViewById(R.id.et_namabarang);
        etharga = findViewById(R.id.et_hargabarang);
        etjumlah = findViewById(R.id.et_jumlahbarang);
        etbayar = findViewById(R.id.et_bayar);

        bttotal = findViewById(R.id.btn_total);
        bthasil = findViewById(R.id.btn_hasil);
        bthapus = findViewById(R.id.btn_hapus);

        tvtotal = findViewById(R.id.tv_hasil);
        tvkembalian = findViewById(R.id.tv_kembalian2);

        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double jmlbarang, hrgbarang, total;
                jmlbarang = Double.valueOf(etjumlah.getText().toString().trim());
                hrgbarang = Double.valueOf(etharga.getText().toString().trim());
                total = jmlbarang*hrgbarang;
                String total1 = String.valueOf(total);
                tvtotal.setText(total1);
            }
        });

        bthasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bayar, totalharga, hasil;
                totalharga = Double.valueOf(tvtotal.getText().toString().trim());
                bayar = Double.valueOf(etbayar.getText().toString().trim());
                hasil = bayar - totalharga;
                String hasil1 = String.valueOf(hasil);
                tvkembalian.setText(hasil1);
            }
        });

        bthapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etnama.setText("");
                etharga.setText("");
                etjumlah.setText("");
                etbayar.setText("");
                tvtotal.setText("");
                tvkembalian.setText("");
            }
        });
    }
}