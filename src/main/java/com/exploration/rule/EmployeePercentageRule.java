package com.exploration.rule;

import com.exploration.dto.BillDetails;
import com.exploration.dto.CustomerDetails;
import com.exploration.dto.DiscountDetails;
import com.exploration.util.GenericUtilities;

public class EmployeePercentageRule implements IRule {
    private final int percentage;

    public EmployeePercentageRule(int percentage) {
        this.percentage = percentage;
    }

    public DiscountDetails apply(BillDetails billDetails) {
        DiscountDetails discountDetails=null;
        if(billDetails.getCustomerDetails().getCustomerType()==CustomerDetails.CustomerType.EMPLOYEE){
            discountDetails=new DiscountDetails(GenericUtilities.getNonGroceryBillTotal(billDetails)*percentage/100);
        }
        return discountDetails;
    }
}
