package com.example.provaandroidex2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {
    TextView txtRaiz ,txtDobro;
    EditText editText;
    Button btVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        btVerificar = (Button) findViewById(R.id.btVerificar);
        txtDobro = (TextView) findViewById(R.id.txtDobro);
        txtRaiz = (TextView) findViewById(R.id.txtRaiz) ;

        btVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Double.parseDouble(editText.getText().toString());

                if (num % 2 == 0)
                {
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                    dialogo.setTitle("Par ou Impar");
                    dialogo.setMessage("Numero é par.");
                    dialogo.setNeutralButton("Ok", null);
                    dialogo.show();

                }
                else {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Par ou Impar");
                    dialog.setMessage("O Numero é impar.");
                    dialog.setNeutralButton("Ok", null);
                    dialog.show();
                }
                double soma = num + num;
                double raiz = Math.sqrt(num);
                txtDobro.setText("O dobro é " + soma);
                txtRaiz.setText("A raiz quadrada é: " + raiz);

            }
        });

    }
}