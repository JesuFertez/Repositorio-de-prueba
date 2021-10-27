package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText etIngresoValor;
    private Button btnSumar;
    private TextView tvResult;
    private Calculadora calculadora;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        setupButton();
        calculadora = new Calculadora();
    }

    private void setupButton() {
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sumarValores();
            }
        });
    }

    private void initWidgets() {

        etIngresoValor = findViewById(R.id.tv_entrada);
        btnSumar = findViewById(R.id.button);
        tvResult = findViewById(R.id.tv_res);
    }

    public void sumarValores() {
        String resultado = String.valueOf(calculadora.add(etIngresoValor.getText().toString()));
        tvResult.setText(resultado);
    }
}