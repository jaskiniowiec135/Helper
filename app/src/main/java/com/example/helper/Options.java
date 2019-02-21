package com.example.helper;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Options extends MainActivity implements AdapterView.OnItemSelectedListener {

    public Spinner language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        language = (Spinner)findViewById(R.id.spnLanguage);

        String[] items = new String[]{"Polski","English"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,items);

        language.setAdapter(adapter);
        language.setOnItemSelectedListener(this);

        setSelected(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id)
    {
        SharedPreferences.Editor editor = getSharedPreferences("language",MODE_PRIVATE).edit();

        switch (position){
            case 0:
                editor.putString("language","PL");
                break;
            case 1:
                editor.putString("language","EN");
                break;
        }

        editor.commit();
    }

    public void setSelected(ArrayAdapter<String> adapter)
    {
        SharedPreferences pref = getSharedPreferences("language",MODE_PRIVATE);
        String lang = pref.getString("language","PL");

        switch (lang)
        {
            case "PL":
                language.setSelection(0);
                break;
            case "EN":
                language.setSelection(1);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {

    }
}
