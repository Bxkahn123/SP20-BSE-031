package com.example.sp20_bse_031_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView = null ;
    int x = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        findViewById(R.id.btnopen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x >3)
                    finish();
                else if(textView.getText().toString().trim().equals("0000")){
                    x=0; //resetting the counter.
                    startActivity(new Intent(MainActivity.this, Activity2.class));
                }
                else
                    Toast.makeText(MainActivity.this, "Wrong password, counter: "+x Toast.LENGTH_SHORT).show();

                x++;
            }
        });


        findViewById(R.id.btndlt).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           String textViewString = textView.getText().toString().trim();

            if(textViewString.equals(""))
                return;

            textView.setText(textViewString.substring(0,textViewString.length()-1));
        }
        });

    }

}