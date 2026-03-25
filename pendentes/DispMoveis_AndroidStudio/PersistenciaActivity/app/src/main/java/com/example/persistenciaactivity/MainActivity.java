package com.example.persistenciaactivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.transform.TransformerFactory;

public class MainActivity extends AppCompatActivity {

    static private String KEY_NOME = "key.nome";
    static private String KEY_PONTOS = "key.pontos";

    private String[] array = new String[]{"Arquivo1","Arquivo2","Arquivo3","Arquivo4","Arquivo5"};
    private String arquivo;
    private EditText entrada, exibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        entrada = findViewById(R.id.edEntrada);
        exibicao = findViewById(R.id.edVisualiza);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1, array);
        ListView lista = findViewById(R.id.listView);

        lista.setAdapter(arrayAdapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                arquivo = (String) parent.getItemAtPosition(position);
                exibirDados();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void salvarChave(View view){
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(KEY_NOME, ((EditText)findViewById(R.id.edNome)).getText().toString());
        editor.putInt(KEY_PONTOS, Integer.parseInt(((EditText)findViewById(R.id.edPontos)).getText().toString()));
        editor.commit();
    }

    public void lerChave(View view){
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        String nome = preferences.getString(KEY_NOME, "PADRÃO");
        int pontos = preferences.getInt(KEY_PONTOS, 0);
        ((EditText)findViewById(R.id.edNome)).setText(nome);
        ((EditText)findViewById(R.id.edPontos)).setText(String.valueOf(pontos));
    }

    private void exibirDados(){
        exibicao.setText("");
        FileInputStream in;
        try {
            in = openFileInput(arquivo);
            Scanner scanner = new Scanner(in);
            while(scanner.hasNext()){
                exibicao.append(scanner.nextLine() + "\n");
            }
        }catch (IOException ex){
            exibicao.setHint("Vazio");
        }
    }

    public void gravarDados(View view){
        FileOutputStream out;
        try {
            out = openFileOutput(arquivo, MODE_APPEND);
            out.write(entrada.getText().toString().concat("\n").getBytes());
        }catch (IOException ex){
        }
        exibirDados();
    }
}