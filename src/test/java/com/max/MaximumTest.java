package com.max;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    Maximum findMax = new Maximum();

    //Test Case 1.1
    @Test
    public void givenFirstNumberAsLarge_Return_FirstNumberAsMax() {
        Integer max = findMax.Max(25, 10, 7);
        Assert.assertEquals((Integer) 25, max);
    }

    //Test Case 1.2
    @Test
    public void givenSecondNumberAsLarge_Return_SecondNumberAsMax() {
        Integer max = findMax.Max(35, 46, 10);
        Assert.assertEquals((Integer) 46, max);
    }

    //Test case 1.3
    @Test
    public void givenThirdNumberAsLarge_Return_ThirdNumberAsMax() {
        Integer max = findMax.Max(35, 25, 140);
        Assert.assertEquals((Integer) 140, max);
    }
}
