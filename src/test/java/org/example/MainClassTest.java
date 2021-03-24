package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass mainClass = new MainClass();
    private int expectedResult = 45;
    private int actualResult = mainClass.getClassNumber();

    @Test
    public void testGetLocalNumber(){
        Assert.assertTrue("getClassNumber returning value " + actualResult + " is NOT greater than " + expectedResult,  actualResult>expectedResult);
    }
}