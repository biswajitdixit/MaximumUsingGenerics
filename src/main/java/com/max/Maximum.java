package com.max;


public class Maximum
{

    public Float Max(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            max = secondNumber;
        }
        if (thirdNumber.compareTo(max) > 0) {
            max = thirdNumber;
        }

        return max;
    }


}
