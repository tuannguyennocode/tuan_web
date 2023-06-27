package com.example.tuan_web.converter;

import org.springframework.stereotype.Component;

import com.example.tuan_web.dto.CategoryDTO;
import com.example.tuan_web.entity.CategoryEntity;

@Component
public class CategoryConverter {
    public CategoryEntity toEntity(CategoryDTO dto){
        CategoryEntity entity = new CategoryEntity();
        entity.setName(dto.getName());
        entity.setCode(dto.getCode());
        return entity;
    }
    public CategoryDTO toDTO(CategoryEntity entity){
        CategoryDTO dto = new CategoryDTO();
        dto.setName(entity.getName());
        dto.setCode(entity.getCode());
        if(entity.getId() != null){
            dto.setId(entity.getId());
        }
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setUpdatedDate(entity.getUpdatedDate());
        return dto;
    }
     public CategoryEntity toEntity(CategoryDTO dto, CategoryEntity entity){
        entity.setName(dto.getName());
        entity.setCode(dto.getCode());
        return entity;
    }
}
