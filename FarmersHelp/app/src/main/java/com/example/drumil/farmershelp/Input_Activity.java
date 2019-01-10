package com.example.drumil.farmershelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import static java.lang.Thread.sleep;

public class Input_Activity extends AppCompatActivity {

    public Button btnReset ;
    ProgressBar pgBar;

    public EditText Etnitrogen;
    public EditText Etpotassium;
    public EditText Etphosphorus;
    public EditText EtAcres;


    public  void Reset()
    {
        btnReset = (Button)findViewById(R.id.btn_reset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reset = new Intent(Input_Activity.this,Input_Activity.class);
                startActivity(reset);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_);
        pgBar = findViewById(R.id.progressBar1);
        pgBar.setProgress(0);
        Reset();

    }
    public void Input(View view)
    {
                Etnitrogen = (EditText)findViewById(R.id.AddressLine1);
                Etphosphorus = (EditText)findViewById(R.id.AddressLine2);
                Etpotassium = (EditText)findViewById(R.id.CityName);
                EtAcres = (EditText)findViewById(R.id.PinCode);


        Intent submit = new Intent(this,Cropselection.class);
        submit.putExtra("nitrogen",Etnitrogen.getText().toString());
        submit.putExtra("phosphorus",Etphosphorus.getText().toString());
        submit.putExtra("potassium",Etpotassium.getText().toString());
        submit.putExtra("Acres",EtAcres.getText().toString());
        startActivity(submit);
    }

}
