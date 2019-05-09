package com.twentytwo.ad.train;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Check_Info extends AppCompatActivity {
 Spinner nat , pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check__info);
        pay = findViewById(R.id.spinner_payment);
        nat = findViewById(R.id.spinner_natio);

        ArrayAdapter<CharSequence> pay_spin = ArrayAdapter.createFromResource(getApplicationContext(),R.array.pay,android.R.layout.simple_spinner_item);
        pay_spin.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        pay.setAdapter(pay_spin);
        ArrayAdapter<CharSequence> pay_spin1 = ArrayAdapter.createFromResource(getApplicationContext(),R.array.spinner,android.R.layout.simple_spinner_item);
        pay_spin.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        nat.setAdapter(pay_spin1);

    }

    public void ticket(View view)
    {
        startActivity(new Intent(getApplicationContext(),ticket.class));
    }
}
