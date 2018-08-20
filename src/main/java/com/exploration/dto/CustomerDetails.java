package com.exploration.dto;

import java.util.Date;

public class CustomerDetails {
    private long customerId;
    private String name;
    private CustomerType customerType;
    private Date creationDate;
    public enum CustomerType{
        EMPLOYEE,
        AFFILIATE,
        OTHERS
    };

    public CustomerDetails(long customerId, String name, CustomerType customerType, Date creationDate) {
        this.customerId = customerId;
        this.name = name;
        this.customerType = customerType;
        this.creationDate = creationDate;
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
