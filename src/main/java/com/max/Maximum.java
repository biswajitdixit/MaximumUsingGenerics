package com.max;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// Generic Class To Find Max Values
public class Maximum<E extends Comparable<E>> {
    E[] values;
    List<E> listValues = new LinkedList<>();


    public Maximum(E[] values) {
        this.values = values;
    }


    public Maximum(List<E> listValues) {
        this.listValues = listValues;
    }

    public E findMax() {
        return Collections.max(listValues);
    }

    public E max() {
        if (values[0].compareTo(values[1]) > 0 && values[0].compareTo(values[2]) > 0) {
            return values[0];
        } else if (values[1].compareTo(values[0]) > 0 && values[1].compareTo(values[2]) > 0) {
            return values[1];
        } else {
            return values[2];
        }
    }

}