package com.example.tuan_web.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String image;

    @Column(name = "priceSizeS")
    private Long priceSizeS;

    @Column(name = "priceSizeM")
    private Long priceSizeM;

    @Column(name = "priceSizeL")
    private Long priceSizeL;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;


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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getPriceSizeS() {
        return priceSizeS;
    }

    public void setPriceSizeS(Long priceSizeS) {
        this.priceSizeS = priceSizeS;
    }

    public Long getPriceSizeM() {
        return priceSizeM;
    }

    public void setPriceSizeM(Long priceSizeM) {
        this.priceSizeM = priceSizeM;
    }

    public Long getPriceSizeL() {
        return priceSizeL;
    }

    public void setPriceSizeL(Long priceSizeL) {
        this.priceSizeL = priceSizeL;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }
}
