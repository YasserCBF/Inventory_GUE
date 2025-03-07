package com.example.invetario_gue_lp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nombreButton = findViewById(R.id.nombre_button);
        Button marcaButton = findViewById(R.id.marca_button);
        Button cantidadButton = findViewById(R.id.cantidad_button);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StorageActivity.class);
                startActivity(intent);
            }
        };

        nombreButton.setOnClickListener(listener);
        marcaButton.setOnClickListener(listener);
        cantidadButton.setOnClickListener(listener);
    }
}