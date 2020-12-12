package com.example.momo;


public class FoodData
{
    private String itemName;
    private  String itemDescription;
    private String itemPrice;
    private String itemDanhGia;
    private String itemKm;
    private String itemGiamGia;
    private  int itemImage;

    public FoodData(String itemName, String itemDescription, String itemPrice, String itemDanhGia, String itemKm, String itemGiamGia, int itemImage) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemDanhGia = itemDanhGia;
        this.itemKm = itemKm;
        this.itemGiamGia = itemGiamGia;
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDanhGia() {
        return itemDanhGia;
    }

    public void setItemDanhGia(String itemDanhGia) {
        this.itemDanhGia = itemDanhGia;
    }

    public String getItemKm() {
        return itemKm;
    }

    public void setItemKm(String itemKm) {
        this.itemKm = itemKm;
    }

    public String getItemGiamGia() {
        return itemGiamGia;
    }

    public void setItemGiamGia(String itemGiamGia) {
        this.itemGiamGia = itemGiamGia;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }
}

