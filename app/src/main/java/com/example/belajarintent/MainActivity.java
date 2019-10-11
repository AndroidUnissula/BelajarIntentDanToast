package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //TODO 3 : Membuat objek edittext
    EditText edtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 4 : Menghubungkan dengan id pada tampilan layout dengan objek EditText
        edtNama = findViewById(R.id.edt_nama);

    }

    // TODO 1 : Membuat Tombol Pindah Aktifiti biasa
    public void btnPindah(View view) {
        startActivity(new Intent(MainActivity.this, PindahActivity.class));
    }

    // TODO 2 : Membuat Tombol Toast
    public void btnToast(View view) {
        Toast.makeText(this, "Ini toast", Toast.LENGTH_SHORT).show();
    }

    //TODO 5 : Mengirim data dengan menekan tombol bawa data
    public void btnBawaData(View view) {

        // TODO 6 : Mengirim data
        Intent nama = new Intent(MainActivity.this,BawaDataActivity.class);
        nama.putExtra("nm",edtNama.getText().toString());
        startActivity(nama);

        
    }
}
