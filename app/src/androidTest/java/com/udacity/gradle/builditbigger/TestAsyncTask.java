package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Pair;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by MorcosS on 3/14/17.
 */

public class TestAsyncTask extends AndroidTestCase{
    @Test
    public void testAsyncTask() throws Exception{
        assertEquals("Hi, " + "Joke",new EndpointsAsyncTask().doInBackground("Joke"));
    }
}
