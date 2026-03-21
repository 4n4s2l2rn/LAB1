package com.exemple.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView textCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Assurez-vous que le fichier s'appelle bien activity_main.xml
        setContentView(R.layout.activity_main);

        textCount = findViewById(R.id.text_count);
        Button buttonToast = findViewById(R.id.button_toast);
        Button buttonCount = findViewById(R.id.button_count);

        // Action du bouton TOAST
        buttonToast.setOnClickListener(v -> {
            Toast.makeText(this, "Bonjour !", Toast.LENGTH_SHORT).show();
        });

        // Action du bouton COUNT
        buttonCount.setOnClickListener(v -> {
            count++;
            if (textCount != null) {
                textCount.setText(String.valueOf(count));
            }
        });
    }
}