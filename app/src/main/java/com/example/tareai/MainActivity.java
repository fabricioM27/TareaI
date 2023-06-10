package com.example.tareai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nun1, nun2;

    TextView res;
    Button btnsuma, btnresta, btnmulti, btndivi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nun1 = (EditText) findViewById(R.id.nun1);
        nun2 = (EditText) findViewById(R.id.nun2);
        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnresta = (Button) findViewById(R.id.btnresta);
        btnmulti = (Button) findViewById(R.id.btnmulti);
        btndivi = (Button) findViewById(R.id.btndivi);

        Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(nun1.getText().toString());
                int n2 = Integer.parseInt(nun2.getText().toString());

                int s = n1+n2;

                intent.putExtra( "resultado",s);

                startActivity(intent);

                limpiar();
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(nun1.getText().toString());
                int n2 = Integer.parseInt(nun2.getText().toString());

                int s = n1-n2;

                intent.putExtra( "resultado",s);

                startActivity(intent);

                limpiar();
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(nun1.getText().toString());
                int n2 = Integer.parseInt(nun2.getText().toString());

                int s = n1*n2;

                intent.putExtra( "resultado",s);

                startActivity(intent);

                limpiar();
            }
        });

        btndivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(nun1.getText().toString());
                int n2 = Integer.parseInt(nun2.getText().toString());

                if (n2 == 0){
                    Intent mensaje = new Intent(getApplicationContext(), Activitymensaje.class);
                    startActivity(mensaje);
                }
                else {
                    int s = n1 / n2;

                    intent.putExtra("resultado", s);

                    startActivity(intent);

                }

                limpiar();
            }
        });
    

    }

    private void limpiar() {
        nun1.setText("");
        nun2.setText("");
    }


}