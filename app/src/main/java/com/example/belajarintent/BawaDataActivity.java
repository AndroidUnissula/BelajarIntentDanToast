package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BawaDataActivity extends AppCompatActivity {

    TextView tvNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bawa_data);

        tvNama = findViewById(R.id.tv_nama);

        tvNama.setText("Selamat Datang "+getIntent().getStringExtra("nm"));
    }
}
