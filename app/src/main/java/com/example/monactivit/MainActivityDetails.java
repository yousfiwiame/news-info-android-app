package com.example.monactivit;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivityDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);

        Intent intent=getIntent();
        String title=intent.getStringExtra("title");
        String description=intent.getStringExtra("description");

        TextView detailTitle = findViewById(R.id.detailTitle);
        detailTitle.setText(title);

        TextView detailDescription = findViewById(R.id.detailDescription);
        detailDescription.setText(description);

        Button btnOk = findViewById(R.id.btnOk);
        btnOk.setOnClickListener(v -> {
            Intent intent1 = new Intent(this, MainActivityNews.class);
            startActivity(intent1);
            finish();
        });
    }
}