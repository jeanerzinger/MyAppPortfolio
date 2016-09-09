package com.example.jean.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

        btPopularMovies.setOnClickListener(this);
        btStockHawk.setOnClickListener(this);
        btBuildItBigger.setOnClickListener(this);
        btMakeYourAppMaterial.setOnClickListener(this);
        btGoUbiquitous.setOnClickListener(this);
        btCapstone.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "This button will launch my " + ((Button) v).getText()
                + " app!", Toast.LENGTH_SHORT).show();
    }
}
