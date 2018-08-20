package com.exploration.strategy;

import com.exploration.dto.BillDetails;
import com.exploration.dto.DiscountDetails;
import com.exploration.rule.AffiliatePercentageRule;
import com.exploration.rule.EmployeePercentageRule;
import com.exploration.rule.OldCustomerPercentageRule;
import com.exploration.rule.TotalBillRule;

public class GraphicalRuleExecutionStrategy implements IRuleExecutionStrategy {

    private final AffiliatePercentageRule affiliateEmployeeRule;
    private final EmployeePercentageRule employeePercentageRule;
    private final OldCustomerPercentageRule oldCustomerRule;
    private final TotalBillRule totalBillRule;

    /*All these rules can be encoded in xml instead of code

     */
    public GraphicalRuleExecutionStrategy(){
        affiliateEmployeeRule=new AffiliatePercentageRule(5);
        employeePercentageRule=new EmployeePercentageRule(30);
        oldCustomerRule=new OldCustomerPercentageRule(2,5);
        totalBillRule=new TotalBillRule(5,100);
    }

    /*
        Execution graph can be calculated for these execution rules instead of hard coded logic
     */
    public DiscountDetails executeDiscountRules(BillDetails billDetails) {
        DiscountDetails discountDetails=null;
        if(discountDetails==null) {
            discountDetails = affiliateEmployeeRule.apply(billDetails);
        }
        if(discountDetails==null){
            discountDetails=employeePercentageRule.apply(billDetails);
        }
        if(discountDetails==null){
            discountDetails=oldCustomerRule.apply(billDetails);
        }
        DiscountDetails totalBillDiscountDetails=totalBillRule.apply(billDetails);

        return new DiscountDetails(discountDetails.getDiscountValue()+
                totalBillDiscountDetails.getDiscountValue());
    }
}
