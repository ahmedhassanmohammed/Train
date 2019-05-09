package com.twentytwo.ad.train;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Asking extends AppCompatActivity {
Spinner from , to;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asking);
        from = findViewById(R.id.spinner_from);
        to = findViewById(R.id.spinner_to);
        ArrayAdapter<CharSequence> charSequenceArrayAdapter = ArrayAdapter.createFromResource(getApplicationContext(),R.array.spinner_from,android.R.layout.simple_spinner_item);
        charSequenceArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        from.setAdapter(charSequenceArrayAdapter);
        ArrayAdapter<CharSequence> charSequenceArrayAdapter2 = ArrayAdapter.createFromResource(getApplicationContext(),R.array.spinner_to,android.R.layout.simple_spinner_item);
        charSequenceArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        to.setAdapter(charSequenceArrayAdapter2);
    }

    public void rec(View view)
    {
        startActivity(new Intent(getApplicationContext(),Asking_two.class));
    }
}
