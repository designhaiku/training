package com.designhaiku.supermarket;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: jeffreylutz
 * Date: 4/27/13
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Decimal {

    private BigDecimal value;

    public Decimal(String val) {
        this.value = new BigDecimal(val);
    }

    public Decimal(Integer val) {
        this.value = new BigDecimal(val);
    }

    private Decimal(BigDecimal val) {
        this(val.toPlainString());
    }

    public Decimal multiply(Decimal arg) {
        BigDecimal result = value.multiply(arg.value);
        return new Decimal(result);
    }

    @Override
    public int hashCode() {
        return super.hashCode();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Decimal)) {
            return false;
        }
        Decimal lhs = this;
        Decimal rhs = (Decimal) obj;
        if (lhs.value == null && rhs.value == null) {
            return true;
        } else if (lhs.value != null) {
            return lhs.value.equals(rhs.value);
        }
        return false;

    }
}
