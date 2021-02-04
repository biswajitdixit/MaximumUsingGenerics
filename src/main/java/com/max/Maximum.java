package com.max;
import java.util.Arrays;
public class Maximum<E extends Comparable<E>> {
    E[] values;

    @SafeVarargs
    public Maximum(E... values) {
        this.values = values;
    }

    public E max() throws MaximumException {
        if (values.length == 0) {
            throw new MaximumException("No Elements to Compare");
        } else {
            Arrays.sort(values);
            printMax(values[values.length - 1]);
            return values[values.length - 1];
        }
    }


    public void printMax(E value) {
        System.out.println("Max Value = " + value);
    }
}