package com.wipro.sug.catalog.entity;

import org.springframework.data.annotation.Id;

public class BaseEntity {

    @Id
    private String id;

    public String getId() {
        return this.id;
    }
}
