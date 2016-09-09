package com.example.jean.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btPopularMovies = (Button) findViewById(R.id.btPopularMovies);
        final Button btStockHawk = (Button) findViewById(R.id.btStockHawk);
        final Button btBuildItBigger = (Button) findViewById(R.id.btBuildItBigger);
        final Button btMakeYourAppMaterial = (Button) findViewById(R.id.btMakeYourAppMaterial);
        final Button btGoUbiquitous = (Button) findViewById(R.id.btGoUbiquitous);
        final Button btCapstone = (Button) findViewById(R.id.btCapstone);


        btPopularMovies.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Esse botão vai abrir meu " +
                        btPopularMovies.getText() + " app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Esse botão vai abrir meu " +
                        btStockHawk.getText() + " app!", Toast.LENGTH_SHORT);
                toast.show();

            }
        });

        btBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Esse botão vai abrir meu " +
                        btBuildItBigger.getText() + " app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btMakeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Esse botão vai abrir meu " +
                        btMakeYourAppMaterial.getText() + " app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Esse botão vai abrir meu " +
                        btGoUbiquitous.getText() + " app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Esse botão vai abrir meu " +
                        btCapstone.getText() + " app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }


}
