package com.example.drumil.farmershelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.util.Set;

public class Address extends AppCompatActivity {

    ProgressBar pgBar;
    EditText namePerson;
    EditText address1;
    EditText address2;
    EditText city;
    EditText pinCode;
    Button btnPayment;

    public void SetData()
    {
        btnPayment = findViewById(R.id.button);
        pinCode = findViewById(R.id.PinCode);
        address1 = findViewById(R.id.AddressLine1);
        address2 =findViewById(R.id.AddressLine2);
        city = findViewById(R.id.CityName);
        namePerson = findViewById(R.id.EtNamePerson);



        btnPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Bundle bundle = getIntent().getExtras();
                Intent payment = new Intent(Address.this,Payment.class);
                if(bundle != null)
                {

                    bundle.putString("name",namePerson.getText().toString());
                    bundle.putString("pincode",pinCode.getText().toString());
                    bundle.putString("address1",address1.getText().toString());
                    bundle.putString("address2",address2.getText().toString());
                    bundle.putString("city",city.getText().toString());
                    payment.putExtras(bundle);
                }
                startActivity(payment);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
       pgBar = findViewById(R.id.progressBar4);
       SetData();
        pgBar.setProgress(60);

    }
}
