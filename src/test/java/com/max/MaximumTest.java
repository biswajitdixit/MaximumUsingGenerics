package com.max;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    Maximum findMax = new Maximum();

    //Test Case 1.1
    @Test
    public void givenFirstNumberAsLarge_Return_FirstNumberAsMax() {
        Float max = findMax.Max(25.58f, 10.5f, 7.5f);
        Assert.assertEquals((Float) 25.58f, max);
    }

    //Test Case 1.2
    @Test
    public void givenSecondNumberAsLarge_Return_SecondNumberAsMax() {
        Float max = findMax.Max(35.45f, 46.35f, 10.4f);
        Assert.assertEquals((Float) 46.35f, max);
    }

    //Test case 1.3
    @Test
    public void givenThirdNumberAsLarge_Return_ThirdNumberAsMax() {
        Float max = findMax.Max(35.5f, 25.4f, 140.4f);
        Assert.assertEquals((Float) 140.4f, max);
    }
}
