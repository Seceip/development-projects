package com.example.databaseactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private DbHelper base;
    private EditText nome, cpf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        base = new DbHelper(getApplicationContext());
        nome = findViewById(R.id.edNome);
        cpf = findViewById(R.id.edCpf);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void salvarCliente(View view){
        Cliente cliente = new Cliente(nome.getText().toString(), cpf.getText().toString());
        base.salvarCliente(cliente);
        nome.setText("");
        cpf.setText("");
    }

    public void visualizarClientes(View view){
        Intent intent = new Intent(getApplicationContext(), ViewActivity.class);
        startActivity(intent);
    }
}