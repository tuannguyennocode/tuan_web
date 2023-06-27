package com.example.tuan_web.service.Impl;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tuan_web.converter.CategoryConverter;
import com.example.tuan_web.dto.CategoryDTO;
import com.example.tuan_web.entity.CategoryEntity;
import com.example.tuan_web.repository.CategoryRepository;
import com.example.tuan_web.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    CategoryConverter categoryConverter;

    @Autowired
    CategoryRepository categoryRepository;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public List<CategoryDTO> getAllCategory() {
        List<CategoryDTO> listCateDTO = new ArrayList<>();
        List<CategoryEntity> listCateEntity = categoryRepository.findAll();
        for(CategoryEntity cateEntity : listCateEntity){
            CategoryDTO cateDTO = categoryConverter.toDTO(cateEntity);
            listCateDTO.add(cateDTO);  
        }
        return listCateDTO;
    }

    public CategoryDTO save(CategoryDTO categoryDTO) {
        CategoryEntity categoryEntity = new CategoryEntity();
        if (categoryDTO.getId() != null) {
            CategoryEntity oldCategoryEntity = categoryRepository.findOneById(categoryDTO.getId());
            categoryEntity = categoryConverter.toEntity(categoryDTO, oldCategoryEntity);
            categoryEntity.setUpdatedDate(sdf.format(Date.valueOf(LocalDate.now())));
        } else {
            categoryEntity = categoryConverter.toEntity(categoryDTO);
            categoryEntity.setCreatedDate(sdf.format(Date.valueOf(LocalDate.now())));
        }
        categoryEntity = categoryRepository.save(categoryEntity);
        categoryDTO = categoryConverter.toDTO(categoryEntity);
        return categoryDTO;
    }

    public void delete(Long[] ids) {
        categoryRepository.deleteAllById(Arrays.asList(ids));
    }
}
