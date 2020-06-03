package com.example.personalitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class screen3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        float E,I,S,N,T,F,J,P;
        String type="";
        Intent caller = getIntent();
        E= caller.getFloatExtra("E",0);
        I= caller.getFloatExtra("I",0);
        S= caller.getFloatExtra("S",0);
        N= caller.getFloatExtra("N",0);
        T= caller.getFloatExtra("T",0);
        F= caller.getFloatExtra("F",0);
        J= caller.getFloatExtra("J",0);
        P= caller.getFloatExtra("P",0);
        if(E>=I){
            type= type+"E";
        }
        else{
            type=type+"I";
        }
        if(S>=N){
            type=type+"S";
        }
        else{
            type=type+"N";
        }
        if(T>=F){
            type=type+"T";
        }
        else type=type+"F";
        if(J>=P) type=type+"J";
        else type=type+"P";
        TextView perType= findViewById(R.id.perType);
        perType.setText("YOUR PERSONALITY TYPE IS:  "+ type);
        TextView t1= findViewById(R.id.t1);
        TextView t2= findViewById(R.id.t2);
        TextView t3= findViewById(R.id.t3);
        TextView t4= findViewById(R.id.t4);
        float ex=((float)E/4*100);
        float in=((float)I/4*100);
        float se=((float)S/4*100);
        float intu=((float)N/4*100);
        float th=((float)T/4*100);
        float fe=((float)F/4*100);
        float ju=((float)J/4*100);
        float per=((float)P/4*100);
        t1.setText("YOU ARE: "+ex+"% EXTROVERTED AND "+in+"% INTROVERTED");
        t2.setText("YOU RELY: "+se+"% ON SENSING AND "+intu+"% ON INTUITION");
        t3.setText("YOU RELY: "+th+"% ON THINKING AND "+fe+"% ON FEELINGS.");
        t4.setText("YOU RELY: "+ju+"% ON JUDGEMENT AND "+per+"% ON PERCEPTION.");
    }
}
