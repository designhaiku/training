package com.designhaiku.supermarket;import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: jeffreylutz
 * Date: 4/27/13
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Item {

        public void addQty(int quantity);

        public Decimal total();

        public boolean scalesRequired();
}
