package com.example.rooms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//BEINOMUGISHA BENARD
    // 2017/BIT/078/PS
    Button myb;
    Button button4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myb=findViewById(R.id.button);
        myb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent =new Intent(MainActivity.this,login.class);
                startActivity(myintent);

            }
        }); button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintento= new Intent(MainActivity.this, navigating.class);
                startActivity(myintento);
            }
        });

    }

}
