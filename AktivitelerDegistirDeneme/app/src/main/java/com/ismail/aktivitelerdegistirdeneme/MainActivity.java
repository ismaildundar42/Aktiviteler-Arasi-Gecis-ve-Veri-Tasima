package com.ismail.aktivitelerdegistirdeneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText ;
    EditText editText2;
    EditText editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        editText3 = findViewById(R.id.editTextNumber);
        Toast.makeText(MainActivity.this,"! Hoşgeldiniz !",Toast.LENGTH_LONG).show();
    }

    public void Giris(View view)
    {
        String ad,soyad,numara;
        ad = editText.getText().toString();
        soyad=editText2.getText().toString();
        numara = editText3.getText().toString();

        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("ad",ad);
        intent.putExtra("soyad",soyad);
        intent.putExtra("numara",numara);
        startActivity(intent);

    }

}