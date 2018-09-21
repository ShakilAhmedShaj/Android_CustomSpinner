package com.t3ch.shaj.android_customspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private String[] planetNames;
    private String[] diameter;
    int[] planets = {R.drawable.sun, R.drawable.mercury, R.drawable.venus, R.drawable.earth, R.drawable.mars, R.drawable.jupitar, R.drawable.saturn, R.drawable.uranus, R.drawable.neptune};
    private boolean isFirstSelection = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinnerID);

        planetNames = getResources().getStringArray(R.array.planet_names);
        diameter = getResources().getStringArray(R.array.diameter);

        CustomAdapter adapter = new CustomAdapter(this, planets, planetNames, diameter);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (isFirstSelection == true) {
                    isFirstSelection = false;
                } else {
                    Toast.makeText(getApplicationContext(), planetNames[position] + " is Selected", Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
