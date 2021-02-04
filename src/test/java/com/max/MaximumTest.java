package com.max;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    //Test Cases For Integer Array
    @Test
    public void givenFirstIntegerNumberAsLarge_ShouldReturn_FirstNumberAsMax() throws MaximumException {
        Integer max = new Maximum<>(20,15,1).max();
        Assert.assertEquals((Integer) 20, max);
    }

    @Test
    public void givenSecondIntegerNumberAsLarge_ShouldReturn_SecondNumberAsMax() throws MaximumException {
        Integer max = new Maximum<>(10,15,5).max();
        Assert.assertEquals((Integer) 15, max);
    }

    @Test
    public void givenThirdIntegerNumberAsLarge_ShouldReturn_ThirdNumberAsMax() throws MaximumException {
        Integer max = new Maximum<>(1,5,10).max();
        Assert.assertEquals((Integer) 10, max);
    }

    @Test
    public void givenForthIntegerNumberAsLarge_ShouldReturn_ForthNumberAsMax() throws MaximumException {
        Integer max = new Maximum<>(10,1,2,50).max();
        Assert.assertEquals((Integer) 50, max);
    }

    /* Test Cases For Float Array */
    @Test
    public void givenFirstFloatNumberAsLarge_ShouldReturn_FirstNumberAsMax() throws MaximumException {
        Float max = new Maximum<>(20f,1f,14f).max();
        Assert.assertEquals((Float) 20f, max);
    }

    @Test
    public void givenSecondFloatNumberAsLarge_ShouldReturn_SecondNumberAsMax() throws MaximumException {
        Float max = new Maximum<>(10f,150f,2f).max();
        Assert.assertEquals((Float) 150f, max);
    }

    @Test
    public void givenThirdFloatNumberAsLarge_ShouldReturn_ThirdNumberAsMax() throws MaximumException {
        Float max = new Maximum<>(1f,5f,1000f).max();
        Assert.assertEquals((Float) 1000f, max);
    }

    @Test
    public void givenForthFloatNumberAsLarge_ShouldReturn_ForthNumberAsMax() throws MaximumException {
        Float max = new Maximum<>(10f,5f,102f,500f).max();
        Assert.assertEquals((Float) 500f, max);
    }

    /* Test Cases For String Array */
    @Test
    public void givenFirstStringAsLarge_ShouldReturn_FirstStringAsMax() throws MaximumException {
        String max = new Maximum<>("MANGOES", "DAS", "HELLO").max();
        Assert.assertEquals("MANGOES", max);
    }

    @Test
    public void givenSecondStringAsLarge_ShouldReturn_ThirdStringAsMax() throws MaximumException {
        String max = new Maximum<>("HELLO",  "MANGOES","DAS").max();
        Assert.assertEquals("MANGOES", max);
    }

    @Test
    public void givenThirdStringAsLarge_ShouldReturn_ThirdStringAsMax() throws MaximumException {
        String max = new Maximum<>("HELLO", "DAS", "MANGOES").max();
        Assert.assertEquals("MANGOES", max);
    }
    @Test
    public void givenForthStringAsLarge_ShouldReturn_ForthStringAsMax() throws MaximumException {
        String max = new Maximum<>("HELLO", "DAS", "MANGOES","CAT").max();
        Assert.assertEquals("MANGOES", max);
    }

    @Test
    public void givenEmpty_ShouldReturn_AnException() {
        try{
            new Maximum<>().max();
        }catch (MaximumException e){
            Assert.assertEquals("No Elements to Compare",e.getMessage());
        }
    }
}