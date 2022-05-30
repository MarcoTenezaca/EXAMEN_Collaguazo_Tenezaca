package fisei.edu.examen_collaguazo_tenezaca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MJ_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mj_main);
    }
    public void onClick(View view) {
    Intent intent = new Intent(MJ_MainActivity.this ,MJ_MainActivity_SEGUNDO.class);
        startActivity(intent);
    }
}