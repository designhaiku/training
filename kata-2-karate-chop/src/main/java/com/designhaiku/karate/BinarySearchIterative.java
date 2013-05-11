package com.designhaiku.karate;

/**
 * User: jeffreylutz
 * Date: 5/4/13
 */
public class BinarySearchIterative implements BinarySearch {

    public static final int NOT_FOUND = -1;

    public int chop(int searchTarget, int[] values) {
        return chopIterative(searchTarget, values);
    }

    private int chopIterative(int searchTarget, int[] values) {
        if (values == null) {
            return NOT_FOUND;
        }
        for (int counter = 0; counter < values.length; counter++) {
            int v = values[counter];
            if (searchTarget == v) {
                return counter;
            }
        }

        return NOT_FOUND;
    }
}
