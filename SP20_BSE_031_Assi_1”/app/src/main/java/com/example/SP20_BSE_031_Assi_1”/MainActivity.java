package com.example.sp20_bse_031;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Configuration;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ActionFragment actionFragment;
    private msgFragment msgfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int orientation = getResources().getConfiguration().orientation;

        if(orientation== Configuration.ORIENTATION_LANDSCAPE){
            FragmentManager fragmentManager = getSupportFragmentManager();
            actionFragment = (ActionFragment) fragmentManager.findFragmentById(R.id.leftFrag);
            msgfragment = (msgFragment) fragmentManager.findFragmentById(R.id.rightFrag);
        }
    }



}