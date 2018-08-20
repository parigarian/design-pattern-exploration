package com.exploration.factory;

import com.exploration.strategy.IRuleExecutionStrategy;
import com.exploration.strategy.GraphicalRuleExecutionStrategy;

public class RuleConfigurationFactory {

    /*
    This factory can be expanded further for creating different execution strategies
     */
    public IRuleExecutionStrategy generateRuleStrategy(){
        return new GraphicalRuleExecutionStrategy();
    }
}
