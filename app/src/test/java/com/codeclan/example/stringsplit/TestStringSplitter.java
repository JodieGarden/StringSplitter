package com.codeclan.example.stringsplit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by user on 27/02/2017.
 */

public class TestStringSplitter {
    StringSplitter splitter;

    @Before
    public void before() {
        splitter = new StringSplitter();
    }

    @Test
    public void testCountSplitString() {
        assertEquals(5, splitter.splitString("Hi my name is jeff"));
    }

}
