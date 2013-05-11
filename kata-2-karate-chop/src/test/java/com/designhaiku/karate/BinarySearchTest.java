package com.designhaiku.karate;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import static junit.framework.Assert.assertEquals;

public class BinarySearchTest {
    private int[] values;
    private BinarySearch binarySearch;


    @Before
    public void someBeforeMethod() {
        values = null;
        binarySearch = new BinarySearch();
    }

    @Test
    public void successfullySearchEmptyArrayAndReturnNotFound() {
        //precondition
        int searchTarget = 4;
        int expectedIndex = binarySearch.notFound;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void successfullySearchSingleElementArrayAndReturnFirstIndex() {
        //precondition
        int searchTarget = 1;
        values = new int[]{1};
        int expectedIndex = 0;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void successfullySearchTwoElementArrayAndReturnSecondIndex() {
        //precondition
        int searchTarget = 1;
        values = new int[]{3,1};
        int expectedIndex = 1;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void successfullySearchTwoElementArrayWithValueNotInArray() {
        //precondition
        int searchTarget = 1;
        values = new int[]{0,2};
        int expectedIndex = binarySearch.notFound;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void successfullySearchNullArrayWithReturnNotFound() {
        //precondition
        int searchTarget = 1;
        values = null;
        int expectedIndex = binarySearch.notFound;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void successfullySearchMultipleValueArrayWhenSearchingNegativeNumber() {
        //precondition
        int searchTarget = 7;
        values = new int[]{-12,-5,0,4,7};
        int expectedIndex = 4;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void successfullySearchMultipleValueArrayWithSameValuesAndReturnFirstIndex() {
        //precondition
        int searchTarget = 7;
        values = new int[]{7,7,7,7,7,7};
        int expectedIndex = 0;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }
}
