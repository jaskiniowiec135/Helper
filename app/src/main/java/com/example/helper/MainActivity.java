package com.example.helper;

import android.media.Image;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public Button btnI;
    public Button btnYou;
    public Button btnCold;
    public Button btnHot;
    public Button btnDrink;
    public Button btnFood;
    public Button btnPain;
    public Button btnHead;
    public Button btnLeftArm;
    public Button btnRightArm;
    public Button btnLeftLeg;
    public Button btnRightLeg;
    public Button btnLoud;
    public Button btnQuiet;
    public Button btnTired;
    public TextView txtOutput;
    public String output = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnI = (Button)findViewById(R.id.btnI);
        btnCold = (Button)findViewById(R.id.btnCold);
        btnHot = (Button)findViewById(R.id.btnHot);
        btnFood = (Button)findViewById(R.id.btnFood);
        btnDrink = (Button)findViewById(R.id.btnDrink);
        btnPain = (Button)findViewById(R.id.btnPain);
        btnHead = (Button)findViewById(R.id.btnHead);
        btnLeftArm = (Button)findViewById(R.id.btnLeftArm);
        btnRightArm = (Button)findViewById(R.id.btnRightArm);
        btnLeftLeg = (Button)findViewById(R.id.btnLeftLeg);
        btnRightLeg = (Button)findViewById(R.id.btnRightLeg);
        btnLoud = (Button)findViewById(R.id.btnLoud);
        btnQuiet = (Button)findViewById(R.id.btnQuiet);
        btnTired = (Button)findViewById(R.id.btnTired);
        txtOutput = (TextView)findViewById(R.id.txtOutput);

    }

    public void onClick(View view)
    {
        String tmp = "";
        switch(view.getId())
        {
            case R.id.btnI:
                tmp+= " Ja";
                break;
            case R.id.btnCold:
                tmp += " Zimno";
                break;
            case R.id.btnHot:
                tmp += " Ciepło";
                break;
            case R.id.btnFood:
                tmp += " Jeść";
                break;
            case R.id.btnDrink:
                tmp += " Pić";
                break;
            case R.id.btnPain:
                tmp += " Boli";
                break;
            case R.id.btnHead:
                tmp += " Głowa";
                break;
            case R.id.btnLeftArm:
                tmp += " Lewa ręka";
                break;
            case R.id.btnRightArm:
                tmp += " Prawa ręka";
                break;
            case R.id.btnLeftLeg:
                tmp += " Lewa noga";
                break;
            case R.id.btnRightLeg:
                tmp += " Prawa noga";
                break;
            case R.id.btnLoud:
                tmp += " Głośniej";
                break;
            case  R.id.btnQuiet:
                tmp += " Ciszej";
                break;
            case R.id.btnTired:
                tmp += " Zmęczony";
                break;
            case R.id.btnClear:
                output = "";
                tmp = "";
                break;
        }
        if(output.length() > 30)
        {
            output = "";
            output = tmp;
            txtOutput.setText(output);
        }
        else
        {
            output+= tmp;
            txtOutput.setText(output);
        }
    }
}

