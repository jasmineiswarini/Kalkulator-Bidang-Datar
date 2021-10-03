package com.example.kalkulatorbd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2, e3, e4;
    Button b1, b2, b3, b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.editTextP);
        e2=(EditText) findViewById(R.id.editTextL);
        e3=(EditText) findViewById(R.id.editTextLuas);
        e4=(EditText) findViewById(R.id.editTextKel);

        b1 =(Button) findViewById(R.id.P);
        b2 =(Button) findViewById(R.id.S);
        b3 =(Button) findViewById(R.id.L);
        b4 =(Button) findViewById(R.id.Cl);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.length()==0&&e2.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan Lebar Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else if (e1.length()==0){
                    Toast.makeText(getApplication(),"Panjang Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else if (e2.length()==0){
                    Toast.makeText(getApplication(),"Lebar Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else {
                    int panjang = Integer.parseInt(e1.getText().toString());
                    int lebar = Integer.parseInt(e2.getText().toString());
                    int luas = panjang * lebar;
                    e3.setText(String.valueOf(luas));
                    int kel = 2 * panjang + 2 * lebar;
                    e4.setText(String.valueOf(kel));
                }
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.length()==0&&e2.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else if (e1.length()==0){
                    Toast.makeText(getApplication(),"Alas Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else if (e2.length()==0){
                    Toast.makeText(getApplication(),"Tinggi Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    int alas = Integer.parseInt(e1.getText().toString());
                    int tinggi = Integer.parseInt(e2.getText().toString());
                    int luas = tinggi*alas/2;
                    e3.setText(String.valueOf(luas));
                    int kel = 3 * alas;
                    e4.setText(String.valueOf(kel));
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.length()==0){
                    Toast.makeText(getApplication(),"Diameter Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    int diameter = Integer.parseInt(e1.getText().toString());
                    double  phi = 3.14;
                    double luas = phi*diameter*diameter/4;
                    e3.setText(String.valueOf(luas));
                    double kel = phi*diameter;
                    e4.setText(String.valueOf(kel));
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                e3.setText("");
                e4.setText("");
            }
        });
    }}