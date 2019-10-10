package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    EditText edtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnPindah(View view) {
        startActivity(new Intent(MainActivity.this, PindahActivity.class));
    }

    public void btnToast(View view) {
        Toast.makeText(this, "Ini toast", Toast.LENGTH_SHORT).show();
    }

    public void btnBawaData(View view) {
        
    }
}
