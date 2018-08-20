package com.exploration.strategy;

import com.exploration.dto.BillDetails;
import com.exploration.dto.DiscountDetails;

public interface IRuleExecutionStrategy {
    public DiscountDetails executeDiscountRules(BillDetails billDetails);
}
