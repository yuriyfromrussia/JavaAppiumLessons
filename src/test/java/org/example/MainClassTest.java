package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals("getLocalNumber is not returning 14", 14, mainClass.getLocalNumber());
    }
}