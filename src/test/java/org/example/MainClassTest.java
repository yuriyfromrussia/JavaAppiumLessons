package org.example;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;


public class MainClassTest {

    MainClass mainClass = new MainClass();
    private String expectedResult = "Hello";
    private String actualResult = mainClass.getClassString();

    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("String contains 'hello' or 'Hello'", StringUtils.containsIgnoreCase(actualResult, expectedResult));
    }
}