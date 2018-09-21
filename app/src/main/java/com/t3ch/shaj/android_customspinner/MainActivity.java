package com.t3ch.shaj.android_customspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private String[] planetNames;
    private String[] diameter;
    int[] planets = {R.drawable.sun, R.drawable.mercury, R.drawable.venus, R.drawable.earth, R.drawable.mars, R.drawable.jupitar, R.drawable.saturn, R.drawable.uranus, R.drawable.neptune};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinnerID);

        planetNames = getResources().getStringArray(R.array.planet_names);
        diameter = getResources().getStringArray(R.array.diameter);

        CustomAdapter adapter = new CustomAdapter(this, planets, planetNames, diameter);
        spinner.setAdapter(adapter);
    }
}
