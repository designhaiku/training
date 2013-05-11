package com.designhaiku.karate;

/**
 * User: jeffreylutz
 * Date: 5/4/13
 */
public class BinarySearchFunctionalRecursive implements BinarySearch {

    public static final int NOT_FOUND = -1;

    public int chop(int searchTarget, int[] values) {
            return chopFunctionalRecursive(searchTarget, values, 0);
    }

    private int chopFunctionalRecursive(int searchTarget, int[] values, int index) {
        if (values == null) {
            return NOT_FOUND;
        }
        if (index >= values.length) {
            return NOT_FOUND;
        } else if (searchTarget == values[index]) {
            return index;
        }
        return chopFunctionalRecursive(searchTarget, values, ++index);
    }
}
