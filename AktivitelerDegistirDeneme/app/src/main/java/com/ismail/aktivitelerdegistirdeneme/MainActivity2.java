package com.ismail.aktivitelerdegistirdeneme;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String ad,soyad,no;

        ad = intent.getStringExtra("ad");
        soyad=intent.getStringExtra("soyad");
        no = intent.getStringExtra("numara");

        textView.setText("Hoşgeldiniz \n"+ad+"\n"+soyad+"\n"+no+"\n");

    }
    public void Git(View view)
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity2.this);
        alert.setTitle("Onay");
        alert.setMessage("Gerçekten 1.aktiviteye geçiş yapmak istiyor musunuz ?");
        alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity2.this,"Ana Maine geçiş yapılamadı !",Toast.LENGTH_LONG).show();
            }
        });
        alert.show();
    }
}