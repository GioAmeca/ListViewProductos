package com.unidad3.gio.listviewproductos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private TextView TxtCategoria;
 private ListView TxtLista;
 private String productos[]={"Computadora", "Mouse", "Dulces", "Hojas", "Lapices", "Lentes","Reloj",
                             "Cuchara", "Celular", "Mesa", "Refrigerador","Horno", "Audifonos"};
 private String categoria[] ={"Electronica","Electronica","Dulceria","Papeleria","Papeleria","Moda",
                              "Perfumeria ", "Hogar", "Electronicos", "Hogar", "Electrodomesticos",
                              "Electrodomesticos", "Electronica"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TxtCategoria=(TextView)findViewById(R.id.TxtCategoria);
        TxtLista=(ListView)findViewById(R.id.TxtLista);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,productos);
        TxtLista.setAdapter(adapter);

        TxtLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                TxtCategoria.setText("Categoria: "+ categoria[i]);
            }
        });
    }
}
