package com.exploration.util;

import com.exploration.constant.GlobalConstants;
import com.exploration.dto.BillDetails;
import com.exploration.dto.CustomerDetails;
import com.exploration.dto.ItemDetails;

import java.util.Date;

public class GenericUtilities {

    private GenericUtilities(){

    }
    public static double getNonGroceryBillTotal(BillDetails billDetails){
        double sum=0.0;
        for(ItemDetails itemDetails:billDetails.getItemDetailList()){
            if(itemDetails.getItemType()==ItemDetails.ItemType.NON_GROCERY){
                sum=sum+itemDetails.getTotalItemPrice();
            }
        }
        return sum;
    }

    public static double getGroceryBillTotal(BillDetails billDetails){
        double sum=0.0;
        for(ItemDetails itemDetails:billDetails.getItemDetailList()){
            if(itemDetails.getItemType()==ItemDetails.ItemType.GROCERY){
                sum=sum+itemDetails.getTotalItemPrice();
            }
        }
        return sum;
    }

    public static boolean isCustomerOlderByYear(CustomerDetails customerDetails,int years){
        boolean result=false;
        if(customerDetails.getCreationDate().getTime()<(new Date().getTime()-years*
                GlobalConstants.DAYS_COUNT_IN_YEAR*GlobalConstants.SECONDS_COUNT_IN_DAY))
            result=true;
        else
            result=false;
        return result;
    }
}
