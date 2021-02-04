package com.max;


public class Maximum
{
    public <E extends Comparable> E Max(E firstValue, E secondValue, E thirdValue){
        E max = firstValue;
        if (secondValue.compareTo(max) > 0) {
            max = secondValue;
        }
        if (thirdValue.compareTo(max) > 0) {
            max = thirdValue;
        }
        printMax(max);
        return max;
    }
    public <E> void printMax(E max){
        System.out.println("Max Value = "+max);
    }
}
