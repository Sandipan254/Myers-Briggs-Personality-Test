package com.example.personalitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toDo(View v){
        float E=0,I=0,S=0,N=0,T=0,F=0,J=0,P=0;

        Switch s1= findViewById(R.id.s1);
        if (s1.isChecked()){ E++;}
        else {I++;}

        Switch s2= findViewById(R.id.s2);

                if(s2.isChecked()){ J++;}
                else {P++;}


        Switch s3= findViewById(R.id.s3);

                if(s3.isChecked()) {F++;}
                else {T++;}

        Switch s4= findViewById(R.id.s4);
                if(s4.isChecked()) {I++;}
                else {E++;}

        Switch s5= findViewById(R.id.s5);
                if(s5.isChecked()) {J++;}
                else {P++;}

        Intent goToSecond = new Intent();
        goToSecond.setClass(this, screen2.class);
        goToSecond.putExtra("E", E);
        goToSecond.putExtra("I", I);
        goToSecond.putExtra("S", S);
        goToSecond.putExtra("N", N);
        goToSecond.putExtra("T", T);
        goToSecond.putExtra("F", F);
        goToSecond.putExtra("J", J);
        goToSecond.putExtra("P", P);
        startActivity(goToSecond);
        finish();
    }
}
