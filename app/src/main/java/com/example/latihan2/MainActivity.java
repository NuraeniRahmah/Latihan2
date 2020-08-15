package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edtNama;
Button btnKlik;
TextView txtHasil;
String nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNama=(EditText)findViewById(R.id.edt_nama);
        btnKlik=(Button)findViewById(R.id.btn_klik);
        txtHasil=(TextView)findViewById(R.id.txt_hasil);

        btnKlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            nama=edtNama.getText().toString();
            txtHasil.setText(nama);
            }
        });
    }
}
