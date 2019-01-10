package com.example.drumil.farmershelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    public  Button btnMain;
    public ImageButton btnAboutUs;
    public void init()
    {
        btnAboutUs = (ImageButton)findViewById(R.id.about_us);
        btnMain = (Button)findViewById(R.id.btn_begin);
        btnAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent begin = new Intent(MainActivity.this,about_us.class);
                startActivity(begin);
            }
        });
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent begin = new Intent(MainActivity.this,Input_Activity.class);
                startActivity(begin);
            }
        });
    }
    //gargifce@iitr.ac.in
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
// dont call **super**, if u want disable back button in current screen.
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
       //  onBackPressed();


    }

}
