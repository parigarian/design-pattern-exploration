package com.exploration.core;

import com.exploration.dto.BillDetails;
import com.exploration.dto.CustomerDetails;
import com.exploration.helper.DataGenerator;
import com.exploration.util.GenericUtilities;
import org.junit.Assert;
import org.junit.Test;

public class TestDiscountCalculator {

    @Test
    public void testIsCustomerOlderByYearTrue() {
        BillDetails billDetails=DataGenerator.createDiscountSpecificBillDetails();
        Assert.assertTrue(new DiscountCalculator().calculateDiscount(billDetails).getDiscountValue()==149.0);
    }
}
