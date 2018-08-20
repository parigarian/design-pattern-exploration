package com.exploration.helper;

import com.exploration.constant.GlobalConstants;
import com.exploration.dto.BillDetails;
import com.exploration.dto.CustomerDetails;
import com.exploration.dto.ItemDetails;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataGenerator {

    public static BillDetails createRandomBillDetails(){
        CustomerDetails customerDetails=new CustomerDetails(4,"John",
                CustomerDetails.CustomerType.EMPLOYEE,new Date());
        List<ItemDetails> itemDetailsList=new ArrayList<ItemDetails>();
        itemDetailsList.add(new ItemDetails(1,"something good",4.0,3.5,
                ItemDetails.ItemType.GROCERY));
        itemDetailsList.add(new ItemDetails(1,"aata",4.0,1.9,
                ItemDetails.ItemType.GROCERY));
        itemDetailsList.add(new ItemDetails(1,"glass",4.0,1.4,
                ItemDetails.ItemType.NON_GROCERY));
        itemDetailsList.add(new ItemDetails(1,"spoons",4.0,1.8,
                ItemDetails.ItemType.NON_GROCERY));

        BillDetails billDetails=new BillDetails(customerDetails,itemDetailsList,19.0);
        return billDetails;
    }

    public static BillDetails createDiscountSpecificBillDetails(){
        CustomerDetails customerDetails=new CustomerDetails(4,"John",
                CustomerDetails.CustomerType.EMPLOYEE,new Date());
        List<ItemDetails> itemDetailsList=new ArrayList<ItemDetails>();

        itemDetailsList.add(new ItemDetails(1,"something good",4.0,3.5,
                ItemDetails.ItemType.GROCERY));
        itemDetailsList.add(new ItemDetails(1,"aata",4.0,1.9,
                ItemDetails.ItemType.GROCERY));
        itemDetailsList.add(new ItemDetails(1,"glass",200.0,1.4,
                ItemDetails.ItemType.NON_GROCERY));
        itemDetailsList.add(new ItemDetails(1,"spoons",150.0,1.0,
                ItemDetails.ItemType.NON_GROCERY));

        BillDetails billDetails=new BillDetails(customerDetails,itemDetailsList,450.0);
        return billDetails;
    }


    public static CustomerDetails createRandomCustomerDetails(int olderYear){
        CustomerDetails customerDetails=new CustomerDetails(4,"John",
                CustomerDetails.CustomerType.EMPLOYEE,new Date(new Date().getTime()-olderYear*
                GlobalConstants.DAYS_COUNT_IN_YEAR*GlobalConstants.SECONDS_COUNT_IN_DAY));
        return customerDetails;
    }
}
