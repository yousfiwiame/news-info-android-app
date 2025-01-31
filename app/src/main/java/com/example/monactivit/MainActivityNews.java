package com.example.monactivit;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityNews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        Intent intent=getIntent();
        String login=intent.getStringExtra("wiame");
        TextView textBienvenue=findViewById(R.id.textBienvenue);
        textBienvenue.setText("Bienvenue, " + login + "!");

        Button btnDetails1 = findViewById(R.id.btnDetails1);
        btnDetails1.setOnClickListener(v -> {
            Intent intent3 = new Intent(MainActivityNews.this, MainActivityDetails.class);
            intent3.putExtra("title", "Journées Portes Ouvertes");
            intent3.putExtra("description", "Venez découvrir nos formations et nos campus le 15 mars prochain ! Rencontrez nos enseignants et nos étudiants.\n\nProgramme :\n- 9h-12h : Présentation des filières\n- 12h-14h : Pause déjeuner\n- 14h-17h : Visites des locaux\n- 17h : Cocktail de clôture");
            startActivity(intent3);
        });

        Button btnDetails2 = findViewById(R.id.btnDetails2);
        btnDetails2.setOnClickListener(v -> {
            Intent intent4 = new Intent(MainActivityNews.this, MainActivityDetails.class);
            intent4.putExtra("title", "Bourse d'études");
            intent4.putExtra("description", "Nouvelle campagne de bourses pour l'année académique. Conditions et dossiers disponibles au secrétariat.\n\nCritères d'éligibilité :\n- Être inscrit dans un établissement d'enseignement supérieur\n- Avoir moins de 26 ans\n- Justifier de ressources modestes\n- Avoir de bons résultats académiques\n\nDocuments à fournir :\n- Certificat de scolarité\n- Avis d'imposition des parents\n- Relevés de notes du dernier semestre");
            startActivity(intent4);
        });

        Button btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(v -> {
            Intent intent1=new Intent(this, MainActivityLogin.class);
            startActivity(intent1);
            finish();
        });
    }
}