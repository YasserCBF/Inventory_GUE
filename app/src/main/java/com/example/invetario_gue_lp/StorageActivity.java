package com.example.invetario_gue_lp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.invetario_gue_lp.DatabaseHelper;

public class StorageActivity extends AppCompatActivity {
    private EditText nombreEditText, marcaEditText, cantidadEditText;
    private DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);

        nombreEditText = findViewById(R.id.nombre_edittext);
        marcaEditText = findViewById(R.id.marca_edittext);
        cantidadEditText = findViewById(R.id.cantidad_edittext);
        Button guardarButton = findViewById(R.id.guardar_button);

        dbHelper = new DatabaseHelper(this);

        guardarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = nombreEditText.getText().toString().trim();
                String marca = marcaEditText.getText().toString().trim();
                String cantidadStr = cantidadEditText.getText().toString().trim();

                if (nombre.isEmpty() || marca.isEmpty() || cantidadStr.isEmpty()) {
                    Toast.makeText(StorageActivity.this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
                    return;
                }

                int cantidad = Integer.parseInt(cantidadStr);
                boolean inserted = dbHelper.insertProducto(nombre, marca, cantidad);

                if (inserted) {
                    Toast.makeText(StorageActivity.this, "Producto guardado", Toast.LENGTH_SHORT).show();
                    nombreEditText.setText("");
                    marcaEditText.setText("");
                    cantidadEditText.setText("");
                } else {
                    Toast.makeText(StorageActivity.this, "Error al guardar", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}