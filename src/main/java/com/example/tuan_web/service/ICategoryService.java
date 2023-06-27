package com.example.tuan_web.service;

import java.util.List;

import com.example.tuan_web.dto.CategoryDTO;

public interface ICategoryService {
    List<CategoryDTO> getAllCategory();
    CategoryDTO save(CategoryDTO dto);
    void delete(Long[] ids);
}
