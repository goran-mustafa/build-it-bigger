package com.example.builditbigger;

import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.view.View;
import android.widget.Button;

import androidx.test.core.app.ActivityScenario;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

public class EndpointsAsyncTaskTest {

    @Test
    public void test() throws ExecutionException, InterruptedException {
        EndpointsAsyncTask endpointsAsyncTask=new EndpointsAsyncTask();
        endpointsAsyncTask.execute();
        String result=endpointsAsyncTask.doInBackground();
        assertNotNull(result);


    }

}