package com.example.personalitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class screen2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
    }
    public void calculate(View v){
        float E,I,S,N,T,F,J,P;
        Intent caller = getIntent();
         E= caller.getFloatExtra("E",0);
         I= caller.getFloatExtra("I",0);
         S= caller.getFloatExtra("S",0);
         N= caller.getFloatExtra("N",0);
         T= caller.getFloatExtra("T",0);
         F= caller.getFloatExtra("F",0);
         J= caller.getFloatExtra("J",0);
         P= caller.getFloatExtra("P",0);

        Switch s6= findViewById(R.id.s6);
        if(s6.isChecked()) {I++;}
        else {E++;}

        Switch s7= findViewById(R.id.s7);
        if(s7.isChecked()) {S++;}
        else {N++;}
        Switch s8= findViewById(R.id.s8);
        if(s8.isChecked()) {T++;}
        else {F++;}
        Switch s9= findViewById(R.id.s9);
        if(s9.isChecked()) {F++;}
        else {T++;}
        Switch s10= findViewById(R.id.s10);
        if(s10.isChecked()) {S++;}
        else {N++;}

        Switch s11= findViewById(R.id.s11);
        if(s11.isChecked()){ N++;}
        else {S++;}

        Switch s12= findViewById(R.id.s12);
        if(s12.isChecked()){ P++;}
        else {J++;}

        Switch s13= findViewById(R.id.s13);
        if(s13.isChecked()){
            E++;
            S++;
            T++;
            J++;
                }
        else {
            I++;
            N++;
            F++;
            P++;
                }

        Intent goToNext = new Intent();
        goToNext.setClass(this,screen3.class);
        goToNext.putExtra("E", E);
        goToNext.putExtra("I", I);
        goToNext.putExtra("S", S);
        goToNext.putExtra("N", N);
        goToNext.putExtra("T", T);
        goToNext.putExtra("F", F);
        goToNext.putExtra("J", J);
        goToNext.putExtra("P", P);
        startActivity(goToNext);
        finish();
    }
}
