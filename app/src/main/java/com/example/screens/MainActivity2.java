package com.example.screens;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView myTextView = (TextView) findViewById(R.id.myTextView);
        String name = null;

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            name = extras.getString("name");
            name = "intent".concat(name);
            Log.d("==>", name);
            Log.d("==>", "" + myTextView);
            myTextView.setText(name);
        }

    }
}