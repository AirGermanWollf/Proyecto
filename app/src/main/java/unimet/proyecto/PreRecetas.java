package unimet.proyecto;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by MIGUEL on 15/05/2017.
 */

public class PreRecetas  extends Activity {

    //Elementos de la Interfaz a manipular

    private ListView listaRecetas;
    private String[] elementos = {"Arroz","Pasticho","Pasta","Tajadas","Sopa","Papas Fritas"};


    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.prerecetas);

        listaRecetas=(ListView)findViewById(R.id.lvPrerecetas);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,elementos);

        listaRecetas.setAdapter(adaptador);
    }

}
