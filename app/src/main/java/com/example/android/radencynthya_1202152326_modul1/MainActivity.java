package com.example.android.radencynthya_1202152326_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //    mendeklarasikan variabel;
    Button Abnormal, Eatbus;
    EditText makanan, porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  Mencari menggunakan id
        Eatbus = (Button)findViewById(R.id.eatbus);
        Abnormal = (Button)findViewById(R.id.abnormal);
        makanan = (EditText)findViewById(R.id.namamakanan);
        porsi = (EditText)findViewById(R.id.jumlahmakanan);

      //  untuk button Abnormal
        Abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, Main2Activity.class);
                String tempat = Abnormal.getText().toString();
                pindah.putExtra("makanan", makanan.getText().toString());
                pindah.putExtra("tempat", tempat);
                pindah.putExtra("porsi", porsi.getText().toString());
                startActivity(pindah);
            }
        });
        //untuk button eatbus
        Eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,Main2Activity.class);
                String tempat = Eatbus.getText().toString();
                pindah.putExtra("makanan", makanan.getText().toString());
                pindah.putExtra("tempat", tempat);
                pindah.putExtra("porsi", porsi.getText().toString());
                startActivity(pindah);
            }
        });
    }
}
