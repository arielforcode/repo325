package com.ariel.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnConvertir,btnIncializar;
    private EditText edtMontoBolivianos;
    private TextView tvDolares,tvEuros,tvSoles,tvPesosChile,tvRealesBrasil,tvYuanChina,tvYenJapon;
    int monto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDolares=findViewById(R.id.tvDolares);
        tvEuros=findViewById(R.id.tvEuros);
        tvSoles=findViewById(R.id.tvSoles);
        tvPesosChile=findViewById(R.id.tvPesosChilenos);
        tvRealesBrasil=findViewById(R.id.tvRealesBrasil);
        tvYuanChina=findViewById(R.id.tvYuanChina);
        tvYenJapon=findViewById(R.id.tvYenJapon);
        edtMontoBolivianos=findViewById(R.id.edtMontoBolivianos);
// TODO acciones de los botones que controlaran los textos
        btnConvertir =findViewById(R.id.btnConvertir);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtMontoBolivianos.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "El monto esta en blanco", Toast.LENGTH_SHORT).show();
                }else{
                    monto=Integer.parseInt(edtMontoBolivianos.getText().toString());
                    double dolares=monto/6.96;
                    double euros=monto/7.52;
                    double soles=monto/2.23;
                    double pesosChile=monto/0.011354;
                    double realesBrasil=monto/2.2852;
                    double yuanChina=monto/1.1379;
                    double yenJapon=monto/0.05849034;
                    tvDolares.setText(String.format("%.2f", dolares));
                    tvEuros.setText(String.format("%.2f", euros));
                    tvSoles.setText(String.format("%.2f", soles));
                    tvPesosChile.setText(String.format("%.2f", pesosChile));
                    tvRealesBrasil.setText(String.format("%.2f",
                            realesBrasil));
                    tvYuanChina.setText(String.format("%.2f", yuanChina));
                    tvYenJapon.setText(String.format("%.2f", yenJapon));
                }
            }
        });
        btnIncializar=findViewById(R.id.btnInicializar);
        btnIncializar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monto=0;
                edtMontoBolivianos.setText("");
                tvDolares.setText("");
                tvEuros.setText("");
                tvSoles.setText("");
                tvPesosChile.setText("");
                tvRealesBrasil.setText("");
                tvYuanChina.setText("");
                tvYenJapon.setText("");
            }
        });

    }
}