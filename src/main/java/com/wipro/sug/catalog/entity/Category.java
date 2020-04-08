package com.wipro.sug.catalog.entity;

import java.util.List;

public class Category extends BaseEntity {

    private String description;

    private List<Subcategory> subcategoryList;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Subcategory> getSubcategoryList() {
        return subcategoryList;
    }

    public void setSubcategoryList(List<Subcategory> subcategoryList) {
        this.subcategoryList = subcategoryList;
    }
}
