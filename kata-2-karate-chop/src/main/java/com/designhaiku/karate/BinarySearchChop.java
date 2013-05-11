package com.designhaiku.karate;

/**
 * User: jeffreylutz
 * Date: 5/4/13
 */
public class BinarySearchChop implements BinarySearch {
    public static final int NOT_FOUND = -1;

    public int chop(int searchTarget, int[] values) {
        return chopHalf(searchTarget, values);
    }

    private int chopHalf(int searchTarget, int[] values) {
        if (values == null) {
            return NOT_FOUND;
        }

        int bottomIndex = 0;
        int topIndex = values.length - 1;
        int halfIndex;
        int halfValue;

        while (true) {
            halfIndex = bottomIndex + (topIndex - bottomIndex) / 2;
            halfValue = values[halfIndex];


            if (topIndex - bottomIndex < 2) {
                // Decide which of the two elements match or NOT_FOUND
                if (searchTarget == values[bottomIndex]) {
                    return bottomIndex;
                } else if (searchTarget == values[topIndex]) {
                    return topIndex;
                }
                return NOT_FOUND;
            }

            if (searchTarget == values[bottomIndex]) {
                return bottomIndex;
            }
            if (searchTarget == values[halfIndex - 1]) {
                return halfIndex - 1;
            }

            if (searchTarget == halfValue) {
                return halfIndex;
            } else if (searchTarget > halfValue) {
                bottomIndex = halfIndex;
            } else {
                topIndex = halfIndex;
            }
        }
    }
}
