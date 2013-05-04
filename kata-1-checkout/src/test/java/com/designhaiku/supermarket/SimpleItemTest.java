package com.designhaiku.supermarket;import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: jeffreylutz
 * Date: 4/27/13
 * Time: 2:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleItemTest {

    @Test
    public void successfullyComputeSingleItemTotal() {
        // Pre-condition
        Decimal expectedUnitPrice = new Decimal("1.23");
        Decimal expectedTotal = expectedUnitPrice;
        SimpleItem item = new SimpleItem(expectedUnitPrice);

        // Perform test
        item.addQty(1);
        Decimal actualTotal = item.total();

        // Post condition / assertions
        assertEquals("The actual total does not equal expected unit price!",expectedTotal, actualTotal);
    }

    @Test
    public void successfullyComputeZeroItemTotal() {
        // Pre-condition
        BigDecimal expectedUnitPrice = new BigDecimal("1.23");
        BigDecimal expectedTotal = BigDecimal.ZERO;
//        SimpleItem item = new SimpleItem(expectedUnitPrice);

        // Perform test
//        Decimal actualTotal = item.total();

        // Post condition / assertions
//        assertEquals("The actual total should be zero!",expectedTotal, actualTotal);
    }

    @Test
    public void proveBigDecimalIsBroken() {
        BigDecimal actualValue = new BigDecimal(1.23);
        String expectedStringValue = "1.23";

        assertEquals( expectedStringValue, actualValue);
    }

}
