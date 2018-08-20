package com.exploration.rule;

import com.exploration.dto.BillDetails;
import com.exploration.dto.DiscountDetails;
import com.exploration.util.GenericUtilities;

public class OldCustomerPercentageRule implements IRule{

    private final int numOfYear;
    private final int percentage;

    public OldCustomerPercentageRule(int numOfYear, int percentage) {
        this.numOfYear = numOfYear;
        this.percentage = percentage;
    }

    public DiscountDetails apply(BillDetails billDetails) {
        DiscountDetails discountDetails=null;
        if(GenericUtilities.isCustomerOlderByYear(billDetails.getCustomerDetails(),numOfYear)){
            discountDetails=new DiscountDetails(GenericUtilities.getNonGroceryBillTotal(billDetails)*percentage/100);
        }
        return discountDetails;
    }
}
