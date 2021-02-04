package com.max;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    Maximum findMax = new Maximum();

    //Test Case 1.1
    @Test
    public void givenFirstNumberAsLarge_Return_FirstStringAsMax() {
        String max = findMax.Max("DRAGON", "CAKE", "CAT");
        Assert.assertEquals((String) "DRAGON" , max);
    }

    //Test Case 1.2
    @Test
    public void givenSecondNumberAsLarge_Return_SecondStringAsMax() {
        String max = findMax.Max("DOG", "MANGO", "CAKE");
        Assert.assertEquals((String) "MANGO", max);
    }

    //Test case 1.3
    @Test
    public void givenThirdNumberAsLarge_Return_ThirdStringAsMax() {
        String max = findMax.Max("CAT", "CAKE", "DOCTOR");
        Assert.assertEquals((String) "DOCTOR", max);
    }
}
