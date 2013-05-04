package com.designhaiku.supermarket;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: jeffreylutz
 * Date: 4/27/13
 * Time: 1:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleItem extends AbstractItem {


    public SimpleItem(Decimal unitPrice) {
        super(unitPrice);
    }

    @Override
    public boolean scalesRequired() {
        return false;
    }
}
