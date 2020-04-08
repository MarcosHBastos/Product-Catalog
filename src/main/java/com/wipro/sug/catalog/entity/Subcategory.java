package com.wipro.sug.catalog.entity;

public class Subcategory extends BaseEntity {

    private String description;
    private Category category;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
