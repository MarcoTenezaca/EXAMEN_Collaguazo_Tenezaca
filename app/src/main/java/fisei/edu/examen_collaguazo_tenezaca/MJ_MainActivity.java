package fisei.edu.examen_collaguazo_tenezaca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MJ_MainActivity extends AppCompatActivity {
    private ArrayList<String> datos2;
    private ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mj_main);
        Intent intent = getIntent();
        lv1=(ListView)findViewById(R.id.listaNormal);
        datos2 = new ArrayList<>();
        String[] myStrings = intent.getStringArrayExtra("listaNormal");


    }
    public void onClick(View view) {
    Intent intent = new Intent(MJ_MainActivity.this ,MJ_MainActivity_SEGUNDO.class);
        startActivity(intent);
    }
}