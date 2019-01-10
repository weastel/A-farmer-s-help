package com.example.drumil.farmershelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class Cropselection extends AppCompatActivity {

    Double RealNi;
    Double RealPo;
    Double RealPh;
    public ImageButton btnRice;
    public ImageButton btnCotton;
    public ImageButton btnBanana;
    public ImageButton btnWheat;
    public ImageButton btnTobacco;
    ProgressBar pgbar;
    public void btnPressed()
    {
        btnRice = (ImageButton)findViewById(R.id.btn_rice);
        btnRice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rice = new Intent(Cropselection.this,Cotton.class);
                Bundle bundle = getIntent().getExtras();
                RealNi = Math.floor(16*2.4/2.47*100)/100;
                RealPh = Math.floor(6.4*2.4/2.47*100)/100;
                RealPo = Math.floor(19*2.4/2.47*100)/100;
                bundle.putInt("NoOC",1);
                bundle.putDouble("RealNi",RealNi);
                bundle.putDouble("RealPo",RealPo);
                bundle.putDouble("RealPh",RealPh);
                if(bundle != null)
                {
                    rice.putExtras(bundle);
                }
                startActivity(rice);
            }
        });
        btnWheat = (ImageButton)findViewById(R.id.btn_wheat);
        btnWheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wheat = new Intent(Cropselection.this,Cotton.class);
                Bundle bundle = getIntent().getExtras();
                RealNi = Math.floor(95.00/2.47*100)/100;
                RealPh = Math.floor(33.00/2.47*100)/100;
                RealPo = Math.floor(72.00/2.47*100)/100;
                bundle.putInt("NoOC",2);
                bundle.putDouble("RealNi",RealNi);
                bundle.putDouble("RealPo",RealPo);
                bundle.putDouble("RealPh",RealPh);

                if(bundle != null)
                {
                    wheat.putExtras(bundle);
                }
                startActivity(wheat);
            }
        });
        btnCotton = (ImageButton)findViewById(R.id.btn_cotton);
        btnCotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cotton = new Intent(Cropselection.this,Cotton.class);
                Bundle bundle = getIntent().getExtras();
                RealNi = Math.floor(80.0/2.47*100)/100;
                RealPh = Math.floor(40.0/2.47*100)/100;
                RealPo = Math.floor(40.0/2.47*100)/100;
                bundle.putInt("NoOC",3);
                bundle.putDouble("RealNi",RealNi);
                bundle.putDouble("RealPo",RealPo);
                bundle.putDouble("RealPh",RealPh);
                if(bundle != null)
                {
                    cotton.putExtras(bundle);
                }
                startActivity(cotton);
            }
        });
        btnBanana = (ImageButton)findViewById(R.id.btn_banana);
        btnBanana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent banana = new Intent(Cropselection.this,Cotton.class);
                Bundle bundle = getIntent().getExtras();
                RealNi = Math.floor(100.00/2.47*100)/100;
                RealPh = Math.floor(60.0/2.47*100)/100;
                RealPo = Math.floor(155.0/2.47*100)/100;
                bundle.putInt("NoOC",4);
                bundle.putDouble("RealNi",RealNi);
                bundle.putDouble("RealPo",RealPo);
                bundle.putDouble("RealPh",RealPh);
                if(bundle != null)
                {
                    banana.putExtras(bundle);
                }

                startActivity(banana);
            }
        });
        btnTobacco = (ImageButton)findViewById(R.id.btn_tobaco);
        btnTobacco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tobaco = new Intent(Cropselection.this,Cotton.class);
                Bundle bundle = getIntent().getExtras();
                RealNi = Math.floor(160.00/2.47*100)/100;
                RealPh = Math.floor(139.00/2.47*100)/100;
                RealPo = Math.floor(194.00/2.47*100)/100;
                bundle.putInt("NoOC",5);
                bundle.putDouble("RealNi",RealNi);
                bundle.putDouble("RealPo",RealPo);
                bundle.putDouble("RealPh",RealPh);
                if(bundle != null)
                {
                    tobaco.putExtras(bundle);
                }
                startActivity(tobaco);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cropselection);
        btnPressed();
        pgbar = findViewById(R.id.progressbar2);
        pgbar.setProgress(20);

    }
}
