package com.max;


public class Maximum
{

    public String Max(String firstNumber, String secondNumber, String thirdNumber) {
        String max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max = thirdNumber;
        }
        return max;
    }

}
