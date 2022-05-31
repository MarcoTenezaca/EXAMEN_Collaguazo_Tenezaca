package fisei.edu.examen_collaguazo_tenezaca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

import java.util.Map;


public class MJ_MainActivity_SEGUNDO extends AppCompatActivity {
    private ArrayList<String> datos;
    private ArrayAdapter<String> adaptador1;
    private ListView lv1;
    private ListView lv2;
    private EditText et1;
    private SharedPreferences prefe1;
    private Button buttonVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mj_main_segundo);
        datos =new ArrayList<String>();
        leerSharedPreferences();
        adaptador1=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, datos);
        lv1=(ListView)findViewById(R.id.list1);
        lv2= (ListView)findViewById(R.id.listaNormal);
        lv1.setAdapter(adaptador1);


        et1=(EditText)findViewById(R.id.et1);
        buttonVolver = findViewById(R.id.button_volver);


        // REGRESAR DATOS
        buttonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(MJ_MainActivity_SEGUNDO.this , MJ_MainActivity.class);
                   intent.putStringArrayListExtra("listanumero",(ArrayList<String>) datos);
                    //intent.putIntegerArrayListExtra("listanumero",(Integer).datos );
                    startActivity(intent);


            }



        });
                // FIN REGRESAR DATOS
    }
    private void leerSharedPreferences() {
        prefe1=getSharedPreferences("datos", Context.MODE_PRIVATE);
        Map<String,?> claves = prefe1.getAll();
        for(Map.Entry<String,?> ele : claves.entrySet()){
            datos.add(ele.getKey()+" : " +ele.getValue().toString());
        }
    }

    public void agregar(View v) {
        datos.add(et1.getText().toString());
        adaptador1.notifyDataSetChanged();
        SharedPreferences.Editor elemento=prefe1.edit();
        elemento.commit();
        et1.setText("");

    }



}