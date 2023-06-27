package com.example.tuan_web.converter;

import org.springframework.stereotype.Component;

import com.example.tuan_web.dto.ProductDTO;
import com.example.tuan_web.entity.ProductEntity;

@Component
public class ProductConverter {
    public ProductEntity toEntity(ProductDTO dto){
        ProductEntity entity = new ProductEntity();
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setImage(dto.getImage());
        entity.setPriceSizeS(dto.getPriceSizeS());
        entity.setPriceSizeM(dto.getPriceSizeM());
        entity.setPriceSizeL(dto.getPriceSizeL());
        return entity;
    }
    public ProductDTO toDTO(ProductEntity entity){
        ProductDTO dto = new ProductDTO();
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        dto.setImage(entity.getImage());
        dto.setPriceSizeS(entity.getPriceSizeS());
        dto.setPriceSizeM(entity.getPriceSizeM());
        dto.setPriceSizeL(entity.getPriceSizeL());
        if(entity.getId() != null){
            dto.setId(entity.getId());
        }
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setUpdatedDate(entity.getUpdatedDate());
        return dto;
    }
     public ProductEntity toEntity(ProductDTO dto, ProductEntity entity){
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setImage(dto.getImage());
        entity.setPriceSizeS(dto.getPriceSizeS());
        entity.setPriceSizeM(dto.getPriceSizeM());
        entity.setPriceSizeL(dto.getPriceSizeL());
        return entity;
    }
}
