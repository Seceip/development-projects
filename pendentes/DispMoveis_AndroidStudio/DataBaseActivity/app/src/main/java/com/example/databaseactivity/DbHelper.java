package com.example.databaseactivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NOME = "basedados_persistencia";

    private static final String CREATE_CLIENTE = "create table "+
            Contract.Cliente.TABELA + " ( " +
            Contract.Cliente._ID + "integer primary key autoincrement, " +
            Contract.Cliente.COLUNA_NOME + " text, " +
            Contract.Cliente.COLUNA_CPF + " text)";

    private static final String DROP_CLIENTE = "drop table if exists " +
            Contract.Cliente.TABELA;

    public DbHelper(Context context){
        super(context, DATABASE_NOME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL(CREATE_CLIENTE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion){
        sqLiteDatabase.execSQL(DROP_CLIENTE);
        onCreate(sqLiteDatabase);
    }

    @Override
    public void onDowngrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion){
        onUpgrade(sqLiteDatabase, oldVersion, newVersion);
    }

    public void salvarCliente(Cliente cliente){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(Contract.Cliente.COLUNA_NOME, cliente.getNome());
        contentValues.put(Contract.Cliente.COLUNA_CPF, cliente.getCpf());

        long id = sqLiteDatabase.insert(Contract.Cliente.TABELA, null, contentValues);
        cliente.setId(id);
    }

    @SuppressLint("Range")
    public ArrayList consultarClientes(){
        ArrayList lista = new ArrayList();
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select * from " +
                Contract.Cliente.TABELA, null);

        while (cursor.moveToNext()){
            lista.add(new Cliente(cursor.getLong(
                    cursor.getColumnIndex(Contract.Cliente._ID)),
                    cursor.getString(cursor.getColumnIndex(Contract.Cliente.COLUNA_NOME)),
                    cursor.getString(cursor.getColumnIndex(Contract.Cliente.COLUNA_CPF))));
        }
        return lista;
    }
}
