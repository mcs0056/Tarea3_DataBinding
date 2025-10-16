package com.sinBinding.numerosromanos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editNumero = findViewById(R.id.editNumero);
        Button btnConvertir = findViewById(R.id.btnConvertir);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnConvertir.setOnClickListener(v -> {
            try {
                int numero = Integer.parseInt(editNumero.getText().toString());
                String romano = Conversor.decimalToRoman(numero);
                txtResultado.setText("Resultado: " + romano);
            } catch (NumberFormatException e) {
                txtResultado.setText("Número inválido");
            }
        });
    }
}