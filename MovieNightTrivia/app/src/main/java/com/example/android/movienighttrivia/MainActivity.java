package com.example.android.movienighttrivia;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Set font for textview displaying untro summary
        TextView myTextView1 = (TextView) findViewById(R.id.intro);
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/kiss.ttf");
        myTextView1.setTypeface(typeface1);

    }

    /*
    onClick Methods being called based on chosen category. (Intents to start activity
     */
    public void disney(View view) {

        startActivity(new Intent(this, Disney.class));
    }

    public void potter(View view) {
         startActivity(new Intent(this, Potter.class));
    }

    public void sponge(View view){
        startActivity(new Intent(this, Sponge.class));
    }

}
