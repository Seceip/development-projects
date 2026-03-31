package com.example.indicemassacorporal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText peso, altura;
    private TextView imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        peso = findViewById(R.id.edPeso);
        altura = findViewById(R.id.edAltura);
        imc = findViewById(R.id.edIMC);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void enviar(View view){
        int pes = Integer.parseInt(peso.getText().toString());
        double alt = Double.parseDouble(altura.getText().toString());
        imc.setText(String.valueOf(pes/(alt*alt)));
        Intent intent = new Intent(getApplicationContext(), InfoCalculado.class);
        intent.putExtra("nome", ((EditText)findViewById(R.id.edNome)).getText().toString());
        intent.putExtra("imc", ((TextView)findViewById(R.id.edIMC)).getText().toString());
        startActivity(intent);
    }

}