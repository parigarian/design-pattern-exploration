package com.exploration.core;

import com.exploration.dto.BillDetails;
import com.exploration.dto.DiscountDetails;
import com.exploration.factory.RuleConfigurationFactory;
import com.exploration.strategy.IRuleExecutionStrategy;

public class DiscountCalculator {

    private IRuleExecutionStrategy ruleExecutionStrategy;

    /*  Different rule execution strategy can be created here.
        One such is implemented here by default
    */
    public DiscountCalculator(){
        ruleExecutionStrategy=new RuleConfigurationFactory().generateRuleStrategy();
    }

    /*  Constructor where rule execution strategy is supplied in constructor
    */
    public DiscountCalculator(IRuleExecutionStrategy ruleExecutionStrategy){
        this.ruleExecutionStrategy=ruleExecutionStrategy;
    }

    public DiscountDetails calculateDiscount(BillDetails billDetails){
        return ruleExecutionStrategy.executeDiscountRules(billDetails);
    }
    public static void main(String[] args){
        System.out.println("Executing discount calculator");

    }
}
