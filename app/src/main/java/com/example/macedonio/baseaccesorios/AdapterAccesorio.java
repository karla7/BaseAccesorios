package com.example.macedonio.baseaccesorios;

/**
 * Created by macedonio on 28/05/2015.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class AdapterAccesorio extends RecyclerView.Adapter<AdapterAccesorio.accesorioViewHolder> {
    private List<Modelo> items;



    public static class accesorioViewHolder extends RecyclerView.ViewHolder{

        public TextView id_accesorio;
        public TextView nombre;
        public TextView color;
        public TextView tipo;

        public accesorioViewHolder(View v){
            super(v);
            id_accesorio = (TextView) v.findViewById(R.id.id_a);
            nombre= (TextView) v.findViewById(R.id.nombre_a);
            color= (TextView) v.findViewById(R.id.color_a);
            tipo= (TextView) v.findViewById(R.id.tipo_a);

        }
    }

    public AdapterAccesorio(List<Modelo> items){
        this.items= items;
    }

    @Override
    public accesorioViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_accesorio, viewGroup, false);
        return new accesorioViewHolder(v);
    }

    @Override
    public void onBindViewHolder(accesorioViewHolder accesorioViewHolder, int i) {
        accesorioViewHolder.id_accesorio.setText("id: "+ String.valueOf(items.get(i).getId_ACCESORIO()));//solo a este por que es numerico, los demas ya son Strings
        accesorioViewHolder.nombre.setText("nombre: "+ String.valueOf(items.get(i).getNOMBRE()));
        accesorioViewHolder.color.setText("color: " + String.valueOf(items.get(i).getCOLOR()));
        accesorioViewHolder.tipo.setText("tipo: " + String.valueOf(items.get(i).getTIPO()));



    }

    @Override
    public int getItemCount() {

        return items.size();
    }
}

