package com.example.macedonio.baseaccesorios;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class activity_accesorios extends ActionBarActivity {
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_accesorios);

        List<Modelo> items = new ArrayList<>();

        AdminSQLiteOpenHelper funcion = new AdminSQLiteOpenHelper(this, "accesorios", null, 1);
        SQLiteDatabase BD = funcion.getWritableDatabase();
        Cursor fila = BD.rawQuery("select id_accesorio, nombre, color, tipo from accesorios", null);
        for(fila.moveToFirst(); !fila.isAfterLast(); fila.moveToNext()){

            items.add (new Modelo(fila.getString(0), fila.getString(1), fila.getString(2), fila.getString(3)));
        }

        recycler = (RecyclerView) findViewById(R.id.accesorios);
        recycler.setHasFixedSize(true);


        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);


        adapter = new AdapterAccesorio(items);
        recycler.setAdapter(adapter);
        BD.close();
    }
}
