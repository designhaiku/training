package com.designhaiku.supermarket;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: jeffreylutz
 * Date: 4/27/13
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractItem implements Item {

    // Type 3 dependency injection
    protected Decimal unitPrice;
    private Integer quantity;

    // Type 1 dependency injection
    public AbstractItem(Decimal unitPrice) {
        this.quantity = new Integer(0);
        this.unitPrice = unitPrice;
    }

    @Override
    public void addQty(int quantity) {
        if (this.quantity == null) {
            this.quantity = new Integer(0);
        }
        this.quantity += quantity;
    }

    @Override
    public Decimal total() {
        // total = quantity * unitPrice
        Decimal quantityAsBigDecimal = new Decimal(quantity);
        Decimal total = quantityAsBigDecimal.multiply(unitPrice);
        return total;
    }

}
