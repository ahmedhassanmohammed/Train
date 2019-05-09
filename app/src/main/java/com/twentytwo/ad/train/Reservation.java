package com.twentytwo.ad.train;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Reservation extends AppCompatActivity {
    Spinner spinner_from,spinner_to,spinner_pm_am,spinner_level,spinner_hour,spinner_month,spinner_day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        spinner_from = findViewById(R.id.spinner_from);
        spinner_to = findViewById(R.id.spinner_to);
        spinner_hour = findViewById(R.id.spinner_hour);
        spinner_pm_am = findViewById(R.id.spinner_pm_am);
        spinner_level = findViewById(R.id.spinner_level);
        spinner_month = findViewById(R.id.spinner_month);
        spinner_day = findViewById(R.id.spinner_day);
        ArrayAdapter<CharSequence> spinnerArrayAdapter = ArrayAdapter.createFromResource(getApplicationContext(),R.array.spinner_from,android.R.layout.simple_spinner_item);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        spinner_from.setAdapter(spinnerArrayAdapter);
        ArrayAdapter<CharSequence> spinnerArrayAdapter2 = ArrayAdapter.createFromResource(getApplicationContext(),R.array.spinner_to,android.R.layout.simple_spinner_item);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        spinner_to.setAdapter(spinnerArrayAdapter2);
        ArrayAdapter<CharSequence> spinnerArrayAdapter3 = ArrayAdapter.createFromResource(getApplicationContext(),R.array.spinner_hour,android.R.layout.simple_spinner_item);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        spinner_hour.setAdapter(spinnerArrayAdapter3);
        ArrayAdapter<CharSequence> spinnerArrayAdapter4 = ArrayAdapter.createFromResource(getApplicationContext(),R.array.spinner_month,android.R.layout.simple_spinner_item);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        spinner_month.setAdapter(spinnerArrayAdapter4);
        ArrayAdapter<CharSequence> spinnerArrayAdapter5 = ArrayAdapter.createFromResource(getApplicationContext(),R.array.spinner_pm_am,android.R.layout.simple_spinner_item);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        spinner_pm_am.setAdapter(spinnerArrayAdapter5);
        ArrayAdapter<CharSequence> spinnerArrayAdapter6 = ArrayAdapter.createFromResource(getApplicationContext(),R.array.Level,android.R.layout.simple_spinner_item);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        spinner_level.setAdapter(spinnerArrayAdapter6);
        ArrayAdapter<CharSequence> spinnerArrayAdapter7 = ArrayAdapter.createFromResource(getApplicationContext(),R.array.spinner_day,android.R.layout.simple_spinner_item);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        spinner_day.setAdapter(spinnerArrayAdapter7);

    }

    public void checkinfo(View view)
    {
        startActivity(new Intent(getApplicationContext(),Check_Info.class));
    }
}
