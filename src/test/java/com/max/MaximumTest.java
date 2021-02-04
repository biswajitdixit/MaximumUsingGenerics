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

    //Test Case 1.1
    @Test
    public void givenFirstNumberAsLarge_Return_FirstIntegerNumberAsMax() {
        Integer max = findMax.Max(25, 10, 7);
        Assert.assertEquals((Integer) 25, max);
    }

    //Test Case 1.2
    @Test
    public void givenSecondNumberAsLarge_Return_SecondIntegerNumberAsMax() {
        Integer max = findMax.Max(35, 46, 10);
        Assert.assertEquals((Integer) 46, max);
    }

    //Test case 1.3
    @Test
    public void givenThirdNumberAsLarge_Return_ThirdIntegerNumberAsMax() {
        Integer max = findMax.Max(35, 25, 140);
        Assert.assertEquals((Integer) 140, max);
    }
    //Test Case 1.1
    @Test
    public void givenFirstNumberAsLarge_Return_FirstFloatNumberAsMax() {
        Float max = findMax.Max(25.58f, 10.5f, 7.5f);
        Assert.assertEquals((Float) 25.58f, max);
    }

    //Test Case 1.2
    @Test
    public void givenSecondNumberAsLarge_Return_SecondFloatNumberAsMax() {
        Float max = findMax.Max(35.45f, 46.35f, 10.4f);
        Assert.assertEquals((Float) 46.35f, max);
    }

    //Test case 1.3
    @Test
    public void givenThirdNumberAsLarge_Return_ThirdFloatNumberAsMax() {
        Float max = findMax.Max(35.5f, 25.4f, 140.4f);
        Assert.assertEquals((Float) 140.4f, max);
    }
}