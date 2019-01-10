package com.example.drumil.farmershelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Cotton extends AppCompatActivity {


    TextView tw_Real_Ph;
    TextView tw_Real_Ni;
    TextView Tw_Real_Po;
    TextView Name;
    ImageView NameImg;
    TextView tw_phosphorous;
    TextView tw_potassium;
    TextView tw_nitrogen;
    TextView tw_acres;
    Button btnPayment;
    ProgressBar pgBar;

    public void output_data() {

        Name = (TextView)findViewById(R.id.twName);
        NameImg = (ImageView)findViewById(R.id.ivName);
        tw_nitrogen = (TextView) findViewById(R.id.tw_nitrogen_Cotton);
        tw_phosphorous = (TextView) findViewById(R.id.tw_phosphorus_Cotton);
        tw_potassium = (TextView) findViewById(R.id.tw_potassium_Cotton);
        tw_acres = (TextView) findViewById(R.id.tw_Acres_cotton);
        btnPayment = (Button)findViewById(R.id.btn_payment);
        tw_Real_Ni = (TextView)findViewById(R.id.twNRealContent);
        tw_Real_Ph = (TextView)findViewById(R.id.twPhRealContent);
        Tw_Real_Po = (TextView)findViewById(R.id.twPRealContent);
        final Bundle bundle = getIntent().getExtras();
        tw_nitrogen.setText(bundle.getString("nitrogen") + " Kg/Acres");
        tw_phosphorous.setText(bundle.getString("phosphorus") + " Kg/Acres");
        tw_potassium.setText(bundle.getString("potassium") + " Kg/Acres");
        tw_acres.setText(bundle.getString("Acres") + " Acres");
        tw_Real_Ph.setText(String.valueOf(bundle.getDouble("RealPh")) + " Kg/Acres");
        tw_Real_Ni.setText(String.valueOf(bundle.getDouble("RealNi")) + " Kg/Acres");
        Tw_Real_Po.setText(String.valueOf(bundle.getDouble("RealPo")) + " Kg/Acres");
        if(bundle.getInt("NoOC")==1)
        {
            Name.setText("Rice");
            NameImg.setImageResource(R.drawable.rice);
        }
        else if(bundle.getInt("NoOC")==2)
        {
            Name.setText("Wheat");
            NameImg.setImageResource(R.drawable.wheat);
        }
        else if(bundle.getInt("NoOC")==3)
        {
            Name.setText("Cotton");
            NameImg.setImageResource(R.drawable.cotton);
        }
        else if(bundle.getInt("NoOC")==4)
        {
            Name.setText("Banana");
            NameImg.setImageResource(R.drawable.banana);
        }
        else if(bundle.getInt("NoOC")==5)
        {
            Name.setText("Tobacco");
            NameImg.setImageResource(R.drawable.tobacco);
        }
        btnPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        Intent payment = new Intent(Cotton.this,Address.class);
        if(bundle != null)
        {
            payment.putExtras(bundle);
        }
        startActivity(payment);


            }
        });



    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotton);
        pgBar = findViewById(R.id.progressbar3);
        pgBar.setProgress(40);

        output_data();
    }
}
