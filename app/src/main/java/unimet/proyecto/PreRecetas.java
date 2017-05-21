package unimet.proyecto;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by MIGUEL on 15/05/2017.
 */

public class PreRecetas  extends Activity {

    //Elementos de la Interfaz a manipular

    private ListView listaLogica;
    private String[] elementos = {"Arroz","Pasticho","Pasta","Tajadas","Sopa","Papas Fritas",
            "Panterita","Bombon chocolate blanco y chispas de chocolate"};


    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.prerecetas);

        listaLogica=(ListView)findViewById(R.id.lvPrerecetas);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,elementos);

        listaLogica.setAdapter(adaptador);

        //Para que al darle click a un elemento de la lista haga algo
        listaLogica.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), String.valueOf(position),Toast.LENGTH_SHORT).show();
            }
        });
    }

}
