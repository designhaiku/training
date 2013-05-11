package com.designhaiku.karate;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jeffreylutz
 * Date: 5/4/13
 * Time: 2:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearch {
    public int notFound = -1;

    public int chop(int searchTarget, int[] values) {
        if(values == null) {
            return notFound;
        }
        for( int counter = 0; counter < values.length; counter++) {
            int v = values[counter];
            if( searchTarget == v) {
                return counter;
            }
        }

        return notFound;
    }
}
