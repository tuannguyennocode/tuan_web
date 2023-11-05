package com.example.tuan_web.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "task")
public class TaskEntity extends BaseEntity{
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
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
}
