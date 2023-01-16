package org.tutorial;

import org.junit.Assert;
import org.junit.Test;

public class SummatorTest {

    Summator summator = new Summator();

    @Test
    public void testSum(){
        int actual = summator.sum(2, 8);
        Assert.assertEquals(actual, 10);
    } 
}
