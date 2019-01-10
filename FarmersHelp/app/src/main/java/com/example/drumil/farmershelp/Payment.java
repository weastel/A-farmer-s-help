package com.example.drumil.farmershelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Payment extends AppCompatActivity {
    String address_full;
    Double f1Needed = 100.00;
    Double f2Needed = 200.00;
    Double f3Needed = 300.00;
    TextView Name;
    TextView NContent;
    TextView PoContent;
    TextView PhContent;
    TextView RealNContent;
    TextView RealPhContent;
    TextView RealPoContent;
    TextView Fertilizer1;
    TextView Fertilizer2;
    TextView Fertilizer3;
    TextView address;
    ProgressBar pgBar;
    String name;
    public void Payment1()
    {
        Bundle bundle = getIntent().getExtras();
        Name = (TextView)findViewById(R.id.tw_crop_name);
        NContent = (TextView)findViewById(R.id.twNContent);
        PoContent = (TextView)findViewById(R.id.twPoContent);
        PhContent = (TextView)findViewById(R.id.twPhContent);
        RealNContent = (TextView)findViewById(R.id.twRealNContent1);
        RealPhContent = (TextView)findViewById(R.id.twPhRealContent1);
        RealPoContent = (TextView)findViewById(R.id.twPoRealContent1);
        Fertilizer3 = findViewById(R.id.Fertilizer3);
        Fertilizer2 = findViewById(R.id.Fertilizer2);
        Fertilizer1 = findViewById(R.id.Fertilizer1);
        address = findViewById(R.id.your_Address);
        address_full =" Name of Costumer :- " + bundle.getString("name")+"\n "+bundle.getString("address1") + ", " + bundle.getString("address2") +",\n City :- "+ bundle.getString("city") + ",\n Pincode :- " + bundle.getString("pincode");
        name = bundle.getString("name");
        f1Needed = Math.floor(Math.max(0.0,bundle.getDouble("RealNi") - Double.valueOf(bundle.getString("nitrogen")))*100.00/21.00*Double.valueOf(bundle.getString("Acres"))*100)/100;
        f3Needed = Math.floor(Math.max(0.0,bundle.getDouble("RealPo") - Double.valueOf(bundle.getString("potassium")))*100.00/50.00*Double.valueOf(bundle.getString("Acres"))*100)/100;
       f2Needed = Math.floor(Math.max(0.0,bundle.getDouble("RealPh") - Double.valueOf(bundle.getString("phosphorus")))*100.00/21.90*Double.valueOf(bundle.getString("Acres"))*100)/100;
        switch(bundle.getInt("NoOC"))
       {
           case 1:
               Name.setText("Rice");
               break;
           case 2:
               Name.setText("Wheat");
               break;
           case 3:
               Name.setText("Cotton");
               break;
           case 4:
               Name.setText("Banana");
               break;
           case 5:
               Name.setText("Tobacco");
       }
       NContent.setText(bundle.getString("nitrogen") + " Kg/Acres");
       PoContent.setText(bundle.getString("potassium") + " Kg/Acres");
       PhContent.setText(bundle.getString("phosphorus") + " Kg/Acres");
       RealNContent.setText(String.valueOf(bundle.getDouble("RealNi")) + " Kg/Acres");
       RealPoContent.setText(String.valueOf(bundle.getDouble("RealPo")) + " Kg/Acres");
       RealPhContent.setText(String.valueOf(bundle.getDouble("RealPh")) + "Kg/Acres");
       Fertilizer1.setText(String.valueOf(f1Needed) + " Kg");
       Fertilizer2.setText(String.valueOf(f3Needed) + " Kg");
       Fertilizer3.setText(String.valueOf(f2Needed) + " Kg");
       address.setText(address_full);

    }
    public void Return(){
        Button button = findViewById(R.id.EndButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Payment.this,MainActivity.class);
                Toast.makeText(Payment.this,name + ",Thank You For Ordering!",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        pgBar = findViewById(R.id.progressbar5);
        pgBar.setProgress(80);

        Return();
        Payment1();
    }
}
