package com.example.gra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button kolko;
    Button krzyzyk;
    Button Button;
    Button Button2;
    Button Button3;
    Button Button4;
    Button Button5;
    Button Button6;
    Button Button7;
    Button Button8;
    Button Button9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gra();


    }

    private void gra() {
        setContentView(R.layout.activity_main);
        kolko=findViewById(R.id.kolko);
        krzyzyk=findViewById(R.id.krzyzyk);
        Button=findViewById(R.id.button);
        Button2=findViewById(R.id.button2);
        Button3=findViewById(R.id.button3);
        Button4=findViewById(R.id.button4);
        Button5=findViewById(R.id.button5);
        Button6=findViewById(R.id.button6);
        Button7=findViewById(R.id.button7);
        Button8=findViewById(R.id.button8);
        Button9=findViewById(R.id.button9);
        kolko.setOnClickListener((View.OnClickListener) this);
        krzyzyk.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View v){
        int gracz=0;
        switch(v.getId()){
            case R.id.kolko:
                Toast.makeText(getApplicationContext(), "kółko", Toast.LENGTH_SHORT).show();
                gracz = 1;
                break;
            case R.id.krzyzyk:
                Toast.makeText(getApplicationContext(), "krzyżyk", Toast.LENGTH_SHORT).show();
                gracz = 2;
                break;
        }
        if(gracz==1)
        {
        switch(v.getId()){
            case R.id.button:

                break;
            case R.id.button2:

                break;
            case R.id.button3:

                break;
            case R.id.button4:

                break;
            case R.id.button5:

                break;
            case R.id.button6:

                break;
            case R.id.button7:

                break;
            case R.id.button8:

                break;
            case R.id.button9:

                break;

        }
    }
        else if(gracz==2)
        {
            switch(v.getId()){
                case R.id.button:

                    break;
                case R.id.button2:

                    break;
                case R.id.button3:

                    break;
                case R.id.button4:

                    break;
                case R.id.button5:

                    break;
                case R.id.button6:

                    break;
                case R.id.button7:

                    break;
                case R.id.button8:

                    break;
                case R.id.button9:

                    break;

            }
        }
        else
        {
            Toast.makeText(getApplicationContext(), "wybierz czym grasz", Toast.LENGTH_SHORT).show();
        }
    }

}