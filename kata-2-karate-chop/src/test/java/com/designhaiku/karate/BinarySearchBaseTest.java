package com.designhaiku.karate;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: Jeffrey M Lutz <jeff@lutz.ws>
 * Date: 5/11/13
 */
public class BinarySearchBaseTest {
    protected int[] values;
    protected BinarySearch binarySearch;

    @Test(timeout = 1000)
    public void successfullySearchEmptyArrayAndReturnNotFound() {
        //precondition
        int searchTarget = 4;
        int expectedIndex = BinarySearch.NOT_FOUND;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }

    @Test(timeout = 1000)
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

    @Test(timeout = 1000)
    public void successfullySearchTwoElementArrayAndReturnSecondIndex() {
        //precondition
        int searchTarget = 3;
        values = new int[]{1, 3};
        int expectedIndex = 1;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }

    @Test(timeout = 1000)
    public void successfullySearchTwoElementArrayWithValueNotInArray() {
        //precondition
        int searchTarget = 1;
        values = new int[]{0, 2};
        int expectedIndex = binarySearch.NOT_FOUND;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }

    @Test(timeout = 1000)
    public void successfullySearchNullArrayWithReturnNotFound() {
        //precondition
        int searchTarget = 1;
        values = null;
        int expectedIndex = binarySearch.NOT_FOUND;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }

    @Test(timeout = 1000)
    public void successfullySearchMultipleValueArrayWhenSearchingNegativeNumber() {
        //precondition
        int searchTarget = 7;
        values = new int[]{-12, -5, 0, 4, 7};
        int expectedIndex = 4;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }

    @Test(timeout = 1000)
    public void successfullySearchMultipleValueArrayWithSameValuesAndReturnFirstIndex() {
        //precondition
        int searchTarget = 7;
        values = new int[]{7, 7, 7, 7, 7, 7};
        int expectedIndex = 0;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }

    @Test(timeout = 1000)
    public void successfullySearchMultipleValueArrayWithSameValuesExceptFirstValueAndReturnFirstIndex() {
        //precondition
        int searchTarget = 7;
        values = new int[]{1, 7, 7, 7, 7, 7};
        int expectedIndex = 1;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }

    @Test(timeout = 1000)
    public void successfullySearchMultipleValueArrayWithSameValuesExceptFirstTwoValuesAndReturnFirstIndex() {
        //precondition
        int searchTarget = 7;
        values = new int[]{1, 2, 7, 7, 7, 7};
        int expectedIndex = 2;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }

    @Test(timeout = 1000)
    public void successfullySearchMultipleValueArrayWithAllNegativeNumbers() {
        //precondition
        int searchTarget = -43;
        values = new int[]{-123, -94, -88, -43, -32, -7};
        int expectedIndex = 3;

        //perform test
        int actualIndex = binarySearch.chop(searchTarget, values);

        //post-condition/assertion
        assertEquals(expectedIndex, actualIndex);
    }
}
