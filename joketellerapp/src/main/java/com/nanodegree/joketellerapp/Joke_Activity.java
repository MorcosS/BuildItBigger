package com.nanodegree.joketellerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Joke_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView myJoke = (TextView) findViewById(R.id.myJoke);
        Intent intent = getIntent();
        String Joke = intent.getStringExtra(getResources().getString(R.string.joke));
        myJoke.setText(Joke);
    }
}
