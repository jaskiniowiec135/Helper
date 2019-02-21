package com.example.helper;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.Image;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public String systemLanguage;
    public String language;
    public Button btnOptions;
    public Button btnI;
    public Button btnClear;
    public Button btnCold;
    public Button btnHot;
    public Button btnDrink;
    public Button btnEat;
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

        btnOptions = (Button)findViewById(R.id.btnOptions);
        btnI = (Button)findViewById(R.id.btnI);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnCold = (Button)findViewById(R.id.btnCold);
        btnHot = (Button)findViewById(R.id.btnHot);
        btnEat = (Button)findViewById(R.id.btnEat);
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
        systemLanguage = Resources.getSystem().getConfiguration().locale.toString();
        systemLanguage = systemLanguage.substring(systemLanguage.indexOf('_') + 1);

        SharedPreferences.Editor editor = getSharedPreferences("language",MODE_PRIVATE).edit();

        editor.putString("language",systemLanguage);
        editor.commit();

        setLanguage();
    }

    public void onClick(View view)
    {
        String tmp = "";
        switch (language)
        {
            case "PL":
                tmp += " " + setPLButtons(view);
                break;
            case "EN":
                tmp+= " " + setENButtons(view);
                break;
        }

        if(view.getId() == R.id.btnClear)
        {
            output = "";
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

    public void setLanguage()
    {
        SharedPreferences pref = getSharedPreferences("language",MODE_PRIVATE);
        language = pref.getString("language",language);

        Log.i("language",language);

        switch (language)
        {
            case "PL":
                btnI.setText(R.string.PL_I);
                btnClear.setText(R.string.PL_Clear);
                btnCold.setText(R.string.PL_Cold);
                btnHot.setText(R.string.PL_Hot);
                btnEat.setText(R.string.PL_Eat);
                btnDrink.setText(R.string.PL_Drink);
                btnPain.setText(R.string.PL_Pain);
                btnHead.setText(R.string.PL_Head);
                btnLeftArm.setText(R.string.PL_LeftArm);
                btnRightArm.setText(R.string.PL_RightArm);
                btnLeftLeg.setText(R.string.PL_LeftLeg);
                btnRightLeg.setText(R.string.PL_RightLeg);
                btnLoud.setText(R.string.PL_Loud);
                btnQuiet.setText(R.string.PL_Quiet);
                btnTired.setText(R.string.PL_Tired);
                break;
            case "EN":
                btnI.setText(R.string.EN_I);
                btnClear.setText(R.string.EN_Clear);
                btnCold.setText(R.string.EN_Cold);
                btnHot.setText(R.string.EN_Hot);
                btnEat.setText(R.string.EN_Eat);
                btnDrink.setText(R.string.EN_Drink);
                btnPain.setText(R.string.EN_Pain);
                btnHead.setText(R.string.EN_Head);
                btnLeftArm.setText(R.string.EN_LeftArm);
                btnRightArm.setText(R.string.EN_RightArm);
                btnLeftLeg.setText(R.string.EN_LeftLeg);
                btnRightLeg.setText(R.string.EN_RightLeg);
                btnLoud.setText(R.string.EN_Loud);
                btnQuiet.setText(R.string.EN_Quiet);
                btnTired.setText(R.string.EN_Tired);
                break;
        }
    }

    public String setPLButtons(View view)
    {
        String result = "";
        switch(view.getId())
        {
            case R.id.btnI:
                result = getResources().getString(R.string.PL_I);
                break;
            case R.id.btnCold:
                result = getResources().getString(R.string.PL_Cold);
                break;
            case R.id.btnHot:
                result = getResources().getString(R.string.PL_Hot);
                break;
            case R.id.btnEat:
                result = getResources().getString(R.string.PL_Eat);
                break;
            case R.id.btnDrink:
                result = getResources().getString(R.string.PL_Drink);
                break;
            case R.id.btnPain:
                result = getResources().getString(R.string.PL_Pain);
                break;
            case R.id.btnHead:
                result = getResources().getString(R.string.PL_Head);
                break;
            case R.id.btnLeftArm:
                result = getResources().getString(R.string.PL_LeftArm);
                break;
            case R.id.btnRightArm:
                result = getResources().getString(R.string.PL_RightArm);
                break;
            case R.id.btnLeftLeg:
                result = getResources().getString(R.string.PL_LeftLeg);
                break;
            case R.id.btnRightLeg:
                result = getResources().getString(R.string.PL_RightLeg);
                break;
            case R.id.btnLoud:
                result = getResources().getString(R.string.PL_Loud);
                break;
            case R.id.btnQuiet:
                result = getResources().getString(R.string.PL_Quiet);
                break;
            case R.id.btnTired:
                result = getResources().getString(R.string.PL_Tired);
                break;
        }
            return result;
    }

    public String setENButtons(View view)
    {
        String result = "";
        switch(view.getId())
        {
            case R.id.btnI:
                result = getResources().getString(R.string.EN_I);
                break;
            case R.id.btnCold:
                result = getResources().getString(R.string.EN_Cold);
                break;
            case R.id.btnHot:
                result = getResources().getString(R.string.EN_Hot);
                break;
            case R.id.btnEat:
                result = getResources().getString(R.string.EN_Eat);
                break;
            case R.id.btnDrink:
                result = getResources().getString(R.string.EN_Drink);
                break;
            case R.id.btnPain:
                result = getResources().getString(R.string.EN_Pain);
                break;
            case R.id.btnHead:
                result = getResources().getString(R.string.EN_Head);
                break;
            case R.id.btnLeftArm:
                result = getResources().getString(R.string.EN_LeftArm);
                break;
            case R.id.btnRightArm:
                result = getResources().getString(R.string.EN_RightArm);
                break;
            case R.id.btnLeftLeg:
                result = getResources().getString(R.string.EN_LeftLeg);
                break;
            case R.id.btnRightLeg:
                result = getResources().getString(R.string.EN_RightLeg);
                break;
            case R.id.btnLoud:
                result = getResources().getString(R.string.EN_Loud);
                break;
            case R.id.btnQuiet:
                result = getResources().getString(R.string.EN_Quiet);
                break;
            case R.id.btnTired:
                result = getResources().getString(R.string.PL_Tired);
                break;
        }
        return result;
    }

    public void options(View view)
    {
        SharedPreferences.Editor editor = getSharedPreferences("language",MODE_PRIVATE).edit();
        editor.putString("language",language);
        editor.commit();

        Intent i = new Intent(this,Options.class);
        startActivity(i);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        setLanguage();
    }
}

