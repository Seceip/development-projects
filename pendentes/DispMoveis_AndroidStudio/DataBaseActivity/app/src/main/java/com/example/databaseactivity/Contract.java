package com.example.databaseactivity;

import android.provider.BaseColumns;

public class Contract {
    public static class Cliente implements BaseColumns{
        public static final String TABELA = "cliente";
        public static final String COLUNA_NOME = "nome";
        public static final String COLUNA_CPF = "cpf";
    }
}
