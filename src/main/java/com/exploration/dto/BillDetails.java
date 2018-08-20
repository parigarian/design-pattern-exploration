package com.exploration.dto;

import java.util.List;

public class BillDetails {

    private CustomerDetails customerDetails;
    private List<ItemDetails> itemDetailList;
    private double totalRunningPrice;

    public BillDetails(CustomerDetails customerDetails, List<ItemDetails> itemDetailList, double totalRunningPrice) {
        this.customerDetails = customerDetails;
        this.itemDetailList = itemDetailList;
        this.totalRunningPrice = totalRunningPrice;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public List<ItemDetails> getItemDetailList() {
        return itemDetailList;
    }

    public double getTotalRunningPrice() {
        return totalRunningPrice;
    }
}
