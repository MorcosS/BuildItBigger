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
        assertEquals("This is totally a funny joke",new EndpointsAsyncTask().doInBackground("Tell me a Joke"));
    }
}
