package com.example.tareai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    TextView resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultados = (TextView) findViewById(R.id.resultado);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        int result = (int) extras.get("resultado");
        resultados.setText(""+result);
    }
}