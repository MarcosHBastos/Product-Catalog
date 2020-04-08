package com.wipro.sug.catalog.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document(collection = "product_catalog")
public class Product extends BaseEntity {

    private String name;
    private String description;
    private String shortDescription;
    private String partnerName;
    private Double price;
    private String[] pictures;
    private int stock;
    private HashMap<String, String> uniqueAttributes;

    private Department department;
    private Category category;
    private Subcategory subcategory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String[] getPictures() {
        return pictures;
    }

    public void setPictures(String[] pictures) {
        this.pictures = pictures;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public HashMap<String, String> getUniqueAttributes() {
        return uniqueAttributes;
    }

    public void setUniqueAttributes(HashMap<String, String> uniqueAttributes) {
        this.uniqueAttributes = uniqueAttributes;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Subcategory getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Subcategory subcategory) {
        this.subcategory = subcategory;
    }
}
