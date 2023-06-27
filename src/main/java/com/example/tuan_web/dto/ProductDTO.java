package com.example.tuan_web.dto;

public class ProductDTO extends AbstractDTO {
    private String name;
    private String description;
    private String image;
    private Long priceSizeS;
    private Long priceSizeM;
    private Long priceSizeL;
    private String categoryCode;

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

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
}
