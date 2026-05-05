package com.example.firebaseactivity;

import androidx.annotation.NonNull;

public class Usuario {
    private String nome;
    private String sobrenome;
    private String nascimento;

    public Usuario(){
    }

    public Usuario(String nome, String sobrenome, String nascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getNascimento(){
        return nascimento;
    }

    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return nome + " - " + sobrenome + " - " + nascimento;
    }
}
