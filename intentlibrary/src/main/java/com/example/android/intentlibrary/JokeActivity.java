package com.example.android.intentlibrary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView textView= (TextView) findViewById(R.id.joke_tv);
        Intent i=getIntent();
        if(i!=null){
            String joke =i.getExtras().getString("joke");
            textView.setText(joke);
        }

    }
}
