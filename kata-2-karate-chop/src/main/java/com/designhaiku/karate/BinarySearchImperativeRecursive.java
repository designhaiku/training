package com.designhaiku.karate;

/**
 * User: jeffreylutz
 * Date: 5/4/13
 */
public class BinarySearchImperativeRecursive implements BinarySearch {
    public static final int NOT_FOUND = -1;

    private int index;

    public int chop(int searchTarget, int[] values) {
        this.index = 0;
        return chopImperativeRecursive(searchTarget, values);
    }

    private int chopImperativeRecursive(int searchTarget, int[] values) {
        if (values == null) {
            return NOT_FOUND;
        }
        if (index >= values.length) {
            return NOT_FOUND;
        } else if (searchTarget == values[index]) {
            return index;
        }
        index++;
        return chopImperativeRecursive(searchTarget, values);
    }
}
