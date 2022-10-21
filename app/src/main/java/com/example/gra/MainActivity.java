package com.example.gra;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    int gracz = 0;
    Button kolko;
    Button krzyzyk;
    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    TextView player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kolko=findViewById(R.id.kolko);
        krzyzyk=findViewById(R.id.krzyzyk);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        player=findViewById(R.id.winner);
        kolko.setOnClickListener(this);
        krzyzyk.setOnClickListener(this);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);


    }

    public void onClick(View v){

        if(v.getId()==R.id.kolko)
            {
                Toast.makeText(getApplicationContext(), "kółko", Toast.LENGTH_SHORT).show();
                gracz = 1;
            }
        if(v.getId()==R.id.krzyzyk)
        {   Toast.makeText(getApplicationContext(), "krzyżyk", Toast.LENGTH_SHORT).show();
                gracz = 2;

        }
            if (v.getId() == R.id.button && gracz==2) {
                button.setText("X");
            }
            else if (v.getId() == R.id.button2 && gracz==2) {
                button2.setText("X");
            }
            else if (v.getId() == R.id.button3 && gracz==2) {
                button3.setText("X");
            }
            else if (v.getId() == R.id.button4 && gracz==2) {
                button4.setText("X");
            }
            else if (v.getId() == R.id.button5 && gracz==2) {
                button5.setText("X");
            }
            else if (v.getId() == R.id.button6 && gracz==2) {
                button6.setText("X");
            }
            else if (v.getId() == R.id.button7 && gracz==2) {
                button7.setText("X");
            }
            else if (v.getId() == R.id.button8 && gracz==2) {
                button8.setText("X");
            }
            else if (v.getId() == R.id.button9 && gracz==2) {
                button9.setText("X");
            }
        if (v.getId() == R.id.button && gracz==1) {
            button.setText("O");
        }
        else if (v.getId() == R.id.button2 && gracz==1) {
            button2.setText("O");
        }
        else if (v.getId() == R.id.button3 && gracz==1) {
            button3.setText("O");
        }
        else if (v.getId() == R.id.button4 && gracz==1) {
            button4.setText("O");
        }
        else if (v.getId() == R.id.button5 && gracz==1) {
            button5.setText("O");
        }
        else if (v.getId() == R.id.button6 && gracz==1) {
            button6.setText("O");
        }
        else if (v.getId() == R.id.button7 && gracz==1) {
            button7.setText("O");
        }
        else if (v.getId() == R.id.button8 && gracz==1) {
            button8.setText("O");
        }
        else if (v.getId() == R.id.button9 && gracz==1) {
            button9.setText("O");
        }
        if (button.getText().toString() == "X" && button2.getText().toString() == "X" && button3.getText().toString() == "X")
        {
            player.setText("krzyżyk wygrał");
            Toast.makeText(getApplicationContext(), "krzyżyk wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(button4.getText().toString() == "X" && button5.getText().toString() == "X" && button6.getText().toString() == "X")
        {
            player.setText("krzyżyk wygrał");
            Toast.makeText(getApplicationContext(), "krzyżyk wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(button7.getText().toString() == "X" && button8.getText().toString() == "X" && button9.getText().toString() == "X")
        {
            player.setText("krzyżyk wygrał");
            Toast.makeText(getApplicationContext(), "krzyżyk wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(button.getText().toString() == "X" && button4.getText().toString() == "X" && button7.getText().toString() == "X")
        {
            player.setText("krzyżyk wygrał");
            Toast.makeText(getApplicationContext(), "krzyżyk wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(button2.getText().toString() == "X" && button5.getText().toString() == "X" && button8.getText().toString() == "X")
        {
            player.setText("krzyżyk wygrał");
            Toast.makeText(getApplicationContext(), "krzyżyk wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(button3.getText().toString() == "X" && button6.getText().toString() == "X" && button9.getText().toString() == "X")
        {
            player.setText("krzyżyk wygrał");
            Toast.makeText(getApplicationContext(), "krzyżyk wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(button.getText().toString() == "X" && button5.getText().toString() == "X" && button9.getText().toString() == "X")
        {
            player.setText("krzyżyk wygrał");
            Toast.makeText(getApplicationContext(), "krzyżyk wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(button3.getText().toString() == "X" && button5.getText().toString() == "X" && button7.getText().toString() == "X")
        {
            player.setText("krzyżyk wygrał");
            Toast.makeText(getApplicationContext(), "krzyżyk wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }
        //
        if (button.getText().toString() == "O" && button2.getText().toString() == "O" && button3.getText().toString() == "O")
        {
            player.setText("kółko wygrało");
            Toast.makeText(getApplicationContext(), "kółko wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(button4.getText().toString() == "O" && button5.getText().toString() == "O" && button6.getText().toString() == "O")
        {
            player.setText("kółko wygrało");
            Toast.makeText(getApplicationContext(), "kółko wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(button7.getText().toString() == "O" && button8.getText().toString() == "O" && button9.getText().toString() == "O")
        {
            player.setText("kółko wygrało");
            Toast.makeText(getApplicationContext(), "kółko wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(button.getText().toString() == "O" && button4.getText().toString() == "O" && button7.getText().toString() == "O")
        {
            player.setText("kółko wygrało");
            Toast.makeText(getApplicationContext(), "kółko wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(button2.getText().toString() == "O" && button5.getText().toString() == "O" && button8.getText().toString() == "O")
        {
            player.setText("kółko wygrało");
            Toast.makeText(getApplicationContext(), "kółko wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(button3.getText().toString() == "O" && button6.getText().toString() == "O" && button9.getText().toString() == "O")
        {
            player.setText("kółko wygrało");
            Toast.makeText(getApplicationContext(), "kółko wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(button.getText().toString() == "O" && button5.getText().toString() == "O" && button9.getText().toString() == "O")
        {
            player.setText("kółko wygrało");
            Toast.makeText(getApplicationContext(), "kółko wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(button3.getText().toString() == "O" && button5.getText().toString() == "O" && button7.getText().toString() == "O")
        {
            player.setText("kółko wygrało");
            Toast.makeText(getApplicationContext(), "kółko wygrywa", Toast.LENGTH_SHORT).show();
            finish();
        }

    }
    }

