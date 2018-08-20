package com.exploration.util;

import com.exploration.dto.BillDetails;
import com.exploration.dto.CustomerDetails;
import com.exploration.helper.DataGenerator;
import org.junit.Assert;
import org.junit.Test;


public class TestGenericUtilities {

    @Test
    public void testGetNonGrocerryBillTotal() {
        BillDetails billDetails=DataGenerator.createRandomBillDetails();
        Assert.assertTrue(GenericUtilities.getNonGroceryBillTotal(billDetails)==12.8);
    }

    @Test
    public void testGetGrocerryBillTotal() {
        BillDetails billDetails=DataGenerator.createRandomBillDetails();
        Assert.assertTrue(GenericUtilities.getGroceryBillTotal(billDetails)==21.6);
    }

    @Test
    public void testIsCustomerOlderByYearTrue() {
        CustomerDetails customerDetails=DataGenerator.createRandomCustomerDetails(4);
        Assert.assertTrue(GenericUtilities.isCustomerOlderByYear(customerDetails,3)==true);
    }

    @Test
    public void testIsCustomerOlderByYearFalse() {
        CustomerDetails customerDetails=DataGenerator.createRandomCustomerDetails(4);
        Assert.assertTrue(GenericUtilities.isCustomerOlderByYear(customerDetails,5)==false);
    }
}
