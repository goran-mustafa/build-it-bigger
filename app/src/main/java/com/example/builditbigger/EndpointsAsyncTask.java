package com.example.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

import com.example.jokeactivitylib.ShowJokeActivity;
import com.example.jokeslib.Jokes;

public class EndpointsAsyncTask extends AsyncTask<Void, Void, String> {
    Context c;
    public EndpointsAsyncTask(Context c){
        this.c=c;
    }

    public EndpointsAsyncTask(){
    }

    @Override
    protected String doInBackground(Void... voids) {
        Jokes jokesLib=new Jokes();

        return jokesLib.getRandomJoke();

    }

    @Override
    protected void onPostExecute(String s) {

        if(c!=null){

            Intent intent=new Intent(c,ShowJokeActivity.class);
            intent.putExtra("joke",s);
            c.startActivity(intent);
        }

        super.onPostExecute(s);
    }
}
