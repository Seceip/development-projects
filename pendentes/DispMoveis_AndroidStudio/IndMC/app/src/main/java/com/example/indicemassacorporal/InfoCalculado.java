package com.example.indicemassacorporal;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InfoCalculado extends AppCompatActivity {

    private TextView nome, imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_info_calculado);

        String nome = getIntent().getStringExtra("nome");
        String imc = getIntent().getStringExtra("imc");

        ((TextView)findViewById(R.id.edNome)).setText(nome);
        ((TextView)findViewById(R.id.edIMC)).setText(imc);

        if(Double.parseDouble(imc) < 18.5){
            ((TextView)findViewById(R.id.edInd1)).setTextColor(Color.parseColor("#000000"));
            ((TextView)findViewById(R.id.edInd1)).setBackgroundColor(Color.parseColor("#FFF017"));
            ((TextView)findViewById(R.id.edInd1b)).setTextColor(Color.parseColor("#000000"));
            ((TextView)findViewById(R.id.edInd1b)).setBackgroundColor(Color.parseColor("#FFF017"));
        }else if(Double.parseDouble(imc) >= 18.5 && Double.parseDouble(imc) < 25){
            ((TextView)findViewById(R.id.edInd2)).setTextColor(Color.parseColor("#000000"));
            ((TextView)findViewById(R.id.edInd2)).setBackgroundColor(Color.parseColor("#FFF017"));
            ((TextView)findViewById(R.id.edInd2b)).setTextColor(Color.parseColor("#000000"));
            ((TextView)findViewById(R.id.edInd2b)).setBackgroundColor(Color.parseColor("#FFF017"));
        }else if(Double.parseDouble(imc) >= 25 && Double.parseDouble(imc) < 30){
            ((TextView)findViewById(R.id.edInd3)).setTextColor(Color.parseColor("#000000"));
            ((TextView)findViewById(R.id.edInd3)).setBackgroundColor(Color.parseColor("#FFF017"));
            ((TextView)findViewById(R.id.edInd3b)).setTextColor(Color.parseColor("#000000"));
            ((TextView)findViewById(R.id.edInd3b)).setBackgroundColor(Color.parseColor("#FFF017"));
        }else if(Double.parseDouble(imc) >= 30 && Double.parseDouble(imc) < 35){
            ((TextView)findViewById(R.id.edInd4)).setTextColor(Color.parseColor("#000000"));
            ((TextView)findViewById(R.id.edInd4)).setBackgroundColor(Color.parseColor("#FFF017"));
            ((TextView)findViewById(R.id.edInd4b)).setTextColor(Color.parseColor("#000000"));
            ((TextView)findViewById(R.id.edInd4b)).setBackgroundColor(Color.parseColor("#FFF017"));
        }else if(Double.parseDouble(imc) >= 35 && Double.parseDouble(imc) < 40){
            ((TextView)findViewById(R.id.edInd5)).setTextColor(Color.parseColor("#000000"));
            ((TextView)findViewById(R.id.edInd5)).setBackgroundColor(Color.parseColor("#FFF017"));
            ((TextView)findViewById(R.id.edInd5b)).setTextColor(Color.parseColor("#000000"));
            ((TextView)findViewById(R.id.edInd5b)).setBackgroundColor(Color.parseColor("#FFF017"));
        }else{
            ((TextView)findViewById(R.id.edInd6)).setTextColor(Color.parseColor("#000000"));
            ((TextView)findViewById(R.id.edInd6)).setBackgroundColor(Color.parseColor("#FFF017"));
            ((TextView)findViewById(R.id.edInd6b)).setTextColor(Color.parseColor("#000000"));
            ((TextView)findViewById(R.id.edInd6b)).setBackgroundColor(Color.parseColor("#FFF017"));
        }

        Button btnCompartilhar = findViewById(R.id.btCompartilhar);

        btnCompartilhar.setOnClickListener(v -> {
            String nomeS = getIntent().getStringExtra("nome");
            String imcS = getIntent().getStringExtra("imc");

            String mensagem = "📊 Resultado do IMC\n\n" +
                    "Nome: " + nome + "\n" +
                    "IMC: " + imc;

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, mensagem);

            startActivity(Intent.createChooser(intent, "Compartilhar via"));
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}