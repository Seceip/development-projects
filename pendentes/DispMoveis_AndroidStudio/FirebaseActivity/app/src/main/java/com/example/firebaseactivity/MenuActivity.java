package com.example.firebaseactivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    private String TAG = "cadastrousuario";
    private FirebaseUser user;
    private TextView edNome;
    private FirebaseFirestore db;
    private EditText nome, sobrenome, nasci;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        user = FirebaseAuth.getInstance().getCurrentUser();
        edNome = findViewById(R.id.edNome);
        edNome.setText(user.getEmail());

        db = FirebaseFirestore.getInstance();
        nome = findViewById(R.id.edUserNome);
        sobrenome = findViewById(R.id.edUserSobrenome);
        nasci = findViewById(R.id.edNasci);

        listView = findViewById(R.id.listView);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sairUsuario(View view){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void salvarUsuario(View view){
        Usuario usuario = new Usuario(nome.getText().toString(), sobrenome.getText().toString(),
                nasci.getText().toString());
        db.collection("usuarios")
                .add(usuario)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d(TAG, "DocumentSnapshot added with ID: "+ documentReference.getId());
                        Toast.makeText(MenuActivity.this, "Usuário criado com sucesso!! \nID: "
                        +documentReference.getId(),
                                Toast.LENGTH_SHORT).show();
                        listarUsuarios();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error adding document", e);
                    }
                });
    }

    public void listarUsuarios(){
        List<Usuario> lista = new ArrayList();
        db.collection("usuarios")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if(task.isSuccessful()){
                            Usuario usuario;
                            for (QueryDocumentSnapshot document : task.getResult()){
                                usuario = document.toObject(Usuario.class);
                                Log.d(TAG, document.getId() + " => " + document.getData());
                                lista.add(usuario);
                            }

                            ArrayAdapter<Usuario> arrayAdapter = new ArrayAdapter<>(MenuActivity.this,
                                    android.R.layout.simple_list_item_1, lista);
                            listView.setAdapter(arrayAdapter);
                        }else{
                            Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });
    }

    @Override
    protected void onResume() {
        super.onResume();
        listarUsuarios();
    }
}