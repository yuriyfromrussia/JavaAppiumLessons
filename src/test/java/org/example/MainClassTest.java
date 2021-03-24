package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass mainClass = new MainClass();
    private int expectedResult = 45;

    @Test
    public void testGetLocalNumber(){
        Assert.assertTrue("getClassNumber is returning value greater than " + expectedResult, mainClass.getClassNumber() >expectedResult);
    }
}