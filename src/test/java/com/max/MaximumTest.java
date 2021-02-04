package com.max;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {


    @Test
    public void givenFirstIntegerNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
        Integer[] integerValues = {48, 5, 1};
        Integer max = new Maximum<>(integerValues).max();
        Assert.assertEquals((Integer) 48, max);
    }

    @Test
    public void givenSecondIntegerNumberAsLarge_ShouldReturn_SecondNumberAsMax() {
        Integer[] integerValues = {27, 72, 45};
        Integer max = new Maximum<>(integerValues).max();
        Assert.assertEquals((Integer) 72, max);
    }

    @Test
    public void givenThirdIntegerNumberAsLarge_ShouldReturn_ThirdNumberAsMax() {
        Integer[] integerValues = {2, 5, 10};
        Integer max = new Maximum<>(integerValues).max();
        Assert.assertEquals((Integer) 10, max);
    }

    @Test
    public void givenFirstFloatNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
        Float[] floatValues = {20f, 5f, 1f};
        Float max = new Maximum<>(floatValues).max();
        Assert.assertEquals((Float) 20f, max);
    }

    @Test
    public void givenSecondFloatNumberAsLarge_ShouldReturn_SecondNumberAsMax() {
        Float[] floatValues = {20f, 50f, 10f};
        Float max = new Maximum<>(floatValues).max();
        Assert.assertEquals((Float) 50f, max);
    }

    @Test
    public void givenThirdFloatNumberAsLarge_ShouldReturn_ThirdNumberAsMax() {
        Float[] floatValues = {2f, 15f, 100f};
        Float max = new Maximum<>(floatValues).max();
        Assert.assertEquals((Float) 100f, max);
    }

    @Test
    public void givenFirstStringAsLarge_ShouldReturn_FirstStringAsMax() {
        String[] stringValues = {"MANGOES", "HELLO", "DAS"};
        String max = new Maximum<>(stringValues).max();
        Assert.assertEquals("MANGOES", max);
    }

    @Test
    public void givenSecondStringAsLarge_ShouldReturn_SecondStringAsMax() {
        String[] stringValues = {"HELLO", "MANGOES", "DAS"};
        String max = new Maximum<>(stringValues).max();
        Assert.assertEquals("MANGOES", max);
    }

    @Test
    public void givenThirdStringAsLarge_ShouldReturn_ThirdStringAsMax() {
        String[] stringValues = {"HELLO", "DAS", "MANGOES"};
        String max = new Maximum<>(stringValues).max();
        Assert.assertEquals("MANGOES", max);
    }
}