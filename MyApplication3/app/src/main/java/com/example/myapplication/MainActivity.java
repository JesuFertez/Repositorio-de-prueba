package com.example.myapplication;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupButton();


    }

    private void setupButton() {
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void initWidgets() {
        etIngresoValor=findViewById(R.id.tv_entrada);
        btnSumar= findViewById(R.id.button);

        tvResult=findViewById(R.id.tv_res);
    }

    public void operar (){}
}