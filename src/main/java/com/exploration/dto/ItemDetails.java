package com.exploration.dto;

public class ItemDetails {

    private long id;
    private String description;
    private double quantity;
    private double price;
    private double totalItemPrice;
    private ItemType itemType;

    public enum ItemType{
        GROCERY,
        NON_GROCERY
    }

    public ItemDetails(long id, String description, double quantity, double price, ItemType itemType) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.itemType = itemType;
        this.totalItemPrice=this.quantity*this.price;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public double getTotalItemPrice() {
        return totalItemPrice;
    }
}
