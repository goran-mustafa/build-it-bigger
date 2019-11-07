package com.example.jokeactivitylib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);
        TextView textView=findViewById(R.id.joke);
        Intent intent=getIntent();
        if(intent!=null && intent.getExtras()!=null &&
                intent.getExtras().getString("joke")!=null){

            textView.setText(intent.getExtras().getString("joke"));

        }else{
            textView.setText("no joke");
        }
    }
}
