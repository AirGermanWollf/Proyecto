package unimet.proyecto;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MIGUEL on 21/05/2017.
 */

public class RecetaPreviaAdaptador extends ArrayAdapter<RecetaPrevia>{
    Context myContext;
    int myLayoutResourceID;
    RecetaPrevia myData[] = null;

    public RecetaPreviaAdaptador(Context contexto,int LayoutResourceID, RecetaPrevia[] data){
        super(contexto,LayoutResourceID,data);

        this.myContext=contexto;
        this.myLayoutResourceID=LayoutResourceID;
        this.myData=data;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        RecetaPreviaHolder holder=null;

        if(row==null){
            LayoutInflater inflater = ((Activity)myContext).getLayoutInflater();
            row = inflater.inflate(myLayoutResourceID,parent,false);

            holder=new RecetaPreviaHolder();
            holder.imagen=(ImageView)row.findViewById(R.id.ivImagenRecetaPequeña);
            holder.textView=(TextView)row.findViewById(R.id.tvNombreReceta);
            row.setTag(holder);

        }else{
            holder=(RecetaPreviaHolder)row.getTag();
        }

        RecetaPrevia recetaPrevia=myData[position];
        holder.textView.setText(recetaPrevia.titulo);
        holder.imagen.setImageResource(recetaPrevia.icono);

        return row;
    }

    static class RecetaPreviaHolder {
        ImageView imagen;
        TextView textView;
    }

}
