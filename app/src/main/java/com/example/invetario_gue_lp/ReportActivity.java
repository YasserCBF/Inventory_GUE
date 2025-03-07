package com.example.invetario_gue_lp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ReportActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        Button gueButton = findViewById(R.id.gue_button);
        Button poeButton = findViewById(R.id.poe_button);

        gueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ReportActivity.this, "Reporte GUE", Toast.LENGTH_SHORT).show();
            }
        });

        poeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ReportActivity.this, "Reporte POE", Toast.LENGTH_SHORT).show();
            }
        });
    }
}