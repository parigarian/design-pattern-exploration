package com.exploration.rule;

import com.exploration.dto.BillDetails;
import com.exploration.dto.DiscountDetails;

public interface IRule {
    DiscountDetails apply(BillDetails billDetails);
}
