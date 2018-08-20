package com.exploration.rule;

import com.exploration.dto.BillDetails;
import com.exploration.dto.DiscountDetails;

public class TotalBillRule implements IRule {
    private final int discountDollar;
    private final int perDollar;

    public TotalBillRule(int discountDollar,int perDollar) {
        this.discountDollar = discountDollar;
        this.perDollar=perDollar;
    }

    public DiscountDetails apply(BillDetails billDetails) {
        return new DiscountDetails((int)(billDetails.getTotalRunningPrice()/perDollar)*discountDollar);
    }
}
