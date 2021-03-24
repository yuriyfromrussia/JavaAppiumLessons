package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass mainClass = new MainClass();
    private int expectedResult = 14;

    @Test
    public void testGetLocalNumber(){
        Assert.assertEquals("Validate that getLocalNumber is returning 14", expectedResult, mainClass.getLocalNumber());
    }
}