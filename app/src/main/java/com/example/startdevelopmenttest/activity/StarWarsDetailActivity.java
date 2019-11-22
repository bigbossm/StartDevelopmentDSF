package com.example.startdevelopmenttest.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.startdevelopmenttest.R;

import static com.example.startdevelopmenttest.activity.StarWarsActivity.Diameter;
import static com.example.startdevelopmenttest.activity.StarWarsActivity.PlanetName;
import static com.example.startdevelopmenttest.activity.StarWarsActivity.Population;
import static com.example.startdevelopmenttest.activity.StarWarsActivity.climate;
import static com.example.startdevelopmenttest.activity.StarWarsActivity.orbital;
import static com.example.startdevelopmenttest.activity.StarWarsActivity.rotation;
import static com.example.startdevelopmenttest.activity.StarWarsActivity.surface;
import static com.example.startdevelopmenttest.activity.StarWarsActivity.terrain;
import static com.example.startdevelopmenttest.activity.StarWarsActivity.gravity;

public class StarWarsDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_wars_detail);

        Intent intent = getIntent();
        String name = intent.getStringExtra(PlanetName);
        String population = intent.getStringExtra(Population);
        String diameter = intent.getStringExtra(Diameter);
        String climat = intent.getStringExtra(climate);
        String planetrotation = intent.getStringExtra(rotation);
        String planetorbital = intent.getStringExtra(orbital);
        String planetGravity = intent.getStringExtra(gravity);
        String planetTerrain = intent.getStringExtra(terrain);
        String planetSurface = intent.getStringExtra(surface);


        TextView textViewPlanetName = findViewById(R.id.activity_star_wars_detail_name);
        TextView textViewPopulation = findViewById(R.id.activity_star_wars_detail_population);
        TextView textViewDiameter = findViewById(R.id.activity_star_wars_detail_diameter);
        TextView textViewRotation = findViewById(R.id.activity_star_wars_detail_rotation);
        TextView textViewOrbital = findViewById(R.id.activity_star_wars_detail_orbital);
        TextView textViewClimate = findViewById(R.id.activity_star_wars_detail_climate);
        TextView textViewGravity = findViewById(R.id.activity_star_wars_detail_gravity);
        TextView textViewTerrain = findViewById(R.id.activity_star_wars_detail_terrain);
        TextView textViewSurface = findViewById(R.id.activity_star_wars_detail_surface);

     textViewPlanetName.setText(getString(R.string.starwars_detail_population)+name);
     textViewPopulation.setText(population);
     textViewDiameter.setText(diameter);
     textViewRotation.setText(planetrotation);
     textViewOrbital.setText(planetorbital);
     textViewClimate.setText(climat);
     textViewGravity.setText(planetGravity);
     textViewTerrain.setText(planetTerrain);
     textViewSurface.setText(planetSurface);

    }
}
